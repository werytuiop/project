package org.project.controller;

import java.util.Scanner;

import org.project.command.ActionDelete;
import org.project.command.ActionInsert;
import org.project.command.ActionSelect;
import org.project.command.ActionUpdate;

public class ActionController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println(">> 쿼리문 입력\n(insert/select/update/delete)");
			String query = scn.nextLine();

			if (query.equals("insert")) {
				ActionInsert insert = new ActionInsert();
				insert.excuteQuery();
			} else if (query.equals("select")) {
				ActionSelect select = new ActionSelect();
				select.excuteQuery();
			} else if (query.equals("update")) {
				ActionUpdate update = new ActionUpdate();
				update.excuteQuery();
			} else if (query.equals("delete")) {
				ActionDelete delete = new ActionDelete();
				delete.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.\n");
			}

		}

		scn.close();

	}

}
