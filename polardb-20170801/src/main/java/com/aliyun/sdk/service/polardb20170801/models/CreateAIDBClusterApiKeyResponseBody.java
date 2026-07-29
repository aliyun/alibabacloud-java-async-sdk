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
 * {@link CreateAIDBClusterApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAIDBClusterApiKeyResponseBody</p>
 */
public class CreateAIDBClusterApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private ApiKey apiKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAIDBClusterApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIDBClusterApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiKey apiKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAIDBClusterApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.requestId = model.requestId;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(ApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAIDBClusterApiKeyResponseBody build() {
            return new CreateAIDBClusterApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAIDBClusterApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAIDBClusterApiKeyResponseBody</p>
     */
    public static class ApiKey extends TeaModel {
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

        private ApiKey(Builder builder) {
            this.apiKey = builder.apiKey;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKey create() {
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

            private Builder(ApiKey model) {
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
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>393</p>
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

            public ApiKey build() {
                return new ApiKey(this);
            } 

        } 

    }
}
