// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCenterRequest} extends {@link RequestModel}
 *
 * <p>CreateDataCenterRequest</p>
 */
public class CreateDataCenterRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterName")
    private String dataCenterName;

    @Query
    @NameInMap("DiskSize")
    private Integer diskSize;

    @Query
    @NameInMap("DiskType")
    private String diskType;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("NodeCount")
    @Validation(required = true)
    private Integer nodeCount;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("VswitchId")
    @Validation(required = true)
    private String vswitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDataCenterRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.dataCenterName = builder.dataCenterName;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.instanceType = builder.instanceType;
        this.nodeCount = builder.nodeCount;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataCenterRequest create() {
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
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataCenterName
     */
    public String getDataCenterName() {
        return this.dataCenterName;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
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
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateDataCenterRequest, Builder> {
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clusterId; 
        private String dataCenterName; 
        private Integer diskSize; 
        private String diskType; 
        private String instanceType; 
        private Integer nodeCount; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataCenterRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.clientToken = response.clientToken;
            this.clusterId = response.clusterId;
            this.dataCenterName = response.dataCenterName;
            this.diskSize = response.diskSize;
            this.diskType = response.diskType;
            this.instanceType = response.instanceType;
            this.nodeCount = response.nodeCount;
            this.payType = response.payType;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
            this.vswitchId = response.vswitchId;
            this.zoneId = response.zoneId;
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
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DataCenterName.
         */
        public Builder dataCenterName(String dataCenterName) {
            this.putQueryParameter("DataCenterName", dataCenterName);
            this.dataCenterName = dataCenterName;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * DiskType.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
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
        public CreateDataCenterRequest build() {
            return new CreateDataCenterRequest(this);
        } 

    } 

}
