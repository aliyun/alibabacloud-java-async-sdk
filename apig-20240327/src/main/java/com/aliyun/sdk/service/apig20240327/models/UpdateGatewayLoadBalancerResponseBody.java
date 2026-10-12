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
 * {@link UpdateGatewayLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGatewayLoadBalancerResponseBody</p>
 */
public class UpdateGatewayLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateGatewayLoadBalancerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayLoadBalancerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateGatewayLoadBalancerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CEB8F71F-F889-599E-9D03-250978412350</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGatewayLoadBalancerResponseBody build() {
            return new UpdateGatewayLoadBalancerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerResponseBody</p>
     */
    public static class VirtualServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

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
        public String getPort() {
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
            private String port; 
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
             * <p>The port. When an NLB instance is associated, two placeholder entries with ports 80 and 443 are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. When an NLB instance is associated, HTTP and HTTPS are returned as placeholders. For CLB, the value is deserialized from the stored vServerGroupMetaInfo.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The VServerGroup or ServerGroup ID. When an NLB instance is associated, this field is an empty string placeholder.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-xxxx</p>
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * <p>The group name. When an NLB instance is associated, this field is an empty string placeholder.</p>
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
     * {@link UpdateGatewayLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayLoadBalancerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("editEnable")
        private Boolean editEnable;

        @com.aliyun.core.annotation.NameInMap("loadBalancerAddress")
        private String loadBalancerAddress;

        @com.aliyun.core.annotation.NameInMap("loadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("loadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("loadBalancerType")
        private String loadBalancerType;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ports")
        private java.util.List<Integer> ports;

        @com.aliyun.core.annotation.NameInMap("serviceWeight")
        private Long serviceWeight;

        @com.aliyun.core.annotation.NameInMap("statusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("virtualServiceList")
        private java.util.List<VirtualServiceList> virtualServiceList;

        private Data(Builder builder) {
            this.editEnable = builder.editEnable;
            this.loadBalancerAddress = builder.loadBalancerAddress;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerType = builder.loadBalancerType;
            this.networkType = builder.networkType;
            this.ports = builder.ports;
            this.serviceWeight = builder.serviceWeight;
            this.statusDescription = builder.statusDescription;
            this.virtualServiceList = builder.virtualServiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return editEnable
         */
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        /**
         * @return loadBalancerAddress
         */
        public String getLoadBalancerAddress() {
            return this.loadBalancerAddress;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
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
         * @return ports
         */
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        /**
         * @return serviceWeight
         */
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return virtualServiceList
         */
        public java.util.List<VirtualServiceList> getVirtualServiceList() {
            return this.virtualServiceList;
        }

        public static final class Builder {
            private Boolean editEnable; 
            private String loadBalancerAddress; 
            private String loadBalancerId; 
            private String loadBalancerName; 
            private String loadBalancerType; 
            private String networkType; 
            private java.util.List<Integer> ports; 
            private Long serviceWeight; 
            private String statusDescription; 
            private java.util.List<VirtualServiceList> virtualServiceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.editEnable = model.editEnable;
                this.loadBalancerAddress = model.loadBalancerAddress;
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerName = model.loadBalancerName;
                this.loadBalancerType = model.loadBalancerType;
                this.networkType = model.networkType;
                this.ports = model.ports;
                this.serviceWeight = model.serviceWeight;
                this.statusDescription = model.statusDescription;
                this.virtualServiceList = model.virtualServiceList;
            } 

            /**
             * <p>Indicates whether the load balancer can be edited. This serves as the edit toggle for a load balancer that is being migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * <p>The load balancer address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.x.x.x</p>
             */
            public Builder loadBalancerAddress(String loadBalancerAddress) {
                this.loadBalancerAddress = loadBalancerAddress;
                return this;
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
             * <p>The load balancer name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-clb</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
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
             * <p>The port information.</p>
             */
            public Builder ports(java.util.List<Integer> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The gateway service weight for traffic shifting during migration. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceWeight(Long serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * <p>The status description.</p>
             * 
             * <strong>example:</strong>
             * <p>Status description</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>The backend server group bindings.</p>
             */
            public Builder virtualServiceList(java.util.List<VirtualServiceList> virtualServiceList) {
                this.virtualServiceList = virtualServiceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
