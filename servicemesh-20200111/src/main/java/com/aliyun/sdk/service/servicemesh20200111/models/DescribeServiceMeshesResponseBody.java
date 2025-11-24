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
 * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshesResponseBody</p>
 */
public class DescribeServiceMeshesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceMeshes")
    private java.util.List<ServiceMeshes> serviceMeshes;

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
     * @return serviceMeshes
     */
    public java.util.List<ServiceMeshes> getServiceMeshes() {
        return this.serviceMeshes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ServiceMeshes> serviceMeshes; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshesResponseBody model) {
            this.requestId = model.requestId;
            this.serviceMeshes = model.serviceMeshes;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the ASM instance.</p>
         */
        public Builder serviceMeshes(java.util.List<ServiceMeshes> serviceMeshes) {
            this.serviceMeshes = serviceMeshes;
            return this;
        }

        public DescribeServiceMeshesResponseBody build() {
            return new DescribeServiceMeshesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntranetApiServerEndpoint")
        private String intranetApiServerEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetPilotEndpoint")
        private String intranetPilotEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicApiServerEndpoint")
        private String publicApiServerEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicPilotEndpoint")
        private String publicPilotEndpoint;

        @com.aliyun.core.annotation.NameInMap("ReverseTunnelEndpoint")
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

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.intranetApiServerEndpoint = model.intranetApiServerEndpoint;
                this.intranetPilotEndpoint = model.intranetPilotEndpoint;
                this.publicApiServerEndpoint = model.publicApiServerEndpoint;
                this.publicPilotEndpoint = model.publicPilotEndpoint;
                this.reverseTunnelEndpoint = model.reverseTunnelEndpoint;
            } 

            /**
             * <p>The endpoint that is used to access the API server over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://192.168.xx.xx:6443">https://192.168.xx.xx:6443</a></p>
             */
            public Builder intranetApiServerEndpoint(String intranetApiServerEndpoint) {
                this.intranetApiServerEndpoint = intranetApiServerEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to access Istio Pilot from the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx:15011</p>
             */
            public Builder intranetPilotEndpoint(String intranetPilotEndpoint) {
                this.intranetPilotEndpoint = intranetPilotEndpoint;
                return this;
            }

            /**
             * <p>The endpoint that is used to access the API server over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://123.56.xx.xx:6443">https://123.56.xx.xx:6443</a></p>
             */
            public Builder publicApiServerEndpoint(String publicApiServerEndpoint) {
                this.publicApiServerEndpoint = publicApiServerEndpoint;
                return this;
            }

            /**
             * <p>The public endpoint of the Pilot of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder publicPilotEndpoint(String publicPilotEndpoint) {
                this.publicPilotEndpoint = publicPilotEndpoint;
                return this;
            }

            /**
             * <p>The endpoint of the reverse tunnel (Deprecated).</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
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
    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
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
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The edition of the ASM instance before ASM is available for commercial use. Valid values:</p>
             * <ul>
             * <li><code>Pro</code>: Professional Edition</li>
             * <li><code>Default</code>: Standard Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pro</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The region ID of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cb8963379255149cb98c8686f274x****</p>
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * <p>The state of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the ASM instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-21T09:42:20+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class LoadBalancer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiServerLoadbalancerId")
        private String apiServerLoadbalancerId;

        @com.aliyun.core.annotation.NameInMap("ApiServerPublicEip")
        private Boolean apiServerPublicEip;

        @com.aliyun.core.annotation.NameInMap("PilotPublicEip")
        private Boolean pilotPublicEip;

        @com.aliyun.core.annotation.NameInMap("PilotPublicLoadbalancerId")
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

            private Builder() {
            } 

            private Builder(LoadBalancer model) {
                this.apiServerLoadbalancerId = model.apiServerLoadbalancerId;
                this.apiServerPublicEip = model.apiServerPublicEip;
                this.pilotPublicEip = model.pilotPublicEip;
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
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
             * <p>The ID of the ASM Playground scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>ewmaLb</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class ExtraConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Playground")
        private Playground playground;

        private ExtraConfiguration(Builder builder) {
            this.playground = builder.playground;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraConfiguration create() {
            return builder().build();
        }

        /**
         * @return playground
         */
        public Playground getPlayground() {
            return this.playground;
        }

        public static final class Builder {
            private Playground playground; 

            private Builder() {
            } 

            private Builder(ExtraConfiguration model) {
                this.playground = model.playground;
            } 

            /**
             * <p>The configurations of the ASM Playground (valid only for ASM Playground instances).</p>
             */
            public Builder playground(Playground playground) {
                this.playground = playground;
                return this;
            }

            public ExtraConfiguration build() {
                return new ExtraConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class Pilot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Http10Enabled")
        private Boolean http10Enabled;

        @com.aliyun.core.annotation.NameInMap("TraceSampling")
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

            private Builder() {
            } 

            private Builder(Pilot model) {
                this.http10Enabled = model.http10Enabled;
                this.traceSampling = model.traceSampling;
            } 

            /**
             * <p>Indicates whether the support for HTTP 1.0 is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder http10Enabled(Boolean http10Enabled) {
                this.http10Enabled = http10Enabled;
                return this;
            }

            /**
             * <p>The sampling rate when Managed Service for OpenTelemetry is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
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
             * <p>Indicates whether elevated privileges are required for the istio-init container when you perform traffic redirection for the istio-proxy container. Valid values:</p>
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
             * <p>The namespaces in which the CNI plug-in does not check the pods.</p>
             * 
             * <strong>example:</strong>
             * <p>default,foo</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class SidecarInjector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoInjectionPolicyEnabled")
        private Boolean autoInjectionPolicyEnabled;

        @com.aliyun.core.annotation.NameInMap("EnableNamespacesByDefault")
        private Boolean enableNamespacesByDefault;

        @com.aliyun.core.annotation.NameInMap("InitCNIConfiguration")
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

            private Builder() {
            } 

            private Builder(SidecarInjector model) {
                this.autoInjectionPolicyEnabled = model.autoInjectionPolicyEnabled;
                this.enableNamespacesByDefault = model.enableNamespacesByDefault;
                this.initCNIConfiguration = model.initCNIConfiguration;
            } 

            /**
             * <p>Indicates whether automatic sidecar proxy injection is enabled by using annotations.</p>
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
             * <p>The initial configurations of Container Network Interface (CNI).</p>
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
    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class MeshConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraConfiguration")
        private ExtraConfiguration extraConfiguration;

        @com.aliyun.core.annotation.NameInMap("Mtls")
        private Boolean mtls;

        @com.aliyun.core.annotation.NameInMap("OutboundTrafficPolicy")
        private String outboundTrafficPolicy;

        @com.aliyun.core.annotation.NameInMap("Pilot")
        private Pilot pilot;

        @com.aliyun.core.annotation.NameInMap("SidecarInjector")
        private SidecarInjector sidecarInjector;

        @com.aliyun.core.annotation.NameInMap("StrictMtls")
        private Boolean strictMtls;

        @com.aliyun.core.annotation.NameInMap("Telemetry")
        private Boolean telemetry;

        @com.aliyun.core.annotation.NameInMap("Tracing")
        private Boolean tracing;

        private MeshConfig(Builder builder) {
            this.extraConfiguration = builder.extraConfiguration;
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
         * @return extraConfiguration
         */
        public ExtraConfiguration getExtraConfiguration() {
            return this.extraConfiguration;
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
            private ExtraConfiguration extraConfiguration; 
            private Boolean mtls; 
            private String outboundTrafficPolicy; 
            private Pilot pilot; 
            private SidecarInjector sidecarInjector; 
            private Boolean strictMtls; 
            private Boolean telemetry; 
            private Boolean tracing; 

            private Builder() {
            } 

            private Builder(MeshConfig model) {
                this.extraConfiguration = model.extraConfiguration;
                this.mtls = model.mtls;
                this.outboundTrafficPolicy = model.outboundTrafficPolicy;
                this.pilot = model.pilot;
                this.sidecarInjector = model.sidecarInjector;
                this.strictMtls = model.strictMtls;
                this.telemetry = model.telemetry;
                this.tracing = model.tracing;
            } 

            /**
             * <p>The extended configurations of the ASM instance.</p>
             */
            public Builder extraConfiguration(ExtraConfiguration extraConfiguration) {
                this.extraConfiguration = extraConfiguration;
                return this;
            }

            /**
             * <p>Indicates whether nearby access is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mtls(Boolean mtls) {
                this.mtls = mtls;
                return this;
            }

            /**
             * <p>The outbound traffic policy. Valid values:</p>
             * <ul>
             * <li><code>ALLOW_ANY</code>: Outbound traffic to an external service is allowed.</li>
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
             * <p>The configurations of the control plane.</p>
             */
            public Builder pilot(Pilot pilot) {
                this.pilot = pilot;
                return this;
            }

            /**
             * <p>The configurations of sidecar proxy injection.</p>
             */
            public Builder sidecarInjector(SidecarInjector sidecarInjector) {
                this.sidecarInjector = sidecarInjector;
                return this;
            }

            /**
             * <p>Indicates whether mutual Transport Layer Security (mTLS) is strictly enforced.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder strictMtls(Boolean strictMtls) {
                this.strictMtls = strictMtls;
                return this;
            }

            /**
             * <p>Indicates whether Prometheus monitoring is enabled. We recommend that you use Managed Service for Prometheus. Valid values:</p>
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
             * <p>Indicates whether the tracing feature is enabled. This feature can be enabled only after Managed Service for OpenTelemetry is activated. Valid values:</p>
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

            public MeshConfig build() {
                return new MeshConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
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
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze384sxttxbctnj****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches.</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
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
             * <p>The information about load balancing.</p>
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
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>yahaha</p>
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
    /**
     * 
     * {@link DescribeServiceMeshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshesResponseBody</p>
     */
    public static class ServiceMeshes extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        @com.aliyun.core.annotation.NameInMap("Upgradable")
        private Boolean upgradable;

        private ServiceMeshes(Builder builder) {
            this.clusterSpec = builder.clusterSpec;
            this.clusters = builder.clusters;
            this.endpoints = builder.endpoints;
            this.ownerId = builder.ownerId;
            this.ownerType = builder.ownerType;
            this.serviceMeshInfo = builder.serviceMeshInfo;
            this.spec = builder.spec;
            this.tag = builder.tag;
            this.upgradable = builder.upgradable;
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

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        /**
         * @return upgradable
         */
        public Boolean getUpgradable() {
            return this.upgradable;
        }

        public static final class Builder {
            private String clusterSpec; 
            private java.util.List<String> clusters; 
            private Endpoints endpoints; 
            private String ownerId; 
            private String ownerType; 
            private ServiceMeshInfo serviceMeshInfo; 
            private Spec spec; 
            private java.util.List<Tag> tag; 
            private Boolean upgradable; 

            private Builder() {
            } 

            private Builder(ServiceMeshes model) {
                this.clusterSpec = model.clusterSpec;
                this.clusters = model.clusters;
                this.endpoints = model.endpoints;
                this.ownerId = model.ownerId;
                this.ownerType = model.ownerType;
                this.serviceMeshInfo = model.serviceMeshInfo;
                this.spec = model.spec;
                this.tag = model.tag;
                this.upgradable = model.upgradable;
            } 

            /**
             * <p>The edition of the ASM instance. Valid values:</p>
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
             * <p>The information about all endpoints of the ASM instance.</p>
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
             * <p>The basic information about the ASM instances.</p>
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

            /**
             * <p>The details about the tags.</p>
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Indicates whether the ASM instance can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder upgradable(Boolean upgradable) {
                this.upgradable = upgradable;
                return this;
            }

            public ServiceMeshes build() {
                return new ServiceMeshes(this);
            } 

        } 

    }
}
