// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckCreateVirtualWareHouseRequest} extends {@link RequestModel}
 *
 * <p>CheckCreateVirtualWareHouseRequest</p>
 */
public class CheckCreateVirtualWareHouseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseDescription")
    private String virtualWareHouseDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CheckCreateVirtualWareHouseRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.virtualWareHouseCacheStorage = builder.virtualWareHouseCacheStorage;
        this.virtualWareHouseClass = builder.virtualWareHouseClass;
        this.virtualWareHouseDescription = builder.virtualWareHouseDescription;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreateVirtualWareHouseRequest create() {
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
     * @return virtualWareHouseDescription
     */
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CheckCreateVirtualWareHouseRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private Integer virtualWareHouseCacheStorage; 
        private String virtualWareHouseClass; 
        private String virtualWareHouseDescription; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CheckCreateVirtualWareHouseRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.virtualWareHouseCacheStorage = request.virtualWareHouseCacheStorage;
            this.virtualWareHouseClass = request.virtualWareHouseClass;
            this.virtualWareHouseDescription = request.virtualWareHouseDescription;
            this.vswitchId = request.vswitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
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
         * VirtualWareHouseDescription.
         */
        public Builder virtualWareHouseDescription(String virtualWareHouseDescription) {
            this.putQueryParameter("VirtualWareHouseDescription", virtualWareHouseDescription);
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CheckCreateVirtualWareHouseRequest build() {
            return new CheckCreateVirtualWareHouseRequest(this);
        } 

    } 

}
