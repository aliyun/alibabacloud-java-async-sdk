// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ObtainApplicationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainApplicationTokenResponseBody</p>
 */
public class ObtainApplicationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationToken")
    private ApplicationToken applicationToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ObtainApplicationTokenResponseBody(Builder builder) {
        this.applicationToken = builder.applicationToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainApplicationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationToken
     */
    public ApplicationToken getApplicationToken() {
        return this.applicationToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationToken applicationToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ObtainApplicationTokenResponseBody model) {
            this.applicationToken = model.applicationToken;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationToken.
         */
        public Builder applicationToken(ApplicationToken applicationToken) {
            this.applicationToken = applicationToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ObtainApplicationTokenResponseBody build() {
            return new ObtainApplicationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ObtainApplicationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainApplicationTokenResponseBody</p>
     */
    public static class ApplicationToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationToken")
        private String applicationToken;

        @com.aliyun.core.annotation.NameInMap("ApplicationTokenId")
        private String applicationTokenId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTokenType")
        private String applicationTokenType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplicationToken(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationToken = builder.applicationToken;
            this.applicationTokenId = builder.applicationTokenId;
            this.applicationTokenType = builder.applicationTokenType;
            this.createTime = builder.createTime;
            this.expirationTime = builder.expirationTime;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationToken create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationToken
         */
        public String getApplicationToken() {
            return this.applicationToken;
        }

        /**
         * @return applicationTokenId
         */
        public String getApplicationTokenId() {
            return this.applicationTokenId;
        }

        /**
         * @return applicationTokenType
         */
        public String getApplicationTokenType() {
            return this.applicationTokenType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationToken; 
            private String applicationTokenId; 
            private String applicationTokenType; 
            private Long createTime; 
            private Long expirationTime; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApplicationToken model) {
                this.applicationId = model.applicationId;
                this.applicationToken = model.applicationToken;
                this.applicationTokenId = model.applicationTokenId;
                this.applicationTokenType = model.applicationTokenType;
                this.createTime = model.createTime;
                this.expirationTime = model.expirationTime;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.status = model.status;
            } 

            /**
             * <p>IDaaS EIAM 应用Id</p>
             * 
             * <strong>example:</strong>
             * <p>app_na2r73a65s7o4zbs7nj5gxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>客户端密钥</p>
             * 
             * <strong>example:</strong>
             * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBxxxxx</p>
             */
            public Builder applicationToken(String applicationToken) {
                this.applicationToken = applicationToken;
                return this;
            }

            /**
             * <p>IDaaS EIAM 客户端ID</p>
             * 
             * <strong>example:</strong>
             * <p>token_m7aso6v4efvu2otfq3jdzxxxx</p>
             */
            public Builder applicationTokenId(String applicationTokenId) {
                this.applicationTokenId = applicationTokenId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 客户端密钥Id</p>
             * 
             * <strong>example:</strong>
             * <p>bearer_token</p>
             */
            public Builder applicationTokenType(String applicationTokenType) {
                this.applicationTokenType = applicationTokenType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ki6hd7ihir4ybawogqk6kqxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 客户端密钥最近使用时间</p>
             * 
             * <strong>example:</strong>
             * <p>1735610930000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 客户端密钥状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationToken build() {
                return new ApplicationToken(this);
            } 

        } 

    }
}
