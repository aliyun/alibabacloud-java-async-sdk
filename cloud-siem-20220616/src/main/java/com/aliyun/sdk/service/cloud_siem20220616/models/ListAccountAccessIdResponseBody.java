// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListAccountAccessIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountAccessIdResponseBody</p>
 */
public class ListAccountAccessIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAccountAccessIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAccountAccessIdResponseBody build() {
            return new ListAccountAccessIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountAccessIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountAccessIdResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessId = model.accessId;
                this.accessIdMd5 = model.accessIdMd5;
                this.accountId = model.accountId;
                this.accountStr = model.accountStr;
                this.bound = model.bound;
                this.cloudCode = model.cloudCode;
                this.subUserId = model.subUserId;
            } 

            /**
             * <p>The AccessKey ID of the cloud account that is added to the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>ABCXXXXXXXX</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The MD5 hash value of the AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abcXXXXXXXX</p>
             */
            public Builder accessIdMd5(String accessIdMd5) {
                this.accessIdMd5 = accessIdMd5;
                return this;
            }

            /**
             * <p>The ID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The information about the cloud account to which the AccessKey ID belongs. The value is in the following format: Alibaba Cloud account ID|Alibaba Cloud account username|AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxx|xxxx|ABCXXXXX</p>
             */
            public Builder accountStr(String accountStr) {
                this.accountStr = accountStr;
                return this;
            }

            /**
             * <p>Indicates whether the cloud account to which the AccessKey ID belongs is added to the threat analysis feature. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bound(Integer bound) {
                this.bound = bound;
                return this;
            }

            /**
             * <p>The code of the cloud service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to add the third-party cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>ABCXXXXXXXX</p>
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
