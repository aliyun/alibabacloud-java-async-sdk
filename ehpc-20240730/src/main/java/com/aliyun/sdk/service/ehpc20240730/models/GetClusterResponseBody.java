// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The E-HPC Util version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.31</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li>Standard</li>
         * <li>Serverless</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder clusterCategory(String clusterCategory) {
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-06T12:43:01.000Z</p>
         */
        public Builder clusterCreateTime(String clusterCreateTime) {
            this.clusterCreateTime = clusterCreateTime;
            return this;
        }

        /**
         * <p>The post-processing script of the cluster.</p>
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The deployment type of the cluster. Valid values:</p>
         * <ul>
         * <li>Integrated: The cluster is deployed on a public cloud.</li>
         * <li>Hybrid: The cluster is deployed on a hybrid cloud.</li>
         * <li>Custom: The cluster is a custom cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Integrated</p>
         */
        public Builder clusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * <p>The time when the cluster was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-06T12:43:01.000Z</p>
         */
        public Builder clusterModifyTime(String clusterModifyTime) {
            this.clusterModifyTime = clusterModifyTime;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>slurm22.05.8-cluster-20240614</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The cluster state. Valid values:</p>
         * <ul>
         * <li>uninit: The cluster is being installed.</li>
         * <li>creating: The cluster is being created.</li>
         * <li>initing: The cluster is being initialized.</li>
         * <li>running: The cluster is running.</li>
         * <li>exception: The cluster has run into an exception.</li>
         * <li>raleasing: The cluster is being released.</li>
         * <li>stopping: The cluster is being stopped.</li>
         * <li>stopped: The cluster is stopped.</li>
         * <li>pending: The cluster is waiting to be configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder clusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * <p>The ID of the vSwitch used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1p2uugqsjppno******</p>
         */
        public Builder clusterVSwitchId(String clusterVSwitchId) {
            this.clusterVSwitchId = clusterVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6u3lk1pjy28eg*****</p>
         */
        public Builder clusterVpcId(String clusterVpcId) {
            this.clusterVpcId = clusterVpcId;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * <p>The E-HPC version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * <p>Indicates whether automatic scale-in is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableScaleIn(Boolean enableScaleIn) {
            this.enableScaleIn = enableScaleIn;
            return this;
        }

        /**
         * <p>Indicates whether automatic scale-out is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableScaleOut(Boolean enableScaleOut) {
            this.enableScaleOut = enableScaleOut;
            return this;
        }

        /**
         * <p>The interval at which the cluster is automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder growInterval(Integer growInterval) {
            this.growInterval = growInterval;
            return this;
        }

        /**
         * <p>The idle duration of the compute nodes allowed by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder idleInterval(Integer idleInterval) {
            this.idleInterval = idleInterval;
            return this;
        }

        /**
         * <p>The configurations of the cluster management node.</p>
         */
        public Builder manager(Manager manager) {
            this.manager = manager;
            return this;
        }

        /**
         * <p>The maximum total number of vCPUs that can be used by all compute nodes managed by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxCoreCount(String maxCoreCount) {
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * <p>The maximum number of compute nodes that the cluster can manage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-f8z9vb2zaezpkr69a21k</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The arguments that are used to run the script after the scrip is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>E-HPC cn-hangzhou</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>http://*****</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The state of the domain name resolution service. Valid values:</p>
             * <ul>
             * <li>uninit: The service is being installed.</li>
             * <li>initing: The service is being initialized.</li>
             * <li>running: The service is running.</li>
             * <li>exception: The service has run into an exception.</li>
             * <li>releasing: The service is being released.</li>
             * <li>stopped: The service is stopped.</li>
             * <li>pending: The service is waiting to be configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The resolution type.</p>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the resolution service.</p>
             * 
             * <strong>example:</strong>
             * <p>2.31</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The state of the domain account service. Valid values:</p>
             * <ul>
             * <li>uninit: The service is being installed.</li>
             * <li>initing: The service is being initialized.</li>
             * <li>running: The service is running.</li>
             * <li>exception: The service has run into an exception.</li>
             * <li>releasing: The service is being released.</li>
             * <li>stopped: The service is stopped.</li>
             * <li>pending: The service is waiting to be configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the domain account.</p>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the domain account service.</p>
             * 
             * <strong>example:</strong>
             * <p>2.31</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The expiration time of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The instance billing method of the management node. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance ID of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1a170jgea1vl******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance type of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.4xlarge</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The scheduler state. Valid values:</p>
             * <ul>
             * <li>uninit: The scheduler is being installed.</li>
             * <li>initing: The scheduler is being initialized.</li>
             * <li>running: The scheduler is running.</li>
             * <li>exception: The scheduler has run into an exception.</li>
             * <li>releasing: The scheduler is being released.</li>
             * <li>stopped: The scheduler is stopped.</li>
             * <li>pending: The scheduler is waiting to be configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The scheduler type. Valid values:</p>
             * <ul>
             * <li>SLURM</li>
             * <li>PBS</li>
             * <li>OPENGRIDSCHEDULER</li>
             * <li>LSF_PLUGIN</li>
             * <li>PBS_PLUGIN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLURM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The scheduler version.</p>
             * 
             * <strong>example:</strong>
             * <p>22.05.8</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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
             * <p>The configurations of the domain name resolution service.</p>
             */
            public Builder DNS(DNS DNS) {
                this.DNS = DNS;
                return this;
            }

            /**
             * <p>The information about the domain account service.</p>
             */
            public Builder directoryService(DirectoryService directoryService) {
                this.directoryService = directoryService;
                return this;
            }

            /**
             * <p>The configurations of the management node.</p>
             */
            public Builder managerNode(ManagerNode managerNode) {
                this.managerNode = managerNode;
                return this;
            }

            /**
             * <p>The information about the scheduler.</p>
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
