package site.metacoding.ex23;

public class StringCollectionEx01 {
    public static void main(String[] args) {

        String s = "안녕";
        s = s + "안녕";
        s = s + "안녕";
        s = s + "안녕";
        s = s + "안녕";

        // StringBuffer 자원 동기화 적용되어 있음.
        StringBuffer sb = new StringBuffer();
        sb.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?");
        sb.append(
                "serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3%3D&");
        sb.append("numOfRows=10&");
        sb.append("pageNo=1&");
        sb.append("dataType=JSON&");
        sb.append("base_date=20220126&");
        sb.append("base_time=1700&");
        sb.append("nx=97&");
        sb.append("ny=75");

        System.out.println(sb.toString());
    }
}
