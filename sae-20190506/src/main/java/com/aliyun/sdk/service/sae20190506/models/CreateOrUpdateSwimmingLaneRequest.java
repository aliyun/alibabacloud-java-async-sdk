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
         * <p>The route configuration of the gateway.</p>
         * <blockquote>
         * <p> This parameter is required if the gateway entry of the lane group is Java.</p>
         * </blockquote>
         */
        public Builder appEntryRule(AppEntryRule appEntryRule) {
            String appEntryRuleShrink = shrink(appEntryRule, "AppEntryRule", "json");
            this.putQueryParameter("AppEntryRule", appEntryRuleShrink);
            this.appEntryRule = appEntryRule;
            return this;
        }

        /**
         * <p>Full-link Grayscale Mode:</p>
         * <ul>
         * <li>0: The request is routed based on the content of the request.</li>
         * <li>1: routing based on percentages</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder canaryModel(Integer canaryModel) {
            this.putQueryParameter("CanaryModel", canaryModel);
            this.canaryModel = canaryModel;
            return this;
        }

        /**
         * <p>Lane Status</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The ID of the lane group to which the lane belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>13857</p>
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder laneName(String laneName) {
            this.putQueryParameter("LaneName", laneName);
            this.laneName = laneName;
            return this;
        }

        /**
         * <p>The tag of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
         */
        public Builder laneTag(String laneTag) {
            this.putQueryParameter("LaneTag", laneTag);
            this.laneTag = laneTag;
            return this;
        }

        /**
         * <p>The route configuration of the MSE gateway.</p>
         * <blockquote>
         * <p> If the <strong>EntryAppType</strong> is set to <strong>apig</strong> or <strong>mse-gw</strong>, it is required.</p>
         * </blockquote>
         */
        public Builder mseGatewayEntryRule(MseGatewayEntryRule mseGatewayEntryRule) {
            String mseGatewayEntryRuleShrink = shrink(mseGatewayEntryRule, "MseGatewayEntryRule", "json");
            this.putQueryParameter("MseGatewayEntryRule", mseGatewayEntryRuleShrink);
            this.mseGatewayEntryRule = mseGatewayEntryRule;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
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
             * <p>Matching Rule:</p>
             * <ul>
             * <li>The exact match. The condition is met if the traffic value and the condition value are exactly the same.</li>
             * <li>The exact match. The condition is met if the traffic value and the condition value are exactly the same.</li>
             * <li>The inclusive match. The condition is met if the traffic value is included in the specified list.</li>
             * <li>The percentage match. Principle: The condition is met if &quot;hash(get(<code>key</code>)) % 100 &lt; value&quot;.</li>
             * <li>Regular match: a regular expression match. The condition is met when the match is based on regular expression rules.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter type. Valid values:</p>
             * <ul>
             * <li>header</li>
             * <li>param</li>
             * <li>Cookie: forwards requests based on cookies.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Header</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The match value of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>g1</p>
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
             * <p>Logical connectors between conditions:</p>
             * <ul>
             * <li>AND: All conditions are met at the same time.</li>
             * <li>OR: Any condition is met.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder conditionJoiner(String conditionJoiner) {
                this.conditionJoiner = conditionJoiner;
                return this;
            }

            /**
             * <p>The conditions that trigger circuit breaking.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Whether to enable proportional grayscale.</p>
             * <ul>
             * <li>true: enabled. After you enable this parameter, you must configure the PercentageByPath.</li>
             * <li>false: disables the service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * <p>The matched request path.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The traffic ratio. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The traffic configuration.</p>
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
             * <p>The matching rule.</p>
             * <ul>
             * <li>==: exact match.</li>
             * <li>! =: exact match.</li>
             * <li>in: contains matches.</li>
             * <li>Percentage: Percentage matching.</li>
             * <li>Regular matching: specifies whether a regular expression is used to search for the original string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter type. Valid values:</p>
             * <ul>
             * <li>header</li>
             * <li>param</li>
             * <li>Cookie: forwards requests based on cookies.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>header</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The match value of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>g1</p>
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
             * <p>Logical connectors between conditions:</p>
             * <ul>
             * <li>AND: All conditions are met at the same time.</li>
             * <li>OR: Any condition is met.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder conditionJoiner(String conditionJoiner) {
                this.conditionJoiner = conditionJoiner;
                return this;
            }

            /**
             * <p>Routing Condition</p>
             */
            public Builder conditions(java.util.List<MseGatewayEntryRuleConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Whether to enable proportional grayscale.</p>
             * <ul>
             * <li>true: Enabled. After you enable this parameter, you must configure the PercentageByPath.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * <p>The percentage of traffic replication. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The traffic configuration.</p>
             */
            public Builder percentageByRoute(java.util.Map<String, Integer> percentageByRoute) {
                this.percentageByRoute = percentageByRoute;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
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
