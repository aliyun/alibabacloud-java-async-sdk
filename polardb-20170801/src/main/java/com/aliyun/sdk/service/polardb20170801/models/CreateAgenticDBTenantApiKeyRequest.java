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
 * {@link CreateAgenticDBTenantApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticDBTenantApiKeyRequest</p>
 */
public class CreateAgenticDBTenantApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantName;

    private CreateAgenticDBTenantApiKeyRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.expireTime = builder.expireTime;
        this.regionId = builder.regionId;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBTenantApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder extends Request.Builder<CreateAgenticDBTenantApiKeyRequest, Builder> {
        private String DBClusterId; 
        private String description; 
        private String expireTime; 
        private String regionId; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticDBTenantApiKeyRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.expireTime = request.expireTime;
            this.regionId = request.regionId;
            this.tenantName = request.tenantName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-tenant</p>
         */
        public Builder tenantName(String tenantName) {
            this.putQueryParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        @Override
        public CreateAgenticDBTenantApiKeyRequest build() {
            return new CreateAgenticDBTenantApiKeyRequest(this);
        } 

    } 

}
