// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegratedServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegratedServiceResponseBody</p>
 */
public class ListIntegratedServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIntegratedServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegratedServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The information about the cloud service that can be integrated.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegratedServiceResponseBody build() {
            return new ListIntegratedServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntegratedTypes")
        private String integratedTypes;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private Data(Builder builder) {
            this.integratedTypes = builder.integratedTypes;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return integratedTypes
         */
        public String getIntegratedTypes() {
            return this.integratedTypes;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String integratedTypes; 
            private String serviceCode; 
            private String serviceName; 
            private Boolean status; 

            /**
             * The types of the integrated events. Separate multiple event types with commas (,). Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: resource change event
             * *   NonCompliantNotification: non-compliance event
             */
            public Builder integratedTypes(String integratedTypes) {
                this.integratedTypes = integratedTypes;
                return this;
            }

            /**
             * The identifier of the cloud service. Valid values:
             * <p>
             * 
             * *   eventbridge: EventBridge
             * *   cms: CloudMonitor
             * *   bpstudio: Cloud Architect Design Tools
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * The name of the cloud service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The integration status of the cloud service. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
