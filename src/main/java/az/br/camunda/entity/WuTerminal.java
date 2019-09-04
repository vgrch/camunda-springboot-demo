package az.br.camunda.entity;

import java.sql.Date;


public class WuTerminal {

  private String id;
  private String userLogin;
  private String wuId;
  private Date createdAt;
  private String createdBy;
  private Date editedAt;
  private String editedBy;
  private String branchCode;
  private String branchName;
  private String ipAddress;
  private String wuModifyId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }


  public String getWuId() {
    return wuId;
  }

  public void setWuId(String wuId) {
    this.wuId = wuId;
  }


  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Date getEditedAt() {
    return editedAt;
  }

  public void setEditedAt(Date editedAt) {
    this.editedAt = editedAt;
  }


  public String getEditedBy() {
    return editedBy;
  }

  public void setEditedBy(String editedBy) {
    this.editedBy = editedBy;
  }


  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public String getWuModifyId() {
    return wuModifyId;
  }

  public void setWuModifyId(String wuModifyId) {
    this.wuModifyId = wuModifyId;
  }

}
