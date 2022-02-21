// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServicesResponseBody</p>
 */
public class ListServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Services")
    private Services services;

    private ListServicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return services
     */
    public Services getServices() {
        return this.services;
    }

    public static final class Builder {
        private String requestId; 
        private Services services; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Services.
         */
        public Builder services(Services services) {
            this.services = services;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    public static class Service extends TeaModel {
        @NameInMap("Pid")
        private String pid;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServiceName")
        private String serviceName;

        private Service(Builder builder) {
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Service create() {
            return builder().build();
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String pid; 
            private String regionId; 
            private String serviceName; 

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Service build() {
                return new Service(this);
            } 

        } 

    }
    public static class Services extends TeaModel {
        @NameInMap("Service")
        private java.util.List < Service> service;

        private Services(Builder builder) {
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return service
         */
        public java.util.List < Service> getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List < Service> service; 

            /**
             * Service.
             */
            public Builder service(java.util.List < Service> service) {
                this.service = service;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
