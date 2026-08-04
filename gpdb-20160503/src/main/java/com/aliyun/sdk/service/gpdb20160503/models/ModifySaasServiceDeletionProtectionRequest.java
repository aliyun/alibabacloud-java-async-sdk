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
 * {@link ModifySaasServiceDeletionProtectionRequest} extends {@link RequestModel}
 *
 * <p>ModifySaasServiceDeletionProtectionRequest</p>
 */
public class ModifySaasServiceDeletionProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    private ModifySaasServiceDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtection = builder.deletionProtection;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySaasServiceDeletionProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<ModifySaasServiceDeletionProtectionRequest, Builder> {
        private Boolean deletionProtection; 
        private String regionId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySaasServiceDeletionProtectionRequest request) {
            super(request);
            this.deletionProtection = request.deletionProtection;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
        } 

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * RegionId.
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
         * <p>agdb-xxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public ModifySaasServiceDeletionProtectionRequest build() {
            return new ModifySaasServiceDeletionProtectionRequest(this);
        } 

    } 

}
