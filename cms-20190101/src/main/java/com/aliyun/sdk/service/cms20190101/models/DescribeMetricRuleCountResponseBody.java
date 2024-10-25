// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleCountResponseBody</p>
 */
public class DescribeMetricRuleCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MetricRuleCount")
    private MetricRuleCount metricRuleCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMetricRuleCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.metricRuleCount = builder.metricRuleCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricRuleCount
     */
    public MetricRuleCount getMetricRuleCount() {
        return this.metricRuleCount;
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
        private String message; 
        private MetricRuleCount metricRuleCount; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The responses code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of alert rules in each state.</p>
         */
        public Builder metricRuleCount(MetricRuleCount metricRuleCount) {
            this.metricRuleCount = metricRuleCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FF38D33A-67C1-40EB-AB65-FAEE51EDB644</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMetricRuleCountResponseBody build() {
            return new DescribeMetricRuleCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricRuleCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleCountResponseBody</p>
     */
    public static class MetricRuleCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alarm")
        private Integer alarm;

        @com.aliyun.core.annotation.NameInMap("Disable")
        private Integer disable;

        @com.aliyun.core.annotation.NameInMap("Nodata")
        private Integer nodata;

        @com.aliyun.core.annotation.NameInMap("Ok")
        private Integer ok;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private MetricRuleCount(Builder builder) {
            this.alarm = builder.alarm;
            this.disable = builder.disable;
            this.nodata = builder.nodata;
            this.ok = builder.ok;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricRuleCount create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public Integer getAlarm() {
            return this.alarm;
        }

        /**
         * @return disable
         */
        public Integer getDisable() {
            return this.disable;
        }

        /**
         * @return nodata
         */
        public Integer getNodata() {
            return this.nodata;
        }

        /**
         * @return ok
         */
        public Integer getOk() {
            return this.ok;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer alarm; 
            private Integer disable; 
            private Integer nodata; 
            private Integer ok; 
            private Integer total; 

            /**
             * <p>The number of alert rules with active alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder alarm(Integer alarm) {
                this.alarm = alarm;
                return this;
            }

            /**
             * <p>The number of disabled alert rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder disable(Integer disable) {
                this.disable = disable;
                return this;
            }

            /**
             * <p>The number of alert rules without data.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodata(Integer nodata) {
                this.nodata = nodata;
                return this;
            }

            /**
             * <p>The number of alert rules without active alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder ok(Integer ok) {
                this.ok = ok;
                return this;
            }

            /**
             * <p>The total number of alert rules.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public MetricRuleCount build() {
                return new MetricRuleCount(this);
            } 

        } 

    }
}
