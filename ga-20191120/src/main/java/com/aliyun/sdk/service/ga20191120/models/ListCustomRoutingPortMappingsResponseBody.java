// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingPortMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingPortMappingsResponseBody</p>
 */
public class ListCustomRoutingPortMappingsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PortMappings")
    private java.util.List < PortMappings> portMappings;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingPortMappingsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portMappings = builder.portMappings;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingPortMappingsResponseBody create() {
        return builder().build();
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
    public java.util.List < PortMappings> getPortMappings() {
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
        private java.util.List < PortMappings> portMappings; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Details about the port mapping table.
         */
        public Builder portMappings(java.util.List < PortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingPortMappingsResponseBody build() {
            return new ListCustomRoutingPortMappingsResponseBody(this);
        } 

    } 

    public static class DestinationSocketAddress extends TeaModel {
        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Port")
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

            /**
             * The service IP address of the backend instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The service port of the backend instance.
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
    public static class PortMappings extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("AcceleratorPort")
        private Integer acceleratorPort;

        @NameInMap("DestinationSocketAddress")
        private DestinationSocketAddress destinationSocketAddress;

        @NameInMap("DestinationTrafficState")
        private String destinationTrafficState;

        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Protocols")
        private java.util.List < String > protocols;

        @NameInMap("Vswitch")
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
        public java.util.List < String > getProtocols() {
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
            private java.util.List < String > protocols; 
            private String vswitch; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The acceleration port.
             */
            public Builder acceleratorPort(Integer acceleratorPort) {
                this.acceleratorPort = acceleratorPort;
                return this;
            }

            /**
             * The service IP address and port of the backend instance.
             */
            public Builder destinationSocketAddress(DestinationSocketAddress destinationSocketAddress) {
                this.destinationSocketAddress = destinationSocketAddress;
                return this;
            }

            /**
             * The access policy of traffic for the backend instance. Valid values:
             * <p>
             * 
             * *   **allow**: allows traffic to the backend instance.
             * *   **deny**: denies traffic to the backend instance.
             */
            public Builder destinationTrafficState(String destinationTrafficState) {
                this.destinationTrafficState = destinationTrafficState;
                return this;
            }

            /**
             * The ID of the endpoint group.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The ID of the region in which the endpoint group resides.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the listener.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The protocol of the backend service.
             * <p>
             * 
             * *   **tcp**: TCP
             * *   **udp**: UDP
             */
            public Builder protocols(java.util.List < String > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The name of the endpoint (vSwitch).
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
