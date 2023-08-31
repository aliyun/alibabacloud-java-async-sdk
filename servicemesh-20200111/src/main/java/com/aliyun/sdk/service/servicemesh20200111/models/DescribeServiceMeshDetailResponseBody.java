// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshDetailResponseBody</p>
 */
public class DescribeServiceMeshDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceMesh")
    private ServiceMesh serviceMesh;

    private DescribeServiceMeshDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceMesh = builder.serviceMesh;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceMesh
     */
    public ServiceMesh getServiceMesh() {
        return this.serviceMesh;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceMesh serviceMesh; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the ASM instance.
         */
        public Builder serviceMesh(ServiceMesh serviceMesh) {
            this.serviceMesh = serviceMesh;
            return this;
        }

        public DescribeServiceMeshDetailResponseBody build() {
            return new DescribeServiceMeshDetailResponseBody(this);
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

        private Endpoints(Builder builder) {
            this.intranetApiServerEndpoint = builder.intranetApiServerEndpoint;
            this.intranetPilotEndpoint = builder.intranetPilotEndpoint;
            this.publicApiServerEndpoint = builder.publicApiServerEndpoint;
            this.publicPilotEndpoint = builder.publicPilotEndpoint;
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

        public static final class Builder {
            private String intranetApiServerEndpoint; 
            private String intranetPilotEndpoint; 
            private String publicApiServerEndpoint; 
            private String publicPilotEndpoint; 

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
             * The time when the ASM instance was created.
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
             * The edition of the ASM instance. Valid values:
             * <p>
             * 
             * *   `Default`: Standard Edition
             * *   `Pro`: Professional Edition
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
             * The time when the ASM instance was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version of the ASM instance.
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
             * Indicates whether the API server is exposed to the Internet. Valid values:
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
    public static class AccessLog extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Project")
        private String project;

        private AccessLog(Builder builder) {
            this.enabled = builder.enabled;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLog create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String project; 

            /**
             * Indicates whether access log collection is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Access log collection is enabled.
             * *   `false`: Access log collection is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The name of the Log Service project that stores access logs.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public AccessLog build() {
                return new AccessLog(this);
            } 

        } 

    }
    public static class Audit extends TeaModel {
        @NameInMap("AuditProjectStatus")
        private String auditProjectStatus;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Project")
        private String project;

        private Audit(Builder builder) {
            this.auditProjectStatus = builder.auditProjectStatus;
            this.enabled = builder.enabled;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audit create() {
            return builder().build();
        }

        /**
         * @return auditProjectStatus
         */
        public String getAuditProjectStatus() {
            return this.auditProjectStatus;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String auditProjectStatus; 
            private Boolean enabled; 
            private String project; 

            /**
             * Indicates whether an audit project exists in the ASM instance. Valid values:
             * <p>
             * 
             * *   `audit_project_exist`: An audit project exists.
             * *   `audit_project_not_exist`: No audit project exists.
             */
            public Builder auditProjectStatus(String auditProjectStatus) {
                this.auditProjectStatus = auditProjectStatus;
                return this;
            }

            /**
             * Indicates whether mesh audit is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Mesh audit is enabled.
             * *   `false`: Mesh audit is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The name of the Log Service project that is used for mesh audit.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public Audit build() {
                return new Audit(this);
            } 

        } 

    }
    public static class ControlPlaneLogInfo extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("LogTTL")
        private Integer logTTL;

        @NameInMap("Project")
        private String project;

        private ControlPlaneLogInfo(Builder builder) {
            this.enabled = builder.enabled;
            this.logTTL = builder.logTTL;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneLogInfo create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return logTTL
         */
        public Integer getLogTTL() {
            return this.logTTL;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer logTTL; 
            private String project; 

            /**
             * Indicates whether the collection of control-plane logs is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The collection of control-plane logs is enabled.
             * *   `false`: The collection of control-plane logs is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * LogTTL.
             */
            public Builder logTTL(Integer logTTL) {
                this.logTTL = logTTL;
                return this;
            }

            /**
             * The name of the Log Service project that stores control-plane logs.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public ControlPlaneLogInfo build() {
                return new ControlPlaneLogInfo(this);
            } 

        } 

    }
    public static class Edition extends TeaModel {
        @NameInMap("IstiodImageTag")
        private String istiodImageTag;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProxyImageTag")
        private String proxyImageTag;

        private Edition(Builder builder) {
            this.istiodImageTag = builder.istiodImageTag;
            this.name = builder.name;
            this.proxyImageTag = builder.proxyImageTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edition create() {
            return builder().build();
        }

        /**
         * @return istiodImageTag
         */
        public String getIstiodImageTag() {
            return this.istiodImageTag;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return proxyImageTag
         */
        public String getProxyImageTag() {
            return this.proxyImageTag;
        }

        public static final class Builder {
            private String istiodImageTag; 
            private String name; 
            private String proxyImageTag; 

            /**
             * The version of the Istiod image.
             */
            public Builder istiodImageTag(String istiodImageTag) {
                this.istiodImageTag = istiodImageTag;
                return this;
            }

            /**
             * The name of the edition.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The version of the Istio Proxy image.
             */
            public Builder proxyImageTag(String proxyImageTag) {
                this.proxyImageTag = proxyImageTag;
                return this;
            }

            public Edition build() {
                return new Edition(this);
            } 

        } 

    }
    public static class AccessLogExtraConf extends TeaModel {
        @NameInMap("GatewayEnabled")
        private Boolean gatewayEnabled;

        @NameInMap("GatewayLifecycle")
        private Integer gatewayLifecycle;

        @NameInMap("SidecarEnabled")
        private Boolean sidecarEnabled;

        @NameInMap("SidecarLifecycle")
        private Integer sidecarLifecycle;

        private AccessLogExtraConf(Builder builder) {
            this.gatewayEnabled = builder.gatewayEnabled;
            this.gatewayLifecycle = builder.gatewayLifecycle;
            this.sidecarEnabled = builder.sidecarEnabled;
            this.sidecarLifecycle = builder.sidecarLifecycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogExtraConf create() {
            return builder().build();
        }

        /**
         * @return gatewayEnabled
         */
        public Boolean getGatewayEnabled() {
            return this.gatewayEnabled;
        }

        /**
         * @return gatewayLifecycle
         */
        public Integer getGatewayLifecycle() {
            return this.gatewayLifecycle;
        }

        /**
         * @return sidecarEnabled
         */
        public Boolean getSidecarEnabled() {
            return this.sidecarEnabled;
        }

        /**
         * @return sidecarLifecycle
         */
        public Integer getSidecarLifecycle() {
            return this.sidecarLifecycle;
        }

        public static final class Builder {
            private Boolean gatewayEnabled; 
            private Integer gatewayLifecycle; 
            private Boolean sidecarEnabled; 
            private Integer sidecarLifecycle; 

            /**
             * GatewayEnabled.
             */
            public Builder gatewayEnabled(Boolean gatewayEnabled) {
                this.gatewayEnabled = gatewayEnabled;
                return this;
            }

            /**
             * The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using the Log Service. For example, a value of 30 indicates that the logs are retained for 30 days.
             */
            public Builder gatewayLifecycle(Integer gatewayLifecycle) {
                this.gatewayLifecycle = gatewayLifecycle;
                return this;
            }

            /**
             * SidecarEnabled.
             */
            public Builder sidecarEnabled(Boolean sidecarEnabled) {
                this.sidecarEnabled = sidecarEnabled;
                return this;
            }

            /**
             * The retention period for the access logs of sidecar proxies. Unit: day. The logs are collected by using the Log Service. For example, a value of 30 indicates that the logs are retained for 30 days.
             */
            public Builder sidecarLifecycle(Integer sidecarLifecycle) {
                this.sidecarLifecycle = sidecarLifecycle;
                return this;
            }

            public AccessLogExtraConf build() {
                return new AccessLogExtraConf(this);
            } 

        } 

    }
    public static class EgressHpaCpu extends TeaModel {
        @NameInMap("TargetAverageUtilization")
        private Integer targetAverageUtilization;

        private EgressHpaCpu(Builder builder) {
            this.targetAverageUtilization = builder.targetAverageUtilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressHpaCpu create() {
            return builder().build();
        }

        /**
         * @return targetAverageUtilization
         */
        public Integer getTargetAverageUtilization() {
            return this.targetAverageUtilization;
        }

        public static final class Builder {
            private Integer targetAverageUtilization; 

            /**
             * The expected CPU utilization when HPA is enabled. Valid values: 1 to 100. If the CPU utilization exceeds this value, the number of pod replicas increases. If the CPU utilization is less than this value, the number of pod replicas decreases.
             */
            public Builder targetAverageUtilization(Integer targetAverageUtilization) {
                this.targetAverageUtilization = targetAverageUtilization;
                return this;
            }

            public EgressHpaCpu build() {
                return new EgressHpaCpu(this);
            } 

        } 

    }
    public static class EgressHpaMemory extends TeaModel {
        @NameInMap("TargetAverageUtilization")
        private Integer targetAverageUtilization;

        private EgressHpaMemory(Builder builder) {
            this.targetAverageUtilization = builder.targetAverageUtilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressHpaMemory create() {
            return builder().build();
        }

        /**
         * @return targetAverageUtilization
         */
        public Integer getTargetAverageUtilization() {
            return this.targetAverageUtilization;
        }

        public static final class Builder {
            private Integer targetAverageUtilization; 

            /**
             * The expected memory usage when HPA is enabled. Valid values: 1 to 100. If the memory usage exceeds this value, the number of pod replicas increases. If the memory usage is less than this value, the number of pod replicas decreases.
             */
            public Builder targetAverageUtilization(Integer targetAverageUtilization) {
                this.targetAverageUtilization = targetAverageUtilization;
                return this;
            }

            public EgressHpaMemory build() {
                return new EgressHpaMemory(this);
            } 

        } 

    }
    public static class EgressResources extends TeaModel {
        @NameInMap("Limits")
        private java.util.Map < String, ? > limits;

        @NameInMap("Requests")
        private java.util.Map < String, ? > requests;

        private EgressResources(Builder builder) {
            this.limits = builder.limits;
            this.requests = builder.requests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressResources create() {
            return builder().build();
        }

        /**
         * @return limits
         */
        public java.util.Map < String, ? > getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map < String, ? > getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map < String, ? > limits; 
            private java.util.Map < String, ? > requests; 

            /**
             * The resources that are available to the egress gateway.
             */
            public Builder limits(java.util.Map < String, ? > limits) {
                this.limits = limits;
                return this;
            }

            /**
             * The resources that are requested by the egress gateway.
             */
            public Builder requests(java.util.Map < String, ? > requests) {
                this.requests = requests;
                return this;
            }

            public EgressResources build() {
                return new EgressResources(this);
            } 

        } 

    }
    public static class AdaptiveXdsConfiguration extends TeaModel {
        @NameInMap("EgressAutoscaleEnabled")
        private Boolean egressAutoscaleEnabled;

        @NameInMap("EgressHpaCpu")
        private EgressHpaCpu egressHpaCpu;

        @NameInMap("EgressHpaMemory")
        private EgressHpaMemory egressHpaMemory;

        @NameInMap("EgressMaxReplica")
        private Integer egressMaxReplica;

        @NameInMap("EgressMinReplica")
        private Integer egressMinReplica;

        @NameInMap("EgressReplicaCount")
        private Integer egressReplicaCount;

        @NameInMap("EgressResources")
        private EgressResources egressResources;

        @NameInMap("Enabled")
        private Boolean enabled;

        private AdaptiveXdsConfiguration(Builder builder) {
            this.egressAutoscaleEnabled = builder.egressAutoscaleEnabled;
            this.egressHpaCpu = builder.egressHpaCpu;
            this.egressHpaMemory = builder.egressHpaMemory;
            this.egressMaxReplica = builder.egressMaxReplica;
            this.egressMinReplica = builder.egressMinReplica;
            this.egressReplicaCount = builder.egressReplicaCount;
            this.egressResources = builder.egressResources;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdaptiveXdsConfiguration create() {
            return builder().build();
        }

        /**
         * @return egressAutoscaleEnabled
         */
        public Boolean getEgressAutoscaleEnabled() {
            return this.egressAutoscaleEnabled;
        }

        /**
         * @return egressHpaCpu
         */
        public EgressHpaCpu getEgressHpaCpu() {
            return this.egressHpaCpu;
        }

        /**
         * @return egressHpaMemory
         */
        public EgressHpaMemory getEgressHpaMemory() {
            return this.egressHpaMemory;
        }

        /**
         * @return egressMaxReplica
         */
        public Integer getEgressMaxReplica() {
            return this.egressMaxReplica;
        }

        /**
         * @return egressMinReplica
         */
        public Integer getEgressMinReplica() {
            return this.egressMinReplica;
        }

        /**
         * @return egressReplicaCount
         */
        public Integer getEgressReplicaCount() {
            return this.egressReplicaCount;
        }

        /**
         * @return egressResources
         */
        public EgressResources getEgressResources() {
            return this.egressResources;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean egressAutoscaleEnabled; 
            private EgressHpaCpu egressHpaCpu; 
            private EgressHpaMemory egressHpaMemory; 
            private Integer egressMaxReplica; 
            private Integer egressMinReplica; 
            private Integer egressReplicaCount; 
            private EgressResources egressResources; 
            private Boolean enabled; 

            /**
             * Indicates whether Horizontal Pod Autoscaling (HPA) is enabled for the egress gateway.
             */
            public Builder egressAutoscaleEnabled(Boolean egressAutoscaleEnabled) {
                this.egressAutoscaleEnabled = egressAutoscaleEnabled;
                return this;
            }

            /**
             * The CPU resource configurations of the egress gateway when HPA is enabled.
             */
            public Builder egressHpaCpu(EgressHpaCpu egressHpaCpu) {
                this.egressHpaCpu = egressHpaCpu;
                return this;
            }

            /**
             * The memory resource configurations of the egress gateway when HPA is enabled.
             */
            public Builder egressHpaMemory(EgressHpaMemory egressHpaMemory) {
                this.egressHpaMemory = egressHpaMemory;
                return this;
            }

            /**
             * The maximum number of egress gateway pod replicas when HPA is enabled.
             */
            public Builder egressMaxReplica(Integer egressMaxReplica) {
                this.egressMaxReplica = egressMaxReplica;
                return this;
            }

            /**
             * The minimum number of egress gateway pod replicas when HPA is enabled.
             */
            public Builder egressMinReplica(Integer egressMinReplica) {
                this.egressMinReplica = egressMinReplica;
                return this;
            }

            /**
             * The number of the egress gateway pod replicas.
             */
            public Builder egressReplicaCount(Integer egressReplicaCount) {
                this.egressReplicaCount = egressReplicaCount;
                return this;
            }

            /**
             * The resource configurations of the egress gateway that is used by adaptive xDS optimization.
             */
            public Builder egressResources(EgressResources egressResources) {
                this.egressResources = egressResources;
                return this;
            }

            /**
             * Indicates whether adaptive xDS optimization is enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AdaptiveXdsConfiguration build() {
                return new AdaptiveXdsConfiguration(this);
            } 

        } 

    }
    public static class AutoDiagnosis extends TeaModel {
        @NameInMap("AutoDiagnosisEnabled")
        private Boolean autoDiagnosisEnabled;

        private AutoDiagnosis(Builder builder) {
            this.autoDiagnosisEnabled = builder.autoDiagnosisEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDiagnosis create() {
            return builder().build();
        }

        /**
         * @return autoDiagnosisEnabled
         */
        public Boolean getAutoDiagnosisEnabled() {
            return this.autoDiagnosisEnabled;
        }

        public static final class Builder {
            private Boolean autoDiagnosisEnabled; 

            /**
             * Indicates whether automatic diagnosis is enabled for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed five minutes after you modify an Istio resource.
             */
            public Builder autoDiagnosisEnabled(Boolean autoDiagnosisEnabled) {
                this.autoDiagnosisEnabled = autoDiagnosisEnabled;
                return this;
            }

            public AutoDiagnosis build() {
                return new AutoDiagnosis(this);
            } 

        } 

    }
    public static class CRAggregationConfiguration extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        private CRAggregationConfiguration(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CRAggregationConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Indicates whether Istio resources can be accessed by using the Kubernetes API on the data plane.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public CRAggregationConfiguration build() {
                return new CRAggregationConfiguration(this);
            } 

        } 

    }
    public static class IstioCRHistory extends TeaModel {
        @NameInMap("EnableHistory")
        private Boolean enableHistory;

        private IstioCRHistory(Builder builder) {
            this.enableHistory = builder.enableHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IstioCRHistory create() {
            return builder().build();
        }

        /**
         * @return enableHistory
         */
        public Boolean getEnableHistory() {
            return this.enableHistory;
        }

        public static final class Builder {
            private Boolean enableHistory; 

            /**
             * Indicates whether the rollback feature for Istio resources is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The rollback feature for Istio resources is enabled.
             * *   `false`: The rollback feature for Istio resources is disabled.
             */
            public Builder enableHistory(Boolean enableHistory) {
                this.enableHistory = enableHistory;
                return this;
            }

            public IstioCRHistory build() {
                return new IstioCRHistory(this);
            } 

        } 

    }
    public static class Exec extends TeaModel {
        @NameInMap("command")
        private java.util.List < String > command;

        private Exec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * The executed command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    public static class HttpHeaders extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private HttpHeaders(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpHeaders create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the HTTP request header.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the HTTP request header field.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HttpHeaders build() {
                return new HttpHeaders(this);
            } 

        } 

    }
    public static class HttpGet extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("httpHeaders")
        private java.util.List < HttpHeaders> httpHeaders;

        @NameInMap("port")
        private String port;

        @NameInMap("scheme")
        private String scheme;

        private HttpGet(Builder builder) {
            this.host = builder.host;
            this.httpHeaders = builder.httpHeaders;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGet create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpHeaders
         */
        public java.util.List < HttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String host; 
            private java.util.List < HttpHeaders> httpHeaders; 
            private String port; 
            private String scheme; 

            /**
             * The URL of the request.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The HTTP request headers.
             */
            public Builder httpHeaders(java.util.List < HttpHeaders> httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * The port number of the request.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The request method. Valid values: `http` and `https`.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public HttpGet build() {
                return new HttpGet(this);
            } 

        } 

    }
    public static class TcpSocket extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("port")
        private String port;

        private TcpSocket(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TcpSocket create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private String port; 

            /**
             * The URL of the TCP socket request.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port number of the TCP socket request.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public TcpSocket build() {
                return new TcpSocket(this);
            } 

        } 

    }
    public static class PostStart extends TeaModel {
        @NameInMap("exec")
        private Exec exec;

        @NameInMap("httpGet")
        private HttpGet httpGet;

        @NameInMap("tcpSocket")
        private TcpSocket tcpSocket;

        private PostStart(Builder builder) {
            this.exec = builder.exec;
            this.httpGet = builder.httpGet;
            this.tcpSocket = builder.tcpSocket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostStart create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public Exec getExec() {
            return this.exec;
        }

        /**
         * @return httpGet
         */
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return tcpSocket
         */
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public static final class Builder {
            private Exec exec; 
            private HttpGet httpGet; 
            private TcpSocket tcpSocket; 

            /**
             * The post-start script.
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * The HTTP GET request that is sent before the instance stops.
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * The TCP socket request that is sent.
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            public PostStart build() {
                return new PostStart(this);
            } 

        } 

    }
    public static class PreStopExec extends TeaModel {
        @NameInMap("command")
        private java.util.List < String > command;

        private PreStopExec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStopExec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * The executed command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public PreStopExec build() {
                return new PreStopExec(this);
            } 

        } 

    }
    public static class HttpGetHttpHeaders extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private HttpGetHttpHeaders(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGetHttpHeaders create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the HTTP request header.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the HTTP request header field.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HttpGetHttpHeaders build() {
                return new HttpGetHttpHeaders(this);
            } 

        } 

    }
    public static class PreStopHttpGet extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("httpHeaders")
        private java.util.List < HttpGetHttpHeaders> httpHeaders;

        @NameInMap("port")
        private String port;

        @NameInMap("scheme")
        private String scheme;

        private PreStopHttpGet(Builder builder) {
            this.host = builder.host;
            this.httpHeaders = builder.httpHeaders;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStopHttpGet create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpHeaders
         */
        public java.util.List < HttpGetHttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String host; 
            private java.util.List < HttpGetHttpHeaders> httpHeaders; 
            private String port; 
            private String scheme; 

            /**
             * The URL of the request.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The HTTP request headers.
             */
            public Builder httpHeaders(java.util.List < HttpGetHttpHeaders> httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * The port number of the request.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The request method. Valid values: `http` and `https`.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public PreStopHttpGet build() {
                return new PreStopHttpGet(this);
            } 

        } 

    }
    public static class PreStopTcpSocket extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("port")
        private String port;

        private PreStopTcpSocket(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStopTcpSocket create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private String port; 

            /**
             * The URL of the request.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port number of the request.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public PreStopTcpSocket build() {
                return new PreStopTcpSocket(this);
            } 

        } 

    }
    public static class PreStop extends TeaModel {
        @NameInMap("exec")
        private PreStopExec exec;

        @NameInMap("httpGet")
        private PreStopHttpGet httpGet;

        @NameInMap("tcpSocket")
        private PreStopTcpSocket tcpSocket;

        private PreStop(Builder builder) {
            this.exec = builder.exec;
            this.httpGet = builder.httpGet;
            this.tcpSocket = builder.tcpSocket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStop create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public PreStopExec getExec() {
            return this.exec;
        }

        /**
         * @return httpGet
         */
        public PreStopHttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return tcpSocket
         */
        public PreStopTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public static final class Builder {
            private PreStopExec exec; 
            private PreStopHttpGet httpGet; 
            private PreStopTcpSocket tcpSocket; 

            /**
             * The pre-close script.
             */
            public Builder exec(PreStopExec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * The HTTP GET request that is sent before the instance stops.
             */
            public Builder httpGet(PreStopHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * The TCP socket request that is sent.
             */
            public Builder tcpSocket(PreStopTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            public PreStop build() {
                return new PreStop(this);
            } 

        } 

    }
    public static class Lifecycle extends TeaModel {
        @NameInMap("postStart")
        private PostStart postStart;

        @NameInMap("preStop")
        private PreStop preStop;

        private Lifecycle(Builder builder) {
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lifecycle create() {
            return builder().build();
        }

        /**
         * @return postStart
         */
        public PostStart getPostStart() {
            return this.postStart;
        }

        /**
         * @return preStop
         */
        public PreStop getPreStop() {
            return this.preStop;
        }

        public static final class Builder {
            private PostStart postStart; 
            private PreStop preStop; 

            /**
             * The post-start parameters.
             */
            public Builder postStart(PostStart postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * The pre-close parameters.
             */
            public Builder preStop(PreStop preStop) {
                this.preStop = preStop;
                return this;
            }

            public Lifecycle build() {
                return new Lifecycle(this);
            } 

        } 

    }
    public static class MultiBuffer extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("PollDelay")
        private String pollDelay;

        private MultiBuffer(Builder builder) {
            this.enabled = builder.enabled;
            this.pollDelay = builder.pollDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiBuffer create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return pollDelay
         */
        public String getPollDelay() {
            return this.pollDelay;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String pollDelay; 

            /**
             * Indicates whether MulitiBuffer-based TLS acceleration is enabled. Valid values:
             * <p>
             * 
             * *   `true`: MulitiBuffer-based TLS acceleration is enabled.
             * *   `false`: MulitiBuffer-based TLS acceleration is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The pull-request latency.
             */
            public Builder pollDelay(String pollDelay) {
                this.pollDelay = pollDelay;
                return this;
            }

            public MultiBuffer build() {
                return new MultiBuffer(this);
            } 

        } 

    }
    public static class NFDConfiguration extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("NFDLabelPruned")
        private Boolean NFDLabelPruned;

        private NFDConfiguration(Builder builder) {
            this.enabled = builder.enabled;
            this.NFDLabelPruned = builder.NFDLabelPruned;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NFDConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return NFDLabelPruned
         */
        public Boolean getNFDLabelPruned() {
            return this.NFDLabelPruned;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean NFDLabelPruned; 

            /**
             * Indicates whether NFD is enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Indicates whether feature labels on nodes are cleared when NFD is disabled.
             */
            public Builder NFDLabelPruned(Boolean NFDLabelPruned) {
                this.NFDLabelPruned = NFDLabelPruned;
                return this;
            }

            public NFDConfiguration build() {
                return new NFDConfiguration(this);
            } 

        } 

    }
    public static class OPAScopeInjection extends TeaModel {
        @NameInMap("OPAScopeInjected")
        private Boolean OPAScopeInjected;

        private OPAScopeInjection(Builder builder) {
            this.OPAScopeInjected = builder.OPAScopeInjected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OPAScopeInjection create() {
            return builder().build();
        }

        /**
         * @return OPAScopeInjected
         */
        public Boolean getOPAScopeInjected() {
            return this.OPAScopeInjected;
        }

        public static final class Builder {
            private Boolean OPAScopeInjected; 

            /**
             * Indicates whether the feature of controlling the OPA injection scope is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The feature is enabled.
             * *   `false`: The feature is disabled.
             */
            public Builder OPAScopeInjected(Boolean OPAScopeInjected) {
                this.OPAScopeInjected = OPAScopeInjected;
                return this;
            }

            public OPAScopeInjection build() {
                return new OPAScopeInjection(this);
            } 

        } 

    }
    public static class SidecarProxyInitResourceLimit extends TeaModel {
        @NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @NameInMap("ResourceMemoryLimit")
        private String resourceMemoryLimit;

        private SidecarProxyInitResourceLimit(Builder builder) {
            this.resourceCPULimit = builder.resourceCPULimit;
            this.resourceMemoryLimit = builder.resourceMemoryLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyInitResourceLimit create() {
            return builder().build();
        }

        /**
         * @return resourceCPULimit
         */
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        /**
         * @return resourceMemoryLimit
         */
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

        public static final class Builder {
            private String resourceCPULimit; 
            private String resourceMemoryLimit; 

            /**
             * The maximum number of CPU cores that are available to the istio-init container.
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * The maximum size of the memory that is available to the istio-init container.
             */
            public Builder resourceMemoryLimit(String resourceMemoryLimit) {
                this.resourceMemoryLimit = resourceMemoryLimit;
                return this;
            }

            public SidecarProxyInitResourceLimit build() {
                return new SidecarProxyInitResourceLimit(this);
            } 

        } 

    }
    public static class SidecarProxyInitResourceRequest extends TeaModel {
        @NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @NameInMap("ResourceMemoryRequest")
        private String resourceMemoryRequest;

        private SidecarProxyInitResourceRequest(Builder builder) {
            this.resourceCPURequest = builder.resourceCPURequest;
            this.resourceMemoryRequest = builder.resourceMemoryRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyInitResourceRequest create() {
            return builder().build();
        }

        /**
         * @return resourceCPURequest
         */
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        /**
         * @return resourceMemoryRequest
         */
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

        public static final class Builder {
            private String resourceCPURequest; 
            private String resourceMemoryRequest; 

            /**
             * The number of CPU cores that are requested by the istio-init container.
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * The size of the memory that is requested by the istio-init container.
             */
            public Builder resourceMemoryRequest(String resourceMemoryRequest) {
                this.resourceMemoryRequest = resourceMemoryRequest;
                return this;
            }

            public SidecarProxyInitResourceRequest build() {
                return new SidecarProxyInitResourceRequest(this);
            } 

        } 

    }
    public static class ExtraConfiguration extends TeaModel {
        @NameInMap("AccessLogExtraConf")
        private AccessLogExtraConf accessLogExtraConf;

        @NameInMap("AdaptiveXdsConfiguration")
        private AdaptiveXdsConfiguration adaptiveXdsConfiguration;

        @NameInMap("AutoDiagnosis")
        private AutoDiagnosis autoDiagnosis;

        @NameInMap("CRAggregationConfiguration")
        private CRAggregationConfiguration CRAggregationConfiguration;

        @NameInMap("CRAggregationEnabled")
        private Boolean CRAggregationEnabled;

        @NameInMap("DiscoverySelectors")
        private java.util.List < java.util.Map<String, ?>> discoverySelectors;

        @NameInMap("IstioCRHistory")
        private IstioCRHistory istioCRHistory;

        @NameInMap("Lifecycle")
        private Lifecycle lifecycle;

        @NameInMap("MultiBuffer")
        private MultiBuffer multiBuffer;

        @NameInMap("NFDConfiguration")
        private NFDConfiguration NFDConfiguration;

        @NameInMap("OPAScopeInjection")
        private OPAScopeInjection OPAScopeInjection;

        @NameInMap("SidecarProxyInitResourceLimit")
        private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @NameInMap("SidecarProxyInitResourceRequest")
        private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @NameInMap("TerminationDrainDuration")
        private String terminationDrainDuration;

        private ExtraConfiguration(Builder builder) {
            this.accessLogExtraConf = builder.accessLogExtraConf;
            this.adaptiveXdsConfiguration = builder.adaptiveXdsConfiguration;
            this.autoDiagnosis = builder.autoDiagnosis;
            this.CRAggregationConfiguration = builder.CRAggregationConfiguration;
            this.CRAggregationEnabled = builder.CRAggregationEnabled;
            this.discoverySelectors = builder.discoverySelectors;
            this.istioCRHistory = builder.istioCRHistory;
            this.lifecycle = builder.lifecycle;
            this.multiBuffer = builder.multiBuffer;
            this.NFDConfiguration = builder.NFDConfiguration;
            this.OPAScopeInjection = builder.OPAScopeInjection;
            this.sidecarProxyInitResourceLimit = builder.sidecarProxyInitResourceLimit;
            this.sidecarProxyInitResourceRequest = builder.sidecarProxyInitResourceRequest;
            this.terminationDrainDuration = builder.terminationDrainDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraConfiguration create() {
            return builder().build();
        }

        /**
         * @return accessLogExtraConf
         */
        public AccessLogExtraConf getAccessLogExtraConf() {
            return this.accessLogExtraConf;
        }

        /**
         * @return adaptiveXdsConfiguration
         */
        public AdaptiveXdsConfiguration getAdaptiveXdsConfiguration() {
            return this.adaptiveXdsConfiguration;
        }

        /**
         * @return autoDiagnosis
         */
        public AutoDiagnosis getAutoDiagnosis() {
            return this.autoDiagnosis;
        }

        /**
         * @return CRAggregationConfiguration
         */
        public CRAggregationConfiguration getCRAggregationConfiguration() {
            return this.CRAggregationConfiguration;
        }

        /**
         * @return CRAggregationEnabled
         */
        public Boolean getCRAggregationEnabled() {
            return this.CRAggregationEnabled;
        }

        /**
         * @return discoverySelectors
         */
        public java.util.List < java.util.Map<String, ?>> getDiscoverySelectors() {
            return this.discoverySelectors;
        }

        /**
         * @return istioCRHistory
         */
        public IstioCRHistory getIstioCRHistory() {
            return this.istioCRHistory;
        }

        /**
         * @return lifecycle
         */
        public Lifecycle getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return multiBuffer
         */
        public MultiBuffer getMultiBuffer() {
            return this.multiBuffer;
        }

        /**
         * @return NFDConfiguration
         */
        public NFDConfiguration getNFDConfiguration() {
            return this.NFDConfiguration;
        }

        /**
         * @return OPAScopeInjection
         */
        public OPAScopeInjection getOPAScopeInjection() {
            return this.OPAScopeInjection;
        }

        /**
         * @return sidecarProxyInitResourceLimit
         */
        public SidecarProxyInitResourceLimit getSidecarProxyInitResourceLimit() {
            return this.sidecarProxyInitResourceLimit;
        }

        /**
         * @return sidecarProxyInitResourceRequest
         */
        public SidecarProxyInitResourceRequest getSidecarProxyInitResourceRequest() {
            return this.sidecarProxyInitResourceRequest;
        }

        /**
         * @return terminationDrainDuration
         */
        public String getTerminationDrainDuration() {
            return this.terminationDrainDuration;
        }

        public static final class Builder {
            private AccessLogExtraConf accessLogExtraConf; 
            private AdaptiveXdsConfiguration adaptiveXdsConfiguration; 
            private AutoDiagnosis autoDiagnosis; 
            private CRAggregationConfiguration CRAggregationConfiguration; 
            private Boolean CRAggregationEnabled; 
            private java.util.List < java.util.Map<String, ?>> discoverySelectors; 
            private IstioCRHistory istioCRHistory; 
            private Lifecycle lifecycle; 
            private MultiBuffer multiBuffer; 
            private NFDConfiguration NFDConfiguration; 
            private OPAScopeInjection OPAScopeInjection; 
            private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit; 
            private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest; 
            private String terminationDrainDuration; 

            /**
             * The configurations of additional features for access log collection
             */
            public Builder accessLogExtraConf(AccessLogExtraConf accessLogExtraConf) {
                this.accessLogExtraConf = accessLogExtraConf;
                return this;
            }

            /**
             * The configurations of adaptive xDS optimization.
             */
            public Builder adaptiveXdsConfiguration(AdaptiveXdsConfiguration adaptiveXdsConfiguration) {
                this.adaptiveXdsConfiguration = adaptiveXdsConfiguration;
                return this;
            }

            /**
             * The configurations of automatic diagnosis for the ASM instance.
             */
            public Builder autoDiagnosis(AutoDiagnosis autoDiagnosis) {
                this.autoDiagnosis = autoDiagnosis;
                return this;
            }

            /**
             * Access to Istio resources by using the Kubernetes API on the data plane.
             */
            public Builder CRAggregationConfiguration(CRAggregationConfiguration CRAggregationConfiguration) {
                this.CRAggregationConfiguration = CRAggregationConfiguration;
                return this;
            }

            /**
             * Indicates whether the Kubernetes API of clusters on the data plane can be used to access Istio resources. Valid values:
             * <p>
             * 
             * *   `true`: The Kubernetes API of clusters on the data plane can be used to access Istio resources.
             * *   `false`: The Kubernetes API of clusters on the data plane cannot be used to access Istio resources.
             */
            public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
                this.CRAggregationEnabled = CRAggregationEnabled;
                return this;
            }

            /**
             * The label selectors used to specify namespaces on the data plane. The control plane discovers and process only application services in the specified namespaces.
             */
            public Builder discoverySelectors(java.util.List < java.util.Map<String, ?>> discoverySelectors) {
                this.discoverySelectors = discoverySelectors;
                return this;
            }

            /**
             * The configurations of the rollback feature for Istio resources.
             */
            public Builder istioCRHistory(IstioCRHistory istioCRHistory) {
                this.istioCRHistory = istioCRHistory;
                return this;
            }

            /**
             * The lifecycle of Istio Proxy.
             */
            public Builder lifecycle(Lifecycle lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * The information about Transport Layer Security (TLS) acceleration based on MulitiBuffer.
             */
            public Builder multiBuffer(MultiBuffer multiBuffer) {
                this.multiBuffer = multiBuffer;
                return this;
            }

            /**
             * The configurations of Node Feature Discovery (NFD).
             */
            public Builder NFDConfiguration(NFDConfiguration NFDConfiguration) {
                this.NFDConfiguration = NFDConfiguration;
                return this;
            }

            /**
             * The configurations of the feature of controlling the OPA injection scope.
             */
            public Builder OPAScopeInjection(OPAScopeInjection OPAScopeInjection) {
                this.OPAScopeInjection = OPAScopeInjection;
                return this;
            }

            /**
             * The resource limits on the istio-init container.
             */
            public Builder sidecarProxyInitResourceLimit(SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
                this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
                return this;
            }

            /**
             * The resources that are requested by the istio-init container.
             */
            public Builder sidecarProxyInitResourceRequest(SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
                this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
                return this;
            }

            /**
             * The maximum period of time that Istio Proxy waits for a request to end.
             */
            public Builder terminationDrainDuration(String terminationDrainDuration) {
                this.terminationDrainDuration = terminationDrainDuration;
                return this;
            }

            public ExtraConfiguration build() {
                return new ExtraConfiguration(this);
            } 

        } 

    }
    public static class K8sNewAPIsSupport extends TeaModel {
        @NameInMap("GatewayAPIEnabled")
        private Boolean gatewayAPIEnabled;

        private K8sNewAPIsSupport(Builder builder) {
            this.gatewayAPIEnabled = builder.gatewayAPIEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sNewAPIsSupport create() {
            return builder().build();
        }

        /**
         * @return gatewayAPIEnabled
         */
        public Boolean getGatewayAPIEnabled() {
            return this.gatewayAPIEnabled;
        }

        public static final class Builder {
            private Boolean gatewayAPIEnabled; 

            /**
             * Indicates whether Gateway API is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Gateway API is enabled.
             * *   `false`: Gateway API is disabled.
             */
            public Builder gatewayAPIEnabled(Boolean gatewayAPIEnabled) {
                this.gatewayAPIEnabled = gatewayAPIEnabled;
                return this;
            }

            public K8sNewAPIsSupport build() {
                return new K8sNewAPIsSupport(this);
            } 

        } 

    }
    public static class Kiali extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Url")
        private String url;

        private Kiali(Builder builder) {
            this.enabled = builder.enabled;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Kiali create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String url; 

            /**
             * Indicates whether mesh topology is enabled. Mesh topology can be enabled only when Prometheus monitoring is enabled. If Prometheus monitoring is disabled, you must set this parameter to `false`. Valid values:
             * <p>
             * 
             * *   `true`: Mesh topology is enabled.
             * *   `false`: Mesh topology is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The endpoint of the mesh topology service.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Kiali build() {
                return new Kiali(this);
            } 

        } 

    }
    public static class LocalityLB extends TeaModel {
        @NameInMap("Distribute")
        private java.util.Map < String, ? > distribute;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Failover")
        private java.util.Map < String, ? > failover;

        private LocalityLB(Builder builder) {
            this.distribute = builder.distribute;
            this.enabled = builder.enabled;
            this.failover = builder.failover;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalityLB create() {
            return builder().build();
        }

        /**
         * @return distribute
         */
        public java.util.Map < String, ? > getDistribute() {
            return this.distribute;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return failover
         */
        public java.util.Map < String, ? > getFailover() {
            return this.failover;
        }

        public static final class Builder {
            private java.util.Map < String, ? > distribute; 
            private Boolean enabled; 
            private java.util.Map < String, ? > failover; 

            /**
             * The configurations of cross-region traffic distribution.
             * <p>
             * 
             * >  Only one of `Failover` and Distribute parameters can be set. If you set the `Distribute` parameter, you cannot set the Failover parameter.
             */
            public Builder distribute(java.util.Map < String, ? > distribute) {
                this.distribute = distribute;
                return this;
            }

            /**
             * Indicates whether cross-region load balancing is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Cross-region load balancing is enabled.
             * *   `false`: Cross-region load balancing is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The configurations of cross-region failover.
             * <p>
             * 
             * >  Only one of Failover and `Distribute` parameters can be set. If you set the `Failover` parameter, you cannot set the `Distribute` parameter.
             */
            public Builder failover(java.util.Map < String, ? > failover) {
                this.failover = failover;
                return this;
            }

            public LocalityLB build() {
                return new LocalityLB(this);
            } 

        } 

    }
    public static class MSE extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        private MSE(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MSE create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Indicates whether MSE is enabled. Valid values:
             * <p>
             * 
             * - `true`: MSE is enabled.
             * - `false`: MSE is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public MSE build() {
                return new MSE(this);
            } 

        } 

    }
    public static class OPA extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("LimitCPU")
        private String limitCPU;

        @NameInMap("LimitMemory")
        private String limitMemory;

        @NameInMap("LogLevel")
        private String logLevel;

        @NameInMap("RequestCPU")
        private String requestCPU;

        @NameInMap("RequestMemory")
        private String requestMemory;

        private OPA(Builder builder) {
            this.enabled = builder.enabled;
            this.limitCPU = builder.limitCPU;
            this.limitMemory = builder.limitMemory;
            this.logLevel = builder.logLevel;
            this.requestCPU = builder.requestCPU;
            this.requestMemory = builder.requestMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OPA create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return limitCPU
         */
        public String getLimitCPU() {
            return this.limitCPU;
        }

        /**
         * @return limitMemory
         */
        public String getLimitMemory() {
            return this.limitMemory;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return requestCPU
         */
        public String getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestMemory
         */
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String limitCPU; 
            private String limitMemory; 
            private String logLevel; 
            private String requestCPU; 
            private String requestMemory; 

            /**
             * Indicates whether the OPA plug-in is installed. Valid values:
             * <p>
             * 
             * *   `true`: The OPA plug-in is installed.
             * *   `false`: The OPA plug-in is not installed.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The maximum number of CPU cores that are available to the OPA proxy container.
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * The maximum size of the memory that is available to the OPA proxy container.
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * The level of the logs to be generated for OPA.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * The number of CPU cores that are requested by the OPA proxy container.
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * The size of the memory that is requested by the OPA proxy container.
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            public OPA build() {
                return new OPA(this);
            } 

        } 

    }
    public static class ConfigSource extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("NacosID")
        private String nacosID;

        private ConfigSource(Builder builder) {
            this.enabled = builder.enabled;
            this.nacosID = builder.nacosID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSource create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return nacosID
         */
        public String getNacosID() {
            return this.nacosID;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String nacosID; 

            /**
             * Indicates whether communication is allowed between external services and services in the mesh. Valid values:
             * <p>
             * 
             * *   `true`: The communication is allowed.
             * *   `false`: The communication is not allowed.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The ID of the Nacos instance that provides external service information.
             */
            public Builder nacosID(String nacosID) {
                this.nacosID = nacosID;
                return this;
            }

            public ConfigSource build() {
                return new ConfigSource(this);
            } 

        } 

    }
    public static class Feature extends TeaModel {
        @NameInMap("EnableSDSServer")
        private Boolean enableSDSServer;

        @NameInMap("FilterGatewayClusterConfig")
        private Boolean filterGatewayClusterConfig;

        private Feature(Builder builder) {
            this.enableSDSServer = builder.enableSDSServer;
            this.filterGatewayClusterConfig = builder.filterGatewayClusterConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feature create() {
            return builder().build();
        }

        /**
         * @return enableSDSServer
         */
        public Boolean getEnableSDSServer() {
            return this.enableSDSServer;
        }

        /**
         * @return filterGatewayClusterConfig
         */
        public Boolean getFilterGatewayClusterConfig() {
            return this.filterGatewayClusterConfig;
        }

        public static final class Builder {
            private Boolean enableSDSServer; 
            private Boolean filterGatewayClusterConfig; 

            /**
             * Indicates whether Secret Discovery Service (SDS) is enabled. Valid values:
             * <p>
             * 
             * *   `true`: SDS is enabled.
             * *   `false`: SDS is disabled.
             */
            public Builder enableSDSServer(Boolean enableSDSServer) {
                this.enableSDSServer = enableSDSServer;
                return this;
            }

            /**
             * Indicates whether gateway configuration filtering is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Gateway configuration filtering is enabled.
             * *   `false`: Gateway configuration filtering is disabled.
             */
            public Builder filterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
                this.filterGatewayClusterConfig = filterGatewayClusterConfig;
                return this;
            }

            public Feature build() {
                return new Feature(this);
            } 

        } 

    }
    public static class Pilot extends TeaModel {
        @NameInMap("ConfigSource")
        private ConfigSource configSource;

        @NameInMap("Feature")
        private Feature feature;

        @NameInMap("Http10Enabled")
        private Boolean http10Enabled;

        @NameInMap("TraceSampling")
        private Float traceSampling;

        private Pilot(Builder builder) {
            this.configSource = builder.configSource;
            this.feature = builder.feature;
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
         * @return configSource
         */
        public ConfigSource getConfigSource() {
            return this.configSource;
        }

        /**
         * @return feature
         */
        public Feature getFeature() {
            return this.feature;
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
            private ConfigSource configSource; 
            private Feature feature; 
            private Boolean http10Enabled; 
            private Float traceSampling; 

            /**
             * The configurations of communication between external services and services in the mesh.
             */
            public Builder configSource(ConfigSource configSource) {
                this.configSource = configSource;
                return this;
            }

            /**
             * The configurations of Pilot features.
             */
            public Builder feature(Feature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * Indicates whether HTTP/1.0 is supported. Valid values:
             * <p>
             * 
             * *   `true`: HTTP/1.0 is supported.
             * *   `false`: HTTP/1.0 is not supported.
             */
            public Builder http10Enabled(Boolean http10Enabled) {
                this.http10Enabled = http10Enabled;
                return this;
            }

            /**
             * The sampling percentage of tracing analysis.
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
    public static class Prometheus extends TeaModel {
        @NameInMap("ExternalUrl")
        private String externalUrl;

        @NameInMap("UseExternal")
        private Boolean useExternal;

        private Prometheus(Builder builder) {
            this.externalUrl = builder.externalUrl;
            this.useExternal = builder.useExternal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prometheus create() {
            return builder().build();
        }

        /**
         * @return externalUrl
         */
        public String getExternalUrl() {
            return this.externalUrl;
        }

        /**
         * @return useExternal
         */
        public Boolean getUseExternal() {
            return this.useExternal;
        }

        public static final class Builder {
            private String externalUrl; 
            private Boolean useExternal; 

            /**
             * The endpoint of Prometheus monitoring. If you use a custom Prometheus instance, this parameter is populated by the system.
             */
            public Builder externalUrl(String externalUrl) {
                this.externalUrl = externalUrl;
                return this;
            }

            /**
             * Indicates whether a custom Prometheus instance is used. Valid values:
             * <p>
             * 
             * *   `true`: A custom Prometheus instance is used.
             * *   `false`: No custom Prometheus instance is used.
             */
            public Builder useExternal(Boolean useExternal) {
                this.useExternal = useExternal;
                return this;
            }

            public Prometheus build() {
                return new Prometheus(this);
            } 

        } 

    }
    public static class ProtocolSupport extends TeaModel {
        @NameInMap("DubboFilterEnabled")
        private Boolean dubboFilterEnabled;

        @NameInMap("MysqlFilterEnabled")
        private Boolean mysqlFilterEnabled;

        @NameInMap("RedisFilterEnabled")
        private Boolean redisFilterEnabled;

        @NameInMap("ThriftFilterEnabled")
        private Boolean thriftFilterEnabled;

        private ProtocolSupport(Builder builder) {
            this.dubboFilterEnabled = builder.dubboFilterEnabled;
            this.mysqlFilterEnabled = builder.mysqlFilterEnabled;
            this.redisFilterEnabled = builder.redisFilterEnabled;
            this.thriftFilterEnabled = builder.thriftFilterEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolSupport create() {
            return builder().build();
        }

        /**
         * @return dubboFilterEnabled
         */
        public Boolean getDubboFilterEnabled() {
            return this.dubboFilterEnabled;
        }

        /**
         * @return mysqlFilterEnabled
         */
        public Boolean getMysqlFilterEnabled() {
            return this.mysqlFilterEnabled;
        }

        /**
         * @return redisFilterEnabled
         */
        public Boolean getRedisFilterEnabled() {
            return this.redisFilterEnabled;
        }

        /**
         * @return thriftFilterEnabled
         */
        public Boolean getThriftFilterEnabled() {
            return this.thriftFilterEnabled;
        }

        public static final class Builder {
            private Boolean dubboFilterEnabled; 
            private Boolean mysqlFilterEnabled; 
            private Boolean redisFilterEnabled; 
            private Boolean thriftFilterEnabled; 

            /**
             * Indicates whether Dubbo Filter is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Dubbo Filter is enabled.
             * *   `false`: Dubbo Filter is disabled.
             */
            public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
                this.dubboFilterEnabled = dubboFilterEnabled;
                return this;
            }

            /**
             * Indicates whether MySQL Filter is enabled. Valid values:
             * <p>
             * 
             * *   `true`: MySQL Filter is enabled.
             * *   `false`: MySQL Filter is disabled.
             */
            public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
                this.mysqlFilterEnabled = mysqlFilterEnabled;
                return this;
            }

            /**
             * Indicates whether Redis Filter is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Redis Filter is enabled.
             * *   `false`: Redis Filter is disabled.
             */
            public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
                this.redisFilterEnabled = redisFilterEnabled;
                return this;
            }

            /**
             * Indicates whether Thrift Filter is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Thrift Filter is enabled.
             * *   `false`: Thrift Filter is disabled.
             */
            public Builder thriftFilterEnabled(Boolean thriftFilterEnabled) {
                this.thriftFilterEnabled = thriftFilterEnabled;
                return this;
            }

            public ProtocolSupport build() {
                return new ProtocolSupport(this);
            } 

        } 

    }
    public static class Proxy extends TeaModel {
        @NameInMap("AccessLogFile")
        private String accessLogFile;

        @NameInMap("AccessLogFormat")
        private String accessLogFormat;

        @NameInMap("AccessLogServiceEnabled")
        private Boolean accessLogServiceEnabled;

        @NameInMap("AccessLogServiceHost")
        private String accessLogServiceHost;

        @NameInMap("AccessLogServicePort")
        private Integer accessLogServicePort;

        @NameInMap("ClusterDomain")
        private String clusterDomain;

        @NameInMap("EnableDNSProxying")
        private Boolean enableDNSProxying;

        @NameInMap("LimitCPU")
        private String limitCPU;

        @NameInMap("LimitMemory")
        private String limitMemory;

        @NameInMap("RequestCPU")
        private String requestCPU;

        @NameInMap("RequestMemory")
        private String requestMemory;

        private Proxy(Builder builder) {
            this.accessLogFile = builder.accessLogFile;
            this.accessLogFormat = builder.accessLogFormat;
            this.accessLogServiceEnabled = builder.accessLogServiceEnabled;
            this.accessLogServiceHost = builder.accessLogServiceHost;
            this.accessLogServicePort = builder.accessLogServicePort;
            this.clusterDomain = builder.clusterDomain;
            this.enableDNSProxying = builder.enableDNSProxying;
            this.limitCPU = builder.limitCPU;
            this.limitMemory = builder.limitMemory;
            this.requestCPU = builder.requestCPU;
            this.requestMemory = builder.requestMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Proxy create() {
            return builder().build();
        }

        /**
         * @return accessLogFile
         */
        public String getAccessLogFile() {
            return this.accessLogFile;
        }

        /**
         * @return accessLogFormat
         */
        public String getAccessLogFormat() {
            return this.accessLogFormat;
        }

        /**
         * @return accessLogServiceEnabled
         */
        public Boolean getAccessLogServiceEnabled() {
            return this.accessLogServiceEnabled;
        }

        /**
         * @return accessLogServiceHost
         */
        public String getAccessLogServiceHost() {
            return this.accessLogServiceHost;
        }

        /**
         * @return accessLogServicePort
         */
        public Integer getAccessLogServicePort() {
            return this.accessLogServicePort;
        }

        /**
         * @return clusterDomain
         */
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        /**
         * @return enableDNSProxying
         */
        public Boolean getEnableDNSProxying() {
            return this.enableDNSProxying;
        }

        /**
         * @return limitCPU
         */
        public String getLimitCPU() {
            return this.limitCPU;
        }

        /**
         * @return limitMemory
         */
        public String getLimitMemory() {
            return this.limitMemory;
        }

        /**
         * @return requestCPU
         */
        public String getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestMemory
         */
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public static final class Builder {
            private String accessLogFile; 
            private String accessLogFormat; 
            private Boolean accessLogServiceEnabled; 
            private String accessLogServiceHost; 
            private Integer accessLogServicePort; 
            private String clusterDomain; 
            private Boolean enableDNSProxying; 
            private String limitCPU; 
            private String limitMemory; 
            private String requestCPU; 
            private String requestMemory; 

            /**
             * The path to the file that stores the access logs of sidecar proxies.
             */
            public Builder accessLogFile(String accessLogFile) {
                this.accessLogFile = accessLogFile;
                return this;
            }

            /**
             * The format of the access logs of sidecar proxies.
             */
            public Builder accessLogFormat(String accessLogFormat) {
                this.accessLogFormat = accessLogFormat;
                return this;
            }

            /**
             * Indicates whether gRPC Access Log Service (ALS) for Envoy is enabled. Valid values:
             * <p>
             * 
             * *   `true`: gRPC ALS for Envoy is enabled.
             * *   `false`: gRPC ALS for Envoy is disabled.
             */
            public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
                this.accessLogServiceEnabled = accessLogServiceEnabled;
                return this;
            }

            /**
             * The endpoint of gRPC ALS for Envoy.
             */
            public Builder accessLogServiceHost(String accessLogServiceHost) {
                this.accessLogServiceHost = accessLogServiceHost;
                return this;
            }

            /**
             * The port of gRPC ALS for Envoy.
             */
            public Builder accessLogServicePort(Integer accessLogServicePort) {
                this.accessLogServicePort = accessLogServicePort;
                return this;
            }

            /**
             * The trusted domain.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values: Valid values:
             * <p>
             * 
             * *   `true`: The DNS proxy feature is enabled.
             * *   `false`: The DNS proxy feature is disabled.
             */
            public Builder enableDNSProxying(Boolean enableDNSProxying) {
                this.enableDNSProxying = enableDNSProxying;
                return this;
            }

            /**
             * The maximum number of CPU cores.
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * The maximum size of the memory.
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * The number of CPU cores that are requested.
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * The size of the memory that is requested.
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            public Proxy build() {
                return new Proxy(this);
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
             * Indicates whether the CNI plug-in is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The CNI plug-in is enabled.
             * *   `false`: The CNI plug-in is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The namespaces to exclude. The CNI plug-in ignores pods in the excluded namespaces.
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

        @NameInMap("LimitCPU")
        private String limitCPU;

        @NameInMap("LimitMemory")
        private String limitMemory;

        @NameInMap("RequestCPU")
        private String requestCPU;

        @NameInMap("RequestMemory")
        private String requestMemory;

        @NameInMap("SidecarInjectorNum")
        private Integer sidecarInjectorNum;

        @NameInMap("SidecarInjectorWebhookAsYaml")
        private String sidecarInjectorWebhookAsYaml;

        private SidecarInjector(Builder builder) {
            this.autoInjectionPolicyEnabled = builder.autoInjectionPolicyEnabled;
            this.enableNamespacesByDefault = builder.enableNamespacesByDefault;
            this.initCNIConfiguration = builder.initCNIConfiguration;
            this.limitCPU = builder.limitCPU;
            this.limitMemory = builder.limitMemory;
            this.requestCPU = builder.requestCPU;
            this.requestMemory = builder.requestMemory;
            this.sidecarInjectorNum = builder.sidecarInjectorNum;
            this.sidecarInjectorWebhookAsYaml = builder.sidecarInjectorWebhookAsYaml;
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

        /**
         * @return limitCPU
         */
        public String getLimitCPU() {
            return this.limitCPU;
        }

        /**
         * @return limitMemory
         */
        public String getLimitMemory() {
            return this.limitMemory;
        }

        /**
         * @return requestCPU
         */
        public String getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestMemory
         */
        public String getRequestMemory() {
            return this.requestMemory;
        }

        /**
         * @return sidecarInjectorNum
         */
        public Integer getSidecarInjectorNum() {
            return this.sidecarInjectorNum;
        }

        /**
         * @return sidecarInjectorWebhookAsYaml
         */
        public String getSidecarInjectorWebhookAsYaml() {
            return this.sidecarInjectorWebhookAsYaml;
        }

        public static final class Builder {
            private Boolean autoInjectionPolicyEnabled; 
            private Boolean enableNamespacesByDefault; 
            private InitCNIConfiguration initCNIConfiguration; 
            private String limitCPU; 
            private String limitMemory; 
            private String requestCPU; 
            private String requestMemory; 
            private Integer sidecarInjectorNum; 
            private String sidecarInjectorWebhookAsYaml; 

            /**
             * Indicates whether automatic sidecar injection can be enabled by using pod annotations. Valid values:
             * <p>
             * 
             * *   `true`: Automatic sidecar injection can be enabled by using pod annotations.
             * *   `false`: Automatic sidecar injection cannot be enabled by using pod annotations.
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
             * *   `false`: Automatic sidecar injection is not enabled for all namespaces.
             */
            public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
                this.enableNamespacesByDefault = enableNamespacesByDefault;
                return this;
            }

            /**
             * The configurations of Container Network Interface (CNI).
             */
            public Builder initCNIConfiguration(InitCNIConfiguration initCNIConfiguration) {
                this.initCNIConfiguration = initCNIConfiguration;
                return this;
            }

            /**
             * The maximum number of CPU cores that are available to the sidecar injector pod.
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * The maximum size of the memory that is available to the sidecar injector pod.
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * The number of CPU cores that are requested by the sidecar injector pod.
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * The size of the memory that is requested by the sidecar injector pod.
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * The number of component replicas that are used for sidecar injection. Default value: `1`.
             */
            public Builder sidecarInjectorNum(Integer sidecarInjectorNum) {
                this.sidecarInjectorNum = sidecarInjectorNum;
                return this;
            }

            /**
             * Other configurations of automatic sidecar injection, in the YAML format. For more information, see [Enable automatic sidecar injection by using multiple methods](~~186136~~).
             */
            public Builder sidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
                this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
                return this;
            }

            public SidecarInjector build() {
                return new SidecarInjector(this);
            } 

        } 

    }
    public static class WebAssemblyFilterDeployment extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        private WebAssemblyFilterDeployment(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebAssemblyFilterDeployment create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Indicates whether WebAssembly Filter is enabled. Valid values:
             * <p>
             * 
             * *   `true`:WebAssembly Filter is enabled.
             * *   `false`: WebAssembly Filter is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public WebAssemblyFilterDeployment build() {
                return new WebAssemblyFilterDeployment(this);
            } 

        } 

    }
    public static class MeshConfig extends TeaModel {
        @NameInMap("AccessLog")
        private AccessLog accessLog;

        @NameInMap("Audit")
        private Audit audit;

        @NameInMap("ControlPlaneLogInfo")
        private ControlPlaneLogInfo controlPlaneLogInfo;

        @NameInMap("CustomizedZipkin")
        private Boolean customizedZipkin;

        @NameInMap("Edition")
        private Edition edition;

        @NameInMap("EnableLocalityLB")
        private Boolean enableLocalityLB;

        @NameInMap("ExcludeIPRanges")
        private String excludeIPRanges;

        @NameInMap("ExcludeInboundPorts")
        private String excludeInboundPorts;

        @NameInMap("ExcludeOutboundPorts")
        private String excludeOutboundPorts;

        @NameInMap("ExtraConfiguration")
        private ExtraConfiguration extraConfiguration;

        @NameInMap("IncludeIPRanges")
        private String includeIPRanges;

        @NameInMap("K8sNewAPIsSupport")
        private K8sNewAPIsSupport k8sNewAPIsSupport;

        @NameInMap("Kiali")
        private Kiali kiali;

        @NameInMap("LocalityLB")
        private LocalityLB localityLB;

        @NameInMap("MSE")
        private MSE MSE;

        @NameInMap("OPA")
        private OPA OPA;

        @NameInMap("OutboundTrafficPolicy")
        private String outboundTrafficPolicy;

        @NameInMap("Pilot")
        private Pilot pilot;

        @NameInMap("Prometheus")
        private Prometheus prometheus;

        @NameInMap("ProtocolSupport")
        private ProtocolSupport protocolSupport;

        @NameInMap("Proxy")
        private Proxy proxy;

        @NameInMap("SidecarInjector")
        private SidecarInjector sidecarInjector;

        @NameInMap("Telemetry")
        private Boolean telemetry;

        @NameInMap("Tracing")
        private Boolean tracing;

        @NameInMap("WebAssemblyFilterDeployment")
        private WebAssemblyFilterDeployment webAssemblyFilterDeployment;

        private MeshConfig(Builder builder) {
            this.accessLog = builder.accessLog;
            this.audit = builder.audit;
            this.controlPlaneLogInfo = builder.controlPlaneLogInfo;
            this.customizedZipkin = builder.customizedZipkin;
            this.edition = builder.edition;
            this.enableLocalityLB = builder.enableLocalityLB;
            this.excludeIPRanges = builder.excludeIPRanges;
            this.excludeInboundPorts = builder.excludeInboundPorts;
            this.excludeOutboundPorts = builder.excludeOutboundPorts;
            this.extraConfiguration = builder.extraConfiguration;
            this.includeIPRanges = builder.includeIPRanges;
            this.k8sNewAPIsSupport = builder.k8sNewAPIsSupport;
            this.kiali = builder.kiali;
            this.localityLB = builder.localityLB;
            this.MSE = builder.MSE;
            this.OPA = builder.OPA;
            this.outboundTrafficPolicy = builder.outboundTrafficPolicy;
            this.pilot = builder.pilot;
            this.prometheus = builder.prometheus;
            this.protocolSupport = builder.protocolSupport;
            this.proxy = builder.proxy;
            this.sidecarInjector = builder.sidecarInjector;
            this.telemetry = builder.telemetry;
            this.tracing = builder.tracing;
            this.webAssemblyFilterDeployment = builder.webAssemblyFilterDeployment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeshConfig create() {
            return builder().build();
        }

        /**
         * @return accessLog
         */
        public AccessLog getAccessLog() {
            return this.accessLog;
        }

        /**
         * @return audit
         */
        public Audit getAudit() {
            return this.audit;
        }

        /**
         * @return controlPlaneLogInfo
         */
        public ControlPlaneLogInfo getControlPlaneLogInfo() {
            return this.controlPlaneLogInfo;
        }

        /**
         * @return customizedZipkin
         */
        public Boolean getCustomizedZipkin() {
            return this.customizedZipkin;
        }

        /**
         * @return edition
         */
        public Edition getEdition() {
            return this.edition;
        }

        /**
         * @return enableLocalityLB
         */
        public Boolean getEnableLocalityLB() {
            return this.enableLocalityLB;
        }

        /**
         * @return excludeIPRanges
         */
        public String getExcludeIPRanges() {
            return this.excludeIPRanges;
        }

        /**
         * @return excludeInboundPorts
         */
        public String getExcludeInboundPorts() {
            return this.excludeInboundPorts;
        }

        /**
         * @return excludeOutboundPorts
         */
        public String getExcludeOutboundPorts() {
            return this.excludeOutboundPorts;
        }

        /**
         * @return extraConfiguration
         */
        public ExtraConfiguration getExtraConfiguration() {
            return this.extraConfiguration;
        }

        /**
         * @return includeIPRanges
         */
        public String getIncludeIPRanges() {
            return this.includeIPRanges;
        }

        /**
         * @return k8sNewAPIsSupport
         */
        public K8sNewAPIsSupport getK8sNewAPIsSupport() {
            return this.k8sNewAPIsSupport;
        }

        /**
         * @return kiali
         */
        public Kiali getKiali() {
            return this.kiali;
        }

        /**
         * @return localityLB
         */
        public LocalityLB getLocalityLB() {
            return this.localityLB;
        }

        /**
         * @return MSE
         */
        public MSE getMSE() {
            return this.MSE;
        }

        /**
         * @return OPA
         */
        public OPA getOPA() {
            return this.OPA;
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
         * @return prometheus
         */
        public Prometheus getPrometheus() {
            return this.prometheus;
        }

        /**
         * @return protocolSupport
         */
        public ProtocolSupport getProtocolSupport() {
            return this.protocolSupport;
        }

        /**
         * @return proxy
         */
        public Proxy getProxy() {
            return this.proxy;
        }

        /**
         * @return sidecarInjector
         */
        public SidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
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

        /**
         * @return webAssemblyFilterDeployment
         */
        public WebAssemblyFilterDeployment getWebAssemblyFilterDeployment() {
            return this.webAssemblyFilterDeployment;
        }

        public static final class Builder {
            private AccessLog accessLog; 
            private Audit audit; 
            private ControlPlaneLogInfo controlPlaneLogInfo; 
            private Boolean customizedZipkin; 
            private Edition edition; 
            private Boolean enableLocalityLB; 
            private String excludeIPRanges; 
            private String excludeInboundPorts; 
            private String excludeOutboundPorts; 
            private ExtraConfiguration extraConfiguration; 
            private String includeIPRanges; 
            private K8sNewAPIsSupport k8sNewAPIsSupport; 
            private Kiali kiali; 
            private LocalityLB localityLB; 
            private MSE MSE; 
            private OPA OPA; 
            private String outboundTrafficPolicy; 
            private Pilot pilot; 
            private Prometheus prometheus; 
            private ProtocolSupport protocolSupport; 
            private Proxy proxy; 
            private SidecarInjector sidecarInjector; 
            private Boolean telemetry; 
            private Boolean tracing; 
            private WebAssemblyFilterDeployment webAssemblyFilterDeployment; 

            /**
             * The configurations of access log collection.
             */
            public Builder accessLog(AccessLog accessLog) {
                this.accessLog = accessLog;
                return this;
            }

            /**
             * The information about mesh audit.
             */
            public Builder audit(Audit audit) {
                this.audit = audit;
                return this;
            }

            /**
             * The configurations of control-plane log collection.
             */
            public Builder controlPlaneLogInfo(ControlPlaneLogInfo controlPlaneLogInfo) {
                this.controlPlaneLogInfo = controlPlaneLogInfo;
                return this;
            }

            /**
             * Indicates whether a custom Zipkin system is used. Valid values:
             * <p>
             * 
             * *   `true`: A custom Zipkin system is used.
             * *   `false`: No custom Zipkin system is used.
             */
            public Builder customizedZipkin(Boolean customizedZipkin) {
                this.customizedZipkin = customizedZipkin;
                return this;
            }

            /**
             * The information about the edition.
             */
            public Builder edition(Edition edition) {
                this.edition = edition;
                return this;
            }

            /**
             * Indicates whether the feature that routes traffic to the nearest instance is enabled. Valid values:
             * <p>
             * 
             * *   `true`: The feature is enabled.
             * *   `false`: The feature is disabled.
             */
            public Builder enableLocalityLB(Boolean enableLocalityLB) {
                this.enableLocalityLB = enableLocalityLB;
                return this;
            }

            /**
             * The IP ranges in CIDR form to be excluded from redirection to sidecar proxies in the ASM instance.
             */
            public Builder excludeIPRanges(String excludeIPRanges) {
                this.excludeIPRanges = excludeIPRanges;
                return this;
            }

            /**
             * The inbound ports to be excluded from redirection to sidecar proxies in the ASM instance.
             */
            public Builder excludeInboundPorts(String excludeInboundPorts) {
                this.excludeInboundPorts = excludeInboundPorts;
                return this;
            }

            /**
             * The outbound ports to be excluded from redirection to sidecar proxies in the ASM instance.
             */
            public Builder excludeOutboundPorts(String excludeOutboundPorts) {
                this.excludeOutboundPorts = excludeOutboundPorts;
                return this;
            }

            /**
             * The configurations of additional features for the ASM instance.
             */
            public Builder extraConfiguration(ExtraConfiguration extraConfiguration) {
                this.extraConfiguration = extraConfiguration;
                return this;
            }

            /**
             * The IP ranges in CIDR form to redirect to the sidecar proxies in the ASM instance.
             */
            public Builder includeIPRanges(String includeIPRanges) {
                this.includeIPRanges = includeIPRanges;
                return this;
            }

            /**
             * The information about the Kubernetes API.
             */
            public Builder k8sNewAPIsSupport(K8sNewAPIsSupport k8sNewAPIsSupport) {
                this.k8sNewAPIsSupport = k8sNewAPIsSupport;
                return this;
            }

            /**
             * The configurations of mesh topology.
             */
            public Builder kiali(Kiali kiali) {
                this.kiali = kiali;
                return this;
            }

            /**
             * The configurations of cross-region load balancing.
             */
            public Builder localityLB(LocalityLB localityLB) {
                this.localityLB = localityLB;
                return this;
            }

            /**
             * The configurations of Microservices Engine (MSE).
             */
            public Builder MSE(MSE MSE) {
                this.MSE = MSE;
                return this;
            }

            /**
             * The information about the Open Policy Agent (OPA) plug-in.
             */
            public Builder OPA(OPA OPA) {
                this.OPA = OPA;
                return this;
            }

            /**
             * The outbound traffic policy. Valid values:
             * <p>
             * 
             * *   `ALLOW_ANY`: Outbound traffic to all external services is allowed.
             * *   `REGISTRY_ONLY`: Outbound traffic is allowed to only external services that are defined in the service registry of the ASM instance.
             */
            public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
                this.outboundTrafficPolicy = outboundTrafficPolicy;
                return this;
            }

            /**
             * The Pilot configurations.
             */
            public Builder pilot(Pilot pilot) {
                this.pilot = pilot;
                return this;
            }

            /**
             * The configurations of Prometheus monitoring.
             */
            public Builder prometheus(Prometheus prometheus) {
                this.prometheus = prometheus;
                return this;
            }

            /**
             * The configurations of protocol support.
             */
            public Builder protocolSupport(ProtocolSupport protocolSupport) {
                this.protocolSupport = protocolSupport;
                return this;
            }

            /**
             * The proxy configurations.
             */
            public Builder proxy(Proxy proxy) {
                this.proxy = proxy;
                return this;
            }

            /**
             * The configurations of the sidecar injector.
             */
            public Builder sidecarInjector(SidecarInjector sidecarInjector) {
                this.sidecarInjector = sidecarInjector;
                return this;
            }

            /**
             * Indicates whether Prometheus monitoring is enabled. We recommend that you use [Prometheus Service of Application Real-Time Monitoring Service (ARMS)](https://arms.console.aliyun.com/). Valid values:
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
             * Indicates whether tracing analysis is enabled. This feature can be enabled only after [Tracing Analysis](https://tracing-analysis.console.aliyun.com/) is activated. Valid values:
             * <p>
             * 
             * *   `true`: Tracing analysis is enabled.
             * *   `false`: Tracing analysis is disabled.
             */
            public Builder tracing(Boolean tracing) {
                this.tracing = tracing;
                return this;
            }

            /**
             * The configurations of WebAssembly Filter.
             */
            public Builder webAssemblyFilterDeployment(WebAssemblyFilterDeployment webAssemblyFilterDeployment) {
                this.webAssemblyFilterDeployment = webAssemblyFilterDeployment;
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
             * The ID of the vSwitch.
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
    public static class ServiceMesh extends TeaModel {
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

        private ServiceMesh(Builder builder) {
            this.clusterSpec = builder.clusterSpec;
            this.clusters = builder.clusters;
            this.endpoints = builder.endpoints;
            this.ownerId = builder.ownerId;
            this.ownerType = builder.ownerType;
            this.serviceMeshInfo = builder.serviceMeshInfo;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMesh create() {
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

        public static final class Builder {
            private String clusterSpec; 
            private java.util.List < String > clusters; 
            private Endpoints endpoints; 
            private String ownerId; 
            private String ownerType; 
            private ServiceMeshInfo serviceMeshInfo; 
            private Spec spec; 

            /**
             * The specification of the ASM instance. Valid values:
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
             * The list of clusters.
             */
            public Builder clusters(java.util.List < String > clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * The endpoints of the ASM instance.
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

            public ServiceMesh build() {
                return new ServiceMesh(this);
            } 

        } 

    }
}
