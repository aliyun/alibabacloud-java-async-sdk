// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshesResponseBody</p>
 */
public class DescribeServiceMeshesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceMeshes")
    private java.util.List < ServiceMeshes> serviceMeshes;

    private DescribeServiceMeshesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceMeshes = builder.serviceMeshes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceMeshes
     */
    public java.util.List < ServiceMeshes> getServiceMeshes() {
        return this.serviceMeshes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceMeshes> serviceMeshes; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the ASM instances.
         */
        public Builder serviceMeshes(java.util.List < ServiceMeshes> serviceMeshes) {
            this.serviceMeshes = serviceMeshes;
            return this;
        }

        public DescribeServiceMeshesResponseBody build() {
            return new DescribeServiceMeshesResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        private String intranetApiServerEndpoint;

        @NameInMap("IntranetPilotEndpoint")
        private String intranetPilotEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        private String publicApiServerEndpoint;

        @NameInMap("PublicPilotEndpoint")
        private String publicPilotEndpoint;

        @NameInMap("ReverseTunnelEndpoint")
        private String reverseTunnelEndpoint;

        private Endpoints(Builder builder) {
            this.intranetApiServerEndpoint = builder.intranetApiServerEndpoint;
            this.intranetPilotEndpoint = builder.intranetPilotEndpoint;
            this.publicApiServerEndpoint = builder.publicApiServerEndpoint;
            this.publicPilotEndpoint = builder.publicPilotEndpoint;
            this.reverseTunnelEndpoint = builder.reverseTunnelEndpoint;
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
         * @return intranetPilotEndpoint
         */
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        /**
         * @return publicApiServerEndpoint
         */
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        /**
         * @return publicPilotEndpoint
         */
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

        /**
         * @return reverseTunnelEndpoint
         */
        public String getReverseTunnelEndpoint() {
            return this.reverseTunnelEndpoint;
        }

        public static final class Builder {
            private String intranetApiServerEndpoint; 
            private String intranetPilotEndpoint; 
            private String publicApiServerEndpoint; 
            private String publicPilotEndpoint; 
            private String reverseTunnelEndpoint; 

            /**
             * The endpoint that is used to access the API server from the internal network.
             */
            public Builder intranetApiServerEndpoint(String intranetApiServerEndpoint) {
                this.intranetApiServerEndpoint = intranetApiServerEndpoint;
                return this;
            }

            /**
             * The endpoint that is used to access Istio Pilot from the internal network.
             */
            public Builder intranetPilotEndpoint(String intranetPilotEndpoint) {
                this.intranetPilotEndpoint = intranetPilotEndpoint;
                return this;
            }

            /**
             * The endpoint that is used to expose the API server to the Internet.
             */
            public Builder publicApiServerEndpoint(String publicApiServerEndpoint) {
                this.publicApiServerEndpoint = publicApiServerEndpoint;
                return this;
            }

            /**
             * The endpoint that is used to expose Istio Pilot to the Internet.
             */
            public Builder publicPilotEndpoint(String publicPilotEndpoint) {
                this.publicPilotEndpoint = publicPilotEndpoint;
                return this;
            }

            /**
             * The endpoint of the reverse tunnel.
             */
            public Builder reverseTunnelEndpoint(String reverseTunnelEndpoint) {
                this.reverseTunnelEndpoint = reverseTunnelEndpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class ServiceMeshInfo extends TeaModel {
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

        @NameInMap("ServiceMeshId")
        private String serviceMeshId;

        @NameInMap("State")
        private String state;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Version")
        private String version;

        private ServiceMeshInfo(Builder builder) {
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.serviceMeshId = builder.serviceMeshId;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMeshInfo create() {
            return builder().build();
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
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
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
            private String creationTime; 
            private String errorMessage; 
            private String name; 
            private String profile; 
            private String regionId; 
            private String serviceMeshId; 
            private String state; 
            private String updateTime; 
            private String version; 

            /**
             * The point in time when the ASM instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error message that is returned when the call failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The name of the ASM instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The edition of the ASM instance before ASM is available for commercial use. Valid values:
             * <p>
             * 
             * *   `Pro`: Professional Edition
             * *   `Default`: Standard Edition
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The ID of the region in which the ASM instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the ASM instance.
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * The status of the ASM instance.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The point in time when the ASM instance was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version number of the ASM instance.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ServiceMeshInfo build() {
                return new ServiceMeshInfo(this);
            } 

        } 

    }
    public static class LoadBalancer extends TeaModel {
        @NameInMap("ApiServerLoadbalancerId")
        private String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        private Boolean apiServerPublicEip;

        @NameInMap("PilotPublicEip")
        private Boolean pilotPublicEip;

        @NameInMap("PilotPublicLoadbalancerId")
        private String pilotPublicLoadbalancerId;

        private LoadBalancer(Builder builder) {
            this.apiServerLoadbalancerId = builder.apiServerLoadbalancerId;
            this.apiServerPublicEip = builder.apiServerPublicEip;
            this.pilotPublicEip = builder.pilotPublicEip;
            this.pilotPublicLoadbalancerId = builder.pilotPublicLoadbalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancer create() {
            return builder().build();
        }

        /**
         * @return apiServerLoadbalancerId
         */
        public String getApiServerLoadbalancerId() {
            return this.apiServerLoadbalancerId;
        }

        /**
         * @return apiServerPublicEip
         */
        public Boolean getApiServerPublicEip() {
            return this.apiServerPublicEip;
        }

        /**
         * @return pilotPublicEip
         */
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        /**
         * @return pilotPublicLoadbalancerId
         */
        public String getPilotPublicLoadbalancerId() {
            return this.pilotPublicLoadbalancerId;
        }

        public static final class Builder {
            private String apiServerLoadbalancerId; 
            private Boolean apiServerPublicEip; 
            private Boolean pilotPublicEip; 
            private String pilotPublicLoadbalancerId; 

            /**
             * The ID of the SLB instance that is used when the API server is exposed to the Internet.
             */
            public Builder apiServerLoadbalancerId(String apiServerLoadbalancerId) {
                this.apiServerLoadbalancerId = apiServerLoadbalancerId;
                return this;
            }

            /**
             * Indicates whether the API Server is exposed to the Internet. Valid values:
             * <p>
             * 
             * *   `true`: The API server is exposed to the Internet.
             * *   `false`: The API server is not exposed to the Internet.
             */
            public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
                this.apiServerPublicEip = apiServerPublicEip;
                return this;
            }

            /**
             * Indicates whether Istio Pilot is exposed to the Internet. Valid values:
             * <p>
             * 
             * *   `true`: Istio Pilot is exposed to the Internet.
             * *   `false`: Istio Pilot is not exposed to the Internet.
             */
            public Builder pilotPublicEip(Boolean pilotPublicEip) {
                this.pilotPublicEip = pilotPublicEip;
                return this;
            }

            /**
             * The ID of the Server Load Balancer (SLB) instance that is used when Istio Pilot is exposed to the Internet.
             */
            public Builder pilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
                this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
                return this;
            }

            public LoadBalancer build() {
                return new LoadBalancer(this);
            } 

        } 

    }
    public static class Pilot extends TeaModel {
        @NameInMap("Http10Enabled")
        private Boolean http10Enabled;

        @NameInMap("TraceSampling")
        private Float traceSampling;

        private Pilot(Builder builder) {
            this.http10Enabled = builder.http10Enabled;
            this.traceSampling = builder.traceSampling;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pilot create() {
            return builder().build();
        }

        /**
         * @return http10Enabled
         */
        public Boolean getHttp10Enabled() {
            return this.http10Enabled;
        }

        /**
         * @return traceSampling
         */
        public Float getTraceSampling() {
            return this.traceSampling;
        }

        public static final class Builder {
            private Boolean http10Enabled; 
            private Float traceSampling; 

            /**
             * Indicates whether the support for HTTP 1.0 is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The support for HTTP 1.0 is enabled.
             * *   `false`: The support for HTTP 1.0 is disabled.
             */
            public Builder http10Enabled(Boolean http10Enabled) {
                this.http10Enabled = http10Enabled;
                return this;
            }

            /**
             * The sampling percentage of tracing.
             */
            public Builder traceSampling(Float traceSampling) {
                this.traceSampling = traceSampling;
                return this;
            }

            public Pilot build() {
                return new Pilot(this);
            } 

        } 

    }
    public static class InitCNIConfiguration extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("ExcludeNamespaces")
        private String excludeNamespaces;

        private InitCNIConfiguration(Builder builder) {
            this.enabled = builder.enabled;
            this.excludeNamespaces = builder.excludeNamespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitCNIConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return excludeNamespaces
         */
        public String getExcludeNamespaces() {
            return this.excludeNamespaces;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String excludeNamespaces; 

            /**
             * Indicates whether elevated privileges are required for the istio-init container when you perform traffic redirection for the istio-proxy container. Valid values:
             * <p>
             * 
             * *   `true`: Elevated privileges are required for the istio-init container.
             * *   `false`: Elevated privileges are not required for the istio-init container.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The namespace for which sidecar injection is disabled.
             */
            public Builder excludeNamespaces(String excludeNamespaces) {
                this.excludeNamespaces = excludeNamespaces;
                return this;
            }

            public InitCNIConfiguration build() {
                return new InitCNIConfiguration(this);
            } 

        } 

    }
    public static class SidecarInjector extends TeaModel {
        @NameInMap("AutoInjectionPolicyEnabled")
        private Boolean autoInjectionPolicyEnabled;

        @NameInMap("EnableNamespacesByDefault")
        private Boolean enableNamespacesByDefault;

        @NameInMap("InitCNIConfiguration")
        private InitCNIConfiguration initCNIConfiguration;

        private SidecarInjector(Builder builder) {
            this.autoInjectionPolicyEnabled = builder.autoInjectionPolicyEnabled;
            this.enableNamespacesByDefault = builder.enableNamespacesByDefault;
            this.initCNIConfiguration = builder.initCNIConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarInjector create() {
            return builder().build();
        }

        /**
         * @return autoInjectionPolicyEnabled
         */
        public Boolean getAutoInjectionPolicyEnabled() {
            return this.autoInjectionPolicyEnabled;
        }

        /**
         * @return enableNamespacesByDefault
         */
        public Boolean getEnableNamespacesByDefault() {
            return this.enableNamespacesByDefault;
        }

        /**
         * @return initCNIConfiguration
         */
        public InitCNIConfiguration getInitCNIConfiguration() {
            return this.initCNIConfiguration;
        }

        public static final class Builder {
            private Boolean autoInjectionPolicyEnabled; 
            private Boolean enableNamespacesByDefault; 
            private InitCNIConfiguration initCNIConfiguration; 

            /**
             * Indicates whether automatic sidecar injection is enabled by using annotations.
             */
            public Builder autoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
                this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
                return this;
            }

            /**
             * Indicates whether automatic sidecar injection is enabled for all namespaces. Valid values:
             * <p>
             * 
             * *   `true`: Automatic sidecar injection is enabled for all namespaces.
             * *   `false`: Automatic sidecar injection is disabled for all namespaces.
             */
            public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
                this.enableNamespacesByDefault = enableNamespacesByDefault;
                return this;
            }

            /**
             * The initial configurations of Container Network Interface (CNI).
             */
            public Builder initCNIConfiguration(InitCNIConfiguration initCNIConfiguration) {
                this.initCNIConfiguration = initCNIConfiguration;
                return this;
            }

            public SidecarInjector build() {
                return new SidecarInjector(this);
            } 

        } 

    }
    public static class MeshConfig extends TeaModel {
        @NameInMap("Mtls")
        private Boolean mtls;

        @NameInMap("OutboundTrafficPolicy")
        private String outboundTrafficPolicy;

        @NameInMap("Pilot")
        private Pilot pilot;

        @NameInMap("SidecarInjector")
        private SidecarInjector sidecarInjector;

        @NameInMap("StrictMtls")
        private Boolean strictMtls;

        @NameInMap("Telemetry")
        private Boolean telemetry;

        @NameInMap("Tracing")
        private Boolean tracing;

        private MeshConfig(Builder builder) {
            this.mtls = builder.mtls;
            this.outboundTrafficPolicy = builder.outboundTrafficPolicy;
            this.pilot = builder.pilot;
            this.sidecarInjector = builder.sidecarInjector;
            this.strictMtls = builder.strictMtls;
            this.telemetry = builder.telemetry;
            this.tracing = builder.tracing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeshConfig create() {
            return builder().build();
        }

        /**
         * @return mtls
         */
        public Boolean getMtls() {
            return this.mtls;
        }

        /**
         * @return outboundTrafficPolicy
         */
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        /**
         * @return pilot
         */
        public Pilot getPilot() {
            return this.pilot;
        }

        /**
         * @return sidecarInjector
         */
        public SidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
        }

        /**
         * @return strictMtls
         */
        public Boolean getStrictMtls() {
            return this.strictMtls;
        }

        /**
         * @return telemetry
         */
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        /**
         * @return tracing
         */
        public Boolean getTracing() {
            return this.tracing;
        }

        public static final class Builder {
            private Boolean mtls; 
            private String outboundTrafficPolicy; 
            private Pilot pilot; 
            private SidecarInjector sidecarInjector; 
            private Boolean strictMtls; 
            private Boolean telemetry; 
            private Boolean tracing; 

            /**
             * Indicates whether the feature of routing traffic to the nearest instance is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The feature is enabled.
             * *   `false`: The feature is disabled.
             */
            public Builder mtls(Boolean mtls) {
                this.mtls = mtls;
                return this;
            }

            /**
             * The outbound traffic policy. Valid values:
             * <p>
             * 
             * *   `ALLOW_ANY`: Outbound traffic to an external service is allowed.
             * *   `REGISTRY_ONLY`: Outbound traffic is allowed to only external services that are defined in the service registry of the ASM instance.
             */
            public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
                this.outboundTrafficPolicy = outboundTrafficPolicy;
                return this;
            }

            /**
             * The configurations of the control plane.
             */
            public Builder pilot(Pilot pilot) {
                this.pilot = pilot;
                return this;
            }

            /**
             * The configurations of sidecar injection.
             */
            public Builder sidecarInjector(SidecarInjector sidecarInjector) {
                this.sidecarInjector = sidecarInjector;
                return this;
            }

            /**
             * Indicates whether mutual Transport Layer Security (mTLS) is strictly enforced.
             */
            public Builder strictMtls(Boolean strictMtls) {
                this.strictMtls = strictMtls;
                return this;
            }

            /**
             * Indicates whether Prometheus monitoring is enabled. We recommend that you use Prometheus Service of Application Real-Time Monitoring Service (ARMS). Valid values:
             * <p>
             * 
             * *   `true`: Prometheus monitoring is enabled.
             * *   `false`: Prometheus monitoring is disabled.
             */
            public Builder telemetry(Boolean telemetry) {
                this.telemetry = telemetry;
                return this;
            }

            /**
             * Indicates whether the tracing feature is enabled. This feature can be enabled only after Tracing Analysis is activated. Valid values:
             * <p>
             * 
             * *   `true`: The tracing feature is enabled.
             * *   `false`: The tracing feature is disabled.
             */
            public Builder tracing(Boolean tracing) {
                this.tracing = tracing;
                return this;
            }

            public MeshConfig build() {
                return new MeshConfig(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitches")
        private java.util.List < String > vSwitches;

        @NameInMap("VpcId")
        private String vpcId;

        private Network(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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
            private String securityGroupId; 
            private java.util.List < String > vSwitches; 
            private String vpcId; 

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of vSwitches.
             */
            public Builder vSwitches(java.util.List < String > vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
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
    public static class Spec extends TeaModel {
        @NameInMap("LoadBalancer")
        private LoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        private MeshConfig meshConfig;

        @NameInMap("Network")
        private Network network;

        private Spec(Builder builder) {
            this.loadBalancer = builder.loadBalancer;
            this.meshConfig = builder.meshConfig;
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return loadBalancer
         */
        public LoadBalancer getLoadBalancer() {
            return this.loadBalancer;
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

        public static final class Builder {
            private LoadBalancer loadBalancer; 
            private MeshConfig meshConfig; 
            private Network network; 

            /**
             * The information about load balancing.
             */
            public Builder loadBalancer(LoadBalancer loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            /**
             * The configurations of the ASM instance.
             */
            public Builder meshConfig(MeshConfig meshConfig) {
                this.meshConfig = meshConfig;
                return this;
            }

            /**
             * The network configurations of the ASM instance.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class ServiceMeshes extends TeaModel {
        @NameInMap("ClusterSpec")
        private String clusterSpec;

        @NameInMap("Clusters")
        private java.util.List < String > clusters;

        @NameInMap("Endpoints")
        private Endpoints endpoints;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("OwnerType")
        private String ownerType;

        @NameInMap("ServiceMeshInfo")
        private ServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        private Spec spec;

        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private ServiceMeshes(Builder builder) {
            this.clusterSpec = builder.clusterSpec;
            this.clusters = builder.clusters;
            this.endpoints = builder.endpoints;
            this.ownerId = builder.ownerId;
            this.ownerType = builder.ownerType;
            this.serviceMeshInfo = builder.serviceMeshInfo;
            this.spec = builder.spec;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMeshes create() {
            return builder().build();
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return clusters
         */
        public java.util.List < String > getClusters() {
            return this.clusters;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return serviceMeshInfo
         */
        public ServiceMeshInfo getServiceMeshInfo() {
            return this.serviceMeshInfo;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String clusterSpec; 
            private java.util.List < String > clusters; 
            private Endpoints endpoints; 
            private String ownerId; 
            private String ownerType; 
            private ServiceMeshInfo serviceMeshInfo; 
            private Spec spec; 
            private java.util.List < Tag> tag; 

            /**
             * The edition of the ASM instance. Valid values:
             * <p>
             * 
             * - `standard`: Standard Edition
             * - `enterprise`: Enterprise Edition
             * - `ultimate`: Ultimate Edition
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * The information about the clusters.
             */
            public Builder clusters(java.util.List < String > clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * All endpoints of the ASM instance.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud service instance for which the ASM instance is created.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The Alibaba Cloud service for which the ASM instance is created. Valid values:
             * <p>
             * 
             * - `ackone`: The ASM instance is created for Alibaba Cloud Distributed Cloud Container Platform (ACK One).
             * - An empty value indicates that the ASM instance is created by the user.
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * The basic information about the ASM instance.
             */
            public Builder serviceMeshInfo(ServiceMeshInfo serviceMeshInfo) {
                this.serviceMeshInfo = serviceMeshInfo;
                return this;
            }

            /**
             * The specifications of the ASM instance.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public ServiceMeshes build() {
                return new ServiceMeshes(this);
            } 

        } 

    }
}
