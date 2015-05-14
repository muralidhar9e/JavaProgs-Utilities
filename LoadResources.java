/**
   * This method will instantiate and load a resource.
   *
   * @param String The name of the resource.
   * @return Properties The resource.
   * @throws Exception
   */
   public static void main(String args[]){
   	
   }
  public Properties loadProperties(String propertiesFilename) throws Exception
  {
	URL url = (new Object()).getClass().getResource("/" + propertiesFilename);
	if (url == null)
	{
	  throw new Exception("Can not find " + propertiesFilename);
	}
	Properties props = new Properties();
	InputStream is = url.openStream();
	try
	{
	  props.load(is);
	}
	finally
	{
	  is.close();
	}
	return props;
  }
