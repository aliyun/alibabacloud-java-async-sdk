// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHBaseueModuleRequest} extends {@link RequestModel}
 *
 * <p>EnableHBaseueModuleRequest</p>
 */
public class EnableHBaseueModuleRequest extends Request {
    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("BdsId")
    private String bdsId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CoreInstanceType")
    @Validation(required = true)
    private String coreInstanceType;

    @Query
    @NameInMap("DiskSize")
    private Integer diskSize;

    @Query
    @NameInMap("DiskType")
    private String diskType;

    @Query
    @NameInMap("HbaseueClusterId")
    @Validation(required = true)
    private String hbaseueClusterId;

    @Query
    @NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @Query
    @NameInMap("ModuleClusterName")
    private String moduleClusterName;

    @Query
    @NameInMap("ModuleTypeName")
    @Validation(required = true)
    private String moduleTypeName;

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

    private EnableHBaseueModuleRequest(Builder builder) {
        super(builder);
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.bdsId = builder.bdsId;
        this.clientToken = builder.clientToken;
        this.coreInstanceType = builder.coreInstanceType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.hbaseueClusterId = builder.hbaseueClusterId;
        this.masterInstanceType = builder.masterInstanceType;
        this.moduleClusterName = builder.moduleClusterName;
        this.moduleTypeName = builder.moduleTypeName;
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

    public static EnableHBaseueModuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return bdsId
     */
    public String getBdsId() {
        return this.bdsId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
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
     * @return hbaseueClusterId
     */
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return moduleClusterName
     */
    public String getModuleClusterName() {
        return this.moduleClusterName;
    }

    /**
     * @return moduleTypeName
     */
    public String getModuleTypeName() {
        return this.moduleTypeName;
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

    public static final class Builder extends Request.Builder<EnableHBaseueModuleRequest, Builder> {
        private Integer autoRenewPeriod; 
        private String bdsId; 
        private String clientToken; 
        private String coreInstanceType; 
        private Integer diskSize; 
        private String diskType; 
        private String hbaseueClusterId; 
        private String masterInstanceType; 
        private String moduleClusterName; 
        private String moduleTypeName; 
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

        private Builder(EnableHBaseueModuleRequest response) {
            super(response);
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.bdsId = response.bdsId;
            this.clientToken = response.clientToken;
            this.coreInstanceType = response.coreInstanceType;
            this.diskSize = response.diskSize;
            this.diskType = response.diskType;
            this.hbaseueClusterId = response.hbaseueClusterId;
            this.masterInstanceType = response.masterInstanceType;
            this.moduleClusterName = response.moduleClusterName;
            this.moduleTypeName = response.moduleTypeName;
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
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * BdsId.
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
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
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
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
         * HbaseueClusterId.
         */
        public Builder hbaseueClusterId(String hbaseueClusterId) {
            this.putQueryParameter("HbaseueClusterId", hbaseueClusterId);
            this.hbaseueClusterId = hbaseueClusterId;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * ModuleClusterName.
         */
        public Builder moduleClusterName(String moduleClusterName) {
            this.putQueryParameter("ModuleClusterName", moduleClusterName);
            this.moduleClusterName = moduleClusterName;
            return this;
        }

        /**
         * ModuleTypeName.
         */
        public Builder moduleTypeName(String moduleTypeName) {
            this.putQueryParameter("ModuleTypeName", moduleTypeName);
            this.moduleTypeName = moduleTypeName;
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
        public EnableHBaseueModuleRequest build() {
            return new EnableHBaseueModuleRequest(this);
        } 

    } 

}
