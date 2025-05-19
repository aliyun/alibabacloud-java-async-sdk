// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneRequest</p>
 */
public class CreateOrUpdateSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppEntryRule")
    private AppEntryRule appEntryRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanaryModel")
    private Integer canaryModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneId")
    private Long laneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneName")
    private String laneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneTag")
    private String laneTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseGatewayEntryRule")
    private MseGatewayEntryRule mseGatewayEntryRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private CreateOrUpdateSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.appEntryRule = builder.appEntryRule;
        this.canaryModel = builder.canaryModel;
        this.enable = builder.enable;
        this.groupId = builder.groupId;
        this.laneId = builder.laneId;
        this.laneName = builder.laneName;
        this.laneTag = builder.laneTag;
        this.mseGatewayEntryRule = builder.mseGatewayEntryRule;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEntryRule
     */
    public AppEntryRule getAppEntryRule() {
        return this.appEntryRule;
    }

    /**
     * @return canaryModel
     */
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return laneName
     */
    public String getLaneName() {
        return this.laneName;
    }

    /**
     * @return laneTag
     */
    public String getLaneTag() {
        return this.laneTag;
    }

    /**
     * @return mseGatewayEntryRule
     */
    public MseGatewayEntryRule getMseGatewayEntryRule() {
        return this.mseGatewayEntryRule;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneRequest, Builder> {
        private AppEntryRule appEntryRule; 
        private Integer canaryModel; 
        private Boolean enable; 
        private Long groupId; 
        private Long laneId; 
        private String laneName; 
        private String laneTag; 
        private MseGatewayEntryRule mseGatewayEntryRule; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSwimmingLaneRequest request) {
            super(request);
            this.appEntryRule = request.appEntryRule;
            this.canaryModel = request.canaryModel;
            this.enable = request.enable;
            this.groupId = request.groupId;
            this.laneId = request.laneId;
            this.laneName = request.laneName;
            this.laneTag = request.laneTag;
            this.mseGatewayEntryRule = request.mseGatewayEntryRule;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * AppEntryRule.
         */
        public Builder appEntryRule(AppEntryRule appEntryRule) {
            String appEntryRuleShrink = shrink(appEntryRule, "AppEntryRule", "json");
            this.putQueryParameter("AppEntryRule", appEntryRuleShrink);
            this.appEntryRule = appEntryRule;
            return this;
        }

        /**
         * CanaryModel.
         */
        public Builder canaryModel(Integer canaryModel) {
            this.putQueryParameter("CanaryModel", canaryModel);
            this.canaryModel = canaryModel;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * LaneId.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * LaneName.
         */
        public Builder laneName(String laneName) {
            this.putQueryParameter("LaneName", laneName);
            this.laneName = laneName;
            return this;
        }

        /**
         * LaneTag.
         */
        public Builder laneTag(String laneTag) {
            this.putQueryParameter("LaneTag", laneTag);
            this.laneTag = laneTag;
            return this;
        }

        /**
         * MseGatewayEntryRule.
         */
        public Builder mseGatewayEntryRule(MseGatewayEntryRule mseGatewayEntryRule) {
            String mseGatewayEntryRuleShrink = shrink(mseGatewayEntryRule, "MseGatewayEntryRule", "json");
            this.putQueryParameter("MseGatewayEntryRule", mseGatewayEntryRuleShrink);
            this.mseGatewayEntryRule = mseGatewayEntryRule;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneRequest build() {
            return new CreateOrUpdateSwimmingLaneRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.condition = builder.condition;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String condition; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.condition = model.condition;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneRequest</p>
     */
    public static class AppEntryRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionJoiner")
        private String conditionJoiner;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("IndependentPercentageEnable")
        private Boolean independentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("PercentageByPath")
        private java.util.Map<String, Integer> percentageByPath;

        private AppEntryRule(Builder builder) {
            this.conditionJoiner = builder.conditionJoiner;
            this.conditions = builder.conditions;
            this.independentPercentageEnable = builder.independentPercentageEnable;
            this.paths = builder.paths;
            this.percentage = builder.percentage;
            this.percentageByPath = builder.percentageByPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppEntryRule create() {
            return builder().build();
        }

        /**
         * @return conditionJoiner
         */
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return independentPercentageEnable
         */
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return percentageByPath
         */
        public java.util.Map<String, Integer> getPercentageByPath() {
            return this.percentageByPath;
        }

        public static final class Builder {
            private String conditionJoiner; 
            private java.util.List<Conditions> conditions; 
            private Boolean independentPercentageEnable; 
            private java.util.List<String> paths; 
            private Integer percentage; 
            private java.util.Map<String, Integer> percentageByPath; 

            private Builder() {
            } 

            private Builder(AppEntryRule model) {
                this.conditionJoiner = model.conditionJoiner;
                this.conditions = model.conditions;
                this.independentPercentageEnable = model.independentPercentageEnable;
                this.paths = model.paths;
                this.percentage = model.percentage;
                this.percentageByPath = model.percentageByPath;
            } 

            /**
             * ConditionJoiner.
             */
            public Builder conditionJoiner(String conditionJoiner) {
                this.conditionJoiner = conditionJoiner;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * IndependentPercentageEnable.
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * PercentageByPath.
             */
            public Builder percentageByPath(java.util.Map<String, Integer> percentageByPath) {
                this.percentageByPath = percentageByPath;
                return this;
            }

            public AppEntryRule build() {
                return new AppEntryRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneRequest</p>
     */
    public static class MseGatewayEntryRuleConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MseGatewayEntryRuleConditions(Builder builder) {
            this.condition = builder.condition;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MseGatewayEntryRuleConditions create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String condition; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(MseGatewayEntryRuleConditions model) {
                this.condition = model.condition;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MseGatewayEntryRuleConditions build() {
                return new MseGatewayEntryRuleConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneRequest</p>
     */
    public static class MseGatewayEntryRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionJoiner")
        private String conditionJoiner;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<MseGatewayEntryRuleConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("IndependentPercentageEnable")
        private Boolean independentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("PercentageByRoute")
        private java.util.Map<String, Integer> percentageByRoute;

        @com.aliyun.core.annotation.NameInMap("RouteIds")
        private java.util.List<Long> routeIds;

        private MseGatewayEntryRule(Builder builder) {
            this.conditionJoiner = builder.conditionJoiner;
            this.conditions = builder.conditions;
            this.independentPercentageEnable = builder.independentPercentageEnable;
            this.percentage = builder.percentage;
            this.percentageByRoute = builder.percentageByRoute;
            this.routeIds = builder.routeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MseGatewayEntryRule create() {
            return builder().build();
        }

        /**
         * @return conditionJoiner
         */
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        /**
         * @return conditions
         */
        public java.util.List<MseGatewayEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return independentPercentageEnable
         */
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return percentageByRoute
         */
        public java.util.Map<String, Integer> getPercentageByRoute() {
            return this.percentageByRoute;
        }

        /**
         * @return routeIds
         */
        public java.util.List<Long> getRouteIds() {
            return this.routeIds;
        }

        public static final class Builder {
            private String conditionJoiner; 
            private java.util.List<MseGatewayEntryRuleConditions> conditions; 
            private Boolean independentPercentageEnable; 
            private Integer percentage; 
            private java.util.Map<String, Integer> percentageByRoute; 
            private java.util.List<Long> routeIds; 

            private Builder() {
            } 

            private Builder(MseGatewayEntryRule model) {
                this.conditionJoiner = model.conditionJoiner;
                this.conditions = model.conditions;
                this.independentPercentageEnable = model.independentPercentageEnable;
                this.percentage = model.percentage;
                this.percentageByRoute = model.percentageByRoute;
                this.routeIds = model.routeIds;
            } 

            /**
             * ConditionJoiner.
             */
            public Builder conditionJoiner(String conditionJoiner) {
                this.conditionJoiner = conditionJoiner;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<MseGatewayEntryRuleConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * IndependentPercentageEnable.
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * PercentageByRoute.
             */
            public Builder percentageByRoute(java.util.Map<String, Integer> percentageByRoute) {
                this.percentageByRoute = percentageByRoute;
                return this;
            }

            /**
             * RouteIds.
             */
            public Builder routeIds(java.util.List<Long> routeIds) {
                this.routeIds = routeIds;
                return this;
            }

            public MseGatewayEntryRule build() {
                return new MseGatewayEntryRule(this);
            } 

        } 

    }
}
