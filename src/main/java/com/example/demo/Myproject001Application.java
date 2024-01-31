package com.example.demo; //com.examle.demoがパッケージに属していることを示している。

import org.springframework.boot.SpringApplication; //SpringApplicationを使用するためにインポート
import org.springframework.boot.autoconfigure.SpringBootApplication;//Applicationを自動的にセットアップ
import org.springframework.web.bind.annotation.RequestMapping;//URLとコントローラーのクラスやメソッドを紐づけている。
import org.springframework.web.bind.annotation.RestController;//API形式のレスポンスを表示するためにRestControllerを使用

@SpringBootApplication//SpringBootフレームワークの自動生成を有効にしている
@RestController//APIを構成
public class Myproject001Application {//Myproject001Applicationをどこからでもアクセスできるように変更
	
	@RequestMapping("/")//クラスとクラスパスを紐づける
	String home() {//レスポンスとして返される文字列を定義するためにhomeを使用
		return "Hello World!";//returnでその文字列を決めている
	}

	public static void main(String[] args) {//エントリーポイント
		SpringApplication.run(Myproject001Application.class, args);//Myproject001Applicationを指定して起動
	}
}

