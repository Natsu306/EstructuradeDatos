package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructuras.Busqueda;
import sample.Estructuras.Pedido;
import sample.Estructuras.itemPedido;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ControllerCobro {
    @FXML
    ComboBox comboBebidas, comboPlatillos;
    @FXML
    TableView tabla;
    @FXML
    TextField txtbebida1, txtcantplatillos, txtnombre, txtventas;
    @FXML
    Label Nombre1, txtnombreUser, lblventas;
    int[] ventas = new int[5];
    LinkedList<String> listaBebidas = new LinkedList<>();
    LinkedList<String> listaplatillos = new LinkedList<>();
    TableColumn columnabebida = new TableColumn("bebida");
    TableColumn columnacantidadB = new TableColumn("Cant");
    TableColumn columnaplatillo = new TableColumn("Platillo");
    TableColumn columnacantidadP = new TableColumn("Cant");
    ObservableList<Pedido> listapedidos = FXCollections.observableArrayList();
    Queue<itemPedido> cola = new LinkedList<>();
    Stack<itemPedido> pila = new Stack<>();
    String[][] platillos = {
            {"Chilaquiles", "60"},
            {"Platillo premium", "350"},
            {"ORDEN DE TACOS", "120"},
            {"QUESADILLAS", "110"},

            {"Huevo frito", "50"},
            {"Almuerzo de la suerte", "300"},
            {"Perca crujiente", "150"},
            {"Frijoles bien buenos", "50"},

    };
    String[][] Bebidas = {
            {"agua", "10"},
            {"Soda", "15"},
            {"Cerveza   ", "20"},
            {"Vino", "30"},
            {"Cafe", "12"},
            {"Refresco de jengibre", "25"},
    };

    @FXML
    protected void initialize() {
        txtnombreUser.setText(Main.datosN);
        columnabebida.setCellValueFactory(new PropertyValueFactory<Pedido, String>("bebida"));
        columnacantidadB.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cantidadbebida"));
        columnaplatillo.setCellValueFactory(new PropertyValueFactory<Pedido, String>("platillo"));
        columnacantidadP.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cantidadplatillo"));
        tabla.getColumns().addAll(columnabebida, columnacantidadB, columnaplatillo, columnacantidadP);
        tabla.setItems(listapedidos);
        // listaplatillos.add("Huevo frito");
        // listaplatillos.add("Almuerzo de la suerte");
        // listaplatillos.add("Perca crujiente");
        //listaplatillos.add("Anguila frita");
        //listaplatillos.add("Botin otoñal");
        // listaplatillos.add("Macedonia");
        //listaplatillos.add("Crema de langosta");
        //listaplatillos.add("Setas salteadas");
        //listaplatillos.add("Pizza");
        //listaplatillos.add("Sashimi");
        // listaplatillos.add("Sopa de alga");
        //listaplatillos.add("Dulce de grosellas");
        //listaplatillos.add("Torta de cangrejo");
        //listaplatillos.add("Coliflor gratinada");


        for (int x = 0; x < platillos.length; x++) {
            listaplatillos.add(platillos[x][0]);
        }
        for (int x = 0; x < Bebidas.length; x++) {
            listaBebidas.add(Bebidas[x][0]);
        }

        for (int x = 0; x < listaplatillos.size(); x++) comboPlatillos.getItems().add(listaplatillos.get(x));
        for (int x = 0; x < listaBebidas.size(); x++) comboBebidas.getItems().add(listaBebidas.get(x));
    }

    public void insertar(ActionEvent event) {
        String p = comboPlatillos.getSelectionModel().getSelectedItem().toString();
        String b = comboBebidas.getSelectionModel().getSelectedItem().toString();
        String cb = txtbebida1.getText();
        String cp = txtcantplatillos.getText();
        listapedidos.add(new Pedido(b, cb, p, cp));
    }

    public void guardarpedido(ActionEvent event) {
        String[][] items = new String[listapedidos.size()][4];
        for (int x = 0; x < items.length; x++) {
            items[x][0] = listapedidos.get(x).getBebida().toString();
            items[x][1] = listapedidos.get(x).getCantidadbebida();
            items[x][2] = listapedidos.get(x).getPlatillo();
            items[x][3] = listapedidos.get(x).getCantidadplatillo();
        }
        itemPedido pedido = new itemPedido(items, txtnombre.getText());
        cola.add(pedido);
        pila.add(pedido);
        listapedidos.clear();
        txtbebida1.setText("");
        txtcantplatillos.setText("");
        txtnombre.setText("");
    }

    public void finalizar() {
        try {
            itemPedido pedido = cola.poll();
            Nombre1.setText(pedido.getNombre());
            String[][] datos = pedido.getDatos();
            listapedidos.clear();
            for (int i = 0; i < datos.length; i++) {
                System.out.print(datos[i][0]);
                System.out.print(datos[i][1]);
                System.out.print(datos[i][2]);
                System.out.print(datos[i][3]);
                System.out.println();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Salon Fruta Estelar");
            alert.setContentText("No se encuentran pedidos");
            alert.show();
        }
    }

    public void Status() {
        itemPedido pedido = pila.pop();
        txtnombre.setText(pedido.getNombre());
        String[][] datos = pedido.getDatos();
        for (int x = 0; x < datos.length; x++) {
            System.out.print(datos[x][0] + "");
            System.out.print(datos[x][1] + "");
            System.out.print(datos[x][2] + "");
            System.out.print(datos[x][3] + "");
            System.out.println();
        }
    }

    int cont = 0;

    public void insertarVentas(ActionEvent event) {
        ventas[cont] = Integer.parseInt(txtventas.getText().toString());
        System.out.println(txtventas.getText());
        cont++;
    }

    public void ordenarVenta(ActionEvent event) {
        Busqueda ordenar = new Busqueda();
        int[] ordenado = ordenar.burbuja(ventas);
        String todo = "";
        for (int x = 0; x < ordenado.length; x++) todo = todo + "," + ordenado[x];
        lblventas.setText(todo);
    }

    public void ordenarPlatillos(ActionEvent event) {
        Busqueda ordenar = new Busqueda();
        comboPlatillos.getItems().clear();
        listaplatillos.clear();
        String[][] ordenado = ordenar.burbujaArray(platillos);
        for (int x = 0; x < ordenado.length; x++) {
            listaplatillos.add(ordenado[x][0]);
            comboPlatillos.getItems().add(ordenado[x][0]);
        }
    }

    public void OrdenarNombre(ActionEvent event) {
        Busqueda Alfabetica = new Busqueda();
        listaBebidas.clear();
        String[][] alfa = Alfabetica.burbujaAlfa(Bebidas);
        for (int x = 0; x < alfa.length; x++) {
            listaBebidas.add(alfa[x][0]);
            comboBebidas.getItems().add(alfa[x][0]);

        }
    }
}
//Por una extraña razon mutiplica el texto xd