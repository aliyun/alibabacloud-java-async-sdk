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
 * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSwimmingLaneResponseBody</p>
 */
public class DescribeSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private DescribeSwimmingLaneResponseBody(Builder builder) {
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

    public static DescribeSwimmingLaneResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeSwimmingLaneResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code or the error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The request was successful.</li>
         * <li><strong>3xx</strong>: The request was redirected.</li>
         * <li><strong>4xx</strong>: The request failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Responses.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code. Value values:</p>
         * <ul>
         * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
         * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>The error message returned because the request is normal and <strong>success</strong> is returned.</li>
         * <li>If the request is abnormal, the specific exception error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The information was queried.</li>
         * <li><strong>false</strong>: Query failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the trace. This parameter is used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeSwimmingLaneResponseBody build() {
            return new DescribeSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The matching rule.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Parameter type.</p>
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

            /**
             * <p>The match value of the condition.</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The matching condition.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Whether to enable proportional grayscale.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * <p>The request path.</p>
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
             * <p>Traffic matching.</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("mseNamespaceId")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>6b4c0f64-f679-4580-8105-91eac4******</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the MSE instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-53y49******</p>
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * <p>The name of the MSE instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-test</p>
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * <p>The ID of the MSE namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>6733e538-d52f-48e6-91a4-192f91******</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The type of the parameter.</p>
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

            public MseGatewayEntryRuleConditions build() {
                return new MseGatewayEntryRuleConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
     */
    public static class PathPredicate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/Path</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The matching rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Header</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The path matching rule.</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9504</p>
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The routing rule.</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>The logical connector between conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder conditionJoiner(String conditionJoiner) {
                this.conditionJoiner = conditionJoiner;
                return this;
            }

            /**
             * <p>The matching condition.</p>
             */
            public Builder conditions(java.util.List<MseGatewayEntryRuleConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Whether to enable proportional grayscale.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentPercentageEnable(Boolean independentPercentageEnable) {
                this.independentPercentageEnable = independentPercentageEnable;
                return this;
            }

            /**
             * <p>The proportion of path traffic.</p>
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
             * <p>The list of route IDs.</p>
             */
            public Builder routeIds(java.util.List<Long> routeIds) {
                this.routeIds = routeIds;
                return this;
            }

            /**
             * <p>The detailed configuration of the routing rule.</p>
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
     * {@link DescribeSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSwimmingLaneResponseBody</p>
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
             * <p>Apply ingress rules.</p>
             */
            public Builder appEntryRule(AppEntryRule appEntryRule) {
                this.appEntryRule = appEntryRule;
                return this;
            }

            /**
             * <p>The apps.</p>
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * <p>The routing mode for end-to-end canary release.</p>
             * <ul>
             * <li>0: routing based on request content</li>
             * <li>1: routing based on percentages</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
                return this;
            }

            /**
             * <p>Lane status:</p>
             * <ul>
             * <li>true: enabled</li>
             * <li>false: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Whether the traffic rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * <p>The ID of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>9488</p>
             */
            public Builder laneId(Long laneId) {
                this.laneId = laneId;
                return this;
            }

            /**
             * <p>The name of the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-test</p>
             */
            public Builder laneName(String laneName) {
                this.laneName = laneName;
                return this;
            }

            /**
             * <p>The label of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
             */
            public Builder laneTag(String laneTag) {
                this.laneTag = laneTag;
                return this;
            }

            /**
             * <p>MSE gateway routes.</p>
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
