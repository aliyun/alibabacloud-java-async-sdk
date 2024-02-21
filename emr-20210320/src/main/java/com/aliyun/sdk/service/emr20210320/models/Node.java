// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Node} extends {@link TeaModel}
 *
 * <p>Node</p>
 */
public class Node extends TeaModel {
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("MaintenanceStatus")
    private String maintenanceStatus;

    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("NodeGroupType")
    private String nodeGroupType;

    @NameInMap("NodeId")
    private String nodeId;

    @NameInMap("NodeName")
    private String nodeName;

    @NameInMap("NodeState")
    private String nodeState;

    @NameInMap("PrivateIp")
    private String privateIp;

    @NameInMap("PublicIp")
    private String publicIp;

    @NameInMap("ZoneId")
    private String zoneId;

    private Node(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.instanceType = builder.instanceType;
        this.maintenanceStatus = builder.maintenanceStatus;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupType = builder.nodeGroupType;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.nodeState = builder.nodeState;
        this.privateIp = builder.privateIp;
        this.publicIp = builder.publicIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Node create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maintenanceStatus
     */
    public String getMaintenanceStatus() {
        return this.maintenanceStatus;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeState
     */
    public String getNodeState() {
        return this.nodeState;
    }

    /**
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private Long createTime; 
        private Long expireTime; 
        private String instanceType; 
        private String maintenanceStatus; 
        private String nodeGroupId; 
        private String nodeGroupType; 
        private String nodeId; 
        private String nodeName; 
        private String nodeState; 
        private String privateIp; 
        private String publicIp; 
        private String zoneId; 

        /**
         * 节点是否自动续费。
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * 节点自动续费时长。
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * 节点自动续费时长单位。
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
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
         * 节点过期时间。
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * 实例类型。
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 运维模式状态。取值范围：
         * <p>
         * - ON：处于运维模式。
         * - OFF：处于非运维模式。
         * 
         * 为空表示处于非运维模式。
         */
        public Builder maintenanceStatus(String maintenanceStatus) {
            this.maintenanceStatus = maintenanceStatus;
            return this;
        }

        /**
         * 节点组ID。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点组类型。
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * 节点ID。
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * 节点名称。
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * 节点状态。取值范围：
         * <p>
         * - Pending：创建中。
         * - Starting：启动中。
         * - Running：运行中。
         * - Stopping：停止中。
         * - Stopped：已停止。
         * - Terminated：已终止。
         */
        public Builder nodeState(String nodeState) {
            this.nodeState = nodeState;
            return this;
        }

        /**
         * 私网IP。
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * 公网IP。
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        /**
         * 可用区ID。
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Node build() {
            return new Node(this);
        } 

    } 

}
