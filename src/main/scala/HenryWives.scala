object HenryWives{
  def survived (name: String, marriage: Int):Boolean ={
    (name == "Catherine" && marriage >=2) || (name == "Anne" && marriage <=1)


  }
}
