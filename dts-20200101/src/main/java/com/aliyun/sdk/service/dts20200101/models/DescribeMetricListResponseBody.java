// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricListResponseBody</p>
 */
public class DescribeMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private java.util.List<DataPoints> dataPoints;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DataPoints> getDataPoints() {
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
        private java.util.List<DataPoints> dataPoints; 
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

        private Builder() {
        } 

        private Builder(DescribeMetricListResponseBody model) {
            this.code = model.code;
            this.dataPoints = model.dataPoints;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.metricName = model.metricName;
            this.metricType = model.metricType;
            this.param = model.param;
            this.period = model.period;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend error code, which is an incrementing number.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The monitoring statistics information.</p>
         */
        public Builder dataPoints(java.util.List<DataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the %s placeholder in the <strong>ErrMessage</strong> error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Type</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code corresponding to the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <ul>
         * <li><strong>InternetOut</strong>: outbound Internet traffic, in bytes.</li>
         * <li><strong>diskusage_utilization</strong>: disk usage.</li>
         * <li><strong>IntranetInRate</strong>: inbound internal network traffic, in bytes.</li>
         * <li><strong>InternetIn</strong>: inbound Internet traffic, in bytes.</li>
         * <li><strong>cpu_total</strong>: CPU utilization.</li>
         * <li><strong>memory_usedutilization</strong>: memory utilization.</li>
         * <li><strong>IntranetOutRate</strong>: outbound internal network traffic, in bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>Specifies whether to query a cluster or a node. Valid values:</p>
         * <ul>
         * <li><strong>CLUSTER</strong>: cluster.</li>
         * <li><strong>NODE</strong>: node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The observation value.</p>
         * <ul>
         * <li>If <strong>MetricType</strong> is set to <strong>NODE</strong>, the value is <strong>nodeid</strong>.</li>
         * <li>If <strong>MetricType</strong> is set to <strong>CLUSTER</strong>, the value is the ID of the dedicated cluster, which can be obtained by calling the ListDedicatedCluster operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs-jhjnjjn</p>
         */
        public Builder param(String param) {
            this.param = param;
            return this;
        }

        /**
         * <p>The observation interval in seconds. The minimum interval is 15 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder period(Long period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMetricListResponseBody build() {
            return new DescribeMetricListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.statistics = model.statistics;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The statistical value.</p>
             * 
             * <strong>example:</strong>
             * <p>15.25</p>
             */
            public Builder statistics(Float statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The record timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1650872310000</p>
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
