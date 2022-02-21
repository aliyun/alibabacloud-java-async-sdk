// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHiTSDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHiTSDBInstanceResponseBody</p>
 */
public class DescribeHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    private String autoRenew;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("ConnectionString")
    private String connectionString;

    @NameInMap("CpuNumber")
    private String cpuNumber;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("DiskCategory")
    private String diskCategory;

    @NameInMap("EngineType")
    private String engineType;

    @NameInMap("ExpiredTime")
    private Long expiredTime;

    @NameInMap("GmtCreated")
    private String gmtCreated;

    @NameInMap("GmtExpire")
    private String gmtExpire;

    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @NameInMap("InstanceClass")
    private String instanceClass;

    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("InstanceStorage")
    private String instanceStorage;

    @NameInMap("InstanceTps")
    private String instanceTps;

    @NameInMap("MaxTimelineLimit")
    private String maxTimelineLimit;

    @NameInMap("MemSize")
    private String memSize;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("PublicConnectionString")
    private String publicConnectionString;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpList")
    private java.util.List < SecurityIpList> securityIpList;

    @NameInMap("Series")
    private Integer series;

    @NameInMap("Status")
    private String status;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("VswitchId")
    private String vswitchId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeHiTSDBInstanceResponseBody(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.connectionString = builder.connectionString;
        this.cpuNumber = builder.cpuNumber;
        this.createTime = builder.createTime;
        this.diskCategory = builder.diskCategory;
        this.engineType = builder.engineType;
        this.expiredTime = builder.expiredTime;
        this.gmtCreated = builder.gmtCreated;
        this.gmtExpire = builder.gmtExpire;
        this.instanceAlias = builder.instanceAlias;
        this.instanceClass = builder.instanceClass;
        this.instanceDescription = builder.instanceDescription;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.instanceStorage = builder.instanceStorage;
        this.instanceTps = builder.instanceTps;
        this.maxTimelineLimit = builder.maxTimelineLimit;
        this.memSize = builder.memSize;
        this.networkType = builder.networkType;
        this.paymentType = builder.paymentType;
        this.publicConnectionString = builder.publicConnectionString;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
        this.series = builder.series;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHiTSDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return cpuNumber
     */
    public String getCpuNumber() {
        return this.cpuNumber;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtExpire
     */
    public String getGmtExpire() {
        return this.gmtExpire;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceStorage
     */
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    /**
     * @return instanceTps
     */
    public String getInstanceTps() {
        return this.instanceTps;
    }

    /**
     * @return maxTimelineLimit
     */
    public String getMaxTimelineLimit() {
        return this.maxTimelineLimit;
    }

    /**
     * @return memSize
     */
    public String getMemSize() {
        return this.memSize;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return publicConnectionString
     */
    public String getPublicConnectionString() {
        return this.publicConnectionString;
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
     * @return securityIpList
     */
    public java.util.List < SecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    /**
     * @return series
     */
    public Integer getSeries() {
        return this.series;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private String autoRenew; 
        private String chargeType; 
        private String connectionString; 
        private String cpuNumber; 
        private Long createTime; 
        private String diskCategory; 
        private String engineType; 
        private Long expiredTime; 
        private String gmtCreated; 
        private String gmtExpire; 
        private String instanceAlias; 
        private String instanceClass; 
        private String instanceDescription; 
        private String instanceId; 
        private String instanceStatus; 
        private String instanceStorage; 
        private String instanceTps; 
        private String maxTimelineLimit; 
        private String memSize; 
        private String networkType; 
        private String paymentType; 
        private String publicConnectionString; 
        private String regionId; 
        private String requestId; 
        private java.util.List < SecurityIpList> securityIpList; 
        private Integer series; 
        private String status; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * CpuNumber.
         */
        public Builder cpuNumber(String cpuNumber) {
            this.cpuNumber = cpuNumber;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * GmtExpire.
         */
        public Builder gmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * InstanceStorage.
         */
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * InstanceTps.
         */
        public Builder instanceTps(String instanceTps) {
            this.instanceTps = instanceTps;
            return this;
        }

        /**
         * MaxTimelineLimit.
         */
        public Builder maxTimelineLimit(String maxTimelineLimit) {
            this.maxTimelineLimit = maxTimelineLimit;
            return this;
        }

        /**
         * MemSize.
         */
        public Builder memSize(String memSize) {
            this.memSize = memSize;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * PublicConnectionString.
         */
        public Builder publicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
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
         * SecurityIpList.
         */
        public Builder securityIpList(java.util.List < SecurityIpList> securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        /**
         * Series.
         */
        public Builder series(Integer series) {
            this.series = series;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeHiTSDBInstanceResponseBody build() {
            return new DescribeHiTSDBInstanceResponseBody(this);
        } 

    } 

    public static class SecurityIpList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        private SecurityIpList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public SecurityIpList build() {
                return new SecurityIpList(this);
            } 

        } 

    }
}
