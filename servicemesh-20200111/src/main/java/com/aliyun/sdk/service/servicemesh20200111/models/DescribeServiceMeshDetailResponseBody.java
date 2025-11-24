// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshDetailResponseBody</p>
 */
public class DescribeServiceMeshDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceMesh")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeServiceMeshDetailResponseBody model) {
            this.requestId = model.requestId;
            this.serviceMesh = model.serviceMesh;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the ASM instance.</p>
         */
        public Builder serviceMesh(ServiceMesh serviceMesh) {
            this.serviceMesh = serviceMesh;
            return this;
        }

        public DescribeServiceMeshDetailResponseBody build() {
            return new DescribeServiceMeshDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntranetApiServerEndpoint")
        private String intranetApiServerEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetCanaryPilotEndpoint")
        private String intranetCanaryPilotEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetPilotEndpoint")
        private String intranetPilotEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicApiServerEndpoint")
        private String publicApiServerEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicCanaryPilotEndpoint")
        private String publicCanaryPilotEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicPilotEndpoint")
        private String publicPilotEndpoint;

        private Endpoints(Builder builder) {
            this.intranetApiServerEndpoint = builder.intranetApiServerEndpoint;
            this.intranetCanaryPilotEndpoint = builder.intranetCanaryPilotEndpoint;
            this.intranetPilotEndpoint = builder.intranetPilotEndpoint;
            this.publicApiServerEndpoint = builder.publicApiServerEndpoint;
            this.publicCanaryPilotEndpoint = builder.publicCanaryPilotEndpoint;
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
         * @return intranetCanaryPilotEndpoint
         */
        public String getIntranetCanaryPilotEndpoint() {
            return this.intranetCanaryPilotEndpoint;
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
         * @return publicCanaryPilotEndpoint
         */
        public String getPublicCanaryPilotEndpoint() {
            return this.publicCanaryPilotEndpoint;
        }

        /**
         * @return publicPilotEndpoint
         */
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

        public static final class Builder {
            private String intranetApiServerEndpoint; 
            private String intranetCanaryPilotEndpoint; 
            private String intranetPilotEndpoint; 
            private String publicApiServerEndpoint; 
            private String publicCanaryPilotEndpoint; 
            private String publicPilotEndpoint; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.intranetApiServerEndpoint = model.intranetApiServerEndpoint;
                this.intranetCanaryPilotEndpoint = model.intranetCanaryPilotEndpoint;
                this.intranetPilotEndpoint = model.intranetPilotEndpoint;
                this.publicApiServerEndpoint = model.publicApiServerEndpoint;
                this.publicCanaryPilotEndpoint = model.publicCanaryPilotEndpoint;
                this.publicPilotEndpoint = model.publicPilotEndpoint;
            } 

            /**
             * <p>The endpoint that is used to access the API server from the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<code>192.168.**.**</code>:6443</p>
             */
            public Builder intranetApiServerEndpoint(String intranetApiServerEndpoint) {
                this.intranetApiServerEndpoint = intranetApiServerEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to access Istio Pilot from the internal network (Intranet) during canary release.</p>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code>:15011</p>
             */
            public Builder intranetCanaryPilotEndpoint(String intranetCanaryPilotEndpoint) {
                this.intranetCanaryPilotEndpoint = intranetCanaryPilotEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to access Istio Pilot from the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code>:15011</p>
             */
            public Builder intranetPilotEndpoint(String intranetPilotEndpoint) {
                this.intranetPilotEndpoint = intranetPilotEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to access the API server over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<code>123.56.**.**</code>:6443</p>
             */
            public Builder publicApiServerEndpoint(String publicApiServerEndpoint) {
                this.publicApiServerEndpoint = publicApiServerEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to expose Istio Pilot to the public network (Internet) during canary release.</p>
             * 
             * <strong>example:</strong>
             * <p><code>182.92.**.**</code>:15011</p>
             */
            public Builder publicCanaryPilotEndpoint(String publicCanaryPilotEndpoint) {
                this.publicCanaryPilotEndpoint = publicCanaryPilotEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to expose Istio Pilot to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p><code>182.92.**.**</code>:15011</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ServiceMeshInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
        private String serviceMeshId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(ServiceMeshInfo model) {
                this.creationTime = model.creationTime;
                this.errorMessage = model.errorMessage;
                this.name = model.name;
                this.profile = model.profile;
                this.regionId = model.regionId;
                this.serviceMeshId = model.serviceMeshId;
                this.state = model.state;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>The time when the ASM instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-21T09:42:20+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The returned error message.</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mesh1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The edition of the ASM instance. Valid values:</p>
             * <ul>
             * <li><code>Default</code>: Standard Edition</li>
             * <li><code>Pro</code>: Enterprise Edition and Ultimate Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The ID of the region in which the ASM instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ASM instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * <p>The state of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the ASM instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-03T14:48:54+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.7.4.0-gfb34ba99-aliyun</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class LoadBalancer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiServerLoadbalancerId")
        private String apiServerLoadbalancerId;

        @com.aliyun.core.annotation.NameInMap("ApiServerPublicEip")
        private Boolean apiServerPublicEip;

        @com.aliyun.core.annotation.NameInMap("ApiServerPublicEipId")
        private String apiServerPublicEipId;

        @com.aliyun.core.annotation.NameInMap("CanaryPilotLoadBalancerId")
        private String canaryPilotLoadBalancerId;

        @com.aliyun.core.annotation.NameInMap("CanaryPilotPublicEipId")
        private String canaryPilotPublicEipId;

        @com.aliyun.core.annotation.NameInMap("PilotPublicEip")
        private Boolean pilotPublicEip;

        @com.aliyun.core.annotation.NameInMap("PilotPublicEipId")
        private String pilotPublicEipId;

        @com.aliyun.core.annotation.NameInMap("PilotPublicLoadbalancerId")
        private String pilotPublicLoadbalancerId;

        private LoadBalancer(Builder builder) {
            this.apiServerLoadbalancerId = builder.apiServerLoadbalancerId;
            this.apiServerPublicEip = builder.apiServerPublicEip;
            this.apiServerPublicEipId = builder.apiServerPublicEipId;
            this.canaryPilotLoadBalancerId = builder.canaryPilotLoadBalancerId;
            this.canaryPilotPublicEipId = builder.canaryPilotPublicEipId;
            this.pilotPublicEip = builder.pilotPublicEip;
            this.pilotPublicEipId = builder.pilotPublicEipId;
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
         * @return apiServerPublicEipId
         */
        public String getApiServerPublicEipId() {
            return this.apiServerPublicEipId;
        }

        /**
         * @return canaryPilotLoadBalancerId
         */
        public String getCanaryPilotLoadBalancerId() {
            return this.canaryPilotLoadBalancerId;
        }

        /**
         * @return canaryPilotPublicEipId
         */
        public String getCanaryPilotPublicEipId() {
            return this.canaryPilotPublicEipId;
        }

        /**
         * @return pilotPublicEip
         */
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        /**
         * @return pilotPublicEipId
         */
        public String getPilotPublicEipId() {
            return this.pilotPublicEipId;
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
            private String apiServerPublicEipId; 
            private String canaryPilotLoadBalancerId; 
            private String canaryPilotPublicEipId; 
            private Boolean pilotPublicEip; 
            private String pilotPublicEipId; 
            private String pilotPublicLoadbalancerId; 

            private Builder() {
            } 

            private Builder(LoadBalancer model) {
                this.apiServerLoadbalancerId = model.apiServerLoadbalancerId;
                this.apiServerPublicEip = model.apiServerPublicEip;
                this.apiServerPublicEipId = model.apiServerPublicEipId;
                this.canaryPilotLoadBalancerId = model.canaryPilotLoadBalancerId;
                this.canaryPilotPublicEipId = model.canaryPilotPublicEipId;
                this.pilotPublicEip = model.pilotPublicEip;
                this.pilotPublicEipId = model.pilotPublicEipId;
                this.pilotPublicLoadbalancerId = model.pilotPublicLoadbalancerId;
            } 

            /**
             * <p>The ID of the CLB instance that is used when the API server is exposed to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zekaak10uxds44vx****</p>
             */
            public Builder apiServerLoadbalancerId(String apiServerLoadbalancerId) {
                this.apiServerLoadbalancerId = apiServerLoadbalancerId;
                return this;
            }

            /**
             * <p>Indicates whether the API server is exposed to the Internet. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
                this.apiServerPublicEip = apiServerPublicEip;
                return this;
            }

            /**
             * <p>The ID of the endpoint that is used to expose API server to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-wz9gtwau6b2aklgjk****</p>
             */
            public Builder apiServerPublicEipId(String apiServerPublicEipId) {
                this.apiServerPublicEipId = apiServerPublicEipId;
                return this;
            }

            /**
             * <p>The ID of the Classic Load Balancer (CLB) instance that is used during the canary release of Istio Pilot.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zesa8qs8kbkj9jkl****</p>
             */
            public Builder canaryPilotLoadBalancerId(String canaryPilotLoadBalancerId) {
                this.canaryPilotLoadBalancerId = canaryPilotLoadBalancerId;
                return this;
            }

            /**
             * <p>The ID of the endpoint that is used to expose Istio Pilot to the Internet during canary release.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-wz9gtwau6b2aklgjk****</p>
             */
            public Builder canaryPilotPublicEipId(String canaryPilotPublicEipId) {
                this.canaryPilotPublicEipId = canaryPilotPublicEipId;
                return this;
            }

            /**
             * <p>Indicates whether Istio Pilot is exposed to the Internet. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pilotPublicEip(Boolean pilotPublicEip) {
                this.pilotPublicEip = pilotPublicEip;
                return this;
            }

            /**
             * <p>The ID of the endpoint that is used to expose Istio Pilot to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-wz9gtwau6b2aklgjk****</p>
             */
            public Builder pilotPublicEipId(String pilotPublicEipId) {
                this.pilotPublicEipId = pilotPublicEipId;
                return this;
            }

            /**
             * <p>The ID of the Classic Load Balancer (CLB) instance that is used when Istio Pilot is exposed to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zesa8qs8kbkj9jkl****</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class AccessLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Project")
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

            private Builder() {
            } 

            private Builder(AccessLog model) {
                this.enabled = model.enabled;
                this.project = model.project;
            } 

            /**
             * <p>Indicates whether access log collection is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that stores access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-b7b05d08670e41ca8c8fc0b7718f*****</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Audit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditProjectStatus")
        private String auditProjectStatus;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Project")
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

            private Builder() {
            } 

            private Builder(Audit model) {
                this.auditProjectStatus = model.auditProjectStatus;
                this.enabled = model.enabled;
                this.project = model.project;
            } 

            /**
             * <p>Indicates whether an audit project exists in the ASM instance. Valid values:</p>
             * <ul>
             * <li><code>audit_project_exist</code>: An audit project exists.</li>
             * <li><code>audit_project_not_exist</code>: No audit project exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>audit_project_not_exist</p>
             */
            public Builder auditProjectStatus(String auditProjectStatus) {
                this.auditProjectStatus = auditProjectStatus;
                return this;
            }

            /**
             * <p>Indicates whether mesh audit is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that is used for mesh audit.</p>
             * 
             * <strong>example:</strong>
             * <p>audit-project</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ControlPlaneLogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("LogTTL")
        private Integer logTTL;

        @com.aliyun.core.annotation.NameInMap("Project")
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

            private Builder() {
            } 

            private Builder(ControlPlaneLogInfo model) {
                this.enabled = model.enabled;
                this.logTTL = model.logTTL;
                this.project = model.project;
            } 

            /**
             * <p>Indicates whether the collection of control plane logs is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time to live (TTL) of the collected control-plane logs. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder logTTL(Integer logTTL) {
                this.logTTL = logTTL;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that stores control plane logs.</p>
             * 
             * <strong>example:</strong>
             * <p>mesh-log-cbeb85a09161b4a26ab73e0ac****</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Edition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IstiodImageTag")
        private String istiodImageTag;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProxyImageTag")
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

            private Builder() {
            } 

            private Builder(Edition model) {
                this.istiodImageTag = model.istiodImageTag;
                this.name = model.name;
                this.proxyImageTag = model.proxyImageTag;
            } 

            /**
             * <p>The version of the Istiod image.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.9.7.1-3-gb3f1ab3c9c-pro-aliyun</p>
             */
            public Builder istiodImageTag(String istiodImageTag) {
                this.istiodImageTag = istiodImageTag;
                return this;
            }

            /**
             * <p>The name of the edition.</p>
             * 
             * <strong>example:</strong>
             * <p>Pro</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the Istio Proxy image.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.9.7.1-3-gb3f1ab3c9c-pro-aliyun</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class AccessLogExtraConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayEnabled")
        private Boolean gatewayEnabled;

        @com.aliyun.core.annotation.NameInMap("GatewayLifecycle")
        private Integer gatewayLifecycle;

        @com.aliyun.core.annotation.NameInMap("SidecarEnabled")
        private Boolean sidecarEnabled;

        @com.aliyun.core.annotation.NameInMap("SidecarLifecycle")
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

            private Builder() {
            } 

            private Builder(AccessLogExtraConf model) {
                this.gatewayEnabled = model.gatewayEnabled;
                this.gatewayLifecycle = model.gatewayLifecycle;
                this.sidecarEnabled = model.sidecarEnabled;
                this.sidecarLifecycle = model.sidecarLifecycle;
            } 

            /**
             * <p>Indicates whether gateway log collection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder gatewayEnabled(Boolean gatewayEnabled) {
                this.gatewayEnabled = gatewayEnabled;
                return this;
            }

            /**
             * <p>The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using Simple Log Service. For example, the value 30 indicates that the logs are retained for 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder gatewayLifecycle(Integer gatewayLifecycle) {
                this.gatewayLifecycle = gatewayLifecycle;
                return this;
            }

            /**
             * <p>Indicates whether sidecar log collection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sidecarEnabled(Boolean sidecarEnabled) {
                this.sidecarEnabled = sidecarEnabled;
                return this;
            }

            /**
             * <p>The retention period for the access logs of sidecar proxies. Unit: day. The logs are collected by using Simple Log Service. For example, the value 30 indicates that the logs are retained for 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class EgressHpaCpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetAverageUtilization")
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

            private Builder() {
            } 

            private Builder(EgressHpaCpu model) {
                this.targetAverageUtilization = model.targetAverageUtilization;
            } 

            /**
             * <p>The expected CPU utilization when HPA is enabled. Valid values: 1 to 100. If the CPU utilization exceeds this value, the number of pod replicas increases. If the CPU utilization is less than this value, the number of pod replicas decreases.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class EgressHpaMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetAverageUtilization")
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

            private Builder() {
            } 

            private Builder(EgressHpaMemory model) {
                this.targetAverageUtilization = model.targetAverageUtilization;
            } 

            /**
             * <p>The expected memory usage when HPA is enabled. Valid values: 1 to 100. If the memory usage exceeds this value, the number of pod replicas increases. If the memory usage is less than this value, the number of pod replicas decreases.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class EgressResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limits")
        private java.util.Map<String, ?> limits;

        @com.aliyun.core.annotation.NameInMap("Requests")
        private java.util.Map<String, ?> requests;

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
        public java.util.Map<String, ?> getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map<String, ?> getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map<String, ?> limits; 
            private java.util.Map<String, ?> requests; 

            private Builder() {
            } 

            private Builder(EgressResources model) {
                this.limits = model.limits;
                this.requests = model.requests;
            } 

            /**
             * <p>The resources that are available to the egress gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:&quot;200m&quot;, &quot;memory&quot;: &quot;512Mi&quot;}</p>
             */
            public Builder limits(java.util.Map<String, ?> limits) {
                this.limits = limits;
                return this;
            }

            /**
             * <p>The resources that are requested by the egress gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:&quot;100m&quot;, &quot;memory&quot;: &quot;256Mi&quot;}</p>
             */
            public Builder requests(java.util.Map<String, ?> requests) {
                this.requests = requests;
                return this;
            }

            public EgressResources build() {
                return new EgressResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class AdaptiveXdsConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressAutoscaleEnabled")
        private Boolean egressAutoscaleEnabled;

        @com.aliyun.core.annotation.NameInMap("EgressHpaCpu")
        private EgressHpaCpu egressHpaCpu;

        @com.aliyun.core.annotation.NameInMap("EgressHpaMemory")
        private EgressHpaMemory egressHpaMemory;

        @com.aliyun.core.annotation.NameInMap("EgressMaxReplica")
        private Integer egressMaxReplica;

        @com.aliyun.core.annotation.NameInMap("EgressMinReplica")
        private Integer egressMinReplica;

        @com.aliyun.core.annotation.NameInMap("EgressReplicaCount")
        private Integer egressReplicaCount;

        @com.aliyun.core.annotation.NameInMap("EgressResources")
        private EgressResources egressResources;

        @com.aliyun.core.annotation.NameInMap("Enabled")
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

            private Builder() {
            } 

            private Builder(AdaptiveXdsConfiguration model) {
                this.egressAutoscaleEnabled = model.egressAutoscaleEnabled;
                this.egressHpaCpu = model.egressHpaCpu;
                this.egressHpaMemory = model.egressHpaMemory;
                this.egressMaxReplica = model.egressMaxReplica;
                this.egressMinReplica = model.egressMinReplica;
                this.egressReplicaCount = model.egressReplicaCount;
                this.egressResources = model.egressResources;
                this.enabled = model.enabled;
            } 

            /**
             * <p>Indicates whether Horizontal Pod Autoscaling (HPA) is enabled for the egress gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder egressAutoscaleEnabled(Boolean egressAutoscaleEnabled) {
                this.egressAutoscaleEnabled = egressAutoscaleEnabled;
                return this;
            }

            /**
             * <p>The CPU resource configurations of the egress gateway when HPA is enabled.</p>
             */
            public Builder egressHpaCpu(EgressHpaCpu egressHpaCpu) {
                this.egressHpaCpu = egressHpaCpu;
                return this;
            }

            /**
             * <p>The memory resource configurations of the egress gateway when HPA is enabled.</p>
             */
            public Builder egressHpaMemory(EgressHpaMemory egressHpaMemory) {
                this.egressHpaMemory = egressHpaMemory;
                return this;
            }

            /**
             * <p>The maximum number of egress gateway pod replicas when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder egressMaxReplica(Integer egressMaxReplica) {
                this.egressMaxReplica = egressMaxReplica;
                return this;
            }

            /**
             * <p>The minimum number of egress gateway pod replicas when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder egressMinReplica(Integer egressMinReplica) {
                this.egressMinReplica = egressMinReplica;
                return this;
            }

            /**
             * <p>The number of the egress gateway pod replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder egressReplicaCount(Integer egressReplicaCount) {
                this.egressReplicaCount = egressReplicaCount;
                return this;
            }

            /**
             * <p>The resource configurations of the egress gateway that is used by adaptive xDS optimization.</p>
             */
            public Builder egressResources(EgressResources egressResources) {
                this.egressResources = egressResources;
                return this;
            }

            /**
             * <p>Indicates whether adaptive xDS optimization is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class AutoDiagnosis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDiagnosisEnabled")
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

            private Builder() {
            } 

            private Builder(AutoDiagnosis model) {
                this.autoDiagnosisEnabled = model.autoDiagnosisEnabled;
            } 

            /**
             * <p>Indicates whether automatic diagnostics is enabled for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed 5 minutes after you modify an Istio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class CRAggregationConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
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

            private Builder() {
            } 

            private Builder(CRAggregationConfiguration model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Indicates whether Istio resources can be accessed by using the Kubernetes API on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class IstioCRHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableHistory")
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

            private Builder() {
            } 

            private Builder(IstioCRHistory model) {
                this.enableHistory = model.enableHistory;
            } 

            /**
             * <p>Indicates whether the rollback feature for Istio resources is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class IstiodExtraConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelsForOffloadedWorkloads")
        private String labelsForOffloadedWorkloads;

        @com.aliyun.core.annotation.NameInMap("PilotEnableQuicListeners")
        private Boolean pilotEnableQuicListeners;

        private IstiodExtraConfiguration(Builder builder) {
            this.labelsForOffloadedWorkloads = builder.labelsForOffloadedWorkloads;
            this.pilotEnableQuicListeners = builder.pilotEnableQuicListeners;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IstiodExtraConfiguration create() {
            return builder().build();
        }

        /**
         * @return labelsForOffloadedWorkloads
         */
        public String getLabelsForOffloadedWorkloads() {
            return this.labelsForOffloadedWorkloads;
        }

        /**
         * @return pilotEnableQuicListeners
         */
        public Boolean getPilotEnableQuicListeners() {
            return this.pilotEnableQuicListeners;
        }

        public static final class Builder {
            private String labelsForOffloadedWorkloads; 
            private Boolean pilotEnableQuicListeners; 

            private Builder() {
            } 

            private Builder(IstiodExtraConfiguration model) {
                this.labelsForOffloadedWorkloads = model.labelsForOffloadedWorkloads;
                this.pilotEnableQuicListeners = model.pilotEnableQuicListeners;
            } 

            /**
             * <p>The labels for isolated workloads.</p>
             * 
             * <strong>example:</strong>
             * <p>name=xx,region=xx</p>
             */
            public Builder labelsForOffloadedWorkloads(String labelsForOffloadedWorkloads) {
                this.labelsForOffloadedWorkloads = labelsForOffloadedWorkloads;
                return this;
            }

            /**
             * PilotEnableQuicListeners.
             */
            public Builder pilotEnableQuicListeners(Boolean pilotEnableQuicListeners) {
                this.pilotEnableQuicListeners = pilotEnableQuicListeners;
                return this;
            }

            public IstiodExtraConfiguration build() {
                return new IstiodExtraConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Exec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("command")
        private java.util.List<String> command;

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
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List<String> command; 

            private Builder() {
            } 

            private Builder(Exec model) {
                this.command = model.command;
            } 

            /**
             * <p>The executed commands. The value is a string that consists of JSON arrays.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class HttpHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(HttpHeaders model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the HTTP request header.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the HTTP request header.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class HttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("httpHeaders")
        private java.util.List<HttpHeaders> httpHeaders;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("scheme")
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
        public java.util.List<HttpHeaders> getHttpHeaders() {
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
            private java.util.List<HttpHeaders> httpHeaders; 
            private String port; 
            private String scheme; 

            private Builder() {
            } 

            private Builder(HttpGet model) {
                this.host = model.host;
                this.httpHeaders = model.httpHeaders;
                this.port = model.port;
                this.scheme = model.scheme;
            } 

            /**
             * <p>The URL of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The HTTP request headers.</p>
             */
            public Builder httpHeaders(java.util.List<HttpHeaders> httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * <p>The port number of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The request method. Valid values: <code>http</code> and <code>https</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class TcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
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

            private Builder() {
            } 

            private Builder(TcpSocket model) {
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>The URL of the TCP socket request.</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port number of the TCP socket request.</p>
             * 
             * <strong>example:</strong>
             * <p>888</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class PostStart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exec")
        private Exec exec;

        @com.aliyun.core.annotation.NameInMap("httpGet")
        private HttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("tcpSocket")
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

            private Builder() {
            } 

            private Builder(PostStart model) {
                this.exec = model.exec;
                this.httpGet = model.httpGet;
                this.tcpSocket = model.tcpSocket;
            } 

            /**
             * <p>The post-start script.</p>
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * <p>The HTTP GET request that is sent before the instance stops.</p>
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * <p>The TCP socket request that is sent.</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class PreStopExec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("command")
        private java.util.List<String> command;

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
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List<String> command; 

            private Builder() {
            } 

            private Builder(PreStopExec model) {
                this.command = model.command;
            } 

            /**
             * <p>The executed commands. The value is a string that consists of JSON arrays.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            public PreStopExec build() {
                return new PreStopExec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class HttpGetHttpHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(HttpGetHttpHeaders model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the HTTP request header.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the HTTP request header.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class PreStopHttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("httpHeaders")
        private java.util.List<HttpGetHttpHeaders> httpHeaders;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("scheme")
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
        public java.util.List<HttpGetHttpHeaders> getHttpHeaders() {
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
            private java.util.List<HttpGetHttpHeaders> httpHeaders; 
            private String port; 
            private String scheme; 

            private Builder() {
            } 

            private Builder(PreStopHttpGet model) {
                this.host = model.host;
                this.httpHeaders = model.httpHeaders;
                this.port = model.port;
                this.scheme = model.scheme;
            } 

            /**
             * <p>The URL of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The HTTP request headers.</p>
             */
            public Builder httpHeaders(java.util.List<HttpGetHttpHeaders> httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * <p>The port number of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The request method. Valid values: <code>http</code> and <code>https</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class PreStopTcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
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

            private Builder() {
            } 

            private Builder(PreStopTcpSocket model) {
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>The URL of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port number of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>888</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class PreStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exec")
        private PreStopExec exec;

        @com.aliyun.core.annotation.NameInMap("httpGet")
        private PreStopHttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("tcpSocket")
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

            private Builder() {
            } 

            private Builder(PreStop model) {
                this.exec = model.exec;
                this.httpGet = model.httpGet;
                this.tcpSocket = model.tcpSocket;
            } 

            /**
             * <p>The pre-close script.</p>
             */
            public Builder exec(PreStopExec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * <p>The HTTP GET request that is sent before the instance stops.</p>
             */
            public Builder httpGet(PreStopHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * <p>The TCP socket request that is sent.</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Lifecycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("postStart")
        private PostStart postStart;

        @com.aliyun.core.annotation.NameInMap("preStop")
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

            private Builder() {
            } 

            private Builder(Lifecycle model) {
                this.postStart = model.postStart;
                this.preStop = model.preStop;
            } 

            /**
             * <p>The post-start parameters.</p>
             */
            public Builder postStart(PostStart postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The pre-close parameters.</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class MultiBuffer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("PollDelay")
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

            private Builder() {
            } 

            private Builder(MultiBuffer model) {
                this.enabled = model.enabled;
                this.pollDelay = model.pollDelay;
            } 

            /**
             * <p>Indicates whether MultiBuffer-based TLS acceleration is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The pull-request latency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02s</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class NFDConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("NFDLabelPruned")
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

            private Builder() {
            } 

            private Builder(NFDConfiguration model) {
                this.enabled = model.enabled;
                this.NFDLabelPruned = model.NFDLabelPruned;
            } 

            /**
             * <p>Indicates whether NFD is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Indicates whether feature labels on nodes are cleared when NFD is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class OPAScopeInjection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OPAScopeInjected")
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

            private Builder() {
            } 

            private Builder(OPAScopeInjection model) {
                this.OPAScopeInjected = model.OPAScopeInjected;
            } 

            /**
             * <p>Indicates whether the feature of controlling the OPA injection scope is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Playground extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        private Playground(Builder builder) {
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playground create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        public static final class Builder {
            private String scene; 

            private Builder() {
            } 

            private Builder(Playground model) {
                this.scene = model.scene;
            } 

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            public Playground build() {
                return new Playground(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class SidecarProxyInitResourceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryLimit")
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

            private Builder() {
            } 

            private Builder(SidecarProxyInitResourceLimit model) {
                this.resourceCPULimit = model.resourceCPULimit;
                this.resourceMemoryLimit = model.resourceMemoryLimit;
            } 

            /**
             * <p>The maximum number of CPU cores that are available to the istio-init container.</p>
             * 
             * <strong>example:</strong>
             * <p>2000m</p>
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * <p>The maximum size of the memory that is available to the istio-init container.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mi</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class SidecarProxyInitResourceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryRequest")
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

            private Builder() {
            } 

            private Builder(SidecarProxyInitResourceRequest model) {
                this.resourceCPURequest = model.resourceCPURequest;
                this.resourceMemoryRequest = model.resourceMemoryRequest;
            } 

            /**
             * <p>The number of CPU cores that are requested by the istio-init container.</p>
             * 
             * <strong>example:</strong>
             * <p>10m</p>
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * <p>The size of the memory that is requested by the istio-init container.</p>
             * 
             * <strong>example:</strong>
             * <p>10Mi</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ExtraConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogExtraConf")
        private AccessLogExtraConf accessLogExtraConf;

        @com.aliyun.core.annotation.NameInMap("AdaptiveXdsConfiguration")
        private AdaptiveXdsConfiguration adaptiveXdsConfiguration;

        @com.aliyun.core.annotation.NameInMap("AutoDiagnosis")
        private AutoDiagnosis autoDiagnosis;

        @com.aliyun.core.annotation.NameInMap("CRAggregationConfiguration")
        private CRAggregationConfiguration CRAggregationConfiguration;

        @com.aliyun.core.annotation.NameInMap("CRAggregationEnabled")
        private Boolean CRAggregationEnabled;

        @com.aliyun.core.annotation.NameInMap("DiscoverySelectors")
        private java.util.List<java.util.Map<String, ?>> discoverySelectors;

        @com.aliyun.core.annotation.NameInMap("IstioCRHistory")
        private IstioCRHistory istioCRHistory;

        @com.aliyun.core.annotation.NameInMap("IstiodExtraConfiguration")
        private IstiodExtraConfiguration istiodExtraConfiguration;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private Lifecycle lifecycle;

        @com.aliyun.core.annotation.NameInMap("MultiBuffer")
        private MultiBuffer multiBuffer;

        @com.aliyun.core.annotation.NameInMap("NFDConfiguration")
        private NFDConfiguration NFDConfiguration;

        @com.aliyun.core.annotation.NameInMap("OPAScopeInjection")
        private OPAScopeInjection OPAScopeInjection;

        @com.aliyun.core.annotation.NameInMap("Playground")
        private Playground playground;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyInitResourceLimit")
        private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyInitResourceRequest")
        private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @com.aliyun.core.annotation.NameInMap("TerminationDrainDuration")
        private String terminationDrainDuration;

        private ExtraConfiguration(Builder builder) {
            this.accessLogExtraConf = builder.accessLogExtraConf;
            this.adaptiveXdsConfiguration = builder.adaptiveXdsConfiguration;
            this.autoDiagnosis = builder.autoDiagnosis;
            this.CRAggregationConfiguration = builder.CRAggregationConfiguration;
            this.CRAggregationEnabled = builder.CRAggregationEnabled;
            this.discoverySelectors = builder.discoverySelectors;
            this.istioCRHistory = builder.istioCRHistory;
            this.istiodExtraConfiguration = builder.istiodExtraConfiguration;
            this.lifecycle = builder.lifecycle;
            this.multiBuffer = builder.multiBuffer;
            this.NFDConfiguration = builder.NFDConfiguration;
            this.OPAScopeInjection = builder.OPAScopeInjection;
            this.playground = builder.playground;
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
        public java.util.List<java.util.Map<String, ?>> getDiscoverySelectors() {
            return this.discoverySelectors;
        }

        /**
         * @return istioCRHistory
         */
        public IstioCRHistory getIstioCRHistory() {
            return this.istioCRHistory;
        }

        /**
         * @return istiodExtraConfiguration
         */
        public IstiodExtraConfiguration getIstiodExtraConfiguration() {
            return this.istiodExtraConfiguration;
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
         * @return playground
         */
        public Playground getPlayground() {
            return this.playground;
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
            private java.util.List<java.util.Map<String, ?>> discoverySelectors; 
            private IstioCRHistory istioCRHistory; 
            private IstiodExtraConfiguration istiodExtraConfiguration; 
            private Lifecycle lifecycle; 
            private MultiBuffer multiBuffer; 
            private NFDConfiguration NFDConfiguration; 
            private OPAScopeInjection OPAScopeInjection; 
            private Playground playground; 
            private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit; 
            private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest; 
            private String terminationDrainDuration; 

            private Builder() {
            } 

            private Builder(ExtraConfiguration model) {
                this.accessLogExtraConf = model.accessLogExtraConf;
                this.adaptiveXdsConfiguration = model.adaptiveXdsConfiguration;
                this.autoDiagnosis = model.autoDiagnosis;
                this.CRAggregationConfiguration = model.CRAggregationConfiguration;
                this.CRAggregationEnabled = model.CRAggregationEnabled;
                this.discoverySelectors = model.discoverySelectors;
                this.istioCRHistory = model.istioCRHistory;
                this.istiodExtraConfiguration = model.istiodExtraConfiguration;
                this.lifecycle = model.lifecycle;
                this.multiBuffer = model.multiBuffer;
                this.NFDConfiguration = model.NFDConfiguration;
                this.OPAScopeInjection = model.OPAScopeInjection;
                this.playground = model.playground;
                this.sidecarProxyInitResourceLimit = model.sidecarProxyInitResourceLimit;
                this.sidecarProxyInitResourceRequest = model.sidecarProxyInitResourceRequest;
                this.terminationDrainDuration = model.terminationDrainDuration;
            } 

            /**
             * <p>The configurations of additional features for access log collection.</p>
             */
            public Builder accessLogExtraConf(AccessLogExtraConf accessLogExtraConf) {
                this.accessLogExtraConf = accessLogExtraConf;
                return this;
            }

            /**
             * <p>The configurations of adaptive xDS optimization.</p>
             */
            public Builder adaptiveXdsConfiguration(AdaptiveXdsConfiguration adaptiveXdsConfiguration) {
                this.adaptiveXdsConfiguration = adaptiveXdsConfiguration;
                return this;
            }

            /**
             * <p>The configurations of automatic diagnostics for the ASM instance.</p>
             */
            public Builder autoDiagnosis(AutoDiagnosis autoDiagnosis) {
                this.autoDiagnosis = autoDiagnosis;
                return this;
            }

            /**
             * <p>Access to Istio resources by using the Kubernetes API on the data plane.</p>
             */
            public Builder CRAggregationConfiguration(CRAggregationConfiguration CRAggregationConfiguration) {
                this.CRAggregationConfiguration = CRAggregationConfiguration;
                return this;
            }

            /**
             * <p>Indicates whether the Kubernetes API of clusters on the data plane can be used to access Istio resources. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
                this.CRAggregationEnabled = CRAggregationEnabled;
                return this;
            }

            /**
             * <p>The label selectors used to specify the namespaces of the clusters on the data plane. The control plane discovers and processes only application services in the specified namespaces.</p>
             */
            public Builder discoverySelectors(java.util.List<java.util.Map<String, ?>> discoverySelectors) {
                this.discoverySelectors = discoverySelectors;
                return this;
            }

            /**
             * <p>The configurations of the rollback feature for Istio resources.</p>
             */
            public Builder istioCRHistory(IstioCRHistory istioCRHistory) {
                this.istioCRHistory = istioCRHistory;
                return this;
            }

            /**
             * <p>Additional configurations for Istiod.</p>
             */
            public Builder istiodExtraConfiguration(IstiodExtraConfiguration istiodExtraConfiguration) {
                this.istiodExtraConfiguration = istiodExtraConfiguration;
                return this;
            }

            /**
             * <p>The lifecycle of Istio Proxy.</p>
             */
            public Builder lifecycle(Lifecycle lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The information about Transport Layer Security (TLS) acceleration based on MultiBuffer.</p>
             */
            public Builder multiBuffer(MultiBuffer multiBuffer) {
                this.multiBuffer = multiBuffer;
                return this;
            }

            /**
             * <p>The configurations of Node Feature Discovery (NFD).</p>
             */
            public Builder NFDConfiguration(NFDConfiguration NFDConfiguration) {
                this.NFDConfiguration = NFDConfiguration;
                return this;
            }

            /**
             * <p>The configurations of the feature of controlling the OPA injection scope.</p>
             */
            public Builder OPAScopeInjection(OPAScopeInjection OPAScopeInjection) {
                this.OPAScopeInjection = OPAScopeInjection;
                return this;
            }

            /**
             * Playground.
             */
            public Builder playground(Playground playground) {
                this.playground = playground;
                return this;
            }

            /**
             * <p>The resource limits on the istio-init container.</p>
             */
            public Builder sidecarProxyInitResourceLimit(SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
                this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
                return this;
            }

            /**
             * <p>The resources that are required by the istio-init container.</p>
             */
            public Builder sidecarProxyInitResourceRequest(SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
                this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
                return this;
            }

            /**
             * <p>The maximum period of time that Istio Proxy waits for a request to end.</p>
             * 
             * <strong>example:</strong>
             * <p>5s</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class K8sNewAPIsSupport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayAPIEnabled")
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

            private Builder() {
            } 

            private Builder(K8sNewAPIsSupport model) {
                this.gatewayAPIEnabled = model.gatewayAPIEnabled;
            } 

            /**
             * <p>Indicates whether Gateway API is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Kiali extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(Kiali model) {
                this.enabled = model.enabled;
                this.url = model.url;
            } 

            /**
             * <p>Indicates whether mesh topology is enabled. Mesh topology can be enabled only when Prometheus monitoring is enabled. If Prometheus monitoring is disabled, you must set this parameter to <code>false</code>.`` Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The endpoint of the mesh topology service.</p>
             * 
             * <strong>example:</strong>
             * <p>http://<code>1.2.**.**</code>:20001</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class LocalityLB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Distribute")
        private java.util.Map<String, ?> distribute;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Failover")
        private java.util.Map<String, ?> failover;

        @com.aliyun.core.annotation.NameInMap("FailoverPriority")
        private java.util.Map<String, ?> failoverPriority;

        private LocalityLB(Builder builder) {
            this.distribute = builder.distribute;
            this.enabled = builder.enabled;
            this.failover = builder.failover;
            this.failoverPriority = builder.failoverPriority;
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
        public java.util.Map<String, ?> getDistribute() {
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
        public java.util.Map<String, ?> getFailover() {
            return this.failover;
        }

        /**
         * @return failoverPriority
         */
        public java.util.Map<String, ?> getFailoverPriority() {
            return this.failoverPriority;
        }

        public static final class Builder {
            private java.util.Map<String, ?> distribute; 
            private Boolean enabled; 
            private java.util.Map<String, ?> failover; 
            private java.util.Map<String, ?> failoverPriority; 

            private Builder() {
            } 

            private Builder(LocalityLB model) {
                this.distribute = model.distribute;
                this.enabled = model.enabled;
                this.failover = model.failover;
                this.failoverPriority = model.failoverPriority;
            } 

            /**
             * <p>The configurations of cross-region traffic distribution.</p>
             * <blockquote>
             * <p> Either <code>Failover</code> or Distribute can be set. If you set <code>Distribute</code>, you cannot set Failover.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;from&quot;:&quot;cn-shanghai&quot;,&quot;to&quot;:{&quot;cn-hangzhou/<em>&quot;:50,&quot;cn-shanghai/</em>&quot;:25,&quot;cn-zhangjiakou/<em>&quot;:25}},{&quot;from&quot;:&quot;cn-hangzhou&quot;,&quot;to&quot;:{&quot;cn-hangzhou/</em>&quot;:50,&quot;cn-shanghai/<em>&quot;:25,&quot;cn-zhangjiakou/</em>&quot;:25}}]</p>
             */
            public Builder distribute(java.util.Map<String, ?> distribute) {
                this.distribute = distribute;
                return this;
            }

            /**
             * <p>Indicates whether cross-region load balancing is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The configurations of cross-region failover.</p>
             * <blockquote>
             * <p> Either Failover or <code>Distribute</code> can be set. If you set <code>Failover</code>, you cannot set <code>Distribute</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;failover&quot;:[{&quot;from&quot;:&quot;cn-hangzhou&quot;,&quot;to&quot;:&quot;cn-shanghai&quot;}]}</p>
             */
            public Builder failover(java.util.Map<String, ?> failover) {
                this.failover = failover;
                return this;
            }

            /**
             * FailoverPriority.
             */
            public Builder failoverPriority(java.util.Map<String, ?> failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            public LocalityLB build() {
                return new LocalityLB(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class MSE extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
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

            private Builder() {
            } 

            private Builder(MSE model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Indicates whether MSE is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class OPA extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("LimitCPU")
        private String limitCPU;

        @com.aliyun.core.annotation.NameInMap("LimitMemory")
        private String limitMemory;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private String requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
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

            private Builder() {
            } 

            private Builder(OPA model) {
                this.enabled = model.enabled;
                this.limitCPU = model.limitCPU;
                this.limitMemory = model.limitMemory;
                this.logLevel = model.logLevel;
                this.requestCPU = model.requestCPU;
                this.requestMemory = model.requestMemory;
            } 

            /**
             * <p>Indicates whether the OPA plug-in is installed. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of CPU cores that are available to the OPA proxy container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * <p>The maximum size of the memory that is available to the OPA proxy container.</p>
             * 
             * <strong>example:</strong>
             * <p>512Mi</p>
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * <p>The level of the logs to be generated for OPA.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * <p>The number of CPU cores that are requested by the OPA proxy container.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>The size of the memory that is requested by OPA.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mi</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ConfigSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("NacosID")
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

            private Builder() {
            } 

            private Builder(ConfigSource model) {
                this.enabled = model.enabled;
                this.nacosID = model.nacosID;
            } 

            /**
             * <p>Indicates whether communication is allowed between external services and services in the mesh. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the Nacos instance that provides external service information.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-tl326******</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Feature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSDSServer")
        private Boolean enableSDSServer;

        @com.aliyun.core.annotation.NameInMap("FilterGatewayClusterConfig")
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

            private Builder() {
            } 

            private Builder(Feature model) {
                this.enableSDSServer = model.enableSDSServer;
                this.filterGatewayClusterConfig = model.filterGatewayClusterConfig;
            } 

            /**
             * <p>Indicates whether Secret Discovery Service (SDS) is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSDSServer(Boolean enableSDSServer) {
                this.enableSDSServer = enableSDSServer;
                return this;
            }

            /**
             * <p>Indicates whether gateway configuration filtering is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Pilot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSource")
        private ConfigSource configSource;

        @com.aliyun.core.annotation.NameInMap("Feature")
        private Feature feature;

        @com.aliyun.core.annotation.NameInMap("Http10Enabled")
        private Boolean http10Enabled;

        @com.aliyun.core.annotation.NameInMap("TraceSampling")
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

            private Builder() {
            } 

            private Builder(Pilot model) {
                this.configSource = model.configSource;
                this.feature = model.feature;
                this.http10Enabled = model.http10Enabled;
                this.traceSampling = model.traceSampling;
            } 

            /**
             * <p>The configurations of communication between external services and services in the mesh.</p>
             */
            public Builder configSource(ConfigSource configSource) {
                this.configSource = configSource;
                return this;
            }

            /**
             * <p>The configurations of Pilot features.</p>
             */
            public Builder feature(Feature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>Indicates whether HTTP/1.0 is supported. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder http10Enabled(Boolean http10Enabled) {
                this.http10Enabled = http10Enabled;
                return this;
            }

            /**
             * <p>The sampling percentage of tracing analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Prometheus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalUrl")
        private String externalUrl;

        @com.aliyun.core.annotation.NameInMap("UseExternal")
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

            private Builder() {
            } 

            private Builder(Prometheus model) {
                this.externalUrl = model.externalUrl;
                this.useExternal = model.useExternal;
            } 

            /**
             * <p>The endpoint of Prometheus monitoring. If you use a custom Prometheus instance, this parameter is populated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://prometheus:9090">http://prometheus:9090</a></p>
             */
            public Builder externalUrl(String externalUrl) {
                this.externalUrl = externalUrl;
                return this;
            }

            /**
             * <p>Indicates whether a custom Prometheus instance is used. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ProtocolSupport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboFilterEnabled")
        private Boolean dubboFilterEnabled;

        @com.aliyun.core.annotation.NameInMap("MysqlFilterEnabled")
        private Boolean mysqlFilterEnabled;

        @com.aliyun.core.annotation.NameInMap("RedisFilterEnabled")
        private Boolean redisFilterEnabled;

        @com.aliyun.core.annotation.NameInMap("ThriftFilterEnabled")
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

            private Builder() {
            } 

            private Builder(ProtocolSupport model) {
                this.dubboFilterEnabled = model.dubboFilterEnabled;
                this.mysqlFilterEnabled = model.mysqlFilterEnabled;
                this.redisFilterEnabled = model.redisFilterEnabled;
                this.thriftFilterEnabled = model.thriftFilterEnabled;
            } 

            /**
             * <p>Indicates whether Dubbo Filter is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
                this.dubboFilterEnabled = dubboFilterEnabled;
                return this;
            }

            /**
             * <p>Indicates whether MySQL Filter is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
                this.mysqlFilterEnabled = mysqlFilterEnabled;
                return this;
            }

            /**
             * <p>Indicates whether Redis Filter is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
                this.redisFilterEnabled = redisFilterEnabled;
                return this;
            }

            /**
             * <p>Indicates whether Thrift Filter is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Proxy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogFile")
        private String accessLogFile;

        @com.aliyun.core.annotation.NameInMap("AccessLogFormat")
        private String accessLogFormat;

        @com.aliyun.core.annotation.NameInMap("AccessLogServiceEnabled")
        private Boolean accessLogServiceEnabled;

        @com.aliyun.core.annotation.NameInMap("AccessLogServiceHost")
        private String accessLogServiceHost;

        @com.aliyun.core.annotation.NameInMap("AccessLogServicePort")
        private Integer accessLogServicePort;

        @com.aliyun.core.annotation.NameInMap("ClusterDomain")
        private String clusterDomain;

        @com.aliyun.core.annotation.NameInMap("EnableDNSProxying")
        private Boolean enableDNSProxying;

        @com.aliyun.core.annotation.NameInMap("LimitCPU")
        private String limitCPU;

        @com.aliyun.core.annotation.NameInMap("LimitMemory")
        private String limitMemory;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private String requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
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

            private Builder() {
            } 

            private Builder(Proxy model) {
                this.accessLogFile = model.accessLogFile;
                this.accessLogFormat = model.accessLogFormat;
                this.accessLogServiceEnabled = model.accessLogServiceEnabled;
                this.accessLogServiceHost = model.accessLogServiceHost;
                this.accessLogServicePort = model.accessLogServicePort;
                this.clusterDomain = model.clusterDomain;
                this.enableDNSProxying = model.enableDNSProxying;
                this.limitCPU = model.limitCPU;
                this.limitMemory = model.limitMemory;
                this.requestCPU = model.requestCPU;
                this.requestMemory = model.requestMemory;
            } 

            /**
             * <p>The path to the file that stores the access logs of sidecar proxies.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/stdout</p>
             */
            public Builder accessLogFile(String accessLogFile) {
                this.accessLogFile = accessLogFile;
                return this;
            }

            /**
             * <p>The format of the access logs of sidecar proxies.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;authority_for&quot;:&quot;%REQ(:AUTHORITY)%&quot;,&quot;bytes_received&quot;:&quot;%BYTES_RECEIVED%&quot;,&quot;bytes_sent&quot;:&quot;%BYTES_SENT%&quot;,&quot;downstream_local_address&quot;:&quot;%DOWNSTREAM_LOCAL_ADDRESS%&quot;,&quot;downstream_remote_address&quot;:&quot;%DOWNSTREAM_REMOTE_ADDRESS%&quot;,&quot;duration&quot;:&quot;%DURATION%&quot;,&quot;istio_policy_status&quot;:&quot;%DYNAMIC_METADATA(istio.mixer:status)%&quot;,&quot;method&quot;:&quot;%REQ(:METHOD)%&quot;,&quot;path&quot;:&quot;%REQ(X-ENVOY-ORIGINAL-PATH?:PATH)%&quot;,&quot;protocol&quot;:&quot;%PROTOCOL%&quot;,&quot;request_id&quot;:&quot;%REQ(X-REQUEST-ID)%&quot;,&quot;requested_server_name&quot;:&quot;%REQUESTED_SERVER_NAME%&quot;,&quot;response_code&quot;:&quot;%RESPONSE_CODE%&quot;,&quot;response_flags&quot;:&quot;%RESPONSE_FLAGS%&quot;,&quot;route_name&quot;:&quot;%ROUTE_NAME%&quot;,&quot;start_time&quot;:&quot;%START_TIME%&quot;,&quot;trace_id&quot;:&quot;%REQ(X-B3-TRACEID)%&quot;,&quot;upstream_cluster&quot;:&quot;%UPSTREAM_CLUSTER%&quot;,&quot;upstream_host&quot;:&quot;%UPSTREAM_HOST%&quot;,&quot;upstream_local_address&quot;:&quot;%UPSTREAM_LOCAL_ADDRESS%&quot;,&quot;upstream_service_time&quot;:&quot;%RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)%&quot;,&quot;upstream_transport_failure_reason&quot;:&quot;%UPSTREAM_TRANSPORT_FAILURE_REASON%&quot;,&quot;user_agent&quot;:&quot;%REQ(USER-AGENT)%&quot;,&quot;x_forwarded_for&quot;:&quot;%REQ(X-FORWARDED-FOR)%&quot;}</p>
             */
            public Builder accessLogFormat(String accessLogFormat) {
                this.accessLogFormat = accessLogFormat;
                return this;
            }

            /**
             * <p>Indicates whether gRPC Access Log Service (ALS) for Envoy is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
                this.accessLogServiceEnabled = accessLogServiceEnabled;
                return this;
            }

            /**
             * <p>The endpoint of gRPC ALS for Envoy.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0</p>
             */
            public Builder accessLogServiceHost(String accessLogServiceHost) {
                this.accessLogServiceHost = accessLogServiceHost;
                return this;
            }

            /**
             * <p>The port of gRPC ALS for Envoy.</p>
             * 
             * <strong>example:</strong>
             * <p>9999</p>
             */
            public Builder accessLogServicePort(Integer accessLogServicePort) {
                this.accessLogServicePort = accessLogServicePort;
                return this;
            }

            /**
             * <p>The trusted domain.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster.domain</p>
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * <p>Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableDNSProxying(Boolean enableDNSProxying) {
                this.enableDNSProxying = enableDNSProxying;
                return this;
            }

            /**
             * <p>The maximum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2000m</p>
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * <p>The maximum size of the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mi</p>
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * <p>The number of CPU cores that are requested.</p>
             * 
             * <strong>example:</strong>
             * <p>100m</p>
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>The size of the memory that is requested.</p>
             * 
             * <strong>example:</strong>
             * <p>128Mi</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class InitCNIConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ExcludeNamespaces")
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

            private Builder() {
            } 

            private Builder(InitCNIConfiguration model) {
                this.enabled = model.enabled;
                this.excludeNamespaces = model.excludeNamespaces;
            } 

            /**
             * <p>Indicates whether the CNI plug-in is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The namespaces to exclude. The CNI plug-in ignores pods in the excluded namespaces.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system,istio-system</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class SidecarInjector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoInjectionPolicyEnabled")
        private Boolean autoInjectionPolicyEnabled;

        @com.aliyun.core.annotation.NameInMap("EnableNamespacesByDefault")
        private Boolean enableNamespacesByDefault;

        @com.aliyun.core.annotation.NameInMap("InitCNIConfiguration")
        private InitCNIConfiguration initCNIConfiguration;

        @com.aliyun.core.annotation.NameInMap("LimitCPU")
        private String limitCPU;

        @com.aliyun.core.annotation.NameInMap("LimitMemory")
        private String limitMemory;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private String requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
        private String requestMemory;

        @com.aliyun.core.annotation.NameInMap("SidecarInjectorNum")
        private Integer sidecarInjectorNum;

        @com.aliyun.core.annotation.NameInMap("SidecarInjectorWebhookAsYaml")
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

            private Builder() {
            } 

            private Builder(SidecarInjector model) {
                this.autoInjectionPolicyEnabled = model.autoInjectionPolicyEnabled;
                this.enableNamespacesByDefault = model.enableNamespacesByDefault;
                this.initCNIConfiguration = model.initCNIConfiguration;
                this.limitCPU = model.limitCPU;
                this.limitMemory = model.limitMemory;
                this.requestCPU = model.requestCPU;
                this.requestMemory = model.requestMemory;
                this.sidecarInjectorNum = model.sidecarInjectorNum;
                this.sidecarInjectorWebhookAsYaml = model.sidecarInjectorWebhookAsYaml;
            } 

            /**
             * <p>Indicates whether automatic sidecar proxy injection can be enabled by using pod annotations. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
                this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
                return this;
            }

            /**
             * <p>Indicates whether automatic sidecar proxy injection is enabled for all namespaces. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
                this.enableNamespacesByDefault = enableNamespacesByDefault;
                return this;
            }

            /**
             * <p>The configurations of Container Network Interface (CNI).</p>
             */
            public Builder initCNIConfiguration(InitCNIConfiguration initCNIConfiguration) {
                this.initCNIConfiguration = initCNIConfiguration;
                return this;
            }

            /**
             * <p>The maximum number of CPU cores that are available to the pod where the sidecar injector resides.</p>
             * 
             * <strong>example:</strong>
             * <p>4000m</p>
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * <p>The maximum size of the memory that is available to the pod where the sidecar injector resides.</p>
             * 
             * <strong>example:</strong>
             * <p>2048Mi</p>
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * <p>The number of CPU cores that are requested by the pod where the sidecar injector resides.</p>
             * 
             * <strong>example:</strong>
             * <p>1000m</p>
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>The size of the memory that is requested by the pod where the sidecar injector resides.</p>
             * 
             * <strong>example:</strong>
             * <p>512Mi</p>
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * <p>The number of component replicas that are used for sidecar proxy injection. Default value: <code>1</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sidecarInjectorNum(Integer sidecarInjectorNum) {
                this.sidecarInjectorNum = sidecarInjectorNum;
                return this;
            }

            /**
             * <p>Other configurations of automatic sidecar proxy injection, in the YAML format. For more information, see <a href="https://help.aliyun.com/document_detail/186136.html">Enable automatic sidecar proxy injection</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;injectedAnnotations&quot;:{&quot;test/istio-init&quot;:&quot;runtime/default2&quot;,&quot;test/istio-proxy&quot;:&quot;runtime/default&quot;},&quot;replicaCount&quot;:2,&quot;nodeSelector&quot;:{&quot;beta.kubernetes.io/os&quot;:&quot;linux&quot;}}</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class WebAssemblyFilterDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
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

            private Builder() {
            } 

            private Builder(WebAssemblyFilterDeployment model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Indicates whether WebAssembly Filter is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class MeshConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLog")
        private AccessLog accessLog;

        @com.aliyun.core.annotation.NameInMap("Audit")
        private Audit audit;

        @com.aliyun.core.annotation.NameInMap("ControlPlaneLogInfo")
        private ControlPlaneLogInfo controlPlaneLogInfo;

        @com.aliyun.core.annotation.NameInMap("CustomizedZipkin")
        private Boolean customizedZipkin;

        @com.aliyun.core.annotation.NameInMap("Edition")
        private Edition edition;

        @com.aliyun.core.annotation.NameInMap("EnableLocalityLB")
        private Boolean enableLocalityLB;

        @com.aliyun.core.annotation.NameInMap("ExcludeIPRanges")
        private String excludeIPRanges;

        @com.aliyun.core.annotation.NameInMap("ExcludeInboundPorts")
        private String excludeInboundPorts;

        @com.aliyun.core.annotation.NameInMap("ExcludeOutboundPorts")
        private String excludeOutboundPorts;

        @com.aliyun.core.annotation.NameInMap("ExtraConfiguration")
        private ExtraConfiguration extraConfiguration;

        @com.aliyun.core.annotation.NameInMap("IncludeIPRanges")
        private String includeIPRanges;

        @com.aliyun.core.annotation.NameInMap("K8sNewAPIsSupport")
        private K8sNewAPIsSupport k8sNewAPIsSupport;

        @com.aliyun.core.annotation.NameInMap("Kiali")
        private Kiali kiali;

        @com.aliyun.core.annotation.NameInMap("LocalityLB")
        private LocalityLB localityLB;

        @com.aliyun.core.annotation.NameInMap("MSE")
        private MSE MSE;

        @com.aliyun.core.annotation.NameInMap("OPA")
        private OPA OPA;

        @com.aliyun.core.annotation.NameInMap("OutboundTrafficPolicy")
        private String outboundTrafficPolicy;

        @com.aliyun.core.annotation.NameInMap("Pilot")
        private Pilot pilot;

        @com.aliyun.core.annotation.NameInMap("Prometheus")
        private Prometheus prometheus;

        @com.aliyun.core.annotation.NameInMap("ProtocolSupport")
        private ProtocolSupport protocolSupport;

        @com.aliyun.core.annotation.NameInMap("Proxy")
        private Proxy proxy;

        @com.aliyun.core.annotation.NameInMap("SidecarInjector")
        private SidecarInjector sidecarInjector;

        @com.aliyun.core.annotation.NameInMap("Telemetry")
        private Boolean telemetry;

        @com.aliyun.core.annotation.NameInMap("Tracing")
        private Boolean tracing;

        @com.aliyun.core.annotation.NameInMap("WebAssemblyFilterDeployment")
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

            private Builder() {
            } 

            private Builder(MeshConfig model) {
                this.accessLog = model.accessLog;
                this.audit = model.audit;
                this.controlPlaneLogInfo = model.controlPlaneLogInfo;
                this.customizedZipkin = model.customizedZipkin;
                this.edition = model.edition;
                this.enableLocalityLB = model.enableLocalityLB;
                this.excludeIPRanges = model.excludeIPRanges;
                this.excludeInboundPorts = model.excludeInboundPorts;
                this.excludeOutboundPorts = model.excludeOutboundPorts;
                this.extraConfiguration = model.extraConfiguration;
                this.includeIPRanges = model.includeIPRanges;
                this.k8sNewAPIsSupport = model.k8sNewAPIsSupport;
                this.kiali = model.kiali;
                this.localityLB = model.localityLB;
                this.MSE = model.MSE;
                this.OPA = model.OPA;
                this.outboundTrafficPolicy = model.outboundTrafficPolicy;
                this.pilot = model.pilot;
                this.prometheus = model.prometheus;
                this.protocolSupport = model.protocolSupport;
                this.proxy = model.proxy;
                this.sidecarInjector = model.sidecarInjector;
                this.telemetry = model.telemetry;
                this.tracing = model.tracing;
                this.webAssemblyFilterDeployment = model.webAssemblyFilterDeployment;
            } 

            /**
             * <p>The configurations of access log collection.</p>
             */
            public Builder accessLog(AccessLog accessLog) {
                this.accessLog = accessLog;
                return this;
            }

            /**
             * <p>The information about mesh audit.</p>
             */
            public Builder audit(Audit audit) {
                this.audit = audit;
                return this;
            }

            /**
             * <p>The configurations of control-plane log collection.</p>
             */
            public Builder controlPlaneLogInfo(ControlPlaneLogInfo controlPlaneLogInfo) {
                this.controlPlaneLogInfo = controlPlaneLogInfo;
                return this;
            }

            /**
             * <p>Indicates whether a custom Zipkin system is used. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder customizedZipkin(Boolean customizedZipkin) {
                this.customizedZipkin = customizedZipkin;
                return this;
            }

            /**
             * <p>The information about the edition.</p>
             */
            public Builder edition(Edition edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>Indicates whether the feature that routes traffic to the nearest instance is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableLocalityLB(Boolean enableLocalityLB) {
                this.enableLocalityLB = enableLocalityLB;
                return this;
            }

            /**
             * <p>The IP ranges in CIDR form to be excluded from redirection to sidecar proxies in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0</p>
             */
            public Builder excludeIPRanges(String excludeIPRanges) {
                this.excludeIPRanges = excludeIPRanges;
                return this;
            }

            /**
             * <p>The inbound ports to be excluded from redirection to sidecar proxies in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80,81</p>
             */
            public Builder excludeInboundPorts(String excludeInboundPorts) {
                this.excludeInboundPorts = excludeInboundPorts;
                return this;
            }

            /**
             * <p>The outbound ports to be excluded from redirection to sidecar proxies in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80,81</p>
             */
            public Builder excludeOutboundPorts(String excludeOutboundPorts) {
                this.excludeOutboundPorts = excludeOutboundPorts;
                return this;
            }

            /**
             * <p>The configurations of additional features for the ASM instance.</p>
             */
            public Builder extraConfiguration(ExtraConfiguration extraConfiguration) {
                this.extraConfiguration = extraConfiguration;
                return this;
            }

            /**
             * <p>The IP ranges in CIDR form to redirect to the sidecar proxies in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder includeIPRanges(String includeIPRanges) {
                this.includeIPRanges = includeIPRanges;
                return this;
            }

            /**
             * <p>The information about the Kubernetes API.</p>
             */
            public Builder k8sNewAPIsSupport(K8sNewAPIsSupport k8sNewAPIsSupport) {
                this.k8sNewAPIsSupport = k8sNewAPIsSupport;
                return this;
            }

            /**
             * <p>The configurations of mesh topology.</p>
             */
            public Builder kiali(Kiali kiali) {
                this.kiali = kiali;
                return this;
            }

            /**
             * <p>The configurations of cross-region load balancing.</p>
             */
            public Builder localityLB(LocalityLB localityLB) {
                this.localityLB = localityLB;
                return this;
            }

            /**
             * <p>The configurations of Microservices Engine (MSE).</p>
             */
            public Builder MSE(MSE MSE) {
                this.MSE = MSE;
                return this;
            }

            /**
             * <p>The information about the Open Policy Agent (OPA) plug-in.</p>
             */
            public Builder OPA(OPA OPA) {
                this.OPA = OPA;
                return this;
            }

            /**
             * <p>The outbound traffic policy. Valid values:</p>
             * <ul>
             * <li><code>ALLOW_ANY</code>: Outbound traffic to all external services is allowed.</li>
             * <li><code>REGISTRY_ONLY</code>: Outbound traffic is allowed to only external services that are defined in the service registry of the ASM instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALLOW_ANY</p>
             */
            public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
                this.outboundTrafficPolicy = outboundTrafficPolicy;
                return this;
            }

            /**
             * <p>The Pilot configurations.</p>
             */
            public Builder pilot(Pilot pilot) {
                this.pilot = pilot;
                return this;
            }

            /**
             * <p>The configurations of Prometheus monitoring.</p>
             */
            public Builder prometheus(Prometheus prometheus) {
                this.prometheus = prometheus;
                return this;
            }

            /**
             * <p>The configurations of protocol support.</p>
             */
            public Builder protocolSupport(ProtocolSupport protocolSupport) {
                this.protocolSupport = protocolSupport;
                return this;
            }

            /**
             * <p>The proxy configurations.</p>
             */
            public Builder proxy(Proxy proxy) {
                this.proxy = proxy;
                return this;
            }

            /**
             * <p>The configurations of the sidecar injector.</p>
             */
            public Builder sidecarInjector(SidecarInjector sidecarInjector) {
                this.sidecarInjector = sidecarInjector;
                return this;
            }

            /**
             * <p>Indicates whether Prometheus monitoring is enabled. We recommend that you use <a href="https://arms.console.aliyun.com/">Managed Service for Prometheus</a>. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder telemetry(Boolean telemetry) {
                this.telemetry = telemetry;
                return this;
            }

            /**
             * <p>Indicates whether tracing analysis is enabled. This feature can be enabled only after <a href="https://tracing-analysis.console.aliyun.com/">Managed Service for OpenTelemetry</a> is activated. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracing(Boolean tracing) {
                this.tracing = tracing;
                return this;
            }

            /**
             * <p>The configurations of WebAssembly Filter.</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List<String> vSwitches;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<String> getVSwitches() {
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
            private java.util.List<String> vSwitches; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitches = model.vSwitches;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze384sxttxbctnj****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The virtual switches (vSwitches).</p>
             */
            public Builder vSwitches(java.util.List<String> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zew0rajjkmxy2369****</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancer")
        private LoadBalancer loadBalancer;

        @com.aliyun.core.annotation.NameInMap("MeshConfig")
        private MeshConfig meshConfig;

        @com.aliyun.core.annotation.NameInMap("Network")
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

            private Builder() {
            } 

            private Builder(Spec model) {
                this.loadBalancer = model.loadBalancer;
                this.meshConfig = model.meshConfig;
                this.network = model.network;
            } 

            /**
             * <p>The information about the load balancer.</p>
             */
            public Builder loadBalancer(LoadBalancer loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            /**
             * <p>The configurations of the ASM instance.</p>
             */
            public Builder meshConfig(MeshConfig meshConfig) {
                this.meshConfig = meshConfig;
                return this;
            }

            /**
             * <p>The network configurations of the ASM instance.</p>
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
    /**
     * 
     * {@link DescribeServiceMeshDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshDetailResponseBody</p>
     */
    public static class ServiceMesh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSpec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("Clusters")
        private java.util.List<String> clusters;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("ServiceMeshInfo")
        private ServiceMeshInfo serviceMeshInfo;

        @com.aliyun.core.annotation.NameInMap("Spec")
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
        public java.util.List<String> getClusters() {
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
            private java.util.List<String> clusters; 
            private Endpoints endpoints; 
            private String ownerId; 
            private String ownerType; 
            private ServiceMeshInfo serviceMeshInfo; 
            private Spec spec; 

            private Builder() {
            } 

            private Builder(ServiceMesh model) {
                this.clusterSpec = model.clusterSpec;
                this.clusters = model.clusters;
                this.endpoints = model.endpoints;
                this.ownerId = model.ownerId;
                this.ownerType = model.ownerType;
                this.serviceMeshInfo = model.serviceMeshInfo;
                this.spec = model.spec;
            } 

            /**
             * <p>The specification of the ASM instance. Valid values:</p>
             * <ul>
             * <li><code>standard</code>: Standard Edition</li>
             * <li><code>enterprise</code>: Enterprise Edition</li>
             * <li><code>ultimate</code>: Ultimate Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * <p>The clusters.</p>
             */
            public Builder clusters(java.util.List<String> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * <p>The endpoints of the ASM instance.</p>
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud service instance for which the ASM instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cc3e96f249d124eb38b72718ec5*****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service for which the ASM instance is created. Valid values:</p>
             * <ul>
             * <li><code>ackone</code>: The ASM instance is created for Alibaba Cloud Distributed Cloud Container Platform (ACK One).</li>
             * <li>An empty value indicates that the ASM instance is created by the user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ackone</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The basic information about the ASM instance.</p>
             */
            public Builder serviceMeshInfo(ServiceMeshInfo serviceMeshInfo) {
                this.serviceMeshInfo = serviceMeshInfo;
                return this;
            }

            /**
             * <p>The specifications of the ASM instance.</p>
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
