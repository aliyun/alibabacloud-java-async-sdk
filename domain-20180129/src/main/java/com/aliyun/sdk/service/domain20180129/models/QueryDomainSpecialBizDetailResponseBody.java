// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainSpecialBizDetailResponseBody</p>
 */
public class QueryDomainSpecialBizDetailResponseBody extends TeaModel {
    @NameInMap("AllowRetry")
    private Boolean allowRetry;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorArgs")
    private java.util.List < ? > errorArgs;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Module")
    private Module module;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Synchro")
    private Boolean synchro;

    private QueryDomainSpecialBizDetailResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainSpecialBizDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List < ? > getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List < ? > errorArgs; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private Boolean synchro; 

        /**
         * Indicates whether retries are allowed.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * The name of the application for which the error code is returned.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The array of error parameters that are returned.
         */
        public Builder errorArgs(java.util.List < ? > errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * The HTTP status code that is directly returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates whether to perform synchronous processing.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public QueryDomainSpecialBizDetailResponseBody build() {
            return new QueryDomainSpecialBizDetailResponseBody(this);
        } 

    } 

    public static class DomainSpecialBizContact extends TeaModel {
        @NameInMap("BizId")
        private Long bizId;

        @NameInMap("CCity")
        private String cCity;

        @NameInMap("CCompany")
        private String cCompany;

        @NameInMap("CCountry")
        private String cCountry;

        @NameInMap("CName")
        private String cName;

        @NameInMap("CProvince")
        private String cProvince;

        @NameInMap("CVenu")
        private String cVenu;

        @NameInMap("ECity")
        private String eCity;

        @NameInMap("ECompany")
        private String eCompany;

        @NameInMap("EName")
        private String eName;

        @NameInMap("EProvince")
        private String eProvince;

        @NameInMap("EVenu")
        private String eVenu;

        @NameInMap("Email")
        private String email;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("FaxArea")
        private String faxArea;

        @NameInMap("FaxExt")
        private String faxExt;

        @NameInMap("FaxMain")
        private String faxMain;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("Postalcode")
        private String postalcode;

        @NameInMap("RegType")
        private Integer regType;

        @NameInMap("RegistrantId")
        private String registrantId;

        @NameInMap("TelArea")
        private String telArea;

        @NameInMap("TelExt")
        private String telExt;

        @NameInMap("TelMain")
        private String telMain;

        @NameInMap("VspContactId")
        private String vspContactId;

        private DomainSpecialBizContact(Builder builder) {
            this.bizId = builder.bizId;
            this.cCity = builder.cCity;
            this.cCompany = builder.cCompany;
            this.cCountry = builder.cCountry;
            this.cName = builder.cName;
            this.cProvince = builder.cProvince;
            this.cVenu = builder.cVenu;
            this.eCity = builder.eCity;
            this.eCompany = builder.eCompany;
            this.eName = builder.eName;
            this.eProvince = builder.eProvince;
            this.eVenu = builder.eVenu;
            this.email = builder.email;
            this.extend = builder.extend;
            this.faxArea = builder.faxArea;
            this.faxExt = builder.faxExt;
            this.faxMain = builder.faxMain;
            this.mobile = builder.mobile;
            this.postalcode = builder.postalcode;
            this.regType = builder.regType;
            this.registrantId = builder.registrantId;
            this.telArea = builder.telArea;
            this.telExt = builder.telExt;
            this.telMain = builder.telMain;
            this.vspContactId = builder.vspContactId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainSpecialBizContact create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
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
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return faxArea
         */
        public String getFaxArea() {
            return this.faxArea;
        }

        /**
         * @return faxExt
         */
        public String getFaxExt() {
            return this.faxExt;
        }

        /**
         * @return faxMain
         */
        public String getFaxMain() {
            return this.faxMain;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return postalcode
         */
        public String getPostalcode() {
            return this.postalcode;
        }

        /**
         * @return regType
         */
        public Integer getRegType() {
            return this.regType;
        }

        /**
         * @return registrantId
         */
        public String getRegistrantId() {
            return this.registrantId;
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
         * @return vspContactId
         */
        public String getVspContactId() {
            return this.vspContactId;
        }

        public static final class Builder {
            private Long bizId; 
            private String cCity; 
            private String cCompany; 
            private String cCountry; 
            private String cName; 
            private String cProvince; 
            private String cVenu; 
            private String eCity; 
            private String eCompany; 
            private String eName; 
            private String eProvince; 
            private String eVenu; 
            private String email; 
            private String extend; 
            private String faxArea; 
            private String faxExt; 
            private String faxMain; 
            private String mobile; 
            private String postalcode; 
            private Integer regType; 
            private String registrantId; 
            private String telArea; 
            private String telExt; 
            private String telMain; 
            private String vspContactId; 

            /**
             * The business ID.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * The city.
             */
            public Builder cCity(String cCity) {
                this.cCity = cCity;
                return this;
            }

            /**
             * The organization name.
             */
            public Builder cCompany(String cCompany) {
                this.cCompany = cCompany;
                return this;
            }

            /**
             * The country code.
             */
            public Builder cCountry(String cCountry) {
                this.cCountry = cCountry;
                return this;
            }

            /**
             * The contact name.
             */
            public Builder cName(String cName) {
                this.cName = cName;
                return this;
            }

            /**
             * The province.
             */
            public Builder cProvince(String cProvince) {
                this.cProvince = cProvince;
                return this;
            }

            /**
             * The address.
             */
            public Builder cVenu(String cVenu) {
                this.cVenu = cVenu;
                return this;
            }

            /**
             * The city in English.
             */
            public Builder eCity(String eCity) {
                this.eCity = eCity;
                return this;
            }

            /**
             * The organization name in English.
             */
            public Builder eCompany(String eCompany) {
                this.eCompany = eCompany;
                return this;
            }

            /**
             * The contact name in English.
             */
            public Builder eName(String eName) {
                this.eName = eName;
                return this;
            }

            /**
             * The province in English.
             */
            public Builder eProvince(String eProvince) {
                this.eProvince = eProvince;
                return this;
            }

            /**
             * The address in English.
             */
            public Builder eVenu(String eVenu) {
                this.eVenu = eVenu;
                return this;
            }

            /**
             * The email address.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The extended information.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * The fax country code.
             */
            public Builder faxArea(String faxArea) {
                this.faxArea = faxArea;
                return this;
            }

            /**
             * The fax extension number.
             */
            public Builder faxExt(String faxExt) {
                this.faxExt = faxExt;
                return this;
            }

            /**
             * The fax number with an area code or mobile number.
             */
            public Builder faxMain(String faxMain) {
                this.faxMain = faxMain;
                return this;
            }

            /**
             * The mobile number.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * The zip code.
             */
            public Builder postalcode(String postalcode) {
                this.postalcode = postalcode;
                return this;
            }

            /**
             * The contact type. Valid values: 1: individual. 2: enterprise.
             */
            public Builder regType(Integer regType) {
                this.regType = regType;
                return this;
            }

            /**
             * The registrant ID.
             */
            public Builder registrantId(String registrantId) {
                this.registrantId = registrantId;
                return this;
            }

            /**
             * The calling code of the country or region where the domain name contact is located.
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * The telephone extension number.
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * The landline number with an area code or mobile number.
             */
            public Builder telMain(String telMain) {
                this.telMain = telMain;
                return this;
            }

            /**
             * The VSP contact ID.
             */
            public Builder vspContactId(String vspContactId) {
                this.vspContactId = vspContactId;
                return this;
            }

            public DomainSpecialBizContact build() {
                return new DomainSpecialBizContact(this);
            } 

        } 

    }
    public static class DomainSpecialBizCredentials extends TeaModel {
        @NameInMap("BizId")
        private Long bizId;

        @NameInMap("CredentialNo")
        private String credentialNo;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("CredentialUrl")
        private String credentialUrl;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("HolderCert")
        private Integer holderCert;

        @NameInMap("SaleId")
        private String saleId;

        private DomainSpecialBizCredentials(Builder builder) {
            this.bizId = builder.bizId;
            this.credentialNo = builder.credentialNo;
            this.credentialType = builder.credentialType;
            this.credentialUrl = builder.credentialUrl;
            this.domainName = builder.domainName;
            this.holderCert = builder.holderCert;
            this.saleId = builder.saleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainSpecialBizCredentials create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return credentialUrl
         */
        public String getCredentialUrl() {
            return this.credentialUrl;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return holderCert
         */
        public Integer getHolderCert() {
            return this.holderCert;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        public static final class Builder {
            private Long bizId; 
            private String credentialNo; 
            private String credentialType; 
            private String credentialUrl; 
            private String domainName; 
            private Integer holderCert; 
            private String saleId; 

            /**
             * The ID of the associated workflow.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * The certificate number.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * The certificate type.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * The certificate URL.
             */
            public Builder credentialUrl(String credentialUrl) {
                this.credentialUrl = credentialUrl;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Indicates whether the certificate belongs to the registrant.
             */
            public Builder holderCert(Integer holderCert) {
                this.holderCert = holderCert;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            public DomainSpecialBizCredentials build() {
                return new DomainSpecialBizCredentials(this);
            } 

        } 

    }
    public static class DomainSpecialOrderResult extends TeaModel {
        @NameInMap("ActionType")
        private String actionType;

        @NameInMap("OrderAmount")
        private Double orderAmount;

        @NameInMap("OrderCurrency")
        private String orderCurrency;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("OrderTime")
        private String orderTime;

        @NameInMap("OrderYear")
        private Integer orderYear;

        @NameInMap("SaleId")
        private String saleId;

        @NameInMap("SubOrderId")
        private String subOrderId;

        private DomainSpecialOrderResult(Builder builder) {
            this.actionType = builder.actionType;
            this.orderAmount = builder.orderAmount;
            this.orderCurrency = builder.orderCurrency;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderTime = builder.orderTime;
            this.orderYear = builder.orderYear;
            this.saleId = builder.saleId;
            this.subOrderId = builder.subOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainSpecialOrderResult create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return orderAmount
         */
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return orderCurrency
         */
        public String getOrderCurrency() {
            return this.orderCurrency;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderTime
         */
        public String getOrderTime() {
            return this.orderTime;
        }

        /**
         * @return orderYear
         */
        public Integer getOrderYear() {
            return this.orderYear;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public static final class Builder {
            private String actionType; 
            private Double orderAmount; 
            private String orderCurrency; 
            private String orderId; 
            private String orderStatus; 
            private String orderTime; 
            private Integer orderYear; 
            private String saleId; 
            private String subOrderId; 

            /**
             * The cost type.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * The amount of the order.
             */
            public Builder orderAmount(Double orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * The currency.
             */
            public Builder orderCurrency(String orderCurrency) {
                this.orderCurrency = orderCurrency;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The order status.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * The time when the order was placed.
             */
            public Builder orderTime(String orderTime) {
                this.orderTime = orderTime;
                return this;
            }

            /**
             * The validity period.
             */
            public Builder orderYear(Integer orderYear) {
                this.orderYear = orderYear;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * The suborder ID.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            public DomainSpecialOrderResult build() {
                return new DomainSpecialOrderResult(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("AuditMsg")
        private String auditMsg;

        @NameInMap("BizName")
        private String bizName;

        @NameInMap("BizNo")
        private String bizNo;

        @NameInMap("BizStatus")
        private String bizStatus;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainSpecialBizContact")
        private DomainSpecialBizContact domainSpecialBizContact;

        @NameInMap("DomainSpecialBizCredentials")
        private java.util.List < DomainSpecialBizCredentials> domainSpecialBizCredentials;

        @NameInMap("DomainSpecialOrderResult")
        private DomainSpecialOrderResult domainSpecialOrderResult;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("SaleId")
        private String saleId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private Module(Builder builder) {
            this.auditMsg = builder.auditMsg;
            this.bizName = builder.bizName;
            this.bizNo = builder.bizNo;
            this.bizStatus = builder.bizStatus;
            this.bizType = builder.bizType;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.domainSpecialBizContact = builder.domainSpecialBizContact;
            this.domainSpecialBizCredentials = builder.domainSpecialBizCredentials;
            this.domainSpecialOrderResult = builder.domainSpecialOrderResult;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.orderId = builder.orderId;
            this.productId = builder.productId;
            this.saleId = builder.saleId;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return auditMsg
         */
        public String getAuditMsg() {
            return this.auditMsg;
        }

        /**
         * @return bizName
         */
        public String getBizName() {
            return this.bizName;
        }

        /**
         * @return bizNo
         */
        public String getBizNo() {
            return this.bizNo;
        }

        /**
         * @return bizStatus
         */
        public String getBizStatus() {
            return this.bizStatus;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainSpecialBizContact
         */
        public DomainSpecialBizContact getDomainSpecialBizContact() {
            return this.domainSpecialBizContact;
        }

        /**
         * @return domainSpecialBizCredentials
         */
        public java.util.List < DomainSpecialBizCredentials> getDomainSpecialBizCredentials() {
            return this.domainSpecialBizCredentials;
        }

        /**
         * @return domainSpecialOrderResult
         */
        public DomainSpecialOrderResult getDomainSpecialOrderResult() {
            return this.domainSpecialOrderResult;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String auditMsg; 
            private String bizName; 
            private String bizNo; 
            private String bizStatus; 
            private String bizType; 
            private Long createTime; 
            private String domainName; 
            private DomainSpecialBizContact domainSpecialBizContact; 
            private java.util.List < DomainSpecialBizCredentials> domainSpecialBizCredentials; 
            private DomainSpecialOrderResult domainSpecialOrderResult; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String orderId; 
            private String productId; 
            private String saleId; 
            private Integer status; 
            private String statusDesc; 
            private Long updateTime; 
            private String userId; 

            /**
             * The review information.
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * The business name.
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * The business ID.
             */
            public Builder bizNo(String bizNo) {
                this.bizNo = bizNo;
                return this;
            }

            /**
             * The business status.
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * The business type.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The time when the business was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The contact information.
             */
            public Builder domainSpecialBizContact(DomainSpecialBizContact domainSpecialBizContact) {
                this.domainSpecialBizContact = domainSpecialBizContact;
                return this;
            }

            /**
             * The certificate information.
             */
            public Builder domainSpecialBizCredentials(java.util.List < DomainSpecialBizCredentials> domainSpecialBizCredentials) {
                this.domainSpecialBizCredentials = domainSpecialBizCredentials;
                return this;
            }

            /**
             * The information about the order.
             */
            public Builder domainSpecialOrderResult(DomainSpecialOrderResult domainSpecialOrderResult) {
                this.domainSpecialOrderResult = domainSpecialOrderResult;
                return this;
            }

            /**
             * The time when the business was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the business was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The primary key.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * The business status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The description of business status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The time when the business was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
