// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHubClusterDetailsResponseBody</p>
 */
public class DescribeHubClusterDetailsResponseBody extends TeaModel {
    @NameInMap("Cluster")
    private Cluster cluster;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHubClusterDetailsResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClusterDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Cluster cluster; 
        private String requestId; 

        /**
         * The details of the master instance.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHubClusterDetailsResponseBody build() {
            return new DescribeHubClusterDetailsResponseBody(this);
        } 

    } 

    public static class ApiServer extends TeaModel {
        @NameInMap("ApiServerEipId")
        private String apiServerEipId;

        @NameInMap("EnabledPublic")
        private Boolean enabledPublic;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        private ApiServer(Builder builder) {
            this.apiServerEipId = builder.apiServerEipId;
            this.enabledPublic = builder.enabledPublic;
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiServer create() {
            return builder().build();
        }

        /**
         * @return apiServerEipId
         */
        public String getApiServerEipId() {
            return this.apiServerEipId;
        }

        /**
         * @return enabledPublic
         */
        public Boolean getEnabledPublic() {
            return this.enabledPublic;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private String apiServerEipId; 
            private Boolean enabledPublic; 
            private String loadBalancerId; 

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder apiServerEipId(String apiServerEipId) {
                this.apiServerEipId = apiServerEipId;
                return this;
            }

            /**
             * Indicates whether the API server is accessible over the Internet. Valid values:
             * <p>
             * 
             * *   true: The API server is accessible over the Internet.
             * *   false: The API server is inaccessible over the Internet.
             */
            public Builder enabledPublic(Boolean enabledPublic) {
                this.enabledPublic = enabledPublic;
                return this;
            }

            /**
             * The ID of the Server Load Balancer (SLB) instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public ApiServer build() {
                return new ApiServer(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterSpec")
        private String clusterSpec;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Name")
        private String name;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Version")
        private String version;

        private ClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterSpec = builder.clusterSpec;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterSpec; 
            private String creationTime; 
            private String errorMessage; 
            private String name; 
            private String profile; 
            private String regionId; 
            private String state; 
            private String updateTime; 
            private String version; 

            /**
             * The ID of the master instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The specification of the master instance. Valid value:
             * <p>
             * 
             * *   ack.pro.small: ACK Pro cluster
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * The time when the master instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error message returned when the master instance failed to be created.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The name of the master instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The configurations of the master instance.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The ID of the region in which the master instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the master instance. Valid values:
             * <p>
             * 
             * *   initial: The master instance is being initialized.
             * *   failed: The master instance failed to be created.
             * *   running: The master instance is running
             * *   inactive: The master instance is pending.
             * *   deleting: The master instance is being deleted.
             * *   delete_failed: The master instance failed to be deleted.
             * *   deleted: The master instance is deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the master instance was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version of the master instance.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Conditions(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
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

        public static final class Builder {
            private String message; 
            private String reason; 
            private String status; 
            private String type; 

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason for the deletion condition.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the master instance that the deletion condition indicates. Valid values:
             * <p>
             * 
             * *   True: The master instance cannot be deleted.
             * *   False: The master instance can be deleted.
             * *   Unknow: Whether the master instance can be deleted is unknown.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of deletion condition.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        private String intranetApiServerEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        private String publicApiServerEndpoint;

        private Endpoints(Builder builder) {
            this.intranetApiServerEndpoint = builder.intranetApiServerEndpoint;
            this.publicApiServerEndpoint = builder.publicApiServerEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return intranetApiServerEndpoint
         */
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        /**
         * @return publicApiServerEndpoint
         */
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        public static final class Builder {
            private String intranetApiServerEndpoint; 
            private String publicApiServerEndpoint; 

            /**
             * The endpoint that is used to access the API server over the internal network.
             */
            public Builder intranetApiServerEndpoint(String intranetApiServerEndpoint) {
                this.intranetApiServerEndpoint = intranetApiServerEndpoint;
                return this;
            }

            /**
             * The endpoint that is used to access the API server over the Internet.
             */
            public Builder publicApiServerEndpoint(String publicApiServerEndpoint) {
                this.publicApiServerEndpoint = publicApiServerEndpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class LogConfig extends TeaModel {
        @NameInMap("EnableLog")
        private Boolean enableLog;

        @NameInMap("LogProject")
        private String logProject;

        @NameInMap("LogStoreTTL")
        private String logStoreTTL;

        private LogConfig(Builder builder) {
            this.enableLog = builder.enableLog;
            this.logProject = builder.logProject;
            this.logStoreTTL = builder.logStoreTTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return enableLog
         */
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logStoreTTL
         */
        public String getLogStoreTTL() {
            return this.logStoreTTL;
        }

        public static final class Builder {
            private Boolean enableLog; 
            private String logProject; 
            private String logStoreTTL; 

            /**
             * Indicates whether the audit logging feature is enabled. Valid values:
             * <p>
             * 
             * *   true: Audit logging is enabled.
             * *   false: Audit logging is disabled.
             */
            public Builder enableLog(Boolean enableLog) {
                this.enableLog = enableLog;
                return this;
            }

            /**
             * The name of the project of Log Service.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * The number of days that logs are retained by Log Service.
             */
            public Builder logStoreTTL(String logStoreTTL) {
                this.logStoreTTL = logStoreTTL;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    public static class MeshConfig extends TeaModel {
        @NameInMap("EnableMesh")
        private Boolean enableMesh;

        @NameInMap("MeshId")
        private String meshId;

        private MeshConfig(Builder builder) {
            this.enableMesh = builder.enableMesh;
            this.meshId = builder.meshId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeshConfig create() {
            return builder().build();
        }

        /**
         * @return enableMesh
         */
        public Boolean getEnableMesh() {
            return this.enableMesh;
        }

        /**
         * @return meshId
         */
        public String getMeshId() {
            return this.meshId;
        }

        public static final class Builder {
            private Boolean enableMesh; 
            private String meshId; 

            /**
             * Indicates whether ASM is enabled. Valid values:
             * <p>
             * 
             * *   true: ASM is enabled.
             * *   false: ASM is disabled.
             */
            public Builder enableMesh(Boolean enableMesh) {
                this.enableMesh = enableMesh;
                return this;
            }

            /**
             * service mesh (ASM) instance ID
             */
            public Builder meshId(String meshId) {
                this.meshId = meshId;
                return this;
            }

            public MeshConfig build() {
                return new MeshConfig(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @NameInMap("ClusterDomain")
        private String clusterDomain;

        @NameInMap("IPStack")
        private String IPStack;

        @NameInMap("SecurityGroupIDs")
        private java.util.List < String > securityGroupIDs;

        @NameInMap("VSwitches")
        private java.util.List < String > vSwitches;

        @NameInMap("VpcId")
        private String vpcId;

        private Network(Builder builder) {
            this.clusterDomain = builder.clusterDomain;
            this.IPStack = builder.IPStack;
            this.securityGroupIDs = builder.securityGroupIDs;
            this.vSwitches = builder.vSwitches;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return clusterDomain
         */
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        /**
         * @return IPStack
         */
        public String getIPStack() {
            return this.IPStack;
        }

        /**
         * @return securityGroupIDs
         */
        public java.util.List < String > getSecurityGroupIDs() {
            return this.securityGroupIDs;
        }

        /**
         * @return vSwitches
         */
        public java.util.List < String > getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterDomain; 
            private String IPStack; 
            private java.util.List < String > securityGroupIDs; 
            private java.util.List < String > vSwitches; 
            private String vpcId; 

            /**
             * The domain name of the master instance.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * The IP version that is supported by the master instance. Valid values:
             * <p>
             * 
             * *   ipv4: IPv4.
             * *   ipv6: IPv6.
             * *   dual: IPv4 and IPv6.
             */
            public Builder IPStack(String IPStack) {
                this.IPStack = IPStack;
                return this;
            }

            /**
             * The IDs of the associated security groups.
             */
            public Builder securityGroupIDs(java.util.List < String > securityGroupIDs) {
                this.securityGroupIDs = securityGroupIDs;
                return this;
            }

            /**
             * The details of the vSwitches.
             */
            public Builder vSwitches(java.util.List < String > vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the master instance resides.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class VSwitches extends TeaModel {
        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
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
            private String vswitchId; 
            private String zoneId; 

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

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    public static class WorkflowUnits extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VSwitches")
        private java.util.List < VSwitches> vSwitches;

        @NameInMap("VpcId")
        private String vpcId;

        private WorkflowUnits(Builder builder) {
            this.regionId = builder.regionId;
            this.vSwitches = builder.vSwitches;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowUnits create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitches
         */
        public java.util.List < VSwitches> getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List < VSwitches> vSwitches; 
            private String vpcId; 

            /**
             * The ID of the region in which the master instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The details of the vSwitches.
             */
            public Builder vSwitches(java.util.List < VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the master instance resides.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public WorkflowUnits build() {
                return new WorkflowUnits(this);
            } 

        } 

    }
    public static class WorkflowConfig extends TeaModel {
        @NameInMap("ArgoServerEnabled")
        private Boolean argoServerEnabled;

        @NameInMap("PriceLimit")
        private String priceLimit;

        @NameInMap("WorkflowScheduleMode")
        private String workflowScheduleMode;

        @NameInMap("WorkflowUnits")
        private java.util.List < WorkflowUnits> workflowUnits;

        private WorkflowConfig(Builder builder) {
            this.argoServerEnabled = builder.argoServerEnabled;
            this.priceLimit = builder.priceLimit;
            this.workflowScheduleMode = builder.workflowScheduleMode;
            this.workflowUnits = builder.workflowUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowConfig create() {
            return builder().build();
        }

        /**
         * @return argoServerEnabled
         */
        public Boolean getArgoServerEnabled() {
            return this.argoServerEnabled;
        }

        /**
         * @return priceLimit
         */
        public String getPriceLimit() {
            return this.priceLimit;
        }

        /**
         * @return workflowScheduleMode
         */
        public String getWorkflowScheduleMode() {
            return this.workflowScheduleMode;
        }

        /**
         * @return workflowUnits
         */
        public java.util.List < WorkflowUnits> getWorkflowUnits() {
            return this.workflowUnits;
        }

        public static final class Builder {
            private Boolean argoServerEnabled; 
            private String priceLimit; 
            private String workflowScheduleMode; 
            private java.util.List < WorkflowUnits> workflowUnits; 

            /**
             * ArgoServerEnabled.
             */
            public Builder argoServerEnabled(Boolean argoServerEnabled) {
                this.argoServerEnabled = argoServerEnabled;
                return this;
            }

            /**
             * PriceLimit.
             */
            public Builder priceLimit(String priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            /**
             * WorkflowScheduleMode.
             */
            public Builder workflowScheduleMode(String workflowScheduleMode) {
                this.workflowScheduleMode = workflowScheduleMode;
                return this;
            }

            /**
             * WorkflowUnits.
             */
            public Builder workflowUnits(java.util.List < WorkflowUnits> workflowUnits) {
                this.workflowUnits = workflowUnits;
                return this;
            }

            public WorkflowConfig build() {
                return new WorkflowConfig(this);
            } 

        } 

    }
    public static class Cluster extends TeaModel {
        @NameInMap("ApiServer")
        private ApiServer apiServer;

        @NameInMap("ClusterInfo")
        private ClusterInfo clusterInfo;

        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("Endpoints")
        private Endpoints endpoints;

        @NameInMap("LogConfig")
        private LogConfig logConfig;

        @NameInMap("MeshConfig")
        private MeshConfig meshConfig;

        @NameInMap("Network")
        private Network network;

        @NameInMap("WorkflowConfig")
        private WorkflowConfig workflowConfig;

        private Cluster(Builder builder) {
            this.apiServer = builder.apiServer;
            this.clusterInfo = builder.clusterInfo;
            this.conditions = builder.conditions;
            this.endpoints = builder.endpoints;
            this.logConfig = builder.logConfig;
            this.meshConfig = builder.meshConfig;
            this.network = builder.network;
            this.workflowConfig = builder.workflowConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return apiServer
         */
        public ApiServer getApiServer() {
            return this.apiServer;
        }

        /**
         * @return clusterInfo
         */
        public ClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return logConfig
         */
        public LogConfig getLogConfig() {
            return this.logConfig;
        }

        /**
         * @return meshConfig
         */
        public MeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return workflowConfig
         */
        public WorkflowConfig getWorkflowConfig() {
            return this.workflowConfig;
        }

        public static final class Builder {
            private ApiServer apiServer; 
            private ClusterInfo clusterInfo; 
            private java.util.List < Conditions> conditions; 
            private Endpoints endpoints; 
            private LogConfig logConfig; 
            private MeshConfig meshConfig; 
            private Network network; 
            private WorkflowConfig workflowConfig; 

            /**
             * The details of the API server of the master instance.
             */
            public Builder apiServer(ApiServer apiServer) {
                this.apiServer = apiServer;
                return this;
            }

            /**
             * The details of the master instance.
             */
            public Builder clusterInfo(ClusterInfo clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            /**
             * The deletion conditions of the master instance.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The endpoint of the master instance.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The logging configuration.
             */
            public Builder logConfig(LogConfig logConfig) {
                this.logConfig = logConfig;
                return this;
            }

            /**
             * The configurations of Alibaba Cloud Service Mesh (ASM).
             */
            public Builder meshConfig(MeshConfig meshConfig) {
                this.meshConfig = meshConfig;
                return this;
            }

            /**
             * The network configurations of the master instance.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * WorkflowConfig.
             */
            public Builder workflowConfig(WorkflowConfig workflowConfig) {
                this.workflowConfig = workflowConfig;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
