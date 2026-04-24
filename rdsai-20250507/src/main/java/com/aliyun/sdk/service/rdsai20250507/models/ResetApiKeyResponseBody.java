// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ResetApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ResetApiKeyResponseBody</p>
 */
public class ResetApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ResetApiKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ResetApiKeyResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ResetApiKeyResponseBody build() {
            return new ResetApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ResetApiKeyResponseBody</p>
     */
    public static class CustomKeyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        private CustomKeyList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.keyName = builder.keyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomKeyList create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        public static final class Builder {
            private String apiKey; 
            private String keyName; 

            private Builder() {
            } 

            private Builder(CustomKeyList model) {
                this.apiKey = model.apiKey;
                this.keyName = model.keyName;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            public CustomKeyList build() {
                return new CustomKeyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ResetApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("CustomKeyList")
        private java.util.List<CustomKeyList> customKeyList;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.baseUrl = builder.baseUrl;
            this.customKeyList = builder.customKeyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return customKeyList
         */
        public java.util.List<CustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        public static final class Builder {
            private String apiKey; 
            private String baseUrl; 
            private java.util.List<CustomKeyList> customKeyList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.baseUrl = model.baseUrl;
                this.customKeyList = model.customKeyList;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * CustomKeyList.
             */
            public Builder customKeyList(java.util.List<CustomKeyList> customKeyList) {
                this.customKeyList = customKeyList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
