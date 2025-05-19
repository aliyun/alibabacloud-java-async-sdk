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
 * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllSwimmingLanesResponseBody</p>
 */
public class ListAllSwimmingLanesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListAllSwimmingLanesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllSwimmingLanesResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListAllSwimmingLanesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListAllSwimmingLanesResponseBody build() {
            return new ListAllSwimmingLanesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Conditions(Builder builder) {
            this.condition = builder.condition;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
            this.values = builder.values;
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

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String condition; 
            private String name; 
            private String type; 
            private String value; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.condition = model.condition;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
                this.values = model.values;
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

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
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
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("MseAppId")
        private String mseAppId;

        @com.aliyun.core.annotation.NameInMap("MseAppName")
        private String mseAppName;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        private Apps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.mseAppId = builder.mseAppId;
            this.mseAppName = builder.mseAppName;
            this.mseNamespaceId = builder.mseNamespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return mseAppId
         */
        public String getMseAppId() {
            return this.mseAppId;
        }

        /**
         * @return mseAppName
         */
        public String getMseAppName() {
            return this.mseAppName;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String mseAppId; 
            private String mseAppName; 
            private String mseNamespaceId; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.mseAppId = model.mseAppId;
                this.mseAppName = model.mseAppName;
                this.mseNamespaceId = model.mseNamespaceId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * MseAppId.
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * MseAppName.
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
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
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
     */
    public static class PathPredicate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PathPredicate(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicate create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(PathPredicate model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PathPredicate build() {
                return new PathPredicate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
     */
    public static class RoutePredicate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PathPredicate")
        private PathPredicate pathPredicate;

        private RoutePredicate(Builder builder) {
            this.pathPredicate = builder.pathPredicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutePredicate create() {
            return builder().build();
        }

        /**
         * @return pathPredicate
         */
        public PathPredicate getPathPredicate() {
            return this.pathPredicate;
        }

        public static final class Builder {
            private PathPredicate pathPredicate; 

            private Builder() {
            } 

            private Builder(RoutePredicate model) {
                this.pathPredicate = model.pathPredicate;
            } 

            /**
             * PathPredicate.
             */
            public Builder pathPredicate(PathPredicate pathPredicate) {
                this.pathPredicate = pathPredicate;
                return this;
            }

            public RoutePredicate build() {
                return new RoutePredicate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("RoutePredicate")
        private RoutePredicate routePredicate;

        private Routes(Builder builder) {
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
            this.routePredicate = builder.routePredicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routePredicate
         */
        public RoutePredicate getRoutePredicate() {
            return this.routePredicate;
        }

        public static final class Builder {
            private Long routeId; 
            private String routeName; 
            private RoutePredicate routePredicate; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.routeId = model.routeId;
                this.routeName = model.routeName;
                this.routePredicate = model.routePredicate;
            } 

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * RoutePredicate.
             */
            public Builder routePredicate(RoutePredicate routePredicate) {
                this.routePredicate = routePredicate;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Routes")
        private java.util.List<Routes> routes;

        private MseGatewayEntryRule(Builder builder) {
            this.conditionJoiner = builder.conditionJoiner;
            this.conditions = builder.conditions;
            this.independentPercentageEnable = builder.independentPercentageEnable;
            this.percentage = builder.percentage;
            this.percentageByRoute = builder.percentageByRoute;
            this.routeIds = builder.routeIds;
            this.routes = builder.routes;
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

        /**
         * @return routes
         */
        public java.util.List<Routes> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private String conditionJoiner; 
            private java.util.List<MseGatewayEntryRuleConditions> conditions; 
            private Boolean independentPercentageEnable; 
            private Integer percentage; 
            private java.util.Map<String, Integer> percentageByRoute; 
            private java.util.List<Long> routeIds; 
            private java.util.List<Routes> routes; 

            private Builder() {
            } 

            private Builder(MseGatewayEntryRule model) {
                this.conditionJoiner = model.conditionJoiner;
                this.conditions = model.conditions;
                this.independentPercentageEnable = model.independentPercentageEnable;
                this.percentage = model.percentage;
                this.percentageByRoute = model.percentageByRoute;
                this.routeIds = model.routeIds;
                this.routes = model.routes;
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

            /**
             * Routes.
             */
            public Builder routes(java.util.List<Routes> routes) {
                this.routes = routes;
                return this;
            }

            public MseGatewayEntryRule build() {
                return new MseGatewayEntryRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLanesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLanesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppEntryRule")
        private AppEntryRule appEntryRule;

        @com.aliyun.core.annotation.NameInMap("Apps")
        private java.util.List<Apps> apps;

        @com.aliyun.core.annotation.NameInMap("CanaryModel")
        private Integer canaryModel;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EnableRules")
        private Boolean enableRules;

        @com.aliyun.core.annotation.NameInMap("LaneId")
        private Long laneId;

        @com.aliyun.core.annotation.NameInMap("LaneName")
        private String laneName;

        @com.aliyun.core.annotation.NameInMap("LaneTag")
        private String laneTag;

        @com.aliyun.core.annotation.NameInMap("MseGatewayEntryRule")
        private MseGatewayEntryRule mseGatewayEntryRule;

        private Data(Builder builder) {
            this.appEntryRule = builder.appEntryRule;
            this.apps = builder.apps;
            this.canaryModel = builder.canaryModel;
            this.enable = builder.enable;
            this.enableRules = builder.enableRules;
            this.laneId = builder.laneId;
            this.laneName = builder.laneName;
            this.laneTag = builder.laneTag;
            this.mseGatewayEntryRule = builder.mseGatewayEntryRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appEntryRule
         */
        public AppEntryRule getAppEntryRule() {
            return this.appEntryRule;
        }

        /**
         * @return apps
         */
        public java.util.List<Apps> getApps() {
            return this.apps;
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
         * @return enableRules
         */
        public Boolean getEnableRules() {
            return this.enableRules;
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

        public static final class Builder {
            private AppEntryRule appEntryRule; 
            private java.util.List<Apps> apps; 
            private Integer canaryModel; 
            private Boolean enable; 
            private Boolean enableRules; 
            private Long laneId; 
            private String laneName; 
            private String laneTag; 
            private MseGatewayEntryRule mseGatewayEntryRule; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appEntryRule = model.appEntryRule;
                this.apps = model.apps;
                this.canaryModel = model.canaryModel;
                this.enable = model.enable;
                this.enableRules = model.enableRules;
                this.laneId = model.laneId;
                this.laneName = model.laneName;
                this.laneTag = model.laneTag;
                this.mseGatewayEntryRule = model.mseGatewayEntryRule;
            } 

            /**
             * AppEntryRule.
             */
            public Builder appEntryRule(AppEntryRule appEntryRule) {
                this.appEntryRule = appEntryRule;
                return this;
            }

            /**
             * Apps.
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * CanaryModel.
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
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
             * EnableRules.
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * LaneId.
             */
            public Builder laneId(Long laneId) {
                this.laneId = laneId;
                return this;
            }

            /**
             * LaneName.
             */
            public Builder laneName(String laneName) {
                this.laneName = laneName;
                return this;
            }

            /**
             * LaneTag.
             */
            public Builder laneTag(String laneTag) {
                this.laneTag = laneTag;
                return this;
            }

            /**
             * MseGatewayEntryRule.
             */
            public Builder mseGatewayEntryRule(MseGatewayEntryRule mseGatewayEntryRule) {
                this.mseGatewayEntryRule = mseGatewayEntryRule;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
