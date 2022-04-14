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
         * Cluster.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("EnabledPublic")
        private Boolean enabledPublic;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        private ApiServer(Builder builder) {
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
            private Boolean enabledPublic; 
            private String loadBalancerId; 

            /**
             * EnabledPublic.
             */
            public Builder enabledPublic(Boolean enabledPublic) {
                this.enabledPublic = enabledPublic;
                return this;
            }

            /**
             * LoadBalancerId.
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterSpec.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Version.
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
             * IntranetApiServerEndpoint.
             */
            public Builder intranetApiServerEndpoint(String intranetApiServerEndpoint) {
                this.intranetApiServerEndpoint = intranetApiServerEndpoint;
                return this;
            }

            /**
             * PublicApiServerEndpoint.
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
             * ClusterDomain.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * IPStack.
             */
            public Builder IPStack(String IPStack) {
                this.IPStack = IPStack;
                return this;
            }

            /**
             * SecurityGroupIDs.
             */
            public Builder securityGroupIDs(java.util.List < String > securityGroupIDs) {
                this.securityGroupIDs = securityGroupIDs;
                return this;
            }

            /**
             * VSwitches.
             */
            public Builder vSwitches(java.util.List < String > vSwitches) {
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

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class Cluster extends TeaModel {
        @NameInMap("ApiServer")
        private ApiServer apiServer;

        @NameInMap("ClusterInfo")
        private ClusterInfo clusterInfo;

        @NameInMap("Endpoints")
        private Endpoints endpoints;

        @NameInMap("Network")
        private Network network;

        private Cluster(Builder builder) {
            this.apiServer = builder.apiServer;
            this.clusterInfo = builder.clusterInfo;
            this.endpoints = builder.endpoints;
            this.network = builder.network;
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
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private ApiServer apiServer; 
            private ClusterInfo clusterInfo; 
            private Endpoints endpoints; 
            private Network network; 

            /**
             * ApiServer.
             */
            public Builder apiServer(ApiServer apiServer) {
                this.apiServer = apiServer;
                return this;
            }

            /**
             * ClusterInfo.
             */
            public Builder clusterInfo(ClusterInfo clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
