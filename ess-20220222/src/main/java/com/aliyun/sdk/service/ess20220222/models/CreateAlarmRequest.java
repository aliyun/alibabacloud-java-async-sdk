// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlarmRequest</p>
 */
public class CreateAlarmRequest extends Request {
    @Query
    @NameInMap("AlarmActions")
    private java.util.List < String > alarmActions;

    @Query
    @NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Query
    @NameInMap("Effective")
    private String effective;

    @Query
    @NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @Query
    @NameInMap("Expressions")
    private java.util.List < Expressions> expressions;

    @Query
    @NameInMap("ExpressionsLogicOperator")
    private String expressionsLogicOperator;

    @Query
    @NameInMap("GroupId")
    private Integer groupId;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("MetricType")
    private String metricType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("Statistics")
    private String statistics;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    private CreateAlarmRequest(Builder builder) {
        super(builder);
        this.alarmActions = builder.alarmActions;
        this.comparisonOperator = builder.comparisonOperator;
        this.description = builder.description;
        this.dimensions = builder.dimensions;
        this.effective = builder.effective;
        this.evaluationCount = builder.evaluationCount;
        this.expressions = builder.expressions;
        this.expressionsLogicOperator = builder.expressionsLogicOperator;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmActions
     */
    public java.util.List < String > getAlarmActions() {
        return this.alarmActions;
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
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return effective
     */
    public String getEffective() {
        return this.effective;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return expressions
     */
    public java.util.List < Expressions> getExpressions() {
        return this.expressions;
    }

    /**
     * @return expressionsLogicOperator
     */
    public String getExpressionsLogicOperator() {
        return this.expressionsLogicOperator;
    }

    /**
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public static final class Builder extends Request.Builder<CreateAlarmRequest, Builder> {
        private java.util.List < String > alarmActions; 
        private String comparisonOperator; 
        private String description; 
        private java.util.List < Dimensions> dimensions; 
        private String effective; 
        private Integer evaluationCount; 
        private java.util.List < Expressions> expressions; 
        private String expressionsLogicOperator; 
        private Integer groupId; 
        private String metricName; 
        private String metricType; 
        private String name; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String statistics; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlarmRequest request) {
            super(request);
            this.alarmActions = request.alarmActions;
            this.comparisonOperator = request.comparisonOperator;
            this.description = request.description;
            this.dimensions = request.dimensions;
            this.effective = request.effective;
            this.evaluationCount = request.evaluationCount;
            this.expressions = request.expressions;
            this.expressionsLogicOperator = request.expressionsLogicOperator;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.metricType = request.metricType;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.statistics = request.statistics;
            this.threshold = request.threshold;
        } 

        /**
         * AlarmActions.
         */
        public Builder alarmActions(java.util.List < String > alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * ComparisonOperator.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Effective.
         */
        public Builder effective(String effective) {
            this.putQueryParameter("Effective", effective);
            this.effective = effective;
            return this;
        }

        /**
         * EvaluationCount.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * Expressions.
         */
        public Builder expressions(java.util.List < Expressions> expressions) {
            this.putQueryParameter("Expressions", expressions);
            this.expressions = expressions;
            return this;
        }

        /**
         * ExpressionsLogicOperator.
         */
        public Builder expressionsLogicOperator(String expressionsLogicOperator) {
            this.putQueryParameter("ExpressionsLogicOperator", expressionsLogicOperator);
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Integer groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public CreateAlarmRequest build() {
            return new CreateAlarmRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        private Dimensions(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
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

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Expressions extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private Float threshold;

        private Expressions(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressions create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
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
            private String comparisonOperator; 
            private String metricName; 
            private Integer period; 
            private String statistics; 
            private Float threshold; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
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

            public Expressions build() {
                return new Expressions(this);
            } 

        } 

    }
}
