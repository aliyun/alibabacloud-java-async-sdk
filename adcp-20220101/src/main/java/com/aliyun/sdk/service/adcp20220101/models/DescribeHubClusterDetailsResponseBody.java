// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHubClusterDetailsResponseBody</p>
 */
public class DescribeHubClusterDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private Cluster cluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
        @com.aliyun.core.annotation.NameInMap("ApiServerEipId")
        private String apiServerEipId;

        @com.aliyun.core.annotation.NameInMap("EnabledPublic")
        private Boolean enabledPublic;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
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
    public static class GitOps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessControlList")
        private java.util.List < String > accessControlList;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("HAEnabled")
        private Boolean HAEnabled;

        @com.aliyun.core.annotation.NameInMap("PublicAccessEnabled")
        private Boolean publicAccessEnabled;

        private GitOps(Builder builder) {
            this.accessControlList = builder.accessControlList;
            this.enabled = builder.enabled;
            this.HAEnabled = builder.HAEnabled;
            this.publicAccessEnabled = builder.publicAccessEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitOps create() {
            return builder().build();
        }

        /**
         * @return accessControlList
         */
        public java.util.List < String > getAccessControlList() {
            return this.accessControlList;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return HAEnabled
         */
        public Boolean getHAEnabled() {
            return this.HAEnabled;
        }

        /**
         * @return publicAccessEnabled
         */
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public static final class Builder {
            private java.util.List < String > accessControlList; 
            private Boolean enabled; 
            private Boolean HAEnabled; 
            private Boolean publicAccessEnabled; 

            /**
             * The Internet access control list (ACL). This parameter takes effect only if PublicAccessEnabled is set to true.
             */
            public Builder accessControlList(java.util.List < String > accessControlList) {
                this.accessControlList = accessControlList;
                return this;
            }

            /**
             * Indicates whether GitOps is enabled. Valid values:
             * <p>
             * 
             * *   true: GitOps is enabled.
             * *   false: GitOps is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Indicates whether GitOps High Availability is enabled. Valid values:
             * <p>
             * 
             * *   true:  GitOps High Availability is enabled.
             * *   false:  GitOps High Availability is disabled.
             */
            public Builder HAEnabled(Boolean HAEnabled) {
                this.HAEnabled = HAEnabled;
                return this;
            }

            /**
             * Specifies whether to enable public domain name resolution in the Argo CD or Argo Workflow console. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            public GitOps build() {
                return new GitOps(this);
            } 

        } 

    }
    public static class ArgoWorkflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessControlList")
        private java.util.List < String > accessControlList;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("PublicAccessEnabled")
        private Boolean publicAccessEnabled;

        @com.aliyun.core.annotation.NameInMap("ServerEnabled")
        private String serverEnabled;

        private ArgoWorkflow(Builder builder) {
            this.accessControlList = builder.accessControlList;
            this.enabled = builder.enabled;
            this.publicAccessEnabled = builder.publicAccessEnabled;
            this.serverEnabled = builder.serverEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArgoWorkflow create() {
            return builder().build();
        }

        /**
         * @return accessControlList
         */
        public java.util.List < String > getAccessControlList() {
            return this.accessControlList;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return publicAccessEnabled
         */
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        /**
         * @return serverEnabled
         */
        public String getServerEnabled() {
            return this.serverEnabled;
        }

        public static final class Builder {
            private java.util.List < String > accessControlList; 
            private Boolean enabled; 
            private Boolean publicAccessEnabled; 
            private String serverEnabled; 

            /**
             * The Internet access control list (ACL). This parameter takes effect only if PublicAccessEnabled is set to true.
             */
            public Builder accessControlList(java.util.List < String > accessControlList) {
                this.accessControlList = accessControlList;
                return this;
            }

            /**
             * Specifies whether to enable the argo workflow. Valid values:
             * <p>
             * 
             * *   **false** (default)
             * *   **true**
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Specifies whether to enable public domain name resolution in the Argo CD or Argo Workflow console. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            /**
             * Specifies whether to enable the argo workflow. UI Valid values:
             * <p>
             * 
             * *   **false** (default)
             * *   **true**
             */
            public Builder serverEnabled(String serverEnabled) {
                this.serverEnabled = serverEnabled;
                return this;
            }

            public ArgoWorkflow build() {
                return new ArgoWorkflow(this);
            } 

        } 

    }
    public static class WorkFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgoWorkflow")
        private ArgoWorkflow argoWorkflow;

        private WorkFlow(Builder builder) {
            this.argoWorkflow = builder.argoWorkflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlow create() {
            return builder().build();
        }

        /**
         * @return argoWorkflow
         */
        public ArgoWorkflow getArgoWorkflow() {
            return this.argoWorkflow;
        }

        public static final class Builder {
            private ArgoWorkflow argoWorkflow; 

            /**
             * The Argo workflow metadata.
             */
            public Builder argoWorkflow(ArgoWorkflow argoWorkflow) {
                this.argoWorkflow = argoWorkflow;
                return this;
            }

            public WorkFlow build() {
                return new WorkFlow(this);
            } 

        } 

    }
    public static class ACKOne extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GitOps")
        private GitOps gitOps;

        @com.aliyun.core.annotation.NameInMap("WorkFlow")
        private WorkFlow workFlow;

        private ACKOne(Builder builder) {
            this.gitOps = builder.gitOps;
            this.workFlow = builder.workFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ACKOne create() {
            return builder().build();
        }

        /**
         * @return gitOps
         */
        public GitOps getGitOps() {
            return this.gitOps;
        }

        /**
         * @return workFlow
         */
        public WorkFlow getWorkFlow() {
            return this.workFlow;
        }

        public static final class Builder {
            private GitOps gitOps; 
            private WorkFlow workFlow; 

            /**
             * The GitOps metadata.
             */
            public Builder gitOps(GitOps gitOps) {
                this.gitOps = gitOps;
                return this;
            }

            /**
             * The workflow metadata.
             */
            public Builder workFlow(WorkFlow workFlow) {
                this.workFlow = workFlow;
                return this;
            }

            public ACKOne build() {
                return new ACKOne(this);
            } 

        } 

    }
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ACKOne")
        private ACKOne ACKOne;

        private MetaData(Builder builder) {
            this.ACKOne = builder.ACKOne;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return ACKOne
         */
        public ACKOne getACKOne() {
            return this.ACKOne;
        }

        public static final class Builder {
            private ACKOne ACKOne; 

            /**
             * The cluster metadata.
             */
            public Builder ACKOne(ACKOne ACKOne) {
                this.ACKOne = ACKOne;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterSpec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
        private String resourceGroupID;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterSpec = builder.clusterSpec;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.metaData = builder.metaData;
            this.name = builder.name;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.resourceGroupID = builder.resourceGroupID;
            this.state = builder.state;
            this.tags = builder.tags;
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
         * @return metaData
         */
        public MetaData getMetaData() {
            return this.metaData;
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
         * @return resourceGroupID
         */
        public String getResourceGroupID() {
            return this.resourceGroupID;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private MetaData metaData; 
            private String name; 
            private String profile; 
            private String regionId; 
            private String resourceGroupID; 
            private String state; 
            private java.util.List < Tags> tags; 
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
             * The cluster metadata.
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
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
             * The ID of Resource Group.
             */
            public Builder resourceGroupID(String resourceGroupID) {
                this.resourceGroupID = resourceGroupID;
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
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
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
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        @com.aliyun.core.annotation.NameInMap("IntranetApiServerEndpoint")
        private String intranetApiServerEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicApiServerEndpoint")
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
        @com.aliyun.core.annotation.NameInMap("EnableLog")
        private Boolean enableLog;

        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("LogStoreTTL")
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
        @com.aliyun.core.annotation.NameInMap("EnableMesh")
        private Boolean enableMesh;

        @com.aliyun.core.annotation.NameInMap("MeshId")
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
        @com.aliyun.core.annotation.NameInMap("ClusterDomain")
        private String clusterDomain;

        @com.aliyun.core.annotation.NameInMap("IPStack")
        private String IPStack;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIDs")
        private java.util.List < String > securityGroupIDs;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List < String > vSwitches;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * The ID of the vSwitch.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The zone ID of the cluster.
             * <p>
             * 
             * > You can call the [DescribeRegions](~~143074~~) operation to query the most recent zone list.
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
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List < VSwitches> vSwitches;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
             * The region ID of the cluster.
             * <p>
             * 
             * >  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The vSwitches.
             */
            public Builder vSwitches(java.util.List < VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The ID of the VPC.
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
        @com.aliyun.core.annotation.NameInMap("ArgoServerEnabled")
        private Boolean argoServerEnabled;

        @com.aliyun.core.annotation.NameInMap("PriceLimit")
        private String priceLimit;

        @com.aliyun.core.annotation.NameInMap("WorkflowScheduleMode")
        private String workflowScheduleMode;

        @com.aliyun.core.annotation.NameInMap("WorkflowUnits")
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
             * Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder argoServerEnabled(Boolean argoServerEnabled) {
                this.argoServerEnabled = argoServerEnabled;
                return this;
            }

            /**
             * The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.
             */
            public Builder priceLimit(String priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            /**
             * The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:
             * <p>
             * 
             * *   cost-optimized: cost-prioritized scheduling mode.
             * *   stock-optimized: inventory-prioritized scheduling mode.
             */
            public Builder workflowScheduleMode(String workflowScheduleMode) {
                this.workflowScheduleMode = workflowScheduleMode;
                return this;
            }

            /**
             * The Argo workflow regions  configuration.
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
        @com.aliyun.core.annotation.NameInMap("ApiServer")
        private ApiServer apiServer;

        @com.aliyun.core.annotation.NameInMap("ClusterInfo")
        private ClusterInfo clusterInfo;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("LogConfig")
        private LogConfig logConfig;

        @com.aliyun.core.annotation.NameInMap("MeshConfig")
        private MeshConfig meshConfig;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("WorkflowConfig")
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
             * The Argo workflow configuration.
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
