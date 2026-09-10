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

    @com.aliyun.core.annotation.NameInMap("Ha")
    private Boolean ha;

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

    @com.aliyun.core.annotation.NameInMap("TieringPostCu")
    private Long tieringPostCu;

    @com.aliyun.core.annotation.NameInMap("TieringPreCu")
    private Long tieringPreCu;

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
        this.ha = builder.ha;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.orderState = builder.orderState;
        this.regionId = builder.regionId;
        this.resourceCreateTime = builder.resourceCreateTime;
        this.resourceExpiredTime = builder.resourceExpiredTime;
        this.tabletServerModel = builder.tabletServerModel;
        this.tabletServerNum = builder.tabletServerNum;
        this.tabletServerType = builder.tabletServerType;
        this.tieringPostCu = builder.tieringPostCu;
        this.tieringPreCu = builder.tieringPreCu;
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
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
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
     * @return tieringPostCu
     */
    public Long getTieringPostCu() {
        return this.tieringPostCu;
    }

    /**
     * @return tieringPreCu
     */
    public Long getTieringPreCu() {
        return this.tieringPreCu;
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
        private Boolean ha; 
        private String instanceId; 
        private String instanceName; 
        private String orderState; 
        private String regionId; 
        private Long resourceCreateTime; 
        private Long resourceExpiredTime; 
        private String tabletServerModel; 
        private Long tabletServerNum; 
        private String tabletServerType; 
        private Long tieringPostCu; 
        private Long tieringPreCu; 
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
            this.ha = model.ha;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.orderState = model.orderState;
            this.regionId = model.regionId;
            this.resourceCreateTime = model.resourceCreateTime;
            this.resourceExpiredTime = model.resourceExpiredTime;
            this.tabletServerModel = model.tabletServerModel;
            this.tabletServerNum = model.tabletServerNum;
            this.tabletServerType = model.tabletServerType;
            this.tieringPostCu = model.tieringPostCu;
            this.tieringPreCu = model.tieringPreCu;
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
         * <p>The cluster status.</p>
         */
        public Builder clusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * <p>The URL of the instance management console.</p>
         */
        public Builder consoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }

        /**
         * <p>The disk size, in GB.</p>
         */
        public Builder diskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Specifies whether high availability (HA) is enabled.</p>
         */
        public Builder ha(Boolean ha) {
            this.ha = ha;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The order state.</p>
         */
        public Builder orderState(String orderState) {
            this.orderState = orderState;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The creation time of the resource, as a UNIX timestamp in milliseconds.</p>
         */
        public Builder resourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }

        /**
         * <p>The expiration time of the resource, as a UNIX timestamp in milliseconds.</p>
         */
        public Builder resourceExpiredTime(Long resourceExpiredTime) {
            this.resourceExpiredTime = resourceExpiredTime;
            return this;
        }

        /**
         * <p>The tablet server model.</p>
         */
        public Builder tabletServerModel(String tabletServerModel) {
            this.tabletServerModel = tabletServerModel;
            return this;
        }

        /**
         * <p>The number of tablet servers.</p>
         */
        public Builder tabletServerNum(Long tabletServerNum) {
            this.tabletServerNum = tabletServerNum;
            return this;
        }

        /**
         * <p>The tablet server type.</p>
         */
        public Builder tabletServerType(String tabletServerType) {
            this.tabletServerType = tabletServerType;
            return this;
        }

        /**
         * <p>The number of compute units (CUs) for post-tiering.</p>
         */
        public Builder tieringPostCu(Long tieringPostCu) {
            this.tieringPostCu = tieringPostCu;
            return this;
        }

        /**
         * <p>The number of compute units (CUs) for pre-tiering.</p>
         */
        public Builder tieringPreCu(Long tieringPreCu) {
            this.tieringPreCu = tieringPreCu;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID (UID).</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * <p>The VSwitch details.</p>
         */
        public Builder vSwitches(java.util.List<FlussVswitch> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
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
