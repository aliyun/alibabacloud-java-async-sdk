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
 * {@link GetRegisteredServiceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceEndpointsResponseBody</p>
 */
public class GetRegisteredServiceEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndPointSlice")
    private EndPointSlice endPointSlice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceEndpoints")
    private java.util.List<ServiceEndpoints> serviceEndpoints;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServiceEndpoints> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public static final class Builder {
        private EndPointSlice endPointSlice; 
        private String requestId; 
        private java.util.List<ServiceEndpoints> serviceEndpoints; 

        private Builder() {
        } 

        private Builder(GetRegisteredServiceEndpointsResponseBody model) {
            this.endPointSlice = model.endPointSlice;
            this.requestId = model.requestId;
            this.serviceEndpoints = model.serviceEndpoints;
        } 

        /**
         * <p>The name of the registered service.</p>
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
         * <p>The IP address of the registered service.</p>
         */
        public Builder serviceEndpoints(java.util.List<ServiceEndpoints> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public GetRegisteredServiceEndpointsResponseBody build() {
            return new GetRegisteredServiceEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegisteredServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegisteredServiceEndpointsResponseBody</p>
     */
    public static class EndpointsDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Integer> ports;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SidecarInjected")
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
        public java.util.List<Integer> getPorts() {
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
            private java.util.List<Integer> ports; 
            private String region; 
            private Boolean sidecarInjected; 

            private Builder() {
            } 

            private Builder(EndpointsDetails model) {
                this.address = model.address;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.ports = model.ports;
                this.region = model.region;
                this.sidecarInjected = model.sidecarInjected;
            } 

            /**
             * <p>The port of the registered service.</p>
             * 
             * <strong>example:</strong>
             * <p><code>127.2.**.**</code></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The ID of the region in which the registered service resides.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.demo.com">www.demo.com</a></p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The IP address of the registered service.</p>
             * 
             * <strong>example:</strong>
             * <p>provider-v1-8c86b6898-h***</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>The host name of the registered service.</p>
             */
            public Builder ports(java.util.List<Integer> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>Indicates whether sidecar proxies are injected. Valid values:</p>
             * <ul>
             * <li><code>true</code>: yes</li>
             * <li><code>false</code>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link GetRegisteredServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegisteredServiceEndpointsResponseBody</p>
     */
    public static class EndPointSlice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointsDetails")
        private java.util.List<EndpointsDetails> endpointsDetails;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
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
        public java.util.List<EndpointsDetails> getEndpointsDetails() {
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
            private java.util.List<EndpointsDetails> endpointsDetails; 
            private String location; 
            private String namespace; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(EndPointSlice model) {
                this.endpointsDetails = model.endpointsDetails;
                this.location = model.location;
                this.namespace = model.namespace;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The name of the pod.</p>
             */
            public Builder endpointsDetails(java.util.List<EndpointsDetails> endpointsDetails) {
                this.endpointsDetails = endpointsDetails;
                return this;
            }

            /**
             * <p>The details of the endpoint of the registered service.</p>
             * 
             * <strong>example:</strong>
             * <p>MESH_INTERNAL</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The location of the registered service. Valid values:</p>
             * <ul>
             * <li><code>MESH_INTERNAL</code>: The service is deployed inside the ASM instance.</li>
             * <li><code>MESH_EXTERNAL</code>: The service is deployed outside the ASM instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>reviews</p>
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
    /**
     * 
     * {@link GetRegisteredServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegisteredServiceEndpointsResponseBody</p>
     */
    public static class ServiceEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
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

            private Builder() {
            } 

            private Builder(ServiceEndpoints model) {
                this.address = model.address;
                this.clusterId = model.clusterId;
            } 

            /**
             * <p>The ID of the cluster on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.25.153</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The details of the endpoints of the registered service.</p>
             * 
             * <strong>example:</strong>
             * <p>c80f45444b3da447da60a911390c2****</p>
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
