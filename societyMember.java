class societyMember {

	int memberId;
	int memberAge;
	int memberFlatNo;
	
	String memberName;
	
	public void setMemberId(int memberId){
		 this.memberId = memberId;
	}
	public int getMemberId(){
		 
		 if(memberId==null)
			 System.out.println(" No value given to memberId " );
		  else
				return memberId;			
		 
		 return ;
	 }

	public void memberAge(int memberAge){

		if(memberAge < 21)
			 System.out.println(" Minors are not allowed to create a a/c " );
		else if(memberAge > 21 ) 
			this.memberAge = memberAge;
	 }

	public int getMemberAge(){
		return memberAge;
	 }

	 public void memberFlatNo(int memberFlatNo){
		this.memberFlatNo = memberFlatNo;
	 }
	 public int getMemberFlatNo(){
		 return memberFlatNo;
	 }
}