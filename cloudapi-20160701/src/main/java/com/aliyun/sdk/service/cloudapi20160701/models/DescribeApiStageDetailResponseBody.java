// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiStageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiStageDetailResponseBody</p>
 */
public class DescribeApiStageDetailResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StageId")
    private String stageId;

    @NameInMap("StageName")
    private String stageName;

    @NameInMap("Variables")
    private Variables variables;

    private DescribeApiStageDetailResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.stageId = builder.stageId;
        this.stageName = builder.stageName;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiStageDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return variables
     */
    public Variables getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String groupId; 
        private String modifiedTime; 
        private String requestId; 
        private String stageId; 
        private String stageName; 
        private Variables variables; 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
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
         * StageId.
         */
        public Builder stageId(String stageId) {
            this.stageId = stageId;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.stageName = stageName;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(Variables variables) {
            this.variables = variables;
            return this;
        }

        public DescribeApiStageDetailResponseBody build() {
            return new DescribeApiStageDetailResponseBody(this);
        } 

    } 

    public static class RouteRuleItem extends TeaModel {
        @NameInMap("ConditionValue")
        private String conditionValue;

        @NameInMap("MaxValue")
        private Long maxValue;

        @NameInMap("MinValue")
        private Long minValue;

        @NameInMap("ResultValue")
        private String resultValue;

        private RouteRuleItem(Builder builder) {
            this.conditionValue = builder.conditionValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.resultValue = builder.resultValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteRuleItem create() {
            return builder().build();
        }

        /**
         * @return conditionValue
         */
        public String getConditionValue() {
            return this.conditionValue;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return resultValue
         */
        public String getResultValue() {
            return this.resultValue;
        }

        public static final class Builder {
            private String conditionValue; 
            private Long maxValue; 
            private Long minValue; 
            private String resultValue; 

            /**
             * ConditionValue.
             */
            public Builder conditionValue(String conditionValue) {
                this.conditionValue = conditionValue;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ResultValue.
             */
            public Builder resultValue(String resultValue) {
                this.resultValue = resultValue;
                return this;
            }

            public RouteRuleItem build() {
                return new RouteRuleItem(this);
            } 

        } 

    }
    public static class RouteRules extends TeaModel {
        @NameInMap("RouteRuleItem")
        private java.util.List < RouteRuleItem> routeRuleItem;

        private RouteRules(Builder builder) {
            this.routeRuleItem = builder.routeRuleItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteRules create() {
            return builder().build();
        }

        /**
         * @return routeRuleItem
         */
        public java.util.List < RouteRuleItem> getRouteRuleItem() {
            return this.routeRuleItem;
        }

        public static final class Builder {
            private java.util.List < RouteRuleItem> routeRuleItem; 

            /**
             * RouteRuleItem.
             */
            public Builder routeRuleItem(java.util.List < RouteRuleItem> routeRuleItem) {
                this.routeRuleItem = routeRuleItem;
                return this;
            }

            public RouteRules build() {
                return new RouteRules(this);
            } 

        } 

    }
    public static class StageRouteModel extends TeaModel {
        @NameInMap("Location")
        private String location;

        @NameInMap("ParameterCatalog")
        private String parameterCatalog;

        @NameInMap("ParameterType")
        private String parameterType;

        @NameInMap("RouteMatchSymbol")
        private String routeMatchSymbol;

        @NameInMap("RouteRules")
        private RouteRules routeRules;

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private StageRouteModel(Builder builder) {
            this.location = builder.location;
            this.parameterCatalog = builder.parameterCatalog;
            this.parameterType = builder.parameterType;
            this.routeMatchSymbol = builder.routeMatchSymbol;
            this.routeRules = builder.routeRules;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageRouteModel create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return parameterCatalog
         */
        public String getParameterCatalog() {
            return this.parameterCatalog;
        }

        /**
         * @return parameterType
         */
        public String getParameterType() {
            return this.parameterType;
        }

        /**
         * @return routeMatchSymbol
         */
        public String getRouteMatchSymbol() {
            return this.routeMatchSymbol;
        }

        /**
         * @return routeRules
         */
        public RouteRules getRouteRules() {
            return this.routeRules;
        }

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String location; 
            private String parameterCatalog; 
            private String parameterType; 
            private String routeMatchSymbol; 
            private RouteRules routeRules; 
            private String serviceParameterName; 

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * ParameterCatalog.
             */
            public Builder parameterCatalog(String parameterCatalog) {
                this.parameterCatalog = parameterCatalog;
                return this;
            }

            /**
             * ParameterType.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * RouteMatchSymbol.
             */
            public Builder routeMatchSymbol(String routeMatchSymbol) {
                this.routeMatchSymbol = routeMatchSymbol;
                return this;
            }

            /**
             * RouteRules.
             */
            public Builder routeRules(RouteRules routeRules) {
                this.routeRules = routeRules;
                return this;
            }

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public StageRouteModel build() {
                return new StageRouteModel(this);
            } 

        } 

    }
    public static class VariableItem extends TeaModel {
        @NameInMap("StageRouteModel")
        private StageRouteModel stageRouteModel;

        @NameInMap("SupportRoute")
        private Boolean supportRoute;

        @NameInMap("VariableName")
        private String variableName;

        @NameInMap("VariableValue")
        private String variableValue;

        private VariableItem(Builder builder) {
            this.stageRouteModel = builder.stageRouteModel;
            this.supportRoute = builder.supportRoute;
            this.variableName = builder.variableName;
            this.variableValue = builder.variableValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableItem create() {
            return builder().build();
        }

        /**
         * @return stageRouteModel
         */
        public StageRouteModel getStageRouteModel() {
            return this.stageRouteModel;
        }

        /**
         * @return supportRoute
         */
        public Boolean getSupportRoute() {
            return this.supportRoute;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        /**
         * @return variableValue
         */
        public String getVariableValue() {
            return this.variableValue;
        }

        public static final class Builder {
            private StageRouteModel stageRouteModel; 
            private Boolean supportRoute; 
            private String variableName; 
            private String variableValue; 

            /**
             * StageRouteModel.
             */
            public Builder stageRouteModel(StageRouteModel stageRouteModel) {
                this.stageRouteModel = stageRouteModel;
                return this;
            }

            /**
             * SupportRoute.
             */
            public Builder supportRoute(Boolean supportRoute) {
                this.supportRoute = supportRoute;
                return this;
            }

            /**
             * VariableName.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * VariableValue.
             */
            public Builder variableValue(String variableValue) {
                this.variableValue = variableValue;
                return this;
            }

            public VariableItem build() {
                return new VariableItem(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @NameInMap("VariableItem")
        private java.util.List < VariableItem> variableItem;

        private Variables(Builder builder) {
            this.variableItem = builder.variableItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return variableItem
         */
        public java.util.List < VariableItem> getVariableItem() {
            return this.variableItem;
        }

        public static final class Builder {
            private java.util.List < VariableItem> variableItem; 

            /**
             * VariableItem.
             */
            public Builder variableItem(java.util.List < VariableItem> variableItem) {
                this.variableItem = variableItem;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
