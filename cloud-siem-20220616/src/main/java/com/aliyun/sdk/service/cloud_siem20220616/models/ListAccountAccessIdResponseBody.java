// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountAccessIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountAccessIdResponseBody</p>
 */
public class ListAccountAccessIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAccountAccessIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountAccessIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAccountAccessIdResponseBody build() {
            return new ListAccountAccessIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("AccessIdMd5")
        private String accessIdMd5;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountStr")
        private String accountStr;

        @com.aliyun.core.annotation.NameInMap("Bound")
        private Integer bound;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private Data(Builder builder) {
            this.accessId = builder.accessId;
            this.accessIdMd5 = builder.accessIdMd5;
            this.accountId = builder.accountId;
            this.accountStr = builder.accountStr;
            this.bound = builder.bound;
            this.cloudCode = builder.cloudCode;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessIdMd5
         */
        public String getAccessIdMd5() {
            return this.accessIdMd5;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountStr
         */
        public String getAccountStr() {
            return this.accountStr;
        }

        /**
         * @return bound
         */
        public Integer getBound() {
            return this.bound;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String accessId; 
            private String accessIdMd5; 
            private String accountId; 
            private String accountStr; 
            private Integer bound; 
            private String cloudCode; 
            private Long subUserId; 

            /**
             * The AccessKey ID of the cloud account that is added to the threat analysis feature.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * The MD5 hash value of the AccessKey ID.
             */
            public Builder accessIdMd5(String accessIdMd5) {
                this.accessIdMd5 = accessIdMd5;
                return this;
            }

            /**
             * The ID of the cloud account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The information about the cloud account to which the AccessKey ID belongs. The value is in the following format: Alibaba Cloud account ID|Alibaba Cloud account username|AccessKey ID.
             */
            public Builder accountStr(String accountStr) {
                this.accountStr = accountStr;
                return this;
            }

            /**
             * Indicates whether the cloud account to which the AccessKey ID belongs is added to the threat analysis feature. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder bound(Integer bound) {
                this.bound = bound;
                return this;
            }

            /**
             * The code of the cloud service provider.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to add the third-party cloud account.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
