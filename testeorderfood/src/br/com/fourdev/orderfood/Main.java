package br.com.fourdev.orderfood;

/**
 * Created by 1002428 on 15. 6. 25..
 */
public class Main {

	public static void main(String[] args) {

		String url = "http://localhost:9090/produto";
		String jsonParam = "{\"id\":\"muse1\",\"nome\":\"2342\",\"descricao\":60}‰";
		String param = "";

		// System.out.println(HttpClientUtil.doPost(url,jsonParam));
		// System.out.println("----------------------------------");

		System.out.println(HttpClientUtil.doGet(url, param));

		System.out.println("----------------------------------");
		param = "/muse1";
		System.out.println(HttpClientUtil.doGet(url, param));

	}
}
