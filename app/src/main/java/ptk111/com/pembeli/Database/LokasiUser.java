package ptk111.com.pembeli.Database;

/**
 * Created by ptk111 on 4/25/2017.
 */

public class LokasiUser extends Koneksi {

    String URL = "http://agungcahya.esy.es/server.php";
    String url = "";
    String response = "";

    public String tampilLokasiPedagang() {
        try {
            url = URL + "?operasi=viewPedagang";
            System.out.println("URL Tampil Lokasi Pedagang: " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateLokasiPembeliById(Integer id, Double latitude, Double longitude) {
        try {
            url = URL + "?operasi=updatePembeliById&id=" + id + "&latitude=" + latitude + "&longitude=" + longitude;
            System.out.println("URL Update Lokasi Pembeli By ID : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String insertLokasi(Double latitude , Double longitude) {
        try {
            url = URL + "?operasi=insert&latitude=" + latitude + "&longitude=" + longitude;
            System.out.println("URL Insert Lokasi : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String getLokasiById(int id) {
        try {
            url = URL + "?operasi=get_lokasi_by_id&id=" + id;
            System.out.println("URL Lokasi By ID : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateBiodata(String id, String nama, String alamat) {
        try {
            url = URL + "?operasi=update&id=" + id + "&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String deleteBiodata(int id) {
        try {
            url = URL + "?operasi=delete&id=" + id;
            System.out.println("URL Delete Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

}

