// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomerAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerAccountInfoResponseBody</p>
 */
public class GetCustomerAccountInfoResponseBody extends TeaModel {
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

    private GetCustomerAccountInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerAccountInfoResponseBody create() {
        return builder().build();
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

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>94017C56-1725-5DD9-AB41-B3BAE791D600</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomerAccountInfoResponseBody build() {
            return new GetCustomerAccountInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomerAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerAccountInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("CreditLimitStatus")
        private String creditLimitStatus;

        @com.aliyun.core.annotation.NameInMap("HostingStatus")
        private String hostingStatus;

        @com.aliyun.core.annotation.NameInMap("IsCertified")
        private Boolean isCertified;

        @com.aliyun.core.annotation.NameInMap("LoginEmail")
        private String loginEmail;

        @com.aliyun.core.annotation.NameInMap("Mpk")
        private Long mpk;

        private Data(Builder builder) {
            this.accountType = builder.accountType;
            this.creditLimitStatus = builder.creditLimitStatus;
            this.hostingStatus = builder.hostingStatus;
            this.isCertified = builder.isCertified;
            this.loginEmail = builder.loginEmail;
            this.mpk = builder.mpk;
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
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return creditLimitStatus
         */
        public String getCreditLimitStatus() {
            return this.creditLimitStatus;
        }

        /**
         * @return hostingStatus
         */
        public String getHostingStatus() {
            return this.hostingStatus;
        }

        /**
         * @return isCertified
         */
        public Boolean getIsCertified() {
            return this.isCertified;
        }

        /**
         * @return loginEmail
         */
        public String getLoginEmail() {
            return this.loginEmail;
        }

        /**
         * @return mpk
         */
        public Long getMpk() {
            return this.mpk;
        }

        public static final class Builder {
            private String accountType; 
            private String creditLimitStatus; 
            private String hostingStatus; 
            private Boolean isCertified; 
            private String loginEmail; 
            private Long mpk; 

            /**
             * <p>The type of the account. A value of 1 indicates an enterprise account. A value of 0 indicates an individual account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The business status of the customer. Valid values:</p>
             * <p>Freeze: The business is frozen.</p>
             * <p>Thaw: The business is unfrozen.</p>
             * <p>Trusteeship: The business is hosted.</p>
             * <p>TrusteeshipCancel: The business is not hosted.</p>
             * 
             * <strong>example:</strong>
             * <p>Freeze</p>
             */
            public Builder creditLimitStatus(String creditLimitStatus) {
                this.creditLimitStatus = creditLimitStatus;
                return this;
            }

            /**
             * <p>The hosting status of the credit information and instances of the customer. If the credit information and instances of the customer are managed on Alibaba Cloud, Alibaba Cloud suspends a customer service upon overdue payment. Valid values:</p>
             * <p>FREEZE: The business of the customer is frozen.</p>
             * <p>TRUSTEESHIP: The business of the customer is hosted.</p>
             * 
             * <strong>example:</strong>
             * <p>FREEZE</p>
             */
            public Builder hostingStatus(String hostingStatus) {
                this.hostingStatus = hostingStatus;
                return this;
            }

            /**
             * <p>Indicates whether the account passes the real-name verification.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCertified(Boolean isCertified) {
                this.isCertified = isCertified;
                return this;
            }

            /**
             * <p>The email address of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xxxx@aliyun.com">xxxx@aliyun.com</a></p>
             */
            public Builder loginEmail(String loginEmail) {
                this.loginEmail = loginEmail;
                return this;
            }

            /**
             * <p>The ID of the management account.</p>
             * 
             * <strong>example:</strong>
             * <p>1051360339779133</p>
             */
            public Builder mpk(Long mpk) {
                this.mpk = mpk;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
