// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckCreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CheckCreateClusterRequest</p>
 */
public class CheckCreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

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
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CheckCreateClusterRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.usedTime = builder.usedTime;
        this.virtualWareHouseCacheStorage = builder.virtualWareHouseCacheStorage;
        this.virtualWareHouseClass = builder.virtualWareHouseClass;
        this.virtualWareHouseDescription = builder.virtualWareHouseDescription;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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

    public static final class Builder extends Request.Builder<CheckCreateClusterRequest, Builder> {
        private Boolean autoRenew; 
        private String DBClusterDescription; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String usedTime; 
        private Integer virtualWareHouseCacheStorage; 
        private String virtualWareHouseClass; 
        private String virtualWareHouseDescription; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CheckCreateClusterRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.DBClusterDescription = request.DBClusterDescription;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.usedTime = request.usedTime;
            this.virtualWareHouseCacheStorage = request.virtualWareHouseCacheStorage;
            this.virtualWareHouseClass = request.virtualWareHouseClass;
            this.virtualWareHouseDescription = request.virtualWareHouseDescription;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
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
         * <p>VPC ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6xmupdn7v6ui9f7****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf632qye9oqt4x4sr5****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CheckCreateClusterRequest build() {
            return new CheckCreateClusterRequest(this);
        } 

    } 

}
