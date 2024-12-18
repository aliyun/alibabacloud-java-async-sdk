// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListIntegratedServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegratedServiceResponseBody</p>
 */
public class ListIntegratedServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>The information about the cloud service that can be integrated.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86DB52A5-0C25-505A-96D5-9BAE1EFA00B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegratedServiceResponseBody build() {
            return new ListIntegratedServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegratedServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegratedServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatorDeliveryDataType")
        private String aggregatorDeliveryDataType;

        @com.aliyun.core.annotation.NameInMap("IntegratedTypes")
        private String integratedTypes;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private Data(Builder builder) {
            this.aggregatorDeliveryDataType = builder.aggregatorDeliveryDataType;
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
         * @return aggregatorDeliveryDataType
         */
        public String getAggregatorDeliveryDataType() {
            return this.aggregatorDeliveryDataType;
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
            private String aggregatorDeliveryDataType; 
            private String integratedTypes; 
            private String serviceCode; 
            private String serviceName; 
            private Boolean status; 

            /**
             * AggregatorDeliveryDataType.
             */
            public Builder aggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
                this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
                return this;
            }

            /**
             * <p>The types of the integrated events. Separate multiple event types with commas (,). Valid values:</p>
             * <ul>
             * <li>ConfigurationItemChangeNotification: resource change event</li>
             * <li>NonCompliantNotification: non-compliance event</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NonCompliantNotification</p>
             */
            public Builder integratedTypes(String integratedTypes) {
                this.integratedTypes = integratedTypes;
                return this;
            }

            /**
             * <p>The identifier of the cloud service. Valid values:</p>
             * <ul>
             * <li>eventbridge: EventBridge</li>
             * <li>cms: CloudMonitor</li>
             * <li>bpstudio: Cloud Architect Design Tools</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The name of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The integration status of the cloud service. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
