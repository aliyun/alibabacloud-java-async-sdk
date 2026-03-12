// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryContactTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContactTemplateResponseBody</p>
 */
public class QueryContactTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactTemplates")
    private ContactTemplates contactTemplates;

    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryContactTemplateResponseBody(Builder builder) {
        this.contactTemplates = builder.contactTemplates;
        this.currentPageNum = builder.currentPageNum;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplates
     */
    public ContactTemplates getContactTemplates() {
        return this.contactTemplates;
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private ContactTemplates contactTemplates; 
        private Integer currentPageNum; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(QueryContactTemplateResponseBody model) {
            this.contactTemplates = model.contactTemplates;
            this.currentPageNum = model.currentPageNum;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * ContactTemplates.
         */
        public Builder contactTemplates(ContactTemplates contactTemplates) {
            this.contactTemplates = contactTemplates;
            return this;
        }

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryContactTemplateResponseBody build() {
            return new QueryContactTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryContactTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryContactTemplateResponseBody</p>
     */
    public static class ContactTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("CCity")
        private String cCity;

        @com.aliyun.core.annotation.NameInMap("CCompany")
        private String cCompany;

        @com.aliyun.core.annotation.NameInMap("CCountry")
        private String cCountry;

        @com.aliyun.core.annotation.NameInMap("CName")
        private String cName;

        @com.aliyun.core.annotation.NameInMap("CProvince")
        private String cProvince;

        @com.aliyun.core.annotation.NameInMap("CVenu")
        private String cVenu;

        @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
        private Long contactTemplateId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultTemplate")
        private Boolean defaultTemplate;

        @com.aliyun.core.annotation.NameInMap("ECity")
        private String eCity;

        @com.aliyun.core.annotation.NameInMap("ECompany")
        private String eCompany;

        @com.aliyun.core.annotation.NameInMap("EName")
        private String eName;

        @com.aliyun.core.annotation.NameInMap("EProvince")
        private String eProvince;

        @com.aliyun.core.annotation.NameInMap("EVenu")
        private String eVenu;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EmailVerificationStatus")
        private Integer emailVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("RegType")
        private String regType;

        @com.aliyun.core.annotation.NameInMap("TelArea")
        private String telArea;

        @com.aliyun.core.annotation.NameInMap("TelExt")
        private String telExt;

        @com.aliyun.core.annotation.NameInMap("TelMain")
        private String telMain;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ContactTemplate(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.cCity = builder.cCity;
            this.cCompany = builder.cCompany;
            this.cCountry = builder.cCountry;
            this.cName = builder.cName;
            this.cProvince = builder.cProvince;
            this.cVenu = builder.cVenu;
            this.contactTemplateId = builder.contactTemplateId;
            this.createTime = builder.createTime;
            this.defaultTemplate = builder.defaultTemplate;
            this.eCity = builder.eCity;
            this.eCompany = builder.eCompany;
            this.eName = builder.eName;
            this.eProvince = builder.eProvince;
            this.eVenu = builder.eVenu;
            this.email = builder.email;
            this.emailVerificationStatus = builder.emailVerificationStatus;
            this.postalCode = builder.postalCode;
            this.regType = builder.regType;
            this.telArea = builder.telArea;
            this.telExt = builder.telExt;
            this.telMain = builder.telMain;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactTemplate create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return cCity
         */
        public String getCCity() {
            return this.cCity;
        }

        /**
         * @return cCompany
         */
        public String getCCompany() {
            return this.cCompany;
        }

        /**
         * @return cCountry
         */
        public String getCCountry() {
            return this.cCountry;
        }

        /**
         * @return cName
         */
        public String getCName() {
            return this.cName;
        }

        /**
         * @return cProvince
         */
        public String getCProvince() {
            return this.cProvince;
        }

        /**
         * @return cVenu
         */
        public String getCVenu() {
            return this.cVenu;
        }

        /**
         * @return contactTemplateId
         */
        public Long getContactTemplateId() {
            return this.contactTemplateId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultTemplate
         */
        public Boolean getDefaultTemplate() {
            return this.defaultTemplate;
        }

        /**
         * @return eCity
         */
        public String getECity() {
            return this.eCity;
        }

        /**
         * @return eCompany
         */
        public String getECompany() {
            return this.eCompany;
        }

        /**
         * @return eName
         */
        public String getEName() {
            return this.eName;
        }

        /**
         * @return eProvince
         */
        public String getEProvince() {
            return this.eProvince;
        }

        /**
         * @return eVenu
         */
        public String getEVenu() {
            return this.eVenu;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return emailVerificationStatus
         */
        public Integer getEmailVerificationStatus() {
            return this.emailVerificationStatus;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return regType
         */
        public String getRegType() {
            return this.regType;
        }

        /**
         * @return telArea
         */
        public String getTelArea() {
            return this.telArea;
        }

        /**
         * @return telExt
         */
        public String getTelExt() {
            return this.telExt;
        }

        /**
         * @return telMain
         */
        public String getTelMain() {
            return this.telMain;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String auditStatus; 
            private String cCity; 
            private String cCompany; 
            private String cCountry; 
            private String cName; 
            private String cProvince; 
            private String cVenu; 
            private Long contactTemplateId; 
            private String createTime; 
            private Boolean defaultTemplate; 
            private String eCity; 
            private String eCompany; 
            private String eName; 
            private String eProvince; 
            private String eVenu; 
            private String email; 
            private Integer emailVerificationStatus; 
            private String postalCode; 
            private String regType; 
            private String telArea; 
            private String telExt; 
            private String telMain; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ContactTemplate model) {
                this.auditStatus = model.auditStatus;
                this.cCity = model.cCity;
                this.cCompany = model.cCompany;
                this.cCountry = model.cCountry;
                this.cName = model.cName;
                this.cProvince = model.cProvince;
                this.cVenu = model.cVenu;
                this.contactTemplateId = model.contactTemplateId;
                this.createTime = model.createTime;
                this.defaultTemplate = model.defaultTemplate;
                this.eCity = model.eCity;
                this.eCompany = model.eCompany;
                this.eName = model.eName;
                this.eProvince = model.eProvince;
                this.eVenu = model.eVenu;
                this.email = model.email;
                this.emailVerificationStatus = model.emailVerificationStatus;
                this.postalCode = model.postalCode;
                this.regType = model.regType;
                this.telArea = model.telArea;
                this.telExt = model.telExt;
                this.telMain = model.telMain;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * CCity.
             */
            public Builder cCity(String cCity) {
                this.cCity = cCity;
                return this;
            }

            /**
             * CCompany.
             */
            public Builder cCompany(String cCompany) {
                this.cCompany = cCompany;
                return this;
            }

            /**
             * CCountry.
             */
            public Builder cCountry(String cCountry) {
                this.cCountry = cCountry;
                return this;
            }

            /**
             * CName.
             */
            public Builder cName(String cName) {
                this.cName = cName;
                return this;
            }

            /**
             * CProvince.
             */
            public Builder cProvince(String cProvince) {
                this.cProvince = cProvince;
                return this;
            }

            /**
             * CVenu.
             */
            public Builder cVenu(String cVenu) {
                this.cVenu = cVenu;
                return this;
            }

            /**
             * ContactTemplateId.
             */
            public Builder contactTemplateId(Long contactTemplateId) {
                this.contactTemplateId = contactTemplateId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultTemplate.
             */
            public Builder defaultTemplate(Boolean defaultTemplate) {
                this.defaultTemplate = defaultTemplate;
                return this;
            }

            /**
             * ECity.
             */
            public Builder eCity(String eCity) {
                this.eCity = eCity;
                return this;
            }

            /**
             * ECompany.
             */
            public Builder eCompany(String eCompany) {
                this.eCompany = eCompany;
                return this;
            }

            /**
             * EName.
             */
            public Builder eName(String eName) {
                this.eName = eName;
                return this;
            }

            /**
             * EProvince.
             */
            public Builder eProvince(String eProvince) {
                this.eProvince = eProvince;
                return this;
            }

            /**
             * EVenu.
             */
            public Builder eVenu(String eVenu) {
                this.eVenu = eVenu;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EmailVerificationStatus.
             */
            public Builder emailVerificationStatus(Integer emailVerificationStatus) {
                this.emailVerificationStatus = emailVerificationStatus;
                return this;
            }

            /**
             * PostalCode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * RegType.
             */
            public Builder regType(String regType) {
                this.regType = regType;
                return this;
            }

            /**
             * TelArea.
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * TelExt.
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * TelMain.
             */
            public Builder telMain(String telMain) {
                this.telMain = telMain;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ContactTemplate build() {
                return new ContactTemplate(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryContactTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryContactTemplateResponseBody</p>
     */
    public static class ContactTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactTemplate")
        private java.util.List<ContactTemplate> contactTemplate;

        private ContactTemplates(Builder builder) {
            this.contactTemplate = builder.contactTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactTemplates create() {
            return builder().build();
        }

        /**
         * @return contactTemplate
         */
        public java.util.List<ContactTemplate> getContactTemplate() {
            return this.contactTemplate;
        }

        public static final class Builder {
            private java.util.List<ContactTemplate> contactTemplate; 

            private Builder() {
            } 

            private Builder(ContactTemplates model) {
                this.contactTemplate = model.contactTemplate;
            } 

            /**
             * ContactTemplate.
             */
            public Builder contactTemplate(java.util.List<ContactTemplate> contactTemplate) {
                this.contactTemplate = contactTemplate;
                return this;
            }

            public ContactTemplates build() {
                return new ContactTemplates(this);
            } 

        } 

    }
}
