// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeServerlessClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerlessClusterResponseBody</p>
 */
public class DescribeServerlessClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CuSize")
    private String cuSize;

    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private String diskSize;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("HaType")
    private String haType;

    @com.aliyun.core.annotation.NameInMap("HasUser")
    private String hasUser;

    @com.aliyun.core.annotation.NameInMap("InnerEndpoint")
    private String innerEndpoint;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("IsDeletionProtection")
    private String isDeletionProtection;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MainVersion")
    private String mainVersion;

    @com.aliyun.core.annotation.NameInMap("OuterEndpoint")
    private String outerEndpoint;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReserverMaxQpsNum")
    private String reserverMaxQpsNum;

    @com.aliyun.core.annotation.NameInMap("ReserverMinQpsNum")
    private String reserverMinQpsNum;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateStatus")
    private String updateStatus;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeServerlessClusterResponseBody model) {
            this.autoRenew = model.autoRenew;
            this.clusterType = model.clusterType;
            this.createTime = model.createTime;
            this.cuSize = model.cuSize;
            this.diskSize = model.diskSize;
            this.expireTime = model.expireTime;
            this.haType = model.haType;
            this.hasUser = model.hasUser;
            this.innerEndpoint = model.innerEndpoint;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.isDeletionProtection = model.isDeletionProtection;
            this.lockMode = model.lockMode;
            this.mainVersion = model.mainVersion;
            this.outerEndpoint = model.outerEndpoint;
            this.payType = model.payType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.reserverMaxQpsNum = model.reserverMaxQpsNum;
            this.reserverMinQpsNum = model.reserverMinQpsNum;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.updateStatus = model.updateStatus;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong>: Auto-renewal is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li><strong>Cluster</strong>: Cluster Edition.</li>
         * <li><strong>Single</strong>: single-node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-12T14:40:46</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The compute unit (CU) size.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder cuSize(String cuSize) {
            this.cuSize = cuSize;
            return this;
        }

        /**
         * <p>The disk size of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder diskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-12T14:40:46</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether high availability (HA) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: HA is enabled.</li>
         * <li><strong>false</strong>: HA is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder haType(String haType) {
            this.haType = haType;
            return this;
        }

        /**
         * <p>Indicates whether the cluster has users. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The cluster has users.</li>
         * <li><strong>false</strong>: The cluster does not have users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasUser(String hasUser) {
            this.hasUser = hasUser;
            return this;
        }

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443</a></p>
         */
        public Builder innerEndpoint(String innerEndpoint) {
            this.innerEndpoint = innerEndpoint;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp16f1441y6p2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDeletionProtection(String isDeletionProtection) {
            this.isDeletionProtection = isDeletionProtection;
            return this;
        }

        /**
         * <p>The lock type of the cluster.</p>
         * <blockquote>
         * <p>This parameter does not return a value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>过期</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The major version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.8</p>
         */
        public Builder mainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443</a></p>
         */
        public Builder outerEndpoint(String outerEndpoint) {
            this.outerEndpoint = outerEndpoint;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89F81C30-320B-4550-91DB-C37C81D2358F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum reserved QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder reserverMaxQpsNum(String reserverMaxQpsNum) {
            this.reserverMaxQpsNum = reserverMaxQpsNum;
            return this;
        }

        /**
         * <p>The minimum reserved QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder reserverMinQpsNum(String reserverMinQpsNum) {
            this.reserverMinQpsNum = reserverMinQpsNum;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-fjm2d4v7sf****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The current status. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: being created.</li>
         * <li><strong>ACTIVATION</strong>: running.</li>
         * <li><strong>DELETING</strong>: being deleted.</li>
         * <li><strong>RESTARTING</strong>: being restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The minor version upgrade status. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: An upgrade is available.</li>
         * <li><strong>NO</strong>: No upgrade is available.</li>
         * <li><strong>PENDING</strong>: An upgrade is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        public Builder updateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp191ipotqf****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp120k6ixs4eoghz****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
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
