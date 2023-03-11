package GuerraDados;

public class GuerraDados {

        private String nombre;
        private int fichas;
        private Dados dado;

        public GuerraDados(String nombre) {
            this.nombre = nombre;
            fichas = 10;
            dado = new Dados(6);
        }

        public int lanzarDado() {
            return dado.lanzar();
        }

        public void quitarFicha() {
            fichas--;
        }

        public int getFichas() {
            return fichas;
        }

        public String getNombre() {
            return nombre;
        }
    }

