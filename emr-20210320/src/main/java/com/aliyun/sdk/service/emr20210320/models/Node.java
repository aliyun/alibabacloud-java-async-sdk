// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Node} extends {@link TeaModel}
 *
 * <p>Node</p>
 */
public class Node extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MaintenanceStatus")
    private String maintenanceStatus;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    private String nodeGroupType;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("NodeState")
    private String nodeState;

    @com.aliyun.core.annotation.NameInMap("PrivateIp")
    private String privateIp;

    @com.aliyun.core.annotation.NameInMap("PublicIp")
    private String publicIp;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
         * <p>节点是否自动续费。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>节点自动续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>节点自动续费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
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
         * <p>节点过期时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1603728394857</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>实例类型。</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6e.xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>运维模式状态。取值范围：</p>
         * <ul>
         * <li>ON：处于运维模式。</li>
         * <li>OFF：处于非运维模式。</li>
         * </ul>
         * <p>为空表示处于非运维模式。</p>
         */
        public Builder maintenanceStatus(String maintenanceStatus) {
            this.maintenanceStatus = maintenanceStatus;
            return this;
        }

        /**
         * <p>节点组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>节点组类型。</p>
         * 
         * <strong>example:</strong>
         * <p>CORE</p>
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * <p>节点ID。</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>节点名称。</p>
         * 
         * <strong>example:</strong>
         * <p>core1-1</p>
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>节点状态。取值范围：</p>
         * <ul>
         * <li>Pending：创建中。</li>
         * <li>Starting：启动中。</li>
         * <li>Running：运行中。</li>
         * <li>Stopping：停止中。</li>
         * <li>Stopped：已停止。</li>
         * <li>Terminated：已终止。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder nodeState(String nodeState) {
            this.nodeState = nodeState;
            return this;
        }

        /**
         * <p>私网IP。</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.1</p>
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * <p>公网IP。</p>
         * 
         * <strong>example:</strong>
         * <p>42.120.75.***</p>
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>可用区ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
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
