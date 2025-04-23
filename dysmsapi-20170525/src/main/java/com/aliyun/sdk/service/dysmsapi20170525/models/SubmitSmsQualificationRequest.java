// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitSmsQualificationRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmsQualificationRequest</p>
 */
public class SubmitSmsQualificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminIDCardExpDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminIDCardExpDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminIDCardFrontFace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminIDCardFrontFace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminIDCardNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminIDCardNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminIDCardPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminIDCardPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminIDCardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminIDCardType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminPhoneNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminPhoneNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessLicensePics")
    private java.util.List<BusinessLicensePics> businessLicensePics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessLicenseExpDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bussinessLicenseExpDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonIDCardNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonIDCardNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonIDCardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonIDCardType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonIdCardBackSide")
    private String legalPersonIdCardBackSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonIdCardEffTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonIdCardEffTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonIdCardFrontSide")
    private String legalPersonIdCardFrontSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherFiles")
    private java.util.List<OtherFiles> otherFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBySelf")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean useBySelf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhetherShare")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean whetherShare;

    private SubmitSmsQualificationRequest(Builder builder) {
        super(builder);
        this.adminIDCardExpDate = builder.adminIDCardExpDate;
        this.adminIDCardFrontFace = builder.adminIDCardFrontFace;
        this.adminIDCardNo = builder.adminIDCardNo;
        this.adminIDCardPic = builder.adminIDCardPic;
        this.adminIDCardType = builder.adminIDCardType;
        this.adminName = builder.adminName;
        this.adminPhoneNo = builder.adminPhoneNo;
        this.businessLicensePics = builder.businessLicensePics;
        this.bussinessLicenseExpDate = builder.bussinessLicenseExpDate;
        this.certifyCode = builder.certifyCode;
        this.companyName = builder.companyName;
        this.companyType = builder.companyType;
        this.legalPersonIDCardNo = builder.legalPersonIDCardNo;
        this.legalPersonIDCardType = builder.legalPersonIDCardType;
        this.legalPersonIdCardBackSide = builder.legalPersonIdCardBackSide;
        this.legalPersonIdCardEffTime = builder.legalPersonIdCardEffTime;
        this.legalPersonIdCardFrontSide = builder.legalPersonIdCardFrontSide;
        this.legalPersonName = builder.legalPersonName;
        this.organizationCode = builder.organizationCode;
        this.otherFiles = builder.otherFiles;
        this.ownerId = builder.ownerId;
        this.qualificationName = builder.qualificationName;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.useBySelf = builder.useBySelf;
        this.whetherShare = builder.whetherShare;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmsQualificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminIDCardExpDate
     */
    public String getAdminIDCardExpDate() {
        return this.adminIDCardExpDate;
    }

    /**
     * @return adminIDCardFrontFace
     */
    public String getAdminIDCardFrontFace() {
        return this.adminIDCardFrontFace;
    }

    /**
     * @return adminIDCardNo
     */
    public String getAdminIDCardNo() {
        return this.adminIDCardNo;
    }

    /**
     * @return adminIDCardPic
     */
    public String getAdminIDCardPic() {
        return this.adminIDCardPic;
    }

    /**
     * @return adminIDCardType
     */
    public String getAdminIDCardType() {
        return this.adminIDCardType;
    }

    /**
     * @return adminName
     */
    public String getAdminName() {
        return this.adminName;
    }

    /**
     * @return adminPhoneNo
     */
    public String getAdminPhoneNo() {
        return this.adminPhoneNo;
    }

    /**
     * @return businessLicensePics
     */
    public java.util.List<BusinessLicensePics> getBusinessLicensePics() {
        return this.businessLicensePics;
    }

    /**
     * @return bussinessLicenseExpDate
     */
    public String getBussinessLicenseExpDate() {
        return this.bussinessLicenseExpDate;
    }

    /**
     * @return certifyCode
     */
    public String getCertifyCode() {
        return this.certifyCode;
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return companyType
     */
    public String getCompanyType() {
        return this.companyType;
    }

    /**
     * @return legalPersonIDCardNo
     */
    public String getLegalPersonIDCardNo() {
        return this.legalPersonIDCardNo;
    }

    /**
     * @return legalPersonIDCardType
     */
    public String getLegalPersonIDCardType() {
        return this.legalPersonIDCardType;
    }

    /**
     * @return legalPersonIdCardBackSide
     */
    public String getLegalPersonIdCardBackSide() {
        return this.legalPersonIdCardBackSide;
    }

    /**
     * @return legalPersonIdCardEffTime
     */
    public String getLegalPersonIdCardEffTime() {
        return this.legalPersonIdCardEffTime;
    }

    /**
     * @return legalPersonIdCardFrontSide
     */
    public String getLegalPersonIdCardFrontSide() {
        return this.legalPersonIdCardFrontSide;
    }

    /**
     * @return legalPersonName
     */
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    /**
     * @return organizationCode
     */
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    /**
     * @return otherFiles
     */
    public java.util.List<OtherFiles> getOtherFiles() {
        return this.otherFiles;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qualificationName
     */
    public String getQualificationName() {
        return this.qualificationName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return useBySelf
     */
    public Boolean getUseBySelf() {
        return this.useBySelf;
    }

    /**
     * @return whetherShare
     */
    public Boolean getWhetherShare() {
        return this.whetherShare;
    }

    public static final class Builder extends Request.Builder<SubmitSmsQualificationRequest, Builder> {
        private String adminIDCardExpDate; 
        private String adminIDCardFrontFace; 
        private String adminIDCardNo; 
        private String adminIDCardPic; 
        private String adminIDCardType; 
        private String adminName; 
        private String adminPhoneNo; 
        private java.util.List<BusinessLicensePics> businessLicensePics; 
        private String bussinessLicenseExpDate; 
        private String certifyCode; 
        private String companyName; 
        private String companyType; 
        private String legalPersonIDCardNo; 
        private String legalPersonIDCardType; 
        private String legalPersonIdCardBackSide; 
        private String legalPersonIdCardEffTime; 
        private String legalPersonIdCardFrontSide; 
        private String legalPersonName; 
        private String organizationCode; 
        private java.util.List<OtherFiles> otherFiles; 
        private Long ownerId; 
        private String qualificationName; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean useBySelf; 
        private Boolean whetherShare; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmsQualificationRequest request) {
            super(request);
            this.adminIDCardExpDate = request.adminIDCardExpDate;
            this.adminIDCardFrontFace = request.adminIDCardFrontFace;
            this.adminIDCardNo = request.adminIDCardNo;
            this.adminIDCardPic = request.adminIDCardPic;
            this.adminIDCardType = request.adminIDCardType;
            this.adminName = request.adminName;
            this.adminPhoneNo = request.adminPhoneNo;
            this.businessLicensePics = request.businessLicensePics;
            this.bussinessLicenseExpDate = request.bussinessLicenseExpDate;
            this.certifyCode = request.certifyCode;
            this.companyName = request.companyName;
            this.companyType = request.companyType;
            this.legalPersonIDCardNo = request.legalPersonIDCardNo;
            this.legalPersonIDCardType = request.legalPersonIDCardType;
            this.legalPersonIdCardBackSide = request.legalPersonIdCardBackSide;
            this.legalPersonIdCardEffTime = request.legalPersonIdCardEffTime;
            this.legalPersonIdCardFrontSide = request.legalPersonIdCardFrontSide;
            this.legalPersonName = request.legalPersonName;
            this.organizationCode = request.organizationCode;
            this.otherFiles = request.otherFiles;
            this.ownerId = request.ownerId;
            this.qualificationName = request.qualificationName;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.useBySelf = request.useBySelf;
            this.whetherShare = request.whetherShare;
        } 

        /**
         * <p>经办人身份证有效期，格式示例2023-01-01~2033-01-01</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        public Builder adminIDCardExpDate(String adminIDCardExpDate) {
            this.putQueryParameter("AdminIDCardExpDate", adminIDCardExpDate);
            this.adminIDCardExpDate = adminIDCardExpDate;
            return this;
        }

        /**
         * <p>经办人身份证照片国徽面</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        public Builder adminIDCardFrontFace(String adminIDCardFrontFace) {
            this.putQueryParameter("AdminIDCardFrontFace", adminIDCardFrontFace);
            this.adminIDCardFrontFace = adminIDCardFrontFace;
            return this;
        }

        /**
         * <p>经办人身份证号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>511391********5123</p>
         */
        public Builder adminIDCardNo(String adminIDCardNo) {
            this.putQueryParameter("AdminIDCardNo", adminIDCardNo);
            this.adminIDCardNo = adminIDCardNo;
            return this;
        }

        /**
         * <p>经办人身份证照片人像面</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        public Builder adminIDCardPic(String adminIDCardPic) {
            this.putQueryParameter("AdminIDCardPic", adminIDCardPic);
            this.adminIDCardPic = adminIDCardPic;
            return this;
        }

        /**
         * <p>管理员身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>identityCard</p>
         */
        public Builder adminIDCardType(String adminIDCardType) {
            this.putQueryParameter("AdminIDCardType", adminIDCardType);
            this.adminIDCardType = adminIDCardType;
            return this;
        }

        /**
         * <p>经办人姓名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder adminName(String adminName) {
            this.putQueryParameter("AdminName", adminName);
            this.adminName = adminName;
            return this;
        }

        /**
         * <p>经办人手机号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>137****1234</p>
         */
        public Builder adminPhoneNo(String adminPhoneNo) {
            this.putQueryParameter("AdminPhoneNo", adminPhoneNo);
            this.adminPhoneNo = adminPhoneNo;
            return this;
        }

        /**
         * <p>企业营业证件信息，非大客户必填</p>
         */
        public Builder businessLicensePics(java.util.List<BusinessLicensePics> businessLicensePics) {
            String businessLicensePicsShrink = shrink(businessLicensePics, "BusinessLicensePics", "json");
            this.putQueryParameter("BusinessLicensePics", businessLicensePicsShrink);
            this.businessLicensePics = businessLicensePics;
            return this;
        }

        /**
         * <p>企业营业时间开始和结束字符串，格式示例2023-01-01~2033-01-01</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        public Builder bussinessLicenseExpDate(String bussinessLicenseExpDate) {
            this.putQueryParameter("BussinessLicenseExpDate", bussinessLicenseExpDate);
            this.bussinessLicenseExpDate = bussinessLicenseExpDate;
            return this;
        }

        /**
         * <p>手机号验证码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder certifyCode(String certifyCode) {
            this.putQueryParameter("CertifyCode", certifyCode);
            this.certifyCode = certifyCode;
            return this;
        }

        /**
         * <p>公司名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>企业类型, COMPANY:公司;NON_PROFIT_ORGANIZATION:政府或者事业单位</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPANY</p>
         */
        public Builder companyType(String companyType) {
            this.putQueryParameter("CompanyType", companyType);
            this.companyType = companyType;
            return this;
        }

        /**
         * <p>法人身份证号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>511391********5123</p>
         */
        public Builder legalPersonIDCardNo(String legalPersonIDCardNo) {
            this.putQueryParameter("LegalPersonIDCardNo", legalPersonIDCardNo);
            this.legalPersonIDCardNo = legalPersonIDCardNo;
            return this;
        }

        /**
         * <p>法人身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>identityCard</p>
         */
        public Builder legalPersonIDCardType(String legalPersonIDCardType) {
            this.putQueryParameter("LegalPersonIDCardType", legalPersonIDCardType);
            this.legalPersonIDCardType = legalPersonIDCardType;
            return this;
        }

        /**
         * <p>法人身份证照片人像面</p>
         * 
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        public Builder legalPersonIdCardBackSide(String legalPersonIdCardBackSide) {
            this.putQueryParameter("LegalPersonIdCardBackSide", legalPersonIdCardBackSide);
            this.legalPersonIdCardBackSide = legalPersonIdCardBackSide;
            return this;
        }

        /**
         * <p>法人身份证有效期</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        public Builder legalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
            this.putQueryParameter("LegalPersonIdCardEffTime", legalPersonIdCardEffTime);
            this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
            return this;
        }

        /**
         * <p>法人身份证照片国徽面</p>
         * 
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        public Builder legalPersonIdCardFrontSide(String legalPersonIdCardFrontSide) {
            this.putQueryParameter("LegalPersonIdCardFrontSide", legalPersonIdCardFrontSide);
            this.legalPersonIdCardFrontSide = legalPersonIdCardFrontSide;
            return this;
        }

        /**
         * <p>法人姓名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder legalPersonName(String legalPersonName) {
            this.putQueryParameter("LegalPersonName", legalPersonName);
            this.legalPersonName = legalPersonName;
            return this;
        }

        /**
         * <p>社会统一信用代码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>910X********0012</p>
         */
        public Builder organizationCode(String organizationCode) {
            this.putQueryParameter("OrganizationCode", organizationCode);
            this.organizationCode = organizationCode;
            return this;
        }

        /**
         * <p>更多资料</p>
         */
        public Builder otherFiles(java.util.List<OtherFiles> otherFiles) {
            String otherFilesShrink = shrink(otherFiles, "OtherFiles", "json");
            this.putQueryParameter("OtherFiles", otherFilesShrink);
            this.otherFiles = otherFiles;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>资质名称,名称不能重复</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder qualificationName(String qualificationName) {
            this.putQueryParameter("QualificationName", qualificationName);
            this.qualificationName = qualificationName;
            return this;
        }

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>资质是自用还是他用，true：自用，false：他用</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useBySelf(Boolean useBySelf) {
            this.putQueryParameter("UseBySelf", useBySelf);
            this.useBySelf = useBySelf;
            return this;
        }

        /**
         * <p>是否同意与其他业务线共享</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder whetherShare(Boolean whetherShare) {
            this.putQueryParameter("WhetherShare", whetherShare);
            this.whetherShare = whetherShare;
            return this;
        }

        @Override
        public SubmitSmsQualificationRequest build() {
            return new SubmitSmsQualificationRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSmsQualificationRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmsQualificationRequest</p>
     */
    public static class BusinessLicensePics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicensePic")
        private String licensePic;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BusinessLicensePics(Builder builder) {
            this.licensePic = builder.licensePic;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessLicensePics create() {
            return builder().build();
        }

        /**
         * @return licensePic
         */
        public String getLicensePic() {
            return this.licensePic;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String licensePic; 
            private String type; 

            private Builder() {
            } 

            private Builder(BusinessLicensePics model) {
                this.licensePic = model.licensePic;
                this.type = model.type;
            } 

            /**
             * <p>营业证件图片标识的osskey</p>
             * 
             * <strong>example:</strong>
             * <p>123456/111.png</p>
             */
            public Builder licensePic(String licensePic) {
                this.licensePic = licensePic;
                return this;
            }

            /**
             * <p>营业证件类型，businessLicense:营业执照;organizationCodeLicense:组织机构代码证;taxRegistrationLicense:税务登记证;socialCreditLicense:社会信用代码证书;newStyleBusinessLicense:三证合一;signLegalLicense:签名归属方的事业单位法人证书;otherLicense:其他类型执照证书</p>
             * 
             * <strong>example:</strong>
             * <p>businessLicense</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BusinessLicensePics build() {
                return new BusinessLicensePics(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmsQualificationRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmsQualificationRequest</p>
     */
    public static class OtherFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicensePic")
        private String licensePic;

        private OtherFiles(Builder builder) {
            this.licensePic = builder.licensePic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtherFiles create() {
            return builder().build();
        }

        /**
         * @return licensePic
         */
        public String getLicensePic() {
            return this.licensePic;
        }

        public static final class Builder {
            private String licensePic; 

            private Builder() {
            } 

            private Builder(OtherFiles model) {
                this.licensePic = model.licensePic;
            } 

            /**
             * <p>营业证件图片标识的osskey</p>
             * 
             * <strong>example:</strong>
             * <p>123456/111.png</p>
             */
            public Builder licensePic(String licensePic) {
                this.licensePic = licensePic;
                return this;
            }

            public OtherFiles build() {
                return new OtherFiles(this);
            } 

        } 

    }
}
