package org.project.controller;

import org.project.dbConnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {

		System.out.println("Controller");

//		DBConnect conn = new DBConnect();
		DBConnect.getConnection(); // static은 바로 생성 가능

		MemberDto member1 = new MemberDto();

		member1.setNo(1);
		member1.setUserId("id");
		member1.setUserPw("pw");
		System.out.println(member1.getNo());
		System.out.println(member1.getUserId());
		System.out.println(member1.getUserPw());
		System.out.println(member1.toString());

		System.out.println();

		MemberDto member2 = new MemberDto("id2", "pw2", 2);

		System.out.println(member2.getNo());
		System.out.println(member2.getUserId());
		System.out.println(member2.getUserPw());
		System.out.println(member2.toString());

	}

}
