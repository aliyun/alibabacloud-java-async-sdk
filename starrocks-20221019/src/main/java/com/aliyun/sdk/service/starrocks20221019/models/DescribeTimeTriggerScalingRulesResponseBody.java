// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeTimeTriggerScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTimeTriggerScalingRulesResponseBody</p>
 */
public class DescribeTimeTriggerScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeTimeTriggerScalingRulesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimeTriggerScalingRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeTimeTriggerScalingRulesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeTimeTriggerScalingRulesResponseBody build() {
            return new DescribeTimeTriggerScalingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTimeTriggerScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimeTriggerScalingRulesResponseBody</p>
     */
    public static class ScalingInRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("RecurrenceInterval")
        private Integer recurrenceInterval;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
        private java.util.List<String> recurrenceValues;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private ScalingInRule(Builder builder) {
            this.day = builder.day;
            this.hour = builder.hour;
            this.minute = builder.minute;
            this.month = builder.month;
            this.recurrenceInterval = builder.recurrenceInterval;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValues = builder.recurrenceValues;
            this.second = builder.second;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingInRule create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
            return this.day;
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return recurrenceInterval
         */
        public Integer getRecurrenceInterval() {
            return this.recurrenceInterval;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValues
         */
        public java.util.List<String> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return second
         */
        public Integer getSecond() {
            return this.second;
        }

        /**
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer recurrenceInterval; 
            private String recurrenceType; 
            private java.util.List<String> recurrenceValues; 
            private Integer second; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(ScalingInRule model) {
                this.day = model.day;
                this.hour = model.hour;
                this.minute = model.minute;
                this.month = model.month;
                this.recurrenceInterval = model.recurrenceInterval;
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValues = model.recurrenceValues;
                this.second = model.second;
                this.year = model.year;
            } 

            /**
             * Day.
             */
            public Builder day(Integer day) {
                this.day = day;
                return this;
            }

            /**
             * Hour.
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * RecurrenceInterval.
             */
            public Builder recurrenceInterval(Integer recurrenceInterval) {
                this.recurrenceInterval = recurrenceInterval;
                return this;
            }

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValues.
             */
            public Builder recurrenceValues(java.util.List<String> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * Second.
             */
            public Builder second(Integer second) {
                this.second = second;
                return this;
            }

            /**
             * Year.
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public ScalingInRule build() {
                return new ScalingInRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimeTriggerScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimeTriggerScalingRulesResponseBody</p>
     */
    public static class ScalingOutRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("RecurrenceInterval")
        private Integer recurrenceInterval;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
        private java.util.List<String> recurrenceValues;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private ScalingOutRule(Builder builder) {
            this.day = builder.day;
            this.hour = builder.hour;
            this.minute = builder.minute;
            this.month = builder.month;
            this.recurrenceInterval = builder.recurrenceInterval;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValues = builder.recurrenceValues;
            this.second = builder.second;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingOutRule create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
            return this.day;
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return recurrenceInterval
         */
        public Integer getRecurrenceInterval() {
            return this.recurrenceInterval;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValues
         */
        public java.util.List<String> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return second
         */
        public Integer getSecond() {
            return this.second;
        }

        /**
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer recurrenceInterval; 
            private String recurrenceType; 
            private java.util.List<String> recurrenceValues; 
            private Integer second; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(ScalingOutRule model) {
                this.day = model.day;
                this.hour = model.hour;
                this.minute = model.minute;
                this.month = model.month;
                this.recurrenceInterval = model.recurrenceInterval;
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValues = model.recurrenceValues;
                this.second = model.second;
                this.year = model.year;
            } 

            /**
             * Day.
             */
            public Builder day(Integer day) {
                this.day = day;
                return this;
            }

            /**
             * Hour.
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * RecurrenceInterval.
             */
            public Builder recurrenceInterval(Integer recurrenceInterval) {
                this.recurrenceInterval = recurrenceInterval;
                return this;
            }

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValues.
             */
            public Builder recurrenceValues(java.util.List<String> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * Second.
             */
            public Builder second(Integer second) {
                this.second = second;
                return this;
            }

            /**
             * Year.
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public ScalingOutRule build() {
                return new ScalingOutRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimeTriggerScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimeTriggerScalingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeNumber")
        private String nodeNumber;

        @com.aliyun.core.annotation.NameInMap("ScalingInRule")
        private ScalingInRule scalingInRule;

        @com.aliyun.core.annotation.NameInMap("ScalingOutRule")
        private ScalingOutRule scalingOutRule;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
        private String scalingRuleId;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
        private String scalingRuleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.nodeNumber = builder.nodeNumber;
            this.scalingInRule = builder.scalingInRule;
            this.scalingOutRule = builder.scalingOutRule;
            this.scalingRuleId = builder.scalingRuleId;
            this.scalingRuleName = builder.scalingRuleName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodeNumber
         */
        public String getNodeNumber() {
            return this.nodeNumber;
        }

        /**
         * @return scalingInRule
         */
        public ScalingInRule getScalingInRule() {
            return this.scalingInRule;
        }

        /**
         * @return scalingOutRule
         */
        public ScalingOutRule getScalingOutRule() {
            return this.scalingOutRule;
        }

        /**
         * @return scalingRuleId
         */
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        /**
         * @return scalingRuleName
         */
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String nodeNumber; 
            private ScalingInRule scalingInRule; 
            private ScalingOutRule scalingOutRule; 
            private String scalingRuleId; 
            private String scalingRuleName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nodeNumber = model.nodeNumber;
                this.scalingInRule = model.scalingInRule;
                this.scalingOutRule = model.scalingOutRule;
                this.scalingRuleId = model.scalingRuleId;
                this.scalingRuleName = model.scalingRuleName;
                this.status = model.status;
            } 

            /**
             * NodeNumber.
             */
            public Builder nodeNumber(String nodeNumber) {
                this.nodeNumber = nodeNumber;
                return this;
            }

            /**
             * ScalingInRule.
             */
            public Builder scalingInRule(ScalingInRule scalingInRule) {
                this.scalingInRule = scalingInRule;
                return this;
            }

            /**
             * ScalingOutRule.
             */
            public Builder scalingOutRule(ScalingOutRule scalingOutRule) {
                this.scalingOutRule = scalingOutRule;
                return this;
            }

            /**
             * ScalingRuleId.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * ScalingRuleName.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
