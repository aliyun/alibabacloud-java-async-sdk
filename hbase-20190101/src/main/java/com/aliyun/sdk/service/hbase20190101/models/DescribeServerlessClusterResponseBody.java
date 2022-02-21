// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerlessClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerlessClusterResponseBody</p>
 */
public class DescribeServerlessClusterResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    private String autoRenew;

    @NameInMap("ClusterType")
    private String clusterType;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CuSize")
    private String cuSize;

    @NameInMap("DiskSize")
    private String diskSize;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("HaType")
    private String haType;

    @NameInMap("HasUser")
    private String hasUser;

    @NameInMap("InnerEndpoint")
    private String innerEndpoint;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("IsDeletionProtection")
    private String isDeletionProtection;

    @NameInMap("LockMode")
    private String lockMode;

    @NameInMap("MainVersion")
    private String mainVersion;

    @NameInMap("OuterEndpoint")
    private String outerEndpoint;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReserverMaxQpsNum")
    private String reserverMaxQpsNum;

    @NameInMap("ReserverMinQpsNum")
    private String reserverMinQpsNum;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateStatus")
    private String updateStatus;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeServerlessClusterResponseBody(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.cuSize = builder.cuSize;
        this.diskSize = builder.diskSize;
        this.expireTime = builder.expireTime;
        this.haType = builder.haType;
        this.hasUser = builder.hasUser;
        this.innerEndpoint = builder.innerEndpoint;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isDeletionProtection = builder.isDeletionProtection;
        this.lockMode = builder.lockMode;
        this.mainVersion = builder.mainVersion;
        this.outerEndpoint = builder.outerEndpoint;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.reserverMaxQpsNum = builder.reserverMaxQpsNum;
        this.reserverMinQpsNum = builder.reserverMinQpsNum;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.updateStatus = builder.updateStatus;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerlessClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return cuSize
     */
    public String getCuSize() {
        return this.cuSize;
    }

    /**
     * @return diskSize
     */
    public String getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return haType
     */
    public String getHaType() {
        return this.haType;
    }

    /**
     * @return hasUser
     */
    public String getHasUser() {
        return this.hasUser;
    }

    /**
     * @return innerEndpoint
     */
    public String getInnerEndpoint() {
        return this.innerEndpoint;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isDeletionProtection
     */
    public String getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return mainVersion
     */
    public String getMainVersion() {
        return this.mainVersion;
    }

    /**
     * @return outerEndpoint
     */
    public String getOuterEndpoint() {
        return this.outerEndpoint;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return reserverMaxQpsNum
     */
    public String getReserverMaxQpsNum() {
        return this.reserverMaxQpsNum;
    }

    /**
     * @return reserverMinQpsNum
     */
    public String getReserverMinQpsNum() {
        return this.reserverMinQpsNum;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateStatus
     */
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String autoRenew; 
        private String clusterType; 
        private String createTime; 
        private String cuSize; 
        private String diskSize; 
        private String expireTime; 
        private String haType; 
        private String hasUser; 
        private String innerEndpoint; 
        private String instanceId; 
        private String instanceName; 
        private String isDeletionProtection; 
        private String lockMode; 
        private String mainVersion; 
        private String outerEndpoint; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String reserverMaxQpsNum; 
        private String reserverMinQpsNum; 
        private String resourceGroupId; 
        private String status; 
        private String updateStatus; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CuSize.
         */
        public Builder cuSize(String cuSize) {
            this.cuSize = cuSize;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * HaType.
         */
        public Builder haType(String haType) {
            this.haType = haType;
            return this;
        }

        /**
         * HasUser.
         */
        public Builder hasUser(String hasUser) {
            this.hasUser = hasUser;
            return this;
        }

        /**
         * InnerEndpoint.
         */
        public Builder innerEndpoint(String innerEndpoint) {
            this.innerEndpoint = innerEndpoint;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsDeletionProtection.
         */
        public Builder isDeletionProtection(String isDeletionProtection) {
            this.isDeletionProtection = isDeletionProtection;
            return this;
        }

        /**
         * LockMode.
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * MainVersion.
         */
        public Builder mainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }

        /**
         * OuterEndpoint.
         */
        public Builder outerEndpoint(String outerEndpoint) {
            this.outerEndpoint = outerEndpoint;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
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
         * ReserverMaxQpsNum.
         */
        public Builder reserverMaxQpsNum(String reserverMaxQpsNum) {
            this.reserverMaxQpsNum = reserverMaxQpsNum;
            return this;
        }

        /**
         * ReserverMinQpsNum.
         */
        public Builder reserverMinQpsNum(String reserverMinQpsNum) {
            this.reserverMinQpsNum = reserverMinQpsNum;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
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
         * UpdateStatus.
         */
        public Builder updateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeServerlessClusterResponseBody build() {
            return new DescribeServerlessClusterResponseBody(this);
        } 

    } 

}
