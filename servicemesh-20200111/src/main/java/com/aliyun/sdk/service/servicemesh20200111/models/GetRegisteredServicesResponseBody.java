// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServicesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisteredServicesResponseBody</p>
 */
public class GetRegisteredServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceDirectory")
    private ServiceDirectory serviceDirectory;

    @NameInMap("Services")
    private java.util.List < String > services;

    private GetRegisteredServicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceDirectory = builder.serviceDirectory;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisteredServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceDirectory
     */
    public ServiceDirectory getServiceDirectory() {
        return this.serviceDirectory;
    }

    /**
     * @return services
     */
    public java.util.List < String > getServices() {
        return this.services;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceDirectory serviceDirectory; 
        private java.util.List < String > services; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceDirectory.
         */
        public Builder serviceDirectory(ServiceDirectory serviceDirectory) {
            this.serviceDirectory = serviceDirectory;
            return this;
        }

        /**
         * Services.
         */
        public Builder services(java.util.List < String > services) {
            this.services = services;
            return this;
        }

        public GetRegisteredServicesResponseBody build() {
            return new GetRegisteredServicesResponseBody(this);
        } 

    } 

    public static class ServiceListStages extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Marker")
        private String marker;

        private ServiceListStages(Builder builder) {
            this.clusterId = builder.clusterId;
            this.marker = builder.marker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceListStages create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        public static final class Builder {
            private String clusterId; 
            private String marker; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Marker.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            public ServiceListStages build() {
                return new ServiceListStages(this);
            } 

        } 

    }
    public static class ServiceDirectory extends TeaModel {
        @NameInMap("ServiceListStages")
        private java.util.List < ServiceListStages> serviceListStages;

        @NameInMap("Services")
        private java.util.Map < String, ServiceDirectoryServicesValue > services;

        private ServiceDirectory(Builder builder) {
            this.serviceListStages = builder.serviceListStages;
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceDirectory create() {
            return builder().build();
        }

        /**
         * @return serviceListStages
         */
        public java.util.List < ServiceListStages> getServiceListStages() {
            return this.serviceListStages;
        }

        /**
         * @return services
         */
        public java.util.Map < String, ServiceDirectoryServicesValue > getServices() {
            return this.services;
        }

        public static final class Builder {
            private java.util.List < ServiceListStages> serviceListStages; 
            private java.util.Map < String, ServiceDirectoryServicesValue > services; 

            /**
             * ServiceListStages.
             */
            public Builder serviceListStages(java.util.List < ServiceListStages> serviceListStages) {
                this.serviceListStages = serviceListStages;
                return this;
            }

            /**
             * Services.
             */
            public Builder services(java.util.Map < String, ServiceDirectoryServicesValue > services) {
                this.services = services;
                return this;
            }

            public ServiceDirectory build() {
                return new ServiceDirectory(this);
            } 

        } 

    }
}
