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
 * {@link RotateTokenPlanKeyResponseBody} extends {@link TeaModel}
 *
 * <p>RotateTokenPlanKeyResponseBody</p>
 */
public class RotateTokenPlanKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RotateTokenPlanKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RotateTokenPlanKeyResponseBody create() {
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

        private Builder(RotateTokenPlanKeyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RotateTokenPlanKeyResponseBody build() {
            return new RotateTokenPlanKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RotateTokenPlanKeyResponseBody} extends {@link TeaModel}
     *
     * <p>RotateTokenPlanKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("MaskedApiKey")
        private String maskedApiKey;

        @com.aliyun.core.annotation.NameInMap("PlainApiKey")
        private String plainApiKey;

        @com.aliyun.core.annotation.NameInMap("ResetAt")
        private String resetAt;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        private Data(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.maskedApiKey = builder.maskedApiKey;
            this.plainApiKey = builder.plainApiKey;
            this.resetAt = builder.resetAt;
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
         * @return resetAt
         */
        public String getResetAt() {
            return this.resetAt;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String apiKeyId; 
            private String maskedApiKey; 
            private String plainApiKey; 
            private String resetAt; 
            private String sourceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKeyId = model.apiKeyId;
                this.maskedApiKey = model.maskedApiKey;
                this.plainApiKey = model.plainApiKey;
                this.resetAt = model.resetAt;
                this.sourceId = model.sourceId;
            } 

            /**
             * <p>The system-generated API key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_123456</p>
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * <p>The new masked API key returned by Model Studio, such as sk_***cdef.</p>
             * 
             * <strong>example:</strong>
             * <p>sk_***6</p>
             */
            public Builder maskedApiKey(String maskedApiKey) {
                this.maskedApiKey = maskedApiKey;
                return this;
            }

            /**
             * <p>The new plaintext API key returned by Model Studio. This key is returned only once upon reset.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-ws.abc123456</p>
             */
            public Builder plainApiKey(String plainApiKey) {
                this.plainApiKey = plainApiKey;
                return this;
            }

            /**
             * <p>The reset time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-18T03:19:17Z</p>
             */
            public Builder resetAt(String resetAt) {
                this.resetAt = resetAt;
                return this;
            }

            /**
             * <p>The source_id returned by Model Studio.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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
