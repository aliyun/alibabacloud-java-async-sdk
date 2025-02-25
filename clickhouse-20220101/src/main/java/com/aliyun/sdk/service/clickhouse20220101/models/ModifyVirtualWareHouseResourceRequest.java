// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVirtualWareHouseResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualWareHouseResourceRequest</p>
 */
public class ModifyVirtualWareHouseResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseCacheStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer virtualWareHouseCacheStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseId;

    private ModifyVirtualWareHouseResourceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.virtualWareHouseCacheStorage = builder.virtualWareHouseCacheStorage;
        this.virtualWareHouseClass = builder.virtualWareHouseClass;
        this.virtualWareHouseId = builder.virtualWareHouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualWareHouseResourceRequest create() {
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
     * @return virtualWareHouseCacheStorage
     */
    public Integer getVirtualWareHouseCacheStorage() {
        return this.virtualWareHouseCacheStorage;
    }

    /**
     * @return virtualWareHouseClass
     */
    public String getVirtualWareHouseClass() {
        return this.virtualWareHouseClass;
    }

    /**
     * @return virtualWareHouseId
     */
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static final class Builder extends Request.Builder<ModifyVirtualWareHouseResourceRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private Integer virtualWareHouseCacheStorage; 
        private String virtualWareHouseClass; 
        private String virtualWareHouseId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualWareHouseResourceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.virtualWareHouseCacheStorage = request.virtualWareHouseCacheStorage;
            this.virtualWareHouseClass = request.virtualWareHouseClass;
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
         * <p>200</p>
         */
        public Builder virtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
            this.putQueryParameter("VirtualWareHouseCacheStorage", virtualWareHouseCacheStorage);
            this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n1.xlarge</p>
         */
        public Builder virtualWareHouseClass(String virtualWareHouseClass) {
            this.putQueryParameter("VirtualWareHouseClass", virtualWareHouseClass);
            this.virtualWareHouseClass = virtualWareHouseClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vw-uf62965t8lt50****</p>
         */
        public Builder virtualWareHouseId(String virtualWareHouseId) {
            this.putQueryParameter("VirtualWareHouseId", virtualWareHouseId);
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }

        @Override
        public ModifyVirtualWareHouseResourceRequest build() {
            return new ModifyVirtualWareHouseResourceRequest(this);
        } 

    } 

}
