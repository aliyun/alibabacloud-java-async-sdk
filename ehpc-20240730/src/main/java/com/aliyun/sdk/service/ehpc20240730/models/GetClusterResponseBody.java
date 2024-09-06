// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.NameInMap("ClusterCategory")
    private String clusterCategory;

    @com.aliyun.core.annotation.NameInMap("ClusterCreateTime")
    private String clusterCreateTime;

    @com.aliyun.core.annotation.NameInMap("ClusterCustomConfiguration")
    private ClusterCustomConfiguration clusterCustomConfiguration;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.NameInMap("ClusterModifyTime")
    private String clusterModifyTime;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterStatus")
    private String clusterStatus;

    @com.aliyun.core.annotation.NameInMap("ClusterVSwitchId")
    private String clusterVSwitchId;

    @com.aliyun.core.annotation.NameInMap("ClusterVpcId")
    private String clusterVpcId;

    @com.aliyun.core.annotation.NameInMap("DeleteProtection")
    private String deleteProtection;

    @com.aliyun.core.annotation.NameInMap("EhpcVersion")
    private String ehpcVersion;

    @com.aliyun.core.annotation.NameInMap("EnableScaleIn")
    private Boolean enableScaleIn;

    @com.aliyun.core.annotation.NameInMap("EnableScaleOut")
    private Boolean enableScaleOut;

    @com.aliyun.core.annotation.NameInMap("GrowInterval")
    private Integer growInterval;

    @com.aliyun.core.annotation.NameInMap("IdleInterval")
    private Integer idleInterval;

    @com.aliyun.core.annotation.NameInMap("Manager")
    private Manager manager;

    @com.aliyun.core.annotation.NameInMap("MaxCoreCount")
    private String maxCoreCount;

    @com.aliyun.core.annotation.NameInMap("MaxCount")
    private String maxCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    private GetClusterResponseBody(Builder builder) {
        this.clientVersion = builder.clientVersion;
        this.clusterCategory = builder.clusterCategory;
        this.clusterCreateTime = builder.clusterCreateTime;
        this.clusterCustomConfiguration = builder.clusterCustomConfiguration;
        this.clusterId = builder.clusterId;
        this.clusterMode = builder.clusterMode;
        this.clusterModifyTime = builder.clusterModifyTime;
        this.clusterName = builder.clusterName;
        this.clusterStatus = builder.clusterStatus;
        this.clusterVSwitchId = builder.clusterVSwitchId;
        this.clusterVpcId = builder.clusterVpcId;
        this.deleteProtection = builder.deleteProtection;
        this.ehpcVersion = builder.ehpcVersion;
        this.enableScaleIn = builder.enableScaleIn;
        this.enableScaleOut = builder.enableScaleOut;
        this.growInterval = builder.growInterval;
        this.idleInterval = builder.idleInterval;
        this.manager = builder.manager;
        this.maxCoreCount = builder.maxCoreCount;
        this.maxCount = builder.maxCount;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterCategory
     */
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    /**
     * @return clusterCreateTime
     */
    public String getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * @return clusterCustomConfiguration
     */
    public ClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterMode
     */
    public String getClusterMode() {
        return this.clusterMode;
    }

    /**
     * @return clusterModifyTime
     */
    public String getClusterModifyTime() {
        return this.clusterModifyTime;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return clusterVSwitchId
     */
    public String getClusterVSwitchId() {
        return this.clusterVSwitchId;
    }

    /**
     * @return clusterVpcId
     */
    public String getClusterVpcId() {
        return this.clusterVpcId;
    }

    /**
     * @return deleteProtection
     */
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    /**
     * @return enableScaleIn
     */
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    /**
     * @return enableScaleOut
     */
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    /**
     * @return growInterval
     */
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    /**
     * @return idleInterval
     */
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    /**
     * @return manager
     */
    public Manager getManager() {
        return this.manager;
    }

    /**
     * @return maxCoreCount
     */
    public String getMaxCoreCount() {
        return this.maxCoreCount;
    }

    /**
     * @return maxCount
     */
    public String getMaxCount() {
        return this.maxCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder {
        private String clientVersion; 
        private String clusterCategory; 
        private String clusterCreateTime; 
        private ClusterCustomConfiguration clusterCustomConfiguration; 
        private String clusterId; 
        private String clusterMode; 
        private String clusterModifyTime; 
        private String clusterName; 
        private String clusterStatus; 
        private String clusterVSwitchId; 
        private String clusterVpcId; 
        private String deleteProtection; 
        private String ehpcVersion; 
        private Boolean enableScaleIn; 
        private Boolean enableScaleOut; 
        private Integer growInterval; 
        private Integer idleInterval; 
        private Manager manager; 
        private String maxCoreCount; 
        private String maxCount; 
        private String requestId; 
        private String resourceGroupId; 
        private String securityGroupId; 

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ClusterCategory.
         */
        public Builder clusterCategory(String clusterCategory) {
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * ClusterCreateTime.
         */
        public Builder clusterCreateTime(String clusterCreateTime) {
            this.clusterCreateTime = clusterCreateTime;
            return this;
        }

        /**
         * ClusterCustomConfiguration.
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterMode.
         */
        public Builder clusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * ClusterModifyTime.
         */
        public Builder clusterModifyTime(String clusterModifyTime) {
            this.clusterModifyTime = clusterModifyTime;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
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
         * ClusterVSwitchId.
         */
        public Builder clusterVSwitchId(String clusterVSwitchId) {
            this.clusterVSwitchId = clusterVSwitchId;
            return this;
        }

        /**
         * ClusterVpcId.
         */
        public Builder clusterVpcId(String clusterVpcId) {
            this.clusterVpcId = clusterVpcId;
            return this;
        }

        /**
         * DeleteProtection.
         */
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * EhpcVersion.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * EnableScaleIn.
         */
        public Builder enableScaleIn(Boolean enableScaleIn) {
            this.enableScaleIn = enableScaleIn;
            return this;
        }

        /**
         * EnableScaleOut.
         */
        public Builder enableScaleOut(Boolean enableScaleOut) {
            this.enableScaleOut = enableScaleOut;
            return this;
        }

        /**
         * GrowInterval.
         */
        public Builder growInterval(Integer growInterval) {
            this.growInterval = growInterval;
            return this;
        }

        /**
         * IdleInterval.
         */
        public Builder idleInterval(Integer idleInterval) {
            this.idleInterval = idleInterval;
            return this;
        }

        /**
         * Manager.
         */
        public Builder manager(Manager manager) {
            this.manager = manager;
            return this;
        }

        /**
         * MaxCoreCount.
         */
        public Builder maxCoreCount(String maxCoreCount) {
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(String maxCount) {
            this.maxCount = maxCount;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    public static class ClusterCustomConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private ClusterCustomConfiguration(Builder builder) {
            this.args = builder.args;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterCustomConfiguration create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String args; 
            private String script; 

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public ClusterCustomConfiguration build() {
                return new ClusterCustomConfiguration(this);
            } 

        } 

    }
    public static class DNS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DNS(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNS create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String status; 
            private String type; 
            private String version; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DNS build() {
                return new DNS(this);
            } 

        } 

    }
    public static class DirectoryService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DirectoryService(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryService create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String status; 
            private String type; 
            private String version; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DirectoryService build() {
                return new DirectoryService(this);
            } 

        } 

    }
    public static class ManagerNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private ManagerNode(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagerNode create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String expiredTime; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceType; 

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public ManagerNode build() {
                return new ManagerNode(this);
            } 

        } 

    }
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Scheduler(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String status; 
            private String type; 
            private String version; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Scheduler build() {
                return new Scheduler(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DNS")
        private DNS DNS;

        @com.aliyun.core.annotation.NameInMap("DirectoryService")
        private DirectoryService directoryService;

        @com.aliyun.core.annotation.NameInMap("ManagerNode")
        private ManagerNode managerNode;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private Scheduler scheduler;

        private Manager(Builder builder) {
            this.DNS = builder.DNS;
            this.directoryService = builder.directoryService;
            this.managerNode = builder.managerNode;
            this.scheduler = builder.scheduler;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return DNS
         */
        public DNS getDNS() {
            return this.DNS;
        }

        /**
         * @return directoryService
         */
        public DirectoryService getDirectoryService() {
            return this.directoryService;
        }

        /**
         * @return managerNode
         */
        public ManagerNode getManagerNode() {
            return this.managerNode;
        }

        /**
         * @return scheduler
         */
        public Scheduler getScheduler() {
            return this.scheduler;
        }

        public static final class Builder {
            private DNS DNS; 
            private DirectoryService directoryService; 
            private ManagerNode managerNode; 
            private Scheduler scheduler; 

            /**
             * DNS.
             */
            public Builder DNS(DNS DNS) {
                this.DNS = DNS;
                return this;
            }

            /**
             * DirectoryService.
             */
            public Builder directoryService(DirectoryService directoryService) {
                this.directoryService = directoryService;
                return this;
            }

            /**
             * ManagerNode.
             */
            public Builder managerNode(ManagerNode managerNode) {
                this.managerNode = managerNode;
                return this;
            }

            /**
             * Scheduler.
             */
            public Builder scheduler(Scheduler scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
}
