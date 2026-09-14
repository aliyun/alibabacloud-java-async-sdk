// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiKeyResponseBody</p>
 */
public class GetApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("AuthServices")
    private java.util.List<AuthServices> authServices;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.NameInMap("KeyPrefix")
    private String keyPrefix;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.authServices = builder.authServices;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.keyId = builder.keyId;
        this.keyName = builder.keyName;
        this.keyPrefix = builder.keyPrefix;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return authServices
     */
    public java.util.List<AuthServices> getAuthServices() {
        return this.authServices;
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
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return keyPrefix
     */
    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private java.util.List<AuthServices> authServices; 
        private String createTime; 
        private String description; 
        private String keyId; 
        private String keyName; 
        private String keyPrefix; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.authServices = model.authServices;
            this.createTime = model.createTime;
            this.description = model.description;
            this.keyId = model.keyId;
            this.keyName = model.keyName;
            this.keyPrefix = model.keyPrefix;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The content of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The service IDs.</p>
         */
        public Builder authServices(java.util.List<AuthServices> authServices) {
            this.authServices = authServices;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test api key</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxxx</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>test api key</p>
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>The prefix of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-1235*****</p>
         */
        public Builder keyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiKeyResponseBody build() {
            return new GetApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
     */
    public static class AuthServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        private AuthServices(Builder builder) {
            this.serviceId = builder.serviceId;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthServices create() {
            return builder().build();
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String serviceId; 
            private String serviceType; 

            private Builder() {
            } 

            private Builder(AuthServices model) {
                this.serviceId = model.serviceId;
                this.serviceType = model.serviceType;
            } 

            /**
             * <p>The service IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-2ze8x9278c9iizl</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li><strong>drama</strong></li>
             * <li><strong>memroy</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public AuthServices build() {
                return new AuthServices(this);
            } 

        } 

    }
}
