package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	public String color;
	private Shape s = new Shape();

	// 멤버 변수
	public double calcArea(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어
		// Shape의 필드들 초기화하고 면적 계산법을 통해 계산된 값 반환

		double area = (height + width) / 2;
		return area;
	}

	public void setpaintColor(String paintColor) {
		this.color = paintColor;
		// setter를 통해 매개변수로 넘어온 값으로 변경

	}

	public String print() {
		return "color: " + color;
		// “삼각형” + s.information()으로 삼각형의 정보 리턴

	}

}