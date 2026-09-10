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
 * {@link CreateAgenticDBTenantApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgenticDBTenantApiKeyResponseBody</p>
 */
public class CreateAgenticDBTenantApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private String apiKeyId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    private CreateAgenticDBTenantApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.apiKeyId = builder.apiKeyId;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBTenantApiKeyResponseBody create() {
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
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder {
        private String apiKey; 
        private String apiKeyId; 
        private String createTime; 
        private String expireTime; 
        private String requestId; 
        private String tenantId; 
        private String tenantName; 

        private Builder() {
        } 

        private Builder(CreateAgenticDBTenantApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.apiKeyId = model.apiKeyId;
            this.createTime = model.createTime;
            this.expireTime = model.expireTime;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
            this.tenantName = model.tenantName;
        } 

        /**
         * <p>The plaintext of the API key. This value is returned only in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc_key_xxxx.yyyy</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The resource ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-xxxxxxxxxxxx</p>
         */
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The time when the API key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T08:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The expiration time of the API key. This value is empty if the API key never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-1B2C-3D4E-5F6A-7B8C9D0E1F2A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-aaaa111122223333</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-tenant</p>
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        public CreateAgenticDBTenantApiKeyResponseBody build() {
            return new CreateAgenticDBTenantApiKeyResponseBody(this);
        } 

    } 

}
