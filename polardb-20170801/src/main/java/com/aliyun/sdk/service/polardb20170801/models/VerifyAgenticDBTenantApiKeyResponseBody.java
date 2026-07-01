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
 * {@link VerifyAgenticDBTenantApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyAgenticDBTenantApiKeyResponseBody</p>
 */
public class VerifyAgenticDBTenantApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private String apiKeyId;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("Valid")
    private Boolean valid;

    private VerifyAgenticDBTenantApiKeyResponseBody(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.DBClusterId = builder.DBClusterId;
        this.expireTime = builder.expireTime;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAgenticDBTenantApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder {
        private String apiKeyId; 
        private String DBClusterId; 
        private String expireTime; 
        private String reason; 
        private String regionId; 
        private String requestId; 
        private String tenantId; 
        private String tenantName; 
        private Boolean valid; 

        private Builder() {
        } 

        private Builder(VerifyAgenticDBTenantApiKeyResponseBody model) {
            this.apiKeyId = model.apiKeyId;
            this.DBClusterId = model.DBClusterId;
            this.expireTime = model.expireTime;
            this.reason = model.reason;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
            this.tenantName = model.tenantName;
            this.valid = model.valid;
        } 

        /**
         * ApiKeyId.
         */
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * Valid.
         */
        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        public VerifyAgenticDBTenantApiKeyResponseBody build() {
            return new VerifyAgenticDBTenantApiKeyResponseBody(this);
        } 

    } 

}
