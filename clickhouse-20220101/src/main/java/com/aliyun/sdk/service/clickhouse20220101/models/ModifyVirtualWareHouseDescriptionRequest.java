// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVirtualWareHouseDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualWareHouseDescriptionRequest</p>
 */
public class ModifyVirtualWareHouseDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseId;

    private ModifyVirtualWareHouseDescriptionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.virtualWareHouseDescription = builder.virtualWareHouseDescription;
        this.virtualWareHouseId = builder.virtualWareHouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualWareHouseDescriptionRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return virtualWareHouseDescription
     */
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    /**
     * @return virtualWareHouseId
     */
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static final class Builder extends Request.Builder<ModifyVirtualWareHouseDescriptionRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String virtualWareHouseDescription; 
        private String virtualWareHouseId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualWareHouseDescriptionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.virtualWareHouseDescription = request.virtualWareHouseDescription;
            this.virtualWareHouseId = request.virtualWareHouseId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>test</p>
         */
        public Builder virtualWareHouseDescription(String virtualWareHouseDescription) {
            this.putQueryParameter("VirtualWareHouseDescription", virtualWareHouseDescription);
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vw-bp1w2728d535t****</p>
         */
        public Builder virtualWareHouseId(String virtualWareHouseId) {
            this.putQueryParameter("VirtualWareHouseId", virtualWareHouseId);
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }

        @Override
        public ModifyVirtualWareHouseDescriptionRequest build() {
            return new ModifyVirtualWareHouseDescriptionRequest(this);
        } 

    } 

}
