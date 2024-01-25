// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertDetailDataResponseBody</p>
 */
public class DescribeAlertDetailDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeAlertDetailDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertDetailDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeAlertDetailDataResponseBody build() {
            return new DescribeAlertDetailDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("Category")
        private String category;

        @NameInMap("CountConvergence")
        private Integer countConvergence;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRegionName")
        private String instanceRegionName;

        @NameInMap("MetricExtend")
        private String metricExtend;

        @NameInMap("Mttr")
        private String mttr;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("metricName")
        private String metricName;

        @NameInMap("metricUnit")
        private String metricUnit;

        @NameInMap("productCodeKey")
        private String productCodeKey;

        private Data(Builder builder) {
            this.alertName = builder.alertName;
            this.algorithm = builder.algorithm;
            this.beginTime = builder.beginTime;
            this.category = builder.category;
            this.countConvergence = builder.countConvergence;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRegionName = builder.instanceRegionName;
            this.metricExtend = builder.metricExtend;
            this.mttr = builder.mttr;
            this.serviceType = builder.serviceType;
            this.metricName = builder.metricName;
            this.metricUnit = builder.metricUnit;
            this.productCodeKey = builder.productCodeKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return countConvergence
         */
        public Integer getCountConvergence() {
            return this.countConvergence;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRegionName
         */
        public String getInstanceRegionName() {
            return this.instanceRegionName;
        }

        /**
         * @return metricExtend
         */
        public String getMetricExtend() {
            return this.metricExtend;
        }

        /**
         * @return mttr
         */
        public String getMttr() {
            return this.mttr;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricUnit
         */
        public String getMetricUnit() {
            return this.metricUnit;
        }

        /**
         * @return productCodeKey
         */
        public String getProductCodeKey() {
            return this.productCodeKey;
        }

        public static final class Builder {
            private String alertName; 
            private String algorithm; 
            private String beginTime; 
            private String category; 
            private Integer countConvergence; 
            private String endTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRegionName; 
            private String metricExtend; 
            private String mttr; 
            private String serviceType; 
            private String metricName; 
            private String metricUnit; 
            private String productCodeKey; 

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CountConvergence.
             */
            public Builder countConvergence(Integer countConvergence) {
                this.countConvergence = countConvergence;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceRegionName.
             */
            public Builder instanceRegionName(String instanceRegionName) {
                this.instanceRegionName = instanceRegionName;
                return this;
            }

            /**
             * MetricExtend.
             */
            public Builder metricExtend(String metricExtend) {
                this.metricExtend = metricExtend;
                return this;
            }

            /**
             * Mttr.
             */
            public Builder mttr(String mttr) {
                this.mttr = mttr;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * metricUnit.
             */
            public Builder metricUnit(String metricUnit) {
                this.metricUnit = metricUnit;
                return this;
            }

            /**
             * productCodeKey.
             */
            public Builder productCodeKey(String productCodeKey) {
                this.productCodeKey = productCodeKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
