// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainSpecialBizDetailResponseBody</p>
 */
public class QueryDomainSpecialBizDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List < ? > errorArgs;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
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
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the application for which the error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test-com</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The array of error parameters that are returned.</p>
         */
        public Builder errorArgs(java.util.List < ? > errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The error code.</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>110001</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code that is directly returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A83E1D74-E46B-505C-947A-8C6B7E41C011</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates whether to perform synchronous processing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public QueryDomainSpecialBizDetailResponseBody build() {
            return new QueryDomainSpecialBizDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainSpecialBizDetailResponseBody</p>
     */
    public static class DomainSpecialBizContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

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

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("FaxArea")
        private String faxArea;

        @com.aliyun.core.annotation.NameInMap("FaxExt")
        private String faxExt;

        @com.aliyun.core.annotation.NameInMap("FaxMain")
        private String faxMain;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Postalcode")
        private String postalcode;

        @com.aliyun.core.annotation.NameInMap("RegType")
        private Integer regType;

        @com.aliyun.core.annotation.NameInMap("RegistrantId")
        private String registrantId;

        @com.aliyun.core.annotation.NameInMap("TelArea")
        private String telArea;

        @com.aliyun.core.annotation.NameInMap("TelExt")
        private String telExt;

        @com.aliyun.core.annotation.NameInMap("TelMain")
        private String telMain;

        @com.aliyun.core.annotation.NameInMap("VspContactId")
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
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>258</p>
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The city.</p>
             */
            public Builder cCity(String cCity) {
                this.cCity = cCity;
                return this;
            }

            /**
             * <p>The organization name.</p>
             */
            public Builder cCompany(String cCompany) {
                this.cCompany = cCompany;
                return this;
            }

            /**
             * <p>The country code.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder cCountry(String cCountry) {
                this.cCountry = cCountry;
                return this;
            }

            /**
             * <p>The contact name.</p>
             */
            public Builder cName(String cName) {
                this.cName = cName;
                return this;
            }

            /**
             * <p>The province.</p>
             */
            public Builder cProvince(String cProvince) {
                this.cProvince = cProvince;
                return this;
            }

            /**
             * <p>The address.</p>
             */
            public Builder cVenu(String cVenu) {
                this.cVenu = cVenu;
                return this;
            }

            /**
             * <p>The city in English.</p>
             * 
             * <strong>example:</strong>
             * <p>an shan Shi</p>
             */
            public Builder eCity(String eCity) {
                this.eCity = eCity;
                return this;
            }

            /**
             * <p>The organization name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>hebeihuiheguandaozhizaoyouxiangongsi</p>
             */
            public Builder eCompany(String eCompany) {
                this.eCompany = eCompany;
                return this;
            }

            /**
             * <p>The contact name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>tong da wei</p>
             */
            public Builder eName(String eName) {
                this.eName = eName;
                return this;
            }

            /**
             * <p>The province in English.</p>
             * 
             * <strong>example:</strong>
             * <p>liao ning</p>
             */
            public Builder eProvince(String eProvince) {
                this.eProvince = eProvince;
                return this;
            }

            /**
             * <p>The address in English.</p>
             * 
             * <strong>example:</strong>
             * <p>tie xi qu xin kai jie 59-4 hao</p>
             */
            public Builder eVenu(String eVenu) {
                this.eVenu = eVenu;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The extended information.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The fax country code.</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder faxArea(String faxArea) {
                this.faxArea = faxArea;
                return this;
            }

            /**
             * <p>The fax extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>61284565</p>
             */
            public Builder faxExt(String faxExt) {
                this.faxExt = faxExt;
                return this;
            }

            /**
             * <p>The fax number with an area code or mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>16604121234</p>
             */
            public Builder faxMain(String faxMain) {
                this.faxMain = faxMain;
                return this;
            }

            /**
             * <p>The mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>156********</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The zip code.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder postalcode(String postalcode) {
                this.postalcode = postalcode;
                return this;
            }

            /**
             * <p>The contact type. Valid values: 1: individual. 2: enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder regType(Integer regType) {
                this.regType = regType;
                return this;
            }

            /**
             * <p>The registrant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121000002****</p>
             */
            public Builder registrantId(String registrantId) {
                this.registrantId = registrantId;
                return this;
            }

            /**
             * <p>The calling code of the country or region where the domain name contact is located.</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * <p>The telephone extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>61284565</p>
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * <p>The landline number with an area code or mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>16604121234</p>
             */
            public Builder telMain(String telMain) {
                this.telMain = telMain;
                return this;
            }

            /**
             * <p>The VSP contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121000001****</p>
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
    /**
     * 
     * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainSpecialBizDetailResponseBody</p>
     */
    public static class DomainSpecialBizCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

        @com.aliyun.core.annotation.NameInMap("CredentialNo")
        private String credentialNo;

        @com.aliyun.core.annotation.NameInMap("CredentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("CredentialUrl")
        private String credentialUrl;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("HolderCert")
        private Integer holderCert;

        @com.aliyun.core.annotation.NameInMap("SaleId")
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
             * <p>The ID of the associated workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>T20220831150014000001</p>
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The certificate number.</p>
             * 
             * <strong>example:</strong>
             * <p>4111111111111110**</p>
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * <p>The certificate type.</p>
             * 
             * <strong>example:</strong>
             * <p>SFZ</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>The certificate URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg">http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg</a></p>
             */
            public Builder credentialUrl(String credentialUrl) {
                this.credentialUrl = credentialUrl;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test003.cn</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Indicates whether the certificate belongs to the registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder holderCert(Integer holderCert) {
                this.holderCert = holderCert;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S20172315BJ37809</p>
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
    /**
     * 
     * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainSpecialBizDetailResponseBody</p>
     */
    public static class DomainSpecialOrderResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("OrderAmount")
        private Double orderAmount;

        @com.aliyun.core.annotation.NameInMap("OrderCurrency")
        private String orderCurrency;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderTime")
        private String orderTime;

        @com.aliyun.core.annotation.NameInMap("OrderYear")
        private Integer orderYear;

        @com.aliyun.core.annotation.NameInMap("SaleId")
        private String saleId;

        @com.aliyun.core.annotation.NameInMap("SubOrderId")
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
             * <p>The cost type.</p>
             * 
             * <strong>example:</strong>
             * <p>activate</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder orderAmount(Double orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder orderCurrency(String orderCurrency) {
                this.orderCurrency = orderCurrency;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S201601060123456</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The order status.</p>
             * 
             * <strong>example:</strong>
             * <p>ORDER_WAIT_PAY</p>
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>The time when the order was placed.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-19T14:28Z</p>
             */
            public Builder orderTime(String orderTime) {
                this.orderTime = orderTime;
                return this;
            }

            /**
             * <p>The validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderYear(Integer orderYear) {
                this.orderYear = orderYear;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S201601063418719</p>
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * <p>The suborder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S201601061234567</p>
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
    /**
     * 
     * {@link QueryDomainSpecialBizDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainSpecialBizDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditMsg")
        private String auditMsg;

        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("BizNo")
        private String bizNo;

        @com.aliyun.core.annotation.NameInMap("BizStatus")
        private String bizStatus;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainSpecialBizContact")
        private DomainSpecialBizContact domainSpecialBizContact;

        @com.aliyun.core.annotation.NameInMap("DomainSpecialBizCredentials")
        private java.util.List < DomainSpecialBizCredentials> domainSpecialBizCredentials;

        @com.aliyun.core.annotation.NameInMap("DomainSpecialOrderResult")
        private DomainSpecialOrderResult domainSpecialOrderResult;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("SaleId")
        private String saleId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The review information.</p>
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * <p>The business name.</p>
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A83E1D74-E46B-505C-947A-8C6B7E41C012</p>
             */
            public Builder bizNo(String bizNo) {
                this.bizNo = bizNo;
                return this;
            }

            /**
             * <p>The business status.</p>
             * 
             * <strong>example:</strong>
             * <p>REGISTRANT_VSP_AUDIT_SUCCESS</p>
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * <p>The business type.</p>
             * 
             * <strong>example:</strong>
             * <p>govRegister</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The time when the business was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-17 11:31:10</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test003.cn</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The contact information.</p>
             */
            public Builder domainSpecialBizContact(DomainSpecialBizContact domainSpecialBizContact) {
                this.domainSpecialBizContact = domainSpecialBizContact;
                return this;
            }

            /**
             * <p>The certificate information.</p>
             */
            public Builder domainSpecialBizCredentials(java.util.List < DomainSpecialBizCredentials> domainSpecialBizCredentials) {
                this.domainSpecialBizCredentials = domainSpecialBizCredentials;
                return this;
            }

            /**
             * <p>The information about the order.</p>
             */
            public Builder domainSpecialOrderResult(DomainSpecialOrderResult domainSpecialOrderResult) {
                this.domainSpecialOrderResult = domainSpecialOrderResult;
                return this;
            }

            /**
             * <p>The time when the business was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-21 15:10:04.0</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the business was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-21 15:10:04.0</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>34083</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S20172315BJ37809</p>
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * <p>The business status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of business status.</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The time when the business was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-17 18:11:15</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121000000****</p>
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
