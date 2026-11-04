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
 * {@link DescribeDBClusterModelEnhancementResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterModelEnhancementResponseBody</p>
 */
public class DescribeDBClusterModelEnhancementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ModelEnhancementKeyNumber")
    private Integer modelEnhancementKeyNumber;

    @com.aliyun.core.annotation.NameInMap("ModelEnhancementKeys")
    private java.util.List<ModelEnhancementKeys> modelEnhancementKeys;

    @com.aliyun.core.annotation.NameInMap("ModelEnhancementStatus")
    private String modelEnhancementStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterModelEnhancementResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modelEnhancementKeyNumber = builder.modelEnhancementKeyNumber;
        this.modelEnhancementKeys = builder.modelEnhancementKeys;
        this.modelEnhancementStatus = builder.modelEnhancementStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterModelEnhancementResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modelEnhancementKeyNumber
     */
    public Integer getModelEnhancementKeyNumber() {
        return this.modelEnhancementKeyNumber;
    }

    /**
     * @return modelEnhancementKeys
     */
    public java.util.List<ModelEnhancementKeys> getModelEnhancementKeys() {
        return this.modelEnhancementKeys;
    }

    /**
     * @return modelEnhancementStatus
     */
    public String getModelEnhancementStatus() {
        return this.modelEnhancementStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private Integer modelEnhancementKeyNumber; 
        private java.util.List<ModelEnhancementKeys> modelEnhancementKeys; 
        private String modelEnhancementStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterModelEnhancementResponseBody model) {
            this.createTime = model.createTime;
            this.modelEnhancementKeyNumber = model.modelEnhancementKeyNumber;
            this.modelEnhancementKeys = model.modelEnhancementKeys;
            this.modelEnhancementStatus = model.modelEnhancementStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the model enhancement feature was enabled, in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The number of API keys for model enhancement.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelEnhancementKeyNumber(Integer modelEnhancementKeyNumber) {
            this.modelEnhancementKeyNumber = modelEnhancementKeyNumber;
            return this;
        }

        /**
         * <p>The list of API keys for model enhancement.</p>
         */
        public Builder modelEnhancementKeys(java.util.List<ModelEnhancementKeys> modelEnhancementKeys) {
            this.modelEnhancementKeys = modelEnhancementKeys;
            return this;
        }

        /**
         * <p>The status of the model enhancement feature. ON indicates that the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder modelEnhancementStatus(String modelEnhancementStatus) {
            this.modelEnhancementStatus = modelEnhancementStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterModelEnhancementResponseBody build() {
            return new DescribeDBClusterModelEnhancementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterModelEnhancementResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterModelEnhancementResponseBody</p>
     */
    public static class ModelEnhancementKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        private ModelEnhancementKeys(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiKeyId = builder.apiKeyId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelEnhancementKeys create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiKeyId
         */
        public String getApiKeyId() {
            return this.apiKeyId;
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
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        public static final class Builder {
            private String apiKey; 
            private String apiKeyId; 
            private String createTime; 
            private String description; 
            private String expireTime; 

            private Builder() {
            } 

            private Builder(ModelEnhancementKeys model) {
                this.apiKey = model.apiKey;
                this.apiKeyId = model.apiKeyId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expireTime = model.expireTime;
            } 

            /**
             * <p>The value of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>ak-12345</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-001</p>
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * <p>The time when the API key was created, in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>Model enhancement key</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the API key, in ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-31T23:59:59Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            public ModelEnhancementKeys build() {
                return new ModelEnhancementKeys(this);
            } 

        } 

    }
}
