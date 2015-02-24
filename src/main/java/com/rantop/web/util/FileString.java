
/**
 * <p>Copyright @ 2007 深圳市易思博信息技术有限公司 </p>
 * <p>All right reserved. </p>
 * <p>项目名称		      </p>
 * <p>JDK使用版本			jdk1.5 </P>
 * <p>描述					文件上传，文件信息类</p>
 * @版本						1.0.0 
 * @author					
 * 
 * <p>修改历史 </p>
 * 		
 * <p>修改时间               修改人员   修改内容 </p>
 *	
 */
package com.rantop.web.util;

public class FileString {
	private String title;//文件标题
	private String name;//文件名称
	private String paths;//页面引用文件路径
	private String fullPaths;//完整文件路径
	private String typeDesc;//图片面（横面还是切面）描述，图片文件才有
	private String source;//文件来源
	private String serverPath;//指的是上传的文件名，
	private String contentCol;//文件属的内容，如文字资料。还是录象资
	private String typeId;//父ID
	private String affixId;
	private String remark;
	private java.util.Date date;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPaths() {
		return paths;
	}
	public void setPaths(String paths) {
		this.paths = paths;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getServerPath() {
		return serverPath;
	}
	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}
	public String getContentCol() {
		return contentCol;
	}
	public void setContentCol(String contentCol) {
		this.contentCol = contentCol;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getAffixId() {
		return affixId;
	}
	public void setAffixId(String affixId) {
		this.affixId = affixId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public String getFullPaths() {
		return fullPaths;
	}
	public void setFullPaths(String fullPaths) {
		this.fullPaths = fullPaths;
	}
}
