// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListCustomRoutingPortMappingsByDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingPortMappingsByDestinationResponseBody</p>
 */
public class ListCustomRoutingPortMappingsByDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PortMappings")
    private java.util.List<PortMappings> portMappings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingPortMappingsByDestinationResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portMappings = builder.portMappings;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingPortMappingsByDestinationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return portMappings
     */
    public java.util.List<PortMappings> getPortMappings() {
        return this.portMappings;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PortMappings> portMappings; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomRoutingPortMappingsByDestinationResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.portMappings = model.portMappings;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Details about the port mapping table.</p>
         */
        public Builder portMappings(java.util.List<PortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>String	04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBody build() {
            return new ListCustomRoutingPortMappingsByDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomRoutingPortMappingsByDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingPortMappingsByDestinationResponseBody</p>
     */
    public static class DestinationSocketAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private DestinationSocketAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationSocketAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String ipAddress; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(DestinationSocketAddress model) {
                this.ipAddress = model.ipAddress;
                this.port = model.port;
            } 

            /**
             * <p>The service IP address of the backend instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The service port of the backend instance.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public DestinationSocketAddress build() {
                return new DestinationSocketAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomRoutingPortMappingsByDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingPortMappingsByDestinationResponseBody</p>
     */
    public static class PortMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("AcceleratorPort")
        private Integer acceleratorPort;

        @com.aliyun.core.annotation.NameInMap("DestinationSocketAddress")
        private DestinationSocketAddress destinationSocketAddress;

        @com.aliyun.core.annotation.NameInMap("DestinationTrafficState")
        private String destinationTrafficState;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List<String> protocols;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        private PortMappings(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.acceleratorPort = builder.acceleratorPort;
            this.destinationSocketAddress = builder.destinationSocketAddress;
            this.destinationTrafficState = builder.destinationTrafficState;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.endpointId = builder.endpointId;
            this.listenerId = builder.listenerId;
            this.protocols = builder.protocols;
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMappings create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return acceleratorPort
         */
        public Integer getAcceleratorPort() {
            return this.acceleratorPort;
        }

        /**
         * @return destinationSocketAddress
         */
        public DestinationSocketAddress getDestinationSocketAddress() {
            return this.destinationSocketAddress;
        }

        /**
         * @return destinationTrafficState
         */
        public String getDestinationTrafficState() {
            return this.destinationTrafficState;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointGroupRegion
         */
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private String acceleratorId; 
            private Integer acceleratorPort; 
            private DestinationSocketAddress destinationSocketAddress; 
            private String destinationTrafficState; 
            private String endpointGroupId; 
            private String endpointGroupRegion; 
            private String endpointId; 
            private String listenerId; 
            private java.util.List<String> protocols; 
            private String vswitch; 

            private Builder() {
            } 

            private Builder(PortMappings model) {
                this.acceleratorId = model.acceleratorId;
                this.acceleratorPort = model.acceleratorPort;
                this.destinationSocketAddress = model.destinationSocketAddress;
                this.destinationTrafficState = model.destinationTrafficState;
                this.endpointGroupId = model.endpointGroupId;
                this.endpointGroupRegion = model.endpointGroupRegion;
                this.endpointId = model.endpointId;
                this.listenerId = model.listenerId;
                this.protocols = model.protocols;
                this.vswitch = model.vswitch;
            } 

            /**
             * <p>The ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The acceleration port.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder acceleratorPort(Integer acceleratorPort) {
                this.acceleratorPort = acceleratorPort;
                return this;
            }

            /**
             * <p>The service IP address and port of the backend instance.</p>
             */
            public Builder destinationSocketAddress(DestinationSocketAddress destinationSocketAddress) {
                this.destinationSocketAddress = destinationSocketAddress;
                return this;
            }

            /**
             * <p>The access policy of traffic for the backend instance.</p>
             * <ul>
             * <li><strong>allow</strong>: allows traffic to the backend instance.</li>
             * <li><strong>deny</strong>: denies all traffic to the backend instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder destinationTrafficState(String destinationTrafficState) {
                this.destinationTrafficState = destinationTrafficState;
                return this;
            }

            /**
             * <p>The ID of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The ID of the region in which the endpoint group resides.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The protocol of the backend service.</p>
             * <ul>
             * <li><strong>tcp</strong>: TCP</li>
             * <li><strong>udp</strong>: UDP</li>
             * </ul>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The name of the endpoint (vSwitch).</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-test01</p>
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public PortMappings build() {
                return new PortMappings(this);
            } 

        } 

    }
}
