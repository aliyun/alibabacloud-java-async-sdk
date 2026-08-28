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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
             * port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * virtualServiceGroupId.
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * virtualServiceGroupName.
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
             * editEnable.
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * loadBalancerAddress.
             */
            public Builder loadBalancerAddress(String loadBalancerAddress) {
                this.loadBalancerAddress = loadBalancerAddress;
                return this;
            }

            /**
             * loadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * loadBalancerName.
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * loadBalancerType.
             */
            public Builder loadBalancerType(String loadBalancerType) {
                this.loadBalancerType = loadBalancerType;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * ports.
             */
            public Builder ports(java.util.List<Integer> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * serviceWeight.
             */
            public Builder serviceWeight(Long serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * statusDescription.
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * virtualServiceList.
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
