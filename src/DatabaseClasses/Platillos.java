package DatabaseClasses;

import java.util.ArrayList;

public class Platillos {
    private ArrayList<Dishes> platos;
    
    public Platillos(){
        platos = new ArrayList<>();
        llenar();
    }

    public ArrayList<Dishes> getPlatos() {
        return platos;
    }
    
    
    public void llenar(){
        Dishes plato1 = new Dishes(), plato2 = new Dishes(), plato3 = new Dishes(), plato4 = new Dishes(), plato5 = new Dishes();
        plato1.setNombre("Tarta de remolacha y aguacate");
        plato1.setIngredientes("Aguacate, Remolacha, Ajo, Aceite de oliva, Mostaza dulce, Piñon, Jugo de limon, Sal, Pimienta");
        plato1.setCalorias(754);
        plato1.setPrecio(12500);
        platos.add(plato1);
        plato2.setNombre("Ensalada de frutas con aderezo de miel y lima");
        plato2.setIngredientes("Mango, Fresa, Piña, Kiwi, Sandía, Lima, Miel");
        plato2.setCalorias(167);
        plato2.setPrecio(5000);
        platos.add(plato2);
        plato3.setNombre("Calabacines rellenos con champiñones");
        plato3.setIngredientes("Calabacín, Champiñón, Perejíl, Aceite, Ajo, Huevos, Yogurt, Jarabe de Agave, Pipas, Sal, Pimienta");
        plato3.setCalorias(469);
        plato3.setPrecio(8000);
        platos.add(plato3);
        plato4.setNombre("Ensalada de antipasto");
        plato4.setIngredientes("Tomate, Pimentón Rojo, Pimenton Amarillo, Calabacín, Ajo, Romero, Aceite de Oliva, Pasta de tomate, Caldo de verduras, "
                + "Vinagra vino tinto, Jarabe de Agave");
        plato4.setCalorias(158);
        plato4.setPrecio(9000);
        platos.add(plato4);
        plato5.setNombre("Spaghetti con pesto de aguacate y kale");
        plato5.setIngredientes("Spaguetti, Aguacate, Hoja de Kale, Diente de Ajo, Cebolla, Aceite de Colza, Jugo de Limón, Agua, Sal, Pimienta");
        plato5.setCalorias(540);
        plato5.setPrecio(13500);
    }
}
