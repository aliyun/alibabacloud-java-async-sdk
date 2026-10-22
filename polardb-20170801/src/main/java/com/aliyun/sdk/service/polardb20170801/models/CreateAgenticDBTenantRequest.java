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
 * {@link CreateAgenticDBTenantRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticDBTenantRequest</p>
 */
public class CreateAgenticDBTenantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String tenantName;

    private CreateAgenticDBTenantRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBTenantRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAgenticDBTenantRequest, Builder> {
        private String DBClusterId; 
        private String description; 
        private String regionId; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticDBTenantRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.regionId = request.regionId;
            this.tenantName = request.tenantName;
        } 

        /**
         * <p>The AgenticDB cluster ID.</p>
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
         * <p>The description of the tenant. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Example tenant</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The name of the tenant. It must be 1 to 64 characters in length, start with a letter, and contain only letters, digits, underscores (_), and hyphens (-).</p>
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
        public CreateAgenticDBTenantRequest build() {
            return new CreateAgenticDBTenantRequest(this);
        } 

    } 

}
