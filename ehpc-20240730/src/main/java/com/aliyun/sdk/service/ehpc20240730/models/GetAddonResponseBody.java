// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAddonResponseBody} extends {@link TeaModel}
 *
 * <p>GetAddonResponseBody</p>
 */
public class GetAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addon")
    private Addon addon;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAddonResponseBody(Builder builder) {
        this.addon = builder.addon;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonResponseBody create() {
        return builder().build();
    }

    /**
     * @return addon
     */
    public Addon getAddon() {
        return this.addon;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Addon addon; 
        private String requestId; 

        /**
         * Addon.
         */
        public Builder addon(Addon addon) {
            this.addon = addon;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAddonResponseBody build() {
            return new GetAddonResponseBody(this);
        } 

    } 

    public static class EipResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreate")
        private Boolean autoCreate;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private String eipAddress;

        @com.aliyun.core.annotation.NameInMap("EipInstanceId")
        private String eipInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        private EipResource(Builder builder) {
            this.autoCreate = builder.autoCreate;
            this.bandwidth = builder.bandwidth;
            this.eipAddress = builder.eipAddress;
            this.eipInstanceId = builder.eipInstanceId;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipResource create() {
            return builder().build();
        }

        /**
         * @return autoCreate
         */
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return eipAddress
         */
        public String getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return eipInstanceId
         */
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public static final class Builder {
            private Boolean autoCreate; 
            private String bandwidth; 
            private String eipAddress; 
            private String eipInstanceId; 
            private String instanceChargeType; 
            private String internetChargeType; 

            /**
             * AutoCreate.
             */
            public Builder autoCreate(Boolean autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * EipAddress.
             */
            public Builder eipAddress(String eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * EipInstanceId.
             */
            public Builder eipInstanceId(String eipInstanceId) {
                this.eipInstanceId = eipInstanceId;
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
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            public EipResource build() {
                return new EipResource(this);
            } 

        } 

    }
    public static class ResourcesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsResources")
        private java.util.List < AddonNodeTemplate > ecsResources;

        @com.aliyun.core.annotation.NameInMap("EipResource")
        private EipResource eipResource;

        private ResourcesSpec(Builder builder) {
            this.ecsResources = builder.ecsResources;
            this.eipResource = builder.eipResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesSpec create() {
            return builder().build();
        }

        /**
         * @return ecsResources
         */
        public java.util.List < AddonNodeTemplate > getEcsResources() {
            return this.ecsResources;
        }

        /**
         * @return eipResource
         */
        public EipResource getEipResource() {
            return this.eipResource;
        }

        public static final class Builder {
            private java.util.List < AddonNodeTemplate > ecsResources; 
            private EipResource eipResource; 

            /**
             * EcsResources.
             */
            public Builder ecsResources(java.util.List < AddonNodeTemplate > ecsResources) {
                this.ecsResources = ecsResources;
                return this;
            }

            /**
             * EipResource.
             */
            public Builder eipResource(EipResource eipResource) {
                this.eipResource = eipResource;
                return this;
            }

            public ResourcesSpec build() {
                return new ResourcesSpec(this);
            } 

        } 

    }
    public static class InputParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HelpText")
        private String helpText;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private InputParams(Builder builder) {
            this.helpText = builder.helpText;
            this.label = builder.label;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParams create() {
            return builder().build();
        }

        /**
         * @return helpText
         */
        public String getHelpText() {
            return this.helpText;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String helpText; 
            private String label; 
            private String name; 
            private String type; 
            private String value; 

            /**
             * HelpText.
             */
            public Builder helpText(String helpText) {
                this.helpText = helpText;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InputParams build() {
                return new InputParams(this);
            } 

        } 

    }
    public static class NetworkACL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float port;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceCidrIp;

        private NetworkACL(Builder builder) {
            this.ipProtocol = builder.ipProtocol;
            this.port = builder.port;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkACL create() {
            return builder().build();
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return port
         */
        public Float getPort() {
            return this.port;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String ipProtocol; 
            private Float port; 
            private String sourceCidrIp; 

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Float port) {
                this.port = port;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public NetworkACL build() {
                return new NetworkACL(this);
            } 

        } 

    }
    public static class ServicesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputParams")
        private java.util.List < InputParams> inputParams;

        @com.aliyun.core.annotation.NameInMap("NetworkACL")
        private java.util.List < NetworkACL> networkACL;

        @com.aliyun.core.annotation.NameInMap("ServiceAccessType")
        private String serviceAccessType;

        @com.aliyun.core.annotation.NameInMap("ServiceAccessUrl")
        private String serviceAccessUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serviceName;

        private ServicesSpec(Builder builder) {
            this.inputParams = builder.inputParams;
            this.networkACL = builder.networkACL;
            this.serviceAccessType = builder.serviceAccessType;
            this.serviceAccessUrl = builder.serviceAccessUrl;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicesSpec create() {
            return builder().build();
        }

        /**
         * @return inputParams
         */
        public java.util.List < InputParams> getInputParams() {
            return this.inputParams;
        }

        /**
         * @return networkACL
         */
        public java.util.List < NetworkACL> getNetworkACL() {
            return this.networkACL;
        }

        /**
         * @return serviceAccessType
         */
        public String getServiceAccessType() {
            return this.serviceAccessType;
        }

        /**
         * @return serviceAccessUrl
         */
        public String getServiceAccessUrl() {
            return this.serviceAccessUrl;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < InputParams> inputParams; 
            private java.util.List < NetworkACL> networkACL; 
            private String serviceAccessType; 
            private String serviceAccessUrl; 
            private String serviceName; 

            /**
             * InputParams.
             */
            public Builder inputParams(java.util.List < InputParams> inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * NetworkACL.
             */
            public Builder networkACL(java.util.List < NetworkACL> networkACL) {
                this.networkACL = networkACL;
                return this;
            }

            /**
             * ServiceAccessType.
             */
            public Builder serviceAccessType(String serviceAccessType) {
                this.serviceAccessType = serviceAccessType;
                return this;
            }

            /**
             * ServiceAccessUrl.
             */
            public Builder serviceAccessUrl(String serviceAccessUrl) {
                this.serviceAccessUrl = serviceAccessUrl;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServicesSpec build() {
                return new ServicesSpec(this);
            } 

        } 

    }
    public static class Addon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String addonId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private String installTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
        private ResourcesSpec resourcesSpec;

        @com.aliyun.core.annotation.NameInMap("ServicesSpec")
        private java.util.List < ServicesSpec> servicesSpec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private Addon(Builder builder) {
            this.addonId = builder.addonId;
            this.description = builder.description;
            this.icon = builder.icon;
            this.installTime = builder.installTime;
            this.label = builder.label;
            this.name = builder.name;
            this.resourcesSpec = builder.resourcesSpec;
            this.servicesSpec = builder.servicesSpec;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addon create() {
            return builder().build();
        }

        /**
         * @return addonId
         */
        public String getAddonId() {
            return this.addonId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return installTime
         */
        public String getInstallTime() {
            return this.installTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourcesSpec
         */
        public ResourcesSpec getResourcesSpec() {
            return this.resourcesSpec;
        }

        /**
         * @return servicesSpec
         */
        public java.util.List < ServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String addonId; 
            private String description; 
            private String icon; 
            private String installTime; 
            private String label; 
            private String name; 
            private ResourcesSpec resourcesSpec; 
            private java.util.List < ServicesSpec> servicesSpec; 
            private String status; 
            private String version; 

            /**
             * AddonId.
             */
            public Builder addonId(String addonId) {
                this.addonId = addonId;
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
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * InstallTime.
             */
            public Builder installTime(String installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * ResourcesSpec.
             */
            public Builder resourcesSpec(ResourcesSpec resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * ServicesSpec.
             */
            public Builder servicesSpec(java.util.List < ServicesSpec> servicesSpec) {
                this.servicesSpec = servicesSpec;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Addon build() {
                return new Addon(this);
            } 

        } 

    }
}
