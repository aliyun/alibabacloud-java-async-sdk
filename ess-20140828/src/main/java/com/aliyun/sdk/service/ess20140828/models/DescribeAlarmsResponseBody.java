// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponseBody</p>
 */
public class DescribeAlarmsResponseBody extends TeaModel {
    @NameInMap("AlarmList")
    private AlarmList alarmList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAlarmsResponseBody(Builder builder) {
        this.alarmList = builder.alarmList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmList
     */
    public AlarmList getAlarmList() {
        return this.alarmList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AlarmList alarmList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AlarmList.
         */
        public Builder alarmList(AlarmList alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAlarmsResponseBody build() {
            return new DescribeAlarmsResponseBody(this);
        } 

    } 

    public static class AlarmActions extends TeaModel {
        @NameInMap("AlarmAction")
        private java.util.List < String > alarmAction;

        private AlarmActions(Builder builder) {
            this.alarmAction = builder.alarmAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmActions create() {
            return builder().build();
        }

        /**
         * @return alarmAction
         */
        public java.util.List < String > getAlarmAction() {
            return this.alarmAction;
        }

        public static final class Builder {
            private java.util.List < String > alarmAction; 

            /**
             * AlarmAction.
             */
            public Builder alarmAction(java.util.List < String > alarmAction) {
                this.alarmAction = alarmAction;
                return this;
            }

            public AlarmActions build() {
                return new AlarmActions(this);
            } 

        } 

    }
    public static class Dimension extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        private Dimension(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimension create() {
            return builder().build();
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public static final class Builder {
            private String dimensionKey; 
            private String dimensionValue; 

            /**
             * DimensionKey.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * DimensionValue.
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public Dimension build() {
                return new Dimension(this);
            } 

        } 

    }
    public static class Dimensions extends TeaModel {
        @NameInMap("Dimension")
        private java.util.List < Dimension> dimension;

        private Dimensions(Builder builder) {
            this.dimension = builder.dimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public java.util.List < Dimension> getDimension() {
            return this.dimension;
        }

        public static final class Builder {
            private java.util.List < Dimension> dimension; 

            /**
             * Dimension.
             */
            public Builder dimension(java.util.List < Dimension> dimension) {
                this.dimension = dimension;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Alarm extends TeaModel {
        @NameInMap("AlarmActions")
        private AlarmActions alarmActions;

        @NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("Description")
        private String description;

        @NameInMap("Dimensions")
        private Dimensions dimensions;

        @NameInMap("Effective")
        private String effective;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("MetricType")
        private String metricType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("State")
        private String state;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private Float threshold;

        private Alarm(Builder builder) {
            this.alarmActions = builder.alarmActions;
            this.alarmTaskId = builder.alarmTaskId;
            this.comparisonOperator = builder.comparisonOperator;
            this.description = builder.description;
            this.dimensions = builder.dimensions;
            this.effective = builder.effective;
            this.enable = builder.enable;
            this.evaluationCount = builder.evaluationCount;
            this.metricName = builder.metricName;
            this.metricType = builder.metricType;
            this.name = builder.name;
            this.period = builder.period;
            this.scalingGroupId = builder.scalingGroupId;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
        }

        /**
         * @return alarmActions
         */
        public AlarmActions getAlarmActions() {
            return this.alarmActions;
        }

        /**
         * @return alarmTaskId
         */
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimensions
         */
        public Dimensions getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effective
         */
        public String getEffective() {
            return this.effective;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private AlarmActions alarmActions; 
            private String alarmTaskId; 
            private String comparisonOperator; 
            private String description; 
            private Dimensions dimensions; 
            private String effective; 
            private Boolean enable; 
            private Integer evaluationCount; 
            private String metricName; 
            private String metricType; 
            private String name; 
            private Integer period; 
            private String scalingGroupId; 
            private String state; 
            private String statistics; 
            private Float threshold; 

            /**
             * AlarmActions.
             */
            public Builder alarmActions(AlarmActions alarmActions) {
                this.alarmActions = alarmActions;
                return this;
            }

            /**
             * AlarmTaskId.
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(Dimensions dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Effective.
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Alarm build() {
                return new Alarm(this);
            } 

        } 

    }
    public static class AlarmList extends TeaModel {
        @NameInMap("Alarm")
        private java.util.List < Alarm> alarm;

        private AlarmList(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmList create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public java.util.List < Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List < Alarm> alarm; 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List < Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public AlarmList build() {
                return new AlarmList(this);
            } 

        } 

    }
}
