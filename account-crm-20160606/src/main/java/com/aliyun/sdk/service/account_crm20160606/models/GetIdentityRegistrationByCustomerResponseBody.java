// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetIdentityRegistrationByCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityRegistrationByCustomerResponseBody</p>
 */
public class GetIdentityRegistrationByCustomerResponseBody extends TeaModel {
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

    private GetIdentityRegistrationByCustomerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityRegistrationByCustomerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityRegistrationByCustomerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        public GetIdentityRegistrationByCustomerResponseBody build() {
            return new GetIdentityRegistrationByCustomerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityRegistrationByCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityRegistrationByCustomerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private Integer accountType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplyStatus")
        private String applyStatus;

        @com.aliyun.core.annotation.NameInMap("AuditCode")
        private String auditCode;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private Long customerId;

        @com.aliyun.core.annotation.NameInMap("DocBackPic")
        private String docBackPic;

        @com.aliyun.core.annotation.NameInMap("DocFrontPic")
        private String docFrontPic;

        @com.aliyun.core.annotation.NameInMap("DocNum")
        private String docNum;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("RegisteredAddress")
        private String registeredAddress;

        @com.aliyun.core.annotation.NameInMap("RegisteredCountry")
        private String registeredCountry;

        @com.aliyun.core.annotation.NameInMap("RegisteredNum")
        private String registeredNum;

        @com.aliyun.core.annotation.NameInMap("Tel")
        private String tel;

        private Data(Builder builder) {
            this.accountType = builder.accountType;
            this.applicationId = builder.applicationId;
            this.applyStatus = builder.applyStatus;
            this.auditCode = builder.auditCode;
            this.customerId = builder.customerId;
            this.docBackPic = builder.docBackPic;
            this.docFrontPic = builder.docFrontPic;
            this.docNum = builder.docNum;
            this.docType = builder.docType;
            this.email = builder.email;
            this.fullName = builder.fullName;
            this.registeredAddress = builder.registeredAddress;
            this.registeredCountry = builder.registeredCountry;
            this.registeredNum = builder.registeredNum;
            this.tel = builder.tel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applyStatus
         */
        public String getApplyStatus() {
            return this.applyStatus;
        }

        /**
         * @return auditCode
         */
        public String getAuditCode() {
            return this.auditCode;
        }

        /**
         * @return customerId
         */
        public Long getCustomerId() {
            return this.customerId;
        }

        /**
         * @return docBackPic
         */
        public String getDocBackPic() {
            return this.docBackPic;
        }

        /**
         * @return docFrontPic
         */
        public String getDocFrontPic() {
            return this.docFrontPic;
        }

        /**
         * @return docNum
         */
        public String getDocNum() {
            return this.docNum;
        }

        /**
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return registeredAddress
         */
        public String getRegisteredAddress() {
            return this.registeredAddress;
        }

        /**
         * @return registeredCountry
         */
        public String getRegisteredCountry() {
            return this.registeredCountry;
        }

        /**
         * @return registeredNum
         */
        public String getRegisteredNum() {
            return this.registeredNum;
        }

        /**
         * @return tel
         */
        public String getTel() {
            return this.tel;
        }

        public static final class Builder {
            private Integer accountType; 
            private Long applicationId; 
            private String applyStatus; 
            private String auditCode; 
            private Long customerId; 
            private String docBackPic; 
            private String docFrontPic; 
            private String docNum; 
            private String docType; 
            private String email; 
            private String fullName; 
            private String registeredAddress; 
            private String registeredCountry; 
            private String registeredNum; 
            private String tel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountType = model.accountType;
                this.applicationId = model.applicationId;
                this.applyStatus = model.applyStatus;
                this.auditCode = model.auditCode;
                this.customerId = model.customerId;
                this.docBackPic = model.docBackPic;
                this.docFrontPic = model.docFrontPic;
                this.docNum = model.docNum;
                this.docType = model.docType;
                this.email = model.email;
                this.fullName = model.fullName;
                this.registeredAddress = model.registeredAddress;
                this.registeredCountry = model.registeredCountry;
                this.registeredNum = model.registeredNum;
                this.tel = model.tel;
            } 

            /**
             * AccountType.
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplyStatus.
             */
            public Builder applyStatus(String applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * AuditCode.
             */
            public Builder auditCode(String auditCode) {
                this.auditCode = auditCode;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(Long customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * DocBackPic.
             */
            public Builder docBackPic(String docBackPic) {
                this.docBackPic = docBackPic;
                return this;
            }

            /**
             * DocFrontPic.
             */
            public Builder docFrontPic(String docFrontPic) {
                this.docFrontPic = docFrontPic;
                return this;
            }

            /**
             * DocNum.
             */
            public Builder docNum(String docNum) {
                this.docNum = docNum;
                return this;
            }

            /**
             * DocType.
             */
            public Builder docType(String docType) {
                this.docType = docType;
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
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * RegisteredAddress.
             */
            public Builder registeredAddress(String registeredAddress) {
                this.registeredAddress = registeredAddress;
                return this;
            }

            /**
             * RegisteredCountry.
             */
            public Builder registeredCountry(String registeredCountry) {
                this.registeredCountry = registeredCountry;
                return this;
            }

            /**
             * RegisteredNum.
             */
            public Builder registeredNum(String registeredNum) {
                this.registeredNum = registeredNum;
                return this;
            }

            /**
             * Tel.
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
