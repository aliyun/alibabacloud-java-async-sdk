// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterApiKeysResponseBody</p>
 */
public class DescribeAIDBClusterApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    private java.util.List<ApiKeys> apiKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAIDBClusterApiKeysResponseBody(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApiKeys> apiKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterApiKeysResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API Keys。</p>
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIDBClusterApiKeysResponseBody build() {
            return new DescribeAIDBClusterApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterApiKeysResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApiKeys(Builder builder) {
            this.apiKey = builder.apiKey;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiKey; 
            private String createTime; 
            private String description; 
            private String id; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKey = model.apiKey;
                this.createTime = model.createTime;
                this.description = model.description;
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ApiKey ID</p>
             * 
             * <strong>example:</strong>
             * <p>573</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
