// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationAttributeResponseBody</p>
 */
public class DescribeApplicationAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    private String polarFSInstanceId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private java.util.List<SecurityGroups> securityGroups;

    @com.aliyun.core.annotation.NameInMap("SecurityIPArrays")
    private java.util.List<SecurityIPArrays> securityIPArrays;

    @com.aliyun.core.annotation.NameInMap("ServerlessType")
    private String serverlessType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpgradeAvailable")
    private String upgradeAvailable;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeApplicationAttributeResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.architecture = builder.architecture;
        this.components = builder.components;
        this.creationTime = builder.creationTime;
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.endpoints = builder.endpoints;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.lockMode = builder.lockMode;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.payType = builder.payType;
        this.polarFSInstanceId = builder.polarFSInstanceId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.securityIPArrays = builder.securityIPArrays;
        this.serverlessType = builder.serverlessType;
        this.status = builder.status;
        this.upgradeAvailable = builder.upgradeAvailable;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.version = builder.version;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
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
     * @return securityGroups
     */
    public java.util.List<SecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return securityIPArrays
     */
    public java.util.List<SecurityIPArrays> getSecurityIPArrays() {
        return this.securityIPArrays;
    }

    /**
     * @return serverlessType
     */
    public String getServerlessType() {
        return this.serverlessType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return upgradeAvailable
     */
    public String getUpgradeAvailable() {
        return this.upgradeAvailable;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String applicationId; 
        private String applicationType; 
        private String architecture; 
        private java.util.List<Components> components; 
        private String creationTime; 
        private String DBClusterId; 
        private String description; 
        private java.util.List<Endpoints> endpoints; 
        private String expireTime; 
        private Boolean expired; 
        private String lockMode; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String payType; 
        private String polarFSInstanceId; 
        private String regionId; 
        private String requestId; 
        private java.util.List<SecurityGroups> securityGroups; 
        private java.util.List<SecurityIPArrays> securityIPArrays; 
        private String serverlessType; 
        private String status; 
        private String upgradeAvailable; 
        private String VPCId; 
        private String vSwitchId; 
        private String version; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationAttributeResponseBody model) {
            this.applicationId = model.applicationId;
            this.applicationType = model.applicationType;
            this.architecture = model.architecture;
            this.components = model.components;
            this.creationTime = model.creationTime;
            this.DBClusterId = model.DBClusterId;
            this.description = model.description;
            this.endpoints = model.endpoints;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.lockMode = model.lockMode;
            this.maintainEndTime = model.maintainEndTime;
            this.maintainStartTime = model.maintainStartTime;
            this.payType = model.payType;
            this.polarFSInstanceId = model.polarFSInstanceId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityGroups = model.securityGroups;
            this.securityIPArrays = model.securityIPArrays;
            this.serverlessType = model.serverlessType;
            this.status = model.status;
            this.upgradeAvailable = model.upgradeAvailable;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.version = model.version;
            this.zoneId = model.zoneId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Endpoints.
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
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
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
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
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
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
         * PolarFSInstanceId.
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.polarFSInstanceId = polarFSInstanceId;
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
         * SecurityGroups.
         */
        public Builder securityGroups(java.util.List<SecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * SecurityIPArrays.
         */
        public Builder securityIPArrays(java.util.List<SecurityIPArrays> securityIPArrays) {
            this.securityIPArrays = securityIPArrays;
            return this;
        }

        /**
         * ServerlessType.
         */
        public Builder serverlessType(String serverlessType) {
            this.serverlessType = serverlessType;
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
         * UpgradeAvailable.
         */
        public Builder upgradeAvailable(String upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>VSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*******************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeApplicationAttributeResponseBody build() {
            return new DescribeApplicationAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class ComponentsSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private ComponentsSecurityGroups(Builder builder) {
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String netType; 
            private String regionId; 
            private String securityGroupId; 
            private String securityGroupName; 

            private Builder() {
            } 

            private Builder(ComponentsSecurityGroups model) {
                this.netType = model.netType;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
            } 

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
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
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public ComponentsSecurityGroups build() {
                return new ComponentsSecurityGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class ComponentsSecurityIPArrays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
        private String securityIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayTag")
        private String securityIPArrayTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SecurityIPNetType")
        private String securityIPNetType;

        @com.aliyun.core.annotation.NameInMap("SecurityIPType")
        private String securityIPType;

        private ComponentsSecurityIPArrays(Builder builder) {
            this.securityIPArrayName = builder.securityIPArrayName;
            this.securityIPArrayTag = builder.securityIPArrayTag;
            this.securityIPList = builder.securityIPList;
            this.securityIPNetType = builder.securityIPNetType;
            this.securityIPType = builder.securityIPType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsSecurityIPArrays create() {
            return builder().build();
        }

        /**
         * @return securityIPArrayName
         */
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        /**
         * @return securityIPArrayTag
         */
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPNetType
         */
        public String getSecurityIPNetType() {
            return this.securityIPNetType;
        }

        /**
         * @return securityIPType
         */
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public static final class Builder {
            private String securityIPArrayName; 
            private String securityIPArrayTag; 
            private String securityIPList; 
            private String securityIPNetType; 
            private String securityIPType; 

            private Builder() {
            } 

            private Builder(ComponentsSecurityIPArrays model) {
                this.securityIPArrayName = model.securityIPArrayName;
                this.securityIPArrayTag = model.securityIPArrayTag;
                this.securityIPList = model.securityIPList;
                this.securityIPNetType = model.securityIPNetType;
                this.securityIPType = model.securityIPType;
            } 

            /**
             * SecurityIPArrayName.
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * SecurityIPArrayTag.
             */
            public Builder securityIPArrayTag(String securityIPArrayTag) {
                this.securityIPArrayTag = securityIPArrayTag;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SecurityIPNetType.
             */
            public Builder securityIPNetType(String securityIPNetType) {
                this.securityIPNetType = securityIPNetType;
                return this;
            }

            /**
             * SecurityIPType.
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            public ComponentsSecurityIPArrays build() {
                return new ComponentsSecurityIPArrays(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class Topology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<String> children;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private String layer;

        @com.aliyun.core.annotation.NameInMap("Parents")
        private java.util.List<String> parents;

        private Topology(Builder builder) {
            this.children = builder.children;
            this.layer = builder.layer;
            this.parents = builder.parents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topology create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<String> getChildren() {
            return this.children;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
        }

        /**
         * @return parents
         */
        public java.util.List<String> getParents() {
            return this.parents;
        }

        public static final class Builder {
            private java.util.List<String> children; 
            private String layer; 
            private java.util.List<String> parents; 

            private Builder() {
            } 

            private Builder(Topology model) {
                this.children = model.children;
                this.layer = model.layer;
                this.parents = model.parents;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<String> children) {
                this.children = children;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * Parents.
             */
            public Builder parents(java.util.List<String> parents) {
                this.parents = parents;
                return this;
            }

            public Topology build() {
                return new Topology(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentClass")
        private String componentClass;

        @com.aliyun.core.annotation.NameInMap("ComponentClassDescription")
        private String componentClassDescription;

        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentMaxReplica")
        private Long componentMaxReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentReplica")
        private Long componentReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentReplicaGroupName")
        private String componentReplicaGroupName;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroups")
        private java.util.List<ComponentsSecurityGroups> securityGroups;

        @com.aliyun.core.annotation.NameInMap("SecurityIPArrays")
        private java.util.List<ComponentsSecurityIPArrays> securityIPArrays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Topology")
        private Topology topology;

        private Components(Builder builder) {
            this.componentClass = builder.componentClass;
            this.componentClassDescription = builder.componentClassDescription;
            this.componentId = builder.componentId;
            this.componentMaxReplica = builder.componentMaxReplica;
            this.componentReplica = builder.componentReplica;
            this.componentReplicaGroupName = builder.componentReplicaGroupName;
            this.componentType = builder.componentType;
            this.securityGroups = builder.securityGroups;
            this.securityIPArrays = builder.securityIPArrays;
            this.status = builder.status;
            this.topology = builder.topology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentClass
         */
        public String getComponentClass() {
            return this.componentClass;
        }

        /**
         * @return componentClassDescription
         */
        public String getComponentClassDescription() {
            return this.componentClassDescription;
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentMaxReplica
         */
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        /**
         * @return componentReplica
         */
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        /**
         * @return componentReplicaGroupName
         */
        public String getComponentReplicaGroupName() {
            return this.componentReplicaGroupName;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return securityGroups
         */
        public java.util.List<ComponentsSecurityGroups> getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return securityIPArrays
         */
        public java.util.List<ComponentsSecurityIPArrays> getSecurityIPArrays() {
            return this.securityIPArrays;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topology
         */
        public Topology getTopology() {
            return this.topology;
        }

        public static final class Builder {
            private String componentClass; 
            private String componentClassDescription; 
            private String componentId; 
            private Long componentMaxReplica; 
            private Long componentReplica; 
            private String componentReplicaGroupName; 
            private String componentType; 
            private java.util.List<ComponentsSecurityGroups> securityGroups; 
            private java.util.List<ComponentsSecurityIPArrays> securityIPArrays; 
            private String status; 
            private Topology topology; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentClass = model.componentClass;
                this.componentClassDescription = model.componentClassDescription;
                this.componentId = model.componentId;
                this.componentMaxReplica = model.componentMaxReplica;
                this.componentReplica = model.componentReplica;
                this.componentReplicaGroupName = model.componentReplicaGroupName;
                this.componentType = model.componentType;
                this.securityGroups = model.securityGroups;
                this.securityIPArrays = model.securityIPArrays;
                this.status = model.status;
                this.topology = model.topology;
            } 

            /**
             * ComponentClass.
             */
            public Builder componentClass(String componentClass) {
                this.componentClass = componentClass;
                return this;
            }

            /**
             * ComponentClassDescription.
             */
            public Builder componentClassDescription(String componentClassDescription) {
                this.componentClassDescription = componentClassDescription;
                return this;
            }

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentMaxReplica.
             */
            public Builder componentMaxReplica(Long componentMaxReplica) {
                this.componentMaxReplica = componentMaxReplica;
                return this;
            }

            /**
             * ComponentReplica.
             */
            public Builder componentReplica(Long componentReplica) {
                this.componentReplica = componentReplica;
                return this;
            }

            /**
             * ComponentReplicaGroupName.
             */
            public Builder componentReplicaGroupName(String componentReplicaGroupName) {
                this.componentReplicaGroupName = componentReplicaGroupName;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * SecurityGroups.
             */
            public Builder securityGroups(java.util.List<ComponentsSecurityGroups> securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * SecurityIPArrays.
             */
            public Builder securityIPArrays(java.util.List<ComponentsSecurityIPArrays> securityIPArrays) {
                this.securityIPArrays = securityIPArrays;
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
             * Topology.
             */
            public Builder topology(Topology topology) {
                this.topology = topology;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("PortDescription")
        private String portDescription;

        private Endpoints(Builder builder) {
            this.description = builder.description;
            this.endpointId = builder.endpointId;
            this.ip = builder.ip;
            this.netType = builder.netType;
            this.port = builder.port;
            this.portDescription = builder.portDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return portDescription
         */
        public String getPortDescription() {
            return this.portDescription;
        }

        public static final class Builder {
            private String description; 
            private String endpointId; 
            private String ip; 
            private String netType; 
            private String port; 
            private String portDescription; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.description = model.description;
                this.endpointId = model.endpointId;
                this.ip = model.ip;
                this.netType = model.netType;
                this.port = model.port;
                this.portDescription = model.portDescription;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * PortDescription.
             */
            public Builder portDescription(String portDescription) {
                this.portDescription = portDescription;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private SecurityGroups(Builder builder) {
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String netType; 
            private String regionId; 
            private String securityGroupId; 
            private String securityGroupName; 

            private Builder() {
            } 

            private Builder(SecurityGroups model) {
                this.netType = model.netType;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
            } 

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
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
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAttributeResponseBody</p>
     */
    public static class SecurityIPArrays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
        private String securityIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayTag")
        private String securityIPArrayTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SecurityIPNetType")
        private String securityIPNetType;

        @com.aliyun.core.annotation.NameInMap("SecurityIPType")
        private String securityIPType;

        private SecurityIPArrays(Builder builder) {
            this.securityIPArrayName = builder.securityIPArrayName;
            this.securityIPArrayTag = builder.securityIPArrayTag;
            this.securityIPList = builder.securityIPList;
            this.securityIPNetType = builder.securityIPNetType;
            this.securityIPType = builder.securityIPType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIPArrays create() {
            return builder().build();
        }

        /**
         * @return securityIPArrayName
         */
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        /**
         * @return securityIPArrayTag
         */
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPNetType
         */
        public String getSecurityIPNetType() {
            return this.securityIPNetType;
        }

        /**
         * @return securityIPType
         */
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public static final class Builder {
            private String securityIPArrayName; 
            private String securityIPArrayTag; 
            private String securityIPList; 
            private String securityIPNetType; 
            private String securityIPType; 

            private Builder() {
            } 

            private Builder(SecurityIPArrays model) {
                this.securityIPArrayName = model.securityIPArrayName;
                this.securityIPArrayTag = model.securityIPArrayTag;
                this.securityIPList = model.securityIPList;
                this.securityIPNetType = model.securityIPNetType;
                this.securityIPType = model.securityIPType;
            } 

            /**
             * SecurityIPArrayName.
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * SecurityIPArrayTag.
             */
            public Builder securityIPArrayTag(String securityIPArrayTag) {
                this.securityIPArrayTag = securityIPArrayTag;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SecurityIPNetType.
             */
            public Builder securityIPNetType(String securityIPNetType) {
                this.securityIPNetType = securityIPNetType;
                return this;
            }

            /**
             * SecurityIPType.
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            public SecurityIPArrays build() {
                return new SecurityIPArrays(this);
            } 

        } 

    }
}
