// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link CreateTokenPlanKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTokenPlanKeyResponseBody</p>
 */
public class CreateTokenPlanKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateTokenPlanKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenPlanKeyResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateTokenPlanKeyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateTokenPlanKeyResponseBody build() {
            return new CreateTokenPlanKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTokenPlanKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTokenPlanKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaskedApiKey")
        private String maskedApiKey;

        @com.aliyun.core.annotation.NameInMap("PlainApiKey")
        private String plainApiKey;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        private Data(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.maskedApiKey = builder.maskedApiKey;
            this.plainApiKey = builder.plainApiKey;
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maskedApiKey
         */
        public String getMaskedApiKey() {
            return this.maskedApiKey;
        }

        /**
         * @return plainApiKey
         */
        public String getPlainApiKey() {
            return this.plainApiKey;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String apiKeyId; 
            private String createdAt; 
            private String description; 
            private String maskedApiKey; 
            private String plainApiKey; 
            private String sourceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKeyId = model.apiKeyId;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.maskedApiKey = model.maskedApiKey;
                this.plainApiKey = model.plainApiKey;
                this.sourceId = model.sourceId;
            } 

            /**
             * ApiKeyId.
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * MaskedApiKey.
             */
            public Builder maskedApiKey(String maskedApiKey) {
                this.maskedApiKey = maskedApiKey;
                return this;
            }

            /**
             * PlainApiKey.
             */
            public Builder plainApiKey(String plainApiKey) {
                this.plainApiKey = plainApiKey;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
