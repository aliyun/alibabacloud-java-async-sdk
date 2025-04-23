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
 * {@link QuerySingleSmsQualificationResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySingleSmsQualificationResponseBody</p>
 */
public class QuerySingleSmsQualificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySingleSmsQualificationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySingleSmsQualificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySingleSmsQualificationResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySingleSmsQualificationResponseBody build() {
            return new QuerySingleSmsQualificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySingleSmsQualificationResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySingleSmsQualificationResponseBody</p>
     */
    public static class BusinessLicensePics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicensePic")
        private String licensePic;

        @com.aliyun.core.annotation.NameInMap("PicUrl")
        private String picUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BusinessLicensePics(Builder builder) {
            this.licensePic = builder.licensePic;
            this.picUrl = builder.picUrl;
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
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String licensePic; 
            private String picUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(BusinessLicensePics model) {
                this.licensePic = model.licensePic;
                this.picUrl = model.picUrl;
                this.type = model.type;
            } 

            /**
             * LicensePic.
             */
            public Builder licensePic(String licensePic) {
                this.licensePic = licensePic;
                return this;
            }

            /**
             * <p>文件的完整路径</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * Type.
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
     * {@link QuerySingleSmsQualificationResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySingleSmsQualificationResponseBody</p>
     */
    public static class OtherFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicensePic")
        private String licensePic;

        @com.aliyun.core.annotation.NameInMap("PicUrl")
        private String picUrl;

        private OtherFiles(Builder builder) {
            this.licensePic = builder.licensePic;
            this.picUrl = builder.picUrl;
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

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        public static final class Builder {
            private String licensePic; 
            private String picUrl; 

            private Builder() {
            } 

            private Builder(OtherFiles model) {
                this.licensePic = model.licensePic;
                this.picUrl = model.picUrl;
            } 

            /**
             * LicensePic.
             */
            public Builder licensePic(String licensePic) {
                this.licensePic = licensePic;
                return this;
            }

            /**
             * <p>文件的完整路径</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            public OtherFiles build() {
                return new OtherFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySingleSmsQualificationResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySingleSmsQualificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminIDCardExpDate")
        private String adminIDCardExpDate;

        @com.aliyun.core.annotation.NameInMap("AdminIDCardFrontFace")
        private String adminIDCardFrontFace;

        @com.aliyun.core.annotation.NameInMap("AdminIDCardNo")
        private String adminIDCardNo;

        @com.aliyun.core.annotation.NameInMap("AdminIDCardPic")
        private String adminIDCardPic;

        @com.aliyun.core.annotation.NameInMap("AdminIDCardType")
        private String adminIDCardType;

        @com.aliyun.core.annotation.NameInMap("AdminName")
        private String adminName;

        @com.aliyun.core.annotation.NameInMap("AdminPhoneNo")
        private String adminPhoneNo;

        @com.aliyun.core.annotation.NameInMap("BusinessLicensePics")
        private java.util.List<BusinessLicensePics> businessLicensePics;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("CompanyType")
        private String companyType;

        @com.aliyun.core.annotation.NameInMap("EffTimeStr")
        private String effTimeStr;

        @com.aliyun.core.annotation.NameInMap("LegalPersonIDCardNo")
        private String legalPersonIDCardNo;

        @com.aliyun.core.annotation.NameInMap("LegalPersonIDCardType")
        private String legalPersonIDCardType;

        @com.aliyun.core.annotation.NameInMap("LegalPersonIdCardEffTime")
        private String legalPersonIdCardEffTime;

        @com.aliyun.core.annotation.NameInMap("LegalPersonName")
        private String legalPersonName;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private String organizationCode;

        @com.aliyun.core.annotation.NameInMap("OtherFiles")
        private java.util.List<OtherFiles> otherFiles;

        @com.aliyun.core.annotation.NameInMap("QualificationGroupId")
        private Long qualificationGroupId;

        @com.aliyun.core.annotation.NameInMap("QualificationName")
        private String qualificationName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UseBySelf")
        private Boolean useBySelf;

        @com.aliyun.core.annotation.NameInMap("WhetherShare")
        private Boolean whetherShare;

        @com.aliyun.core.annotation.NameInMap("WorkOrderId")
        private Long workOrderId;

        private Data(Builder builder) {
            this.adminIDCardExpDate = builder.adminIDCardExpDate;
            this.adminIDCardFrontFace = builder.adminIDCardFrontFace;
            this.adminIDCardNo = builder.adminIDCardNo;
            this.adminIDCardPic = builder.adminIDCardPic;
            this.adminIDCardType = builder.adminIDCardType;
            this.adminName = builder.adminName;
            this.adminPhoneNo = builder.adminPhoneNo;
            this.businessLicensePics = builder.businessLicensePics;
            this.businessType = builder.businessType;
            this.companyName = builder.companyName;
            this.companyType = builder.companyType;
            this.effTimeStr = builder.effTimeStr;
            this.legalPersonIDCardNo = builder.legalPersonIDCardNo;
            this.legalPersonIDCardType = builder.legalPersonIDCardType;
            this.legalPersonIdCardEffTime = builder.legalPersonIdCardEffTime;
            this.legalPersonName = builder.legalPersonName;
            this.organizationCode = builder.organizationCode;
            this.otherFiles = builder.otherFiles;
            this.qualificationGroupId = builder.qualificationGroupId;
            this.qualificationName = builder.qualificationName;
            this.remark = builder.remark;
            this.state = builder.state;
            this.useBySelf = builder.useBySelf;
            this.whetherShare = builder.whetherShare;
            this.workOrderId = builder.workOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
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
         * @return effTimeStr
         */
        public String getEffTimeStr() {
            return this.effTimeStr;
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
         * @return legalPersonIdCardEffTime
         */
        public String getLegalPersonIdCardEffTime() {
            return this.legalPersonIdCardEffTime;
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
         * @return qualificationGroupId
         */
        public Long getQualificationGroupId() {
            return this.qualificationGroupId;
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
         * @return state
         */
        public String getState() {
            return this.state;
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

        /**
         * @return workOrderId
         */
        public Long getWorkOrderId() {
            return this.workOrderId;
        }

        public static final class Builder {
            private String adminIDCardExpDate; 
            private String adminIDCardFrontFace; 
            private String adminIDCardNo; 
            private String adminIDCardPic; 
            private String adminIDCardType; 
            private String adminName; 
            private String adminPhoneNo; 
            private java.util.List<BusinessLicensePics> businessLicensePics; 
            private String businessType; 
            private String companyName; 
            private String companyType; 
            private String effTimeStr; 
            private String legalPersonIDCardNo; 
            private String legalPersonIDCardType; 
            private String legalPersonIdCardEffTime; 
            private String legalPersonName; 
            private String organizationCode; 
            private java.util.List<OtherFiles> otherFiles; 
            private Long qualificationGroupId; 
            private String qualificationName; 
            private String remark; 
            private String state; 
            private Boolean useBySelf; 
            private Boolean whetherShare; 
            private Long workOrderId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adminIDCardExpDate = model.adminIDCardExpDate;
                this.adminIDCardFrontFace = model.adminIDCardFrontFace;
                this.adminIDCardNo = model.adminIDCardNo;
                this.adminIDCardPic = model.adminIDCardPic;
                this.adminIDCardType = model.adminIDCardType;
                this.adminName = model.adminName;
                this.adminPhoneNo = model.adminPhoneNo;
                this.businessLicensePics = model.businessLicensePics;
                this.businessType = model.businessType;
                this.companyName = model.companyName;
                this.companyType = model.companyType;
                this.effTimeStr = model.effTimeStr;
                this.legalPersonIDCardNo = model.legalPersonIDCardNo;
                this.legalPersonIDCardType = model.legalPersonIDCardType;
                this.legalPersonIdCardEffTime = model.legalPersonIdCardEffTime;
                this.legalPersonName = model.legalPersonName;
                this.organizationCode = model.organizationCode;
                this.otherFiles = model.otherFiles;
                this.qualificationGroupId = model.qualificationGroupId;
                this.qualificationName = model.qualificationName;
                this.remark = model.remark;
                this.state = model.state;
                this.useBySelf = model.useBySelf;
                this.whetherShare = model.whetherShare;
                this.workOrderId = model.workOrderId;
            } 

            /**
             * <p>经办人身份证有效期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01~2033-01-01</p>
             */
            public Builder adminIDCardExpDate(String adminIDCardExpDate) {
                this.adminIDCardExpDate = adminIDCardExpDate;
                return this;
            }

            /**
             * <p>经办人身份证国徽面，产品需求，要求身份证可以分正反面上传</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
             */
            public Builder adminIDCardFrontFace(String adminIDCardFrontFace) {
                this.adminIDCardFrontFace = adminIDCardFrontFace;
                return this;
            }

            /**
             * <p>经办人身份证号码</p>
             * 
             * <strong>example:</strong>
             * <p>511391********5123</p>
             */
            public Builder adminIDCardNo(String adminIDCardNo) {
                this.adminIDCardNo = adminIDCardNo;
                return this;
            }

            /**
             * <p>经办人身份证图片地址，正反面合一</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
             */
            public Builder adminIDCardPic(String adminIDCardPic) {
                this.adminIDCardPic = adminIDCardPic;
                return this;
            }

            /**
             * <p>管理员身份证类型</p>
             * 
             * <strong>example:</strong>
             * <p>identityCard</p>
             */
            public Builder adminIDCardType(String adminIDCardType) {
                this.adminIDCardType = adminIDCardType;
                return this;
            }

            /**
             * <p>经办人姓名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder adminName(String adminName) {
                this.adminName = adminName;
                return this;
            }

            /**
             * <p>经办人手机号码</p>
             * 
             * <strong>example:</strong>
             * <p>137*******</p>
             */
            public Builder adminPhoneNo(String adminPhoneNo) {
                this.adminPhoneNo = adminPhoneNo;
                return this;
            }

            /**
             * <p>证件信息</p>
             */
            public Builder businessLicensePics(java.util.List<BusinessLicensePics> businessLicensePics) {
                this.businessLicensePics = businessLicensePics;
                return this;
            }

            /**
             * <p>行业类型，在当前模式下是可以用产品线code来区分</p>
             * 
             * <strong>example:</strong>
             * <p>dysms</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>公司名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * <p>企业类型, COMPANY:公司，政府或者事业单位:NON_PROFIT_ORGANIZATION</p>
             * 
             * <strong>example:</strong>
             * <p>COMPANY</p>
             */
            public Builder companyType(String companyType) {
                this.companyType = companyType;
                return this;
            }

            /**
             * EffTimeStr.
             */
            public Builder effTimeStr(String effTimeStr) {
                this.effTimeStr = effTimeStr;
                return this;
            }

            /**
             * <p>法人身份证号码</p>
             * 
             * <strong>example:</strong>
             * <p>511391********5123</p>
             */
            public Builder legalPersonIDCardNo(String legalPersonIDCardNo) {
                this.legalPersonIDCardNo = legalPersonIDCardNo;
                return this;
            }

            /**
             * <p>法人身份证类型</p>
             * 
             * <strong>example:</strong>
             * <p>identityCard</p>
             */
            public Builder legalPersonIDCardType(String legalPersonIDCardType) {
                this.legalPersonIDCardType = legalPersonIDCardType;
                return this;
            }

            /**
             * <p>法人身份证有效期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01~2033-01-01</p>
             */
            public Builder legalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
                this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
                return this;
            }

            /**
             * <p>法人姓名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder legalPersonName(String legalPersonName) {
                this.legalPersonName = legalPersonName;
                return this;
            }

            /**
             * <p>社会统一信用代码</p>
             * 
             * <strong>example:</strong>
             * <p>910X********0012</p>
             */
            public Builder organizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
                return this;
            }

            /**
             * <p>更多资料</p>
             */
            public Builder otherFiles(java.util.List<OtherFiles> otherFiles) {
                this.otherFiles = otherFiles;
                return this;
            }

            /**
             * QualificationGroupId.
             */
            public Builder qualificationGroupId(Long qualificationGroupId) {
                this.qualificationGroupId = qualificationGroupId;
                return this;
            }

            /**
             * <p>资质名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder qualificationName(String qualificationName) {
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
                this.remark = remark;
                return this;
            }

            /**
             * <p>当前审核状态</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>是否自用</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useBySelf(Boolean useBySelf) {
                this.useBySelf = useBySelf;
                return this;
            }

            /**
             * WhetherShare.
             */
            public Builder whetherShare(Boolean whetherShare) {
                this.whetherShare = whetherShare;
                return this;
            }

            /**
             * <p>乾坤袋工单ID</p>
             * 
             * <strong>example:</strong>
             * <p>2001****</p>
             */
            public Builder workOrderId(Long workOrderId) {
                this.workOrderId = workOrderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
