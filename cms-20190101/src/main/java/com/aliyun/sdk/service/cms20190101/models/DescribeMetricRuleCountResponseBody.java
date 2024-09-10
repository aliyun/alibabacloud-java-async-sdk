// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The number of alert rules in each state.
         */
        public Builder metricRuleCount(MetricRuleCount metricRuleCount) {
            this.metricRuleCount = metricRuleCount;
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMetricRuleCountResponseBody build() {
            return new DescribeMetricRuleCountResponseBody(this);
        } 

    } 

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
             * The number of alert rules with active alerts.
             */
            public Builder alarm(Integer alarm) {
                this.alarm = alarm;
                return this;
            }

            /**
             * The number of disabled alert rules.
             */
            public Builder disable(Integer disable) {
                this.disable = disable;
                return this;
            }

            /**
             * The number of alert rules without data.
             */
            public Builder nodata(Integer nodata) {
                this.nodata = nodata;
                return this;
            }

            /**
             * The number of alert rules without active alerts.
             */
            public Builder ok(Integer ok) {
                this.ok = ok;
                return this;
            }

            /**
             * The total number of alert rules.
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
