// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateGatewayLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayLoadBalancerRequest</p>
 */
public class UpdateGatewayLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("loadBalancerDTO")
    private LoadBalancerDTO loadBalancerDTO;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("option")
    private String option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ports")
    private java.util.List<Ports> ports;

    private UpdateGatewayLoadBalancerRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.loadBalancerDTO = builder.loadBalancerDTO;
        this.option = builder.option;
        this.ports = builder.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayLoadBalancerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return loadBalancerDTO
     */
    public LoadBalancerDTO getLoadBalancerDTO() {
        return this.loadBalancerDTO;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayLoadBalancerRequest, Builder> {
        private String gatewayId; 
        private LoadBalancerDTO loadBalancerDTO; 
        private String option; 
        private java.util.List<Ports> ports; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayLoadBalancerRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.loadBalancerDTO = request.loadBalancerDTO;
            this.option = request.option;
            this.ports = request.ports;
        } 

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The load balancer operation DTO.</p>
         */
        public Builder loadBalancerDTO(LoadBalancerDTO loadBalancerDTO) {
            this.putBodyParameter("loadBalancerDTO", loadBalancerDTO);
            this.loadBalancerDTO = loadBalancerDTO;
            return this;
        }

        /**
         * <p>The operation type. If this parameter is left empty or not specified, only the listening ports are updated (only the ports field is used).</p>
         * 
         * <strong>example:</strong>
         * <p>Add</p>
         */
        public Builder option(String option) {
            this.putBodyParameter("option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>The port list.</p>
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.putBodyParameter("ports", ports);
            this.ports = ports;
            return this;
        }

        @Override
        public UpdateGatewayLoadBalancerRequest build() {
            return new UpdateGatewayLoadBalancerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerRequest</p>
     */
    public static class VirtualServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupId")
        private String virtualServiceGroupId;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupName")
        private String virtualServiceGroupName;

        private VirtualServiceList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.virtualServiceGroupId = builder.virtualServiceGroupId;
            this.virtualServiceGroupName = builder.virtualServiceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualServiceList create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return virtualServiceGroupId
         */
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        /**
         * @return virtualServiceGroupName
         */
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

        public static final class Builder {
            private Long port; 
            private String protocol; 
            private String virtualServiceGroupId; 
            private String virtualServiceGroupName; 

            private Builder() {
            } 

            private Builder(VirtualServiceList model) {
                this.port = model.port;
                this.protocol = model.protocol;
                this.virtualServiceGroupId = model.virtualServiceGroupId;
                this.virtualServiceGroupName = model.virtualServiceGroupName;
            } 

            /**
             * <p>The port number. Valid values: 1 to 65535. An error is returned if an invalid value is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. This parameter is required for CLB. If this parameter is not specified for CLB, the error message &quot;protocol is missing for CLB&quot; is returned. No backend enumeration validation is performed. Valid values: tcp, udp, http, https, and tls.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The CLB VServerGroupId or NLB ServerGroupId. This parameter is required. If a duplicate group ID is specified, an error is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-xxxx</p>
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * <p>The group name. This parameter is required. If this parameter is not specified, the error message &quot;virtual service parameter is missing&quot; is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>80-tcp</p>
             */
            public Builder virtualServiceGroupName(String virtualServiceGroupName) {
                this.virtualServiceGroupName = virtualServiceGroupName;
                return this;
            }

            public VirtualServiceList build() {
                return new VirtualServiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateGatewayLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerRequest</p>
     */
    public static class LoadBalancerDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("loadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("loadBalancerType")
        private String loadBalancerType;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("serviceWeight")
        private Long serviceWeight;

        @com.aliyun.core.annotation.NameInMap("virtualServiceList")
        private java.util.List<VirtualServiceList> virtualServiceList;

        private LoadBalancerDTO(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerType = builder.loadBalancerType;
            this.networkType = builder.networkType;
            this.serviceWeight = builder.serviceWeight;
            this.virtualServiceList = builder.virtualServiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerDTO create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerType
         */
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return serviceWeight
         */
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        /**
         * @return virtualServiceList
         */
        public java.util.List<VirtualServiceList> getVirtualServiceList() {
            return this.virtualServiceList;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private String loadBalancerType; 
            private String networkType; 
            private Long serviceWeight; 
            private java.util.List<VirtualServiceList> virtualServiceList; 

            private Builder() {
            } 

            private Builder(LoadBalancerDTO model) {
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerType = model.loadBalancerType;
                this.networkType = model.networkType;
                this.serviceWeight = model.serviceWeight;
                this.virtualServiceList = model.virtualServiceList;
            } 

            /**
             * <p>The load balancer instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1xxxx</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The load balancer type.</p>
             * 
             * <strong>example:</strong>
             * <p>CLB</p>
             */
            public Builder loadBalancerType(String loadBalancerType) {
                this.loadBalancerType = loadBalancerType;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The service weight. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceWeight(Long serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * <p>The backend server group bindings.</p>
             */
            public Builder virtualServiceList(java.util.List<VirtualServiceList> virtualServiceList) {
                this.virtualServiceList = virtualServiceList;
                return this;
            }

            public LoadBalancerDTO build() {
                return new LoadBalancerDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateGatewayLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerRequest</p>
     */
    public static class GatewayLoadBalancerPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private GatewayLoadBalancerPorts(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayLoadBalancerPorts create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(GatewayLoadBalancerPorts model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The listening port. Valid values: 0 to 65535. A maximum of 50 custom ports can be configured in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public GatewayLoadBalancerPorts build() {
                return new GatewayLoadBalancerPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateGatewayLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerRequest</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayLoadBalancerPorts")
        private java.util.List<GatewayLoadBalancerPorts> gatewayLoadBalancerPorts;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Ports(Builder builder) {
            this.gatewayLoadBalancerPorts = builder.gatewayLoadBalancerPorts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return gatewayLoadBalancerPorts
         */
        public java.util.List<GatewayLoadBalancerPorts> getGatewayLoadBalancerPorts() {
            return this.gatewayLoadBalancerPorts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<GatewayLoadBalancerPorts> gatewayLoadBalancerPorts; 
            private String type; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.gatewayLoadBalancerPorts = model.gatewayLoadBalancerPorts;
                this.type = model.type;
            } 

            /**
             * <p>The listening ports.</p>
             */
            public Builder gatewayLoadBalancerPorts(java.util.List<GatewayLoadBalancerPorts> gatewayLoadBalancerPorts) {
                this.gatewayLoadBalancerPorts = gatewayLoadBalancerPorts;
                return this;
            }

            /**
             * <p>The load balancer type.</p>
             * 
             * <strong>example:</strong>
             * <p>NLB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
}
