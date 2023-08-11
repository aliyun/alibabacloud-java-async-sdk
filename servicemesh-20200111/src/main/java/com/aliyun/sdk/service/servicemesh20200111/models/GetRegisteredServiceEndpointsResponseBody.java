// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServiceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceEndpointsResponseBody</p>
 */
public class GetRegisteredServiceEndpointsResponseBody extends TeaModel {
    @NameInMap("EndPointSlice")
    private EndPointSlice endPointSlice;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceEndpoints")
    private java.util.List < ServiceEndpoints> serviceEndpoints;

    private GetRegisteredServiceEndpointsResponseBody(Builder builder) {
        this.endPointSlice = builder.endPointSlice;
        this.requestId = builder.requestId;
        this.serviceEndpoints = builder.serviceEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisteredServiceEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endPointSlice
     */
    public EndPointSlice getEndPointSlice() {
        return this.endPointSlice;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceEndpoints
     */
    public java.util.List < ServiceEndpoints> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public static final class Builder {
        private EndPointSlice endPointSlice; 
        private String requestId; 
        private java.util.List < ServiceEndpoints> serviceEndpoints; 

        /**
         * The name of the registered service.
         */
        public Builder endPointSlice(EndPointSlice endPointSlice) {
            this.endPointSlice = endPointSlice;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IP address of the registered service.
         */
        public Builder serviceEndpoints(java.util.List < ServiceEndpoints> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public GetRegisteredServiceEndpointsResponseBody build() {
            return new GetRegisteredServiceEndpointsResponseBody(this);
        } 

    } 

    public static class EndpointsDetails extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("PodName")
        private String podName;

        @NameInMap("Ports")
        private java.util.List < Integer > ports;

        @NameInMap("Region")
        private String region;

        @NameInMap("SidecarInjected")
        private Boolean sidecarInjected;

        private EndpointsDetails(Builder builder) {
            this.address = builder.address;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.ports = builder.ports;
            this.region = builder.region;
            this.sidecarInjected = builder.sidecarInjected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointsDetails create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sidecarInjected
         */
        public Boolean getSidecarInjected() {
            return this.sidecarInjected;
        }

        public static final class Builder {
            private String address; 
            private String hostname; 
            private String podName; 
            private java.util.List < Integer > ports; 
            private String region; 
            private Boolean sidecarInjected; 

            /**
             * The port of the registered service.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The ID of the region in which the registered service resides.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The IP address of the registered service.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * The host name of the registered service.
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Indicates whether sidecar proxies are injected. Valid values:
             * <p>
             * 
             * *   `true`: yes
             * *   `false`: no
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder sidecarInjected(Boolean sidecarInjected) {
                this.sidecarInjected = sidecarInjected;
                return this;
            }

            public EndpointsDetails build() {
                return new EndpointsDetails(this);
            } 

        } 

    }
    public static class EndPointSlice extends TeaModel {
        @NameInMap("EndpointsDetails")
        private java.util.List < EndpointsDetails> endpointsDetails;

        @NameInMap("Location")
        private String location;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ServiceName")
        private String serviceName;

        private EndPointSlice(Builder builder) {
            this.endpointsDetails = builder.endpointsDetails;
            this.location = builder.location;
            this.namespace = builder.namespace;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndPointSlice create() {
            return builder().build();
        }

        /**
         * @return endpointsDetails
         */
        public java.util.List < EndpointsDetails> getEndpointsDetails() {
            return this.endpointsDetails;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < EndpointsDetails> endpointsDetails; 
            private String location; 
            private String namespace; 
            private String serviceName; 

            /**
             * The name of the pod.
             */
            public Builder endpointsDetails(java.util.List < EndpointsDetails> endpointsDetails) {
                this.endpointsDetails = endpointsDetails;
                return this;
            }

            /**
             * The details of the endpoint of the registered service.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The location of the registered service. Valid values:
             * <p>
             * 
             * *   `MESH_INTERNAL`: The service is deployed inside the ASM instance.
             * *   `MESH_EXTERNAL`: The service is deployed outside the ASM instance.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public EndPointSlice build() {
                return new EndPointSlice(this);
            } 

        } 

    }
    public static class ServiceEndpoints extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("ClusterId")
        private String clusterId;

        private ServiceEndpoints(Builder builder) {
            this.address = builder.address;
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceEndpoints create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private String address; 
            private String clusterId; 

            /**
             * The ID of the cluster on the data plane.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The details of the endpoints of the registered service.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public ServiceEndpoints build() {
                return new ServiceEndpoints(this);
            } 

        } 

    }
}
