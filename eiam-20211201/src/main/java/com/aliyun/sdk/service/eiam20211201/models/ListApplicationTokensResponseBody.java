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
 * {@link ListApplicationTokensResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationTokensResponseBody</p>
 */
public class ListApplicationTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationTokens")
    private java.util.List<ApplicationTokens> applicationTokens;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationTokensResponseBody(Builder builder) {
        this.applicationTokens = builder.applicationTokens;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationTokensResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTokens
     */
    public java.util.List<ApplicationTokens> getApplicationTokens() {
        return this.applicationTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApplicationTokens> applicationTokens; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationTokensResponseBody model) {
            this.applicationTokens = model.applicationTokens;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationTokens.
         */
        public Builder applicationTokens(java.util.List<ApplicationTokens> applicationTokens) {
            this.applicationTokens = applicationTokens;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationTokensResponseBody build() {
            return new ListApplicationTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationTokensResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationTokensResponseBody</p>
     */
    public static class ApplicationTokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplicationTokens(Builder builder) {
            this.aliUid = builder.aliUid;
            this.applicationId = builder.applicationId;
            this.applicationToken = builder.applicationToken;
            this.applicationTokenId = builder.applicationTokenId;
            this.applicationTokenType = builder.applicationTokenType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expirationTime = builder.expirationTime;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTokens create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private Long aliUid; 
            private String applicationId; 
            private String applicationToken; 
            private String applicationTokenId; 
            private String applicationTokenType; 
            private Long createTime; 
            private String description; 
            private Long expirationTime; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApplicationTokens model) {
                this.aliUid = model.aliUid;
                this.applicationId = model.applicationId;
                this.applicationToken = model.applicationToken;
                this.applicationTokenId = model.applicationTokenId;
                this.applicationTokenType = model.applicationTokenType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expirationTime = model.expirationTime;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.status = model.status;
            } 

            /**
             * <p>aliUid。</p>
             * 
             * <strong>example:</strong>
             * <p>1973166921975xxxx</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>应用ID</p>
             * 
             * <strong>example:</strong>
             * <p>app_m7ar5tms4dwtggavalk3j3mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>应用token</p>
             * 
             * <strong>example:</strong>
             * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBYktxxxx</p>
             */
            public Builder applicationToken(String applicationToken) {
                this.applicationToken = applicationToken;
                return this;
            }

            /**
             * <p>应用token ID</p>
             * 
             * <strong>example:</strong>
             * <p>token_ndfxxigahelfne2y2hodehrxxxx</p>
             */
            public Builder applicationTokenId(String applicationTokenId) {
                this.applicationTokenId = applicationTokenId;
                return this;
            }

            /**
             * <p>应用token类型</p>
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
             * <p>应用token描述</p>
             * 
             * <strong>example:</strong>
             * <p>jwqtts-0430</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>到期时间</p>
             * 
             * <strong>example:</strong>
             * <p>1747796654000</p>
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
             * <p>最后使用时间</p>
             * 
             * <strong>example:</strong>
             * <p>1747796654000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>应用状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationTokens build() {
                return new ApplicationTokens(this);
            } 

        } 

    }
}
