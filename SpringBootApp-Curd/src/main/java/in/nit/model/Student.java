package in.nit.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Student {
	@NonNull
	private Integer sid;
	@NonNull
	private String sname;
	@NonNull
	private String course;
	@NonNull
	private Double sfee;
	
	private Double discount;

}
