// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link FlussInstance} extends {@link TeaModel}
 *
 * <p>FlussInstance</p>
 */
public class FlussInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterState")
    private ClusterState clusterState;

    @com.aliyun.core.annotation.NameInMap("ClusterStatus")
    private String clusterStatus;

    @com.aliyun.core.annotation.NameInMap("ConsoleUrl")
    private String consoleUrl;

    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Long diskSize;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("OrderState")
    private String orderState;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
    private Long resourceCreateTime;

    @com.aliyun.core.annotation.NameInMap("ResourceExpiredTime")
    private Long resourceExpiredTime;

    @com.aliyun.core.annotation.NameInMap("TabletServerModel")
    private String tabletServerModel;

    @com.aliyun.core.annotation.NameInMap("TabletServerNum")
    private Long tabletServerNum;

    @com.aliyun.core.annotation.NameInMap("TabletServerType")
    private String tabletServerType;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private java.util.List<FlussVswitch> vSwitches;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private FlussInstance(Builder builder) {
        this.clusterState = builder.clusterState;
        this.clusterStatus = builder.clusterStatus;
        this.consoleUrl = builder.consoleUrl;
        this.diskSize = builder.diskSize;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.orderState = builder.orderState;
        this.regionId = builder.regionId;
        this.resourceCreateTime = builder.resourceCreateTime;
        this.resourceExpiredTime = builder.resourceExpiredTime;
        this.tabletServerModel = builder.tabletServerModel;
        this.tabletServerNum = builder.tabletServerNum;
        this.tabletServerType = builder.tabletServerType;
        this.uid = builder.uid;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlussInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterState
     */
    public ClusterState getClusterState() {
        return this.clusterState;
    }

    /**
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return consoleUrl
     */
    public String getConsoleUrl() {
        return this.consoleUrl;
    }

    /**
     * @return diskSize
     */
    public Long getDiskSize() {
        return this.diskSize;
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
     * @return orderState
     */
    public String getOrderState() {
        return this.orderState;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceCreateTime
     */
    public Long getResourceCreateTime() {
        return this.resourceCreateTime;
    }

    /**
     * @return resourceExpiredTime
     */
    public Long getResourceExpiredTime() {
        return this.resourceExpiredTime;
    }

    /**
     * @return tabletServerModel
     */
    public String getTabletServerModel() {
        return this.tabletServerModel;
    }

    /**
     * @return tabletServerNum
     */
    public Long getTabletServerNum() {
        return this.tabletServerNum;
    }

    /**
     * @return tabletServerType
     */
    public String getTabletServerType() {
        return this.tabletServerType;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return vSwitches
     */
    public java.util.List<FlussVswitch> getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private ClusterState clusterState; 
        private String clusterStatus; 
        private String consoleUrl; 
        private Long diskSize; 
        private String instanceId; 
        private String instanceName; 
        private String orderState; 
        private String regionId; 
        private Long resourceCreateTime; 
        private Long resourceExpiredTime; 
        private String tabletServerModel; 
        private Long tabletServerNum; 
        private String tabletServerType; 
        private String uid; 
        private java.util.List<FlussVswitch> vSwitches; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(FlussInstance model) {
            this.clusterState = model.clusterState;
            this.clusterStatus = model.clusterStatus;
            this.consoleUrl = model.consoleUrl;
            this.diskSize = model.diskSize;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.orderState = model.orderState;
            this.regionId = model.regionId;
            this.resourceCreateTime = model.resourceCreateTime;
            this.resourceExpiredTime = model.resourceExpiredTime;
            this.tabletServerModel = model.tabletServerModel;
            this.tabletServerNum = model.tabletServerNum;
            this.tabletServerType = model.tabletServerType;
            this.uid = model.uid;
            this.vSwitches = model.vSwitches;
            this.vpcId = model.vpcId;
        } 

        /**
         * ClusterState.
         */
        public Builder clusterState(ClusterState clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * ClusterStatus.
         */
        public Builder clusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * ConsoleUrl.
         */
        public Builder consoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(Long diskSize) {
            this.diskSize = diskSize;
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
         * OrderState.
         */
        public Builder orderState(String orderState) {
            this.orderState = orderState;
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
         * ResourceCreateTime.
         */
        public Builder resourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }

        /**
         * ResourceExpiredTime.
         */
        public Builder resourceExpiredTime(Long resourceExpiredTime) {
            this.resourceExpiredTime = resourceExpiredTime;
            return this;
        }

        /**
         * TabletServerModel.
         */
        public Builder tabletServerModel(String tabletServerModel) {
            this.tabletServerModel = tabletServerModel;
            return this;
        }

        /**
         * TabletServerNum.
         */
        public Builder tabletServerNum(Long tabletServerNum) {
            this.tabletServerNum = tabletServerNum;
            return this;
        }

        /**
         * TabletServerType.
         */
        public Builder tabletServerType(String tabletServerType) {
            this.tabletServerType = tabletServerType;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * VSwitches.
         */
        public Builder vSwitches(java.util.List<FlussVswitch> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public FlussInstance build() {
            return new FlussInstance(this);
        } 

    } 

}
