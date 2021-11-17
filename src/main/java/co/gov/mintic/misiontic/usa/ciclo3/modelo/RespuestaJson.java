/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.mintic.misiontic.usa.ciclo3.modelo;
 //..
/**
 *
 * @author JOHN CARLOS ARRIETA ARRIETA
 */
public class RespuestaJson {

    private Estudiante[] items;
    private boolean hasMore;
    private int limit;
    private int offset;
    private int count;
    private Enlace[] links;

    public Estudiante[] getItems() {
        return items;
    }

    public void setItems(Estudiante[] items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Enlace[] getLinks() {
        return links;
    }

    public void setLinks(Enlace[] links) {
        this.links = links;
    }

}

/*
JsonRespuesta{
  items: [
    Estudiante{
      nombre: Lina Paola Gonzalez Arias,
      frontend_reto2;
      frontend_reto3;
      frontend_reto4;
      frontend_reto5;
      mensaje_r2;
      mensaje_r3;
      mensaje_r4;
      mensaje_r5;
      promedio: 5
    }

  ],
  hasMore: false,
  limit: 25,
  offset: 0,
  count: 1,
  links: [
    Enlaces{
      rel: self,
      href: https://g6c335b483ca254-bdgastosg16.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/notas/retos/lina.gonzalez.mt@correo.usa.edu.co
    },
    {
      rel: describedby,
      href: https://g6c335b483ca254-bdgastosg16.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/metadata-catalog/notas/retos/item
    },
    {
      rel: first,
      href: https://g6c335b483ca254-bdgastosg16.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/notas/retos/lina.gonzalez.mt@correo.usa.edu.co
    }
  ]
}
 */
