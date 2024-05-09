// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricListResponseBody</p>
 */
public class DescribeMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private java.util.List < DataPoints> dataPoints;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMetricListResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataPoints = builder.dataPoints;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.param = builder.param;
        this.period = builder.period;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataPoints
     */
    public java.util.List < DataPoints> getDataPoints() {
        return this.dataPoints;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DataPoints> dataPoints; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String metricName; 
        private String metricType; 
        private String param; 
        private Long period; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned by the backend service. The number is incremented.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The monitoring statistics.
         */
        public Builder dataPoints(java.util.List < DataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the %s variable in the **ErrMessage** parameter.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code returned for an exception.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * *   **InternetOut**: the outbound traffic over the Internet. Unit: byte.
         * <p>
         * *   **diskusage_utilization**: the disk usage.
         * *   **IntranetInRate**: the inbound traffic over the internal network. Unit: byte.
         * *   **InternetIn**: the inbound traffic from the Internet. Unit: byte.
         * *   **cpu_total**: the CPU utilization.
         * *   **memory_usedutilization**: the memory usage.
         * *   **IntranetOutRate**: the outbound traffic over the internal network. Unit: byte.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Indicates whether the metrics of the cluster or a node are queried. Valid values:
         * <p>
         * 
         * *   **CLUSTER**: The metrics of the cluster are queried.
         * *   **NODE**: The metrics of a node are queried.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * The monitored object.
         * <p>
         * 
         * *   If the **MetricType** parameter is set to **NODE**, the value of this parameter is the ID of the node that is monitored.****
         * *   If the **MetricType** parameter is set to **CLUSTER**, the value of this parameter is the ID of the dedicated cluster. You can obtain the ID by calling the ListDedicatedCluster operation.
         */
        public Builder param(String param) {
            this.param = param;
            return this;
        }

        /**
         * The monitoring interval. Unit: seconds. Minimum value: 15.
         */
        public Builder period(Long period) {
            this.period = period;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMetricListResponseBody build() {
            return new DescribeMetricListResponseBody(this);
        } 

    } 

    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistics")
        private Float statistics;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private DataPoints(Builder builder) {
            this.statistics = builder.statistics;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return statistics
         */
        public Float getStatistics() {
            return this.statistics;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Float statistics; 
            private Long timestamp; 

            /**
             * The statistical value.
             */
            public Builder statistics(Float statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The timestamp of the record. Unit: milliseconds.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
}
