// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonTemplateResponseBody</p>
 */
public class DescribeAddonTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addon")
    private Addon addon;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAddonTemplateResponseBody(Builder builder) {
        this.addon = builder.addon;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return addon
     */
    public Addon getAddon() {
        return this.addon;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Addon addon; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details of the addon template.</p>
         */
        public Builder addon(Addon addon) {
            this.addon = addon;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAddonTemplateResponseBody build() {
            return new DescribeAddonTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
    public static class EipResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreate")
        private Boolean autoCreate;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("EipInstanceId")
        private String eipInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        private EipResource(Builder builder) {
            this.autoCreate = builder.autoCreate;
            this.bandwidth = builder.bandwidth;
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
            private String eipInstanceId; 
            private String instanceChargeType; 
            private String internetChargeType; 

            /**
             * <p>Indicates whether the EIP is automatically created.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder autoCreate(Boolean autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The EIP ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1jwtsuoiif2qf90****</p>
             */
            public Builder eipInstanceId(String eipInstanceId) {
                this.eipInstanceId = eipInstanceId;
                return this;
            }

            /**
             * <p>The billing method of the EIP. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go.</li>
             * <li>PrePaid: subscription.</li>
             * </ul>
             * <p>Default value: PostPaid</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The metering method of the EIP. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: pay by bandwidth.</li>
             * <li>PayByTraffic: pay by data transfer.</li>
             * </ul>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
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
    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
    public static class ResourcesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsResources")
        private java.util.List<AddonNodeTemplate> ecsResources;

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
        public java.util.List<AddonNodeTemplate> getEcsResources() {
            return this.ecsResources;
        }

        /**
         * @return eipResource
         */
        public EipResource getEipResource() {
            return this.eipResource;
        }

        public static final class Builder {
            private java.util.List<AddonNodeTemplate> ecsResources; 
            private EipResource eipResource; 

            /**
             * <p>The Elastic Compute Service (ECS) resource configurations of the addon.</p>
             */
            public Builder ecsResources(java.util.List<AddonNodeTemplate> ecsResources) {
                this.ecsResources = ecsResources;
                return this;
            }

            /**
             * <p>The Elastic IP Address (EIP) configurations of the service.</p>
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
    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
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
             * <p>The help information of the parameter.</p>
             */
            public Builder helpText(String helpText) {
                this.helpText = helpText;
                return this;
            }

            /**
             * <p>The parameter label.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL_HOME</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>usr/local/mysql</p>
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
    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
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
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong>: forwards TCP packets.</li>
             * <li><strong>UDP</strong>: forwards UDP packets.</li>
             * <li><strong>Any</strong>: forwards all packets.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The port number.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Float port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The source CIDR block.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/12</p>
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
    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
    public static class ServicesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputParams")
        private java.util.List<InputParams> inputParams;

        @com.aliyun.core.annotation.NameInMap("NetworkACL")
        private java.util.List<NetworkACL> networkACL;

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
        public java.util.List<InputParams> getInputParams() {
            return this.inputParams;
        }

        /**
         * @return networkACL
         */
        public java.util.List<NetworkACL> getNetworkACL() {
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
            private java.util.List<InputParams> inputParams; 
            private java.util.List<NetworkACL> networkACL; 
            private String serviceAccessType; 
            private String serviceAccessUrl; 
            private String serviceName; 

            /**
             * <p>The parameter configurations of the service.</p>
             */
            public Builder inputParams(java.util.List<InputParams> inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * <p>The security group configurations of the service.</p>
             */
            public Builder networkACL(java.util.List<NetworkACL> networkACL) {
                this.networkACL = networkACL;
                return this;
            }

            /**
             * <p>The service access type.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder serviceAccessType(String serviceAccessType) {
                this.serviceAccessType = serviceAccessType;
                return this;
            }

            /**
             * <p>The service access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://47.96.xx.xx:12008">https://47.96.xx.xx:12008</a></p>
             */
            public Builder serviceAccessUrl(String serviceAccessUrl) {
                this.serviceAccessUrl = serviceAccessUrl;
                return this;
            }

            /**
             * <p>The service name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Web Portal</p>
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
    /**
     * 
     * {@link DescribeAddonTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonTemplateResponseBody</p>
     */
    public static class Addon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LastUpdate")
        private String lastUpdate;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
        private ResourcesSpec resourcesSpec;

        @com.aliyun.core.annotation.NameInMap("ServicesSpec")
        private java.util.List<ServicesSpec> servicesSpec;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private Addon(Builder builder) {
            this.description = builder.description;
            this.icon = builder.icon;
            this.label = builder.label;
            this.lastUpdate = builder.lastUpdate;
            this.name = builder.name;
            this.resourcesSpec = builder.resourcesSpec;
            this.servicesSpec = builder.servicesSpec;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addon create() {
            return builder().build();
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
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return lastUpdate
         */
        public String getLastUpdate() {
            return this.lastUpdate;
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
        public java.util.List<ServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String icon; 
            private String label; 
            private String lastUpdate; 
            private String name; 
            private ResourcesSpec resourcesSpec; 
            private java.util.List<ServicesSpec> servicesSpec; 
            private String version; 

            /**
             * <p>The addon description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The addon icon.</p>
             * 
             * <strong>example:</strong>
             * <p>/assets/icons/your_icon.svg</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The addon label.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The date when the addon template was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22 18:11:17</p>
             */
            public Builder lastUpdate(String lastUpdate) {
                this.lastUpdate = lastUpdate;
                return this;
            }

            /**
             * <p>The addon name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Login</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource configurations of the addon.</p>
             */
            public Builder resourcesSpec(ResourcesSpec resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * <p>The addon configurations.</p>
             */
            public Builder servicesSpec(java.util.List<ServicesSpec> servicesSpec) {
                this.servicesSpec = servicesSpec;
                return this;
            }

            /**
             * <p>The addon version.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
