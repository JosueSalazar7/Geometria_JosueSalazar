public class musica {
    public class Musica {
        String titulocancion;
        int aniopublicacion;
        String genero;
        String artista;

        public Musica(){
            titulocancion = "Dejate llevar";
            aniopublicacion = 2018;
            genero = "regueton";
            artista = "Juan magan";
        }

        public String getTitulocancion() {
            return titulocancion;
        }

        public void setTitulocancion(String titulocancion) {
            this.titulocancion = titulocancion;
        }

        public int getAniopublicacion() {
            return aniopublicacion;
        }

        public void setAniopublicacion(int aniopublicacion) {
            this.aniopublicacion = aniopublicacion;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }
    }

}
