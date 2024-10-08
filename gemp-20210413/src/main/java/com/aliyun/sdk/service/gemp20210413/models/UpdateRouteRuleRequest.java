// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteRuleRequest</p>
 */
public class UpdateRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assignObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long assignObjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assignObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assignObjectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("childRuleRelation")
    private String childRuleRelation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("convergenceFields")
    private java.util.List < String > convergenceFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("convergenceType")
    private Integer convergenceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("coverageProblemLevels")
    private java.util.List < String > coverageProblemLevels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String effection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("matchCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long matchCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyChannels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > notifyChannels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemEffectionServices")
    private java.util.List < Long > problemEffectionServices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemLevelGroup")
    private java.util.Map < String, ProblemLevelGroupValue > problemLevelGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long relatedServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeChildRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RouteChildRules> routeChildRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routeRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeWindow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeWindow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeWindowUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeWindowUnit;

    private UpdateRouteRuleRequest(Builder builder) {
        super(builder);
        this.assignObjectId = builder.assignObjectId;
        this.assignObjectType = builder.assignObjectType;
        this.childRuleRelation = builder.childRuleRelation;
        this.clientToken = builder.clientToken;
        this.convergenceFields = builder.convergenceFields;
        this.convergenceType = builder.convergenceType;
        this.coverageProblemLevels = builder.coverageProblemLevels;
        this.effection = builder.effection;
        this.incidentLevel = builder.incidentLevel;
        this.matchCount = builder.matchCount;
        this.notifyChannels = builder.notifyChannels;
        this.problemEffectionServices = builder.problemEffectionServices;
        this.problemLevelGroup = builder.problemLevelGroup;
        this.relatedServiceId = builder.relatedServiceId;
        this.routeChildRules = builder.routeChildRules;
        this.routeRuleId = builder.routeRuleId;
        this.routeType = builder.routeType;
        this.ruleName = builder.ruleName;
        this.timeWindow = builder.timeWindow;
        this.timeWindowUnit = builder.timeWindowUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRouteRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignObjectId
     */
    public Long getAssignObjectId() {
        return this.assignObjectId;
    }

    /**
     * @return assignObjectType
     */
    public String getAssignObjectType() {
        return this.assignObjectType;
    }

    /**
     * @return childRuleRelation
     */
    public String getChildRuleRelation() {
        return this.childRuleRelation;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return convergenceFields
     */
    public java.util.List < String > getConvergenceFields() {
        return this.convergenceFields;
    }

    /**
     * @return convergenceType
     */
    public Integer getConvergenceType() {
        return this.convergenceType;
    }

    /**
     * @return coverageProblemLevels
     */
    public java.util.List < String > getCoverageProblemLevels() {
        return this.coverageProblemLevels;
    }

    /**
     * @return effection
     */
    public String getEffection() {
        return this.effection;
    }

    /**
     * @return incidentLevel
     */
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    /**
     * @return matchCount
     */
    public Long getMatchCount() {
        return this.matchCount;
    }

    /**
     * @return notifyChannels
     */
    public java.util.List < String > getNotifyChannels() {
        return this.notifyChannels;
    }

    /**
     * @return problemEffectionServices
     */
    public java.util.List < Long > getProblemEffectionServices() {
        return this.problemEffectionServices;
    }

    /**
     * @return problemLevelGroup
     */
    public java.util.Map < String, ProblemLevelGroupValue > getProblemLevelGroup() {
        return this.problemLevelGroup;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    /**
     * @return routeChildRules
     */
    public java.util.List < RouteChildRules> getRouteChildRules() {
        return this.routeChildRules;
    }

    /**
     * @return routeRuleId
     */
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    /**
     * @return routeType
     */
    public String getRouteType() {
        return this.routeType;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return timeWindow
     */
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * @return timeWindowUnit
     */
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public static final class Builder extends Request.Builder<UpdateRouteRuleRequest, Builder> {
        private Long assignObjectId; 
        private String assignObjectType; 
        private String childRuleRelation; 
        private String clientToken; 
        private java.util.List < String > convergenceFields; 
        private Integer convergenceType; 
        private java.util.List < String > coverageProblemLevels; 
        private String effection; 
        private String incidentLevel; 
        private Long matchCount; 
        private java.util.List < String > notifyChannels; 
        private java.util.List < Long > problemEffectionServices; 
        private java.util.Map < String, ProblemLevelGroupValue > problemLevelGroup; 
        private Long relatedServiceId; 
        private java.util.List < RouteChildRules> routeChildRules; 
        private Long routeRuleId; 
        private String routeType; 
        private String ruleName; 
        private Integer timeWindow; 
        private String timeWindowUnit; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRouteRuleRequest request) {
            super(request);
            this.assignObjectId = request.assignObjectId;
            this.assignObjectType = request.assignObjectType;
            this.childRuleRelation = request.childRuleRelation;
            this.clientToken = request.clientToken;
            this.convergenceFields = request.convergenceFields;
            this.convergenceType = request.convergenceType;
            this.coverageProblemLevels = request.coverageProblemLevels;
            this.effection = request.effection;
            this.incidentLevel = request.incidentLevel;
            this.matchCount = request.matchCount;
            this.notifyChannels = request.notifyChannels;
            this.problemEffectionServices = request.problemEffectionServices;
            this.problemLevelGroup = request.problemLevelGroup;
            this.relatedServiceId = request.relatedServiceId;
            this.routeChildRules = request.routeChildRules;
            this.routeRuleId = request.routeRuleId;
            this.routeType = request.routeType;
            this.ruleName = request.ruleName;
            this.timeWindow = request.timeWindow;
            this.timeWindowUnit = request.timeWindowUnit;
        } 

        /**
         * assignObjectId.
         */
        public Builder assignObjectId(Long assignObjectId) {
            this.putBodyParameter("assignObjectId", assignObjectId);
            this.assignObjectId = assignObjectId;
            return this;
        }

        /**
         * assignObjectType.
         */
        public Builder assignObjectType(String assignObjectType) {
            this.putBodyParameter("assignObjectType", assignObjectType);
            this.assignObjectType = assignObjectType;
            return this;
        }

        /**
         * childRuleRelation.
         */
        public Builder childRuleRelation(String childRuleRelation) {
            this.putBodyParameter("childRuleRelation", childRuleRelation);
            this.childRuleRelation = childRuleRelation;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * convergenceFields.
         */
        public Builder convergenceFields(java.util.List < String > convergenceFields) {
            this.putBodyParameter("convergenceFields", convergenceFields);
            this.convergenceFields = convergenceFields;
            return this;
        }

        /**
         * convergenceType.
         */
        public Builder convergenceType(Integer convergenceType) {
            this.putBodyParameter("convergenceType", convergenceType);
            this.convergenceType = convergenceType;
            return this;
        }

        /**
         * coverageProblemLevels.
         */
        public Builder coverageProblemLevels(java.util.List < String > coverageProblemLevels) {
            this.putBodyParameter("coverageProblemLevels", coverageProblemLevels);
            this.coverageProblemLevels = coverageProblemLevels;
            return this;
        }

        /**
         * effection.
         */
        public Builder effection(String effection) {
            this.putBodyParameter("effection", effection);
            this.effection = effection;
            return this;
        }

        /**
         * incidentLevel.
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * matchCount.
         */
        public Builder matchCount(Long matchCount) {
            this.putBodyParameter("matchCount", matchCount);
            this.matchCount = matchCount;
            return this;
        }

        /**
         * notifyChannels.
         */
        public Builder notifyChannels(java.util.List < String > notifyChannels) {
            this.putBodyParameter("notifyChannels", notifyChannels);
            this.notifyChannels = notifyChannels;
            return this;
        }

        /**
         * problemEffectionServices.
         */
        public Builder problemEffectionServices(java.util.List < Long > problemEffectionServices) {
            this.putBodyParameter("problemEffectionServices", problemEffectionServices);
            this.problemEffectionServices = problemEffectionServices;
            return this;
        }

        /**
         * problemLevelGroup.
         */
        public Builder problemLevelGroup(java.util.Map < String, ProblemLevelGroupValue > problemLevelGroup) {
            this.putBodyParameter("problemLevelGroup", problemLevelGroup);
            this.problemLevelGroup = problemLevelGroup;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * routeChildRules.
         */
        public Builder routeChildRules(java.util.List < RouteChildRules> routeChildRules) {
            this.putBodyParameter("routeChildRules", routeChildRules);
            this.routeChildRules = routeChildRules;
            return this;
        }

        /**
         * routeRuleId.
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        /**
         * routeType.
         */
        public Builder routeType(String routeType) {
            this.putBodyParameter("routeType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * timeWindow.
         */
        public Builder timeWindow(Integer timeWindow) {
            this.putBodyParameter("timeWindow", timeWindow);
            this.timeWindow = timeWindow;
            return this;
        }

        /**
         * timeWindowUnit.
         */
        public Builder timeWindowUnit(String timeWindowUnit) {
            this.putBodyParameter("timeWindowUnit", timeWindowUnit);
            this.timeWindowUnit = timeWindowUnit;
            return this;
        }

        @Override
        public UpdateRouteRuleRequest build() {
            return new UpdateRouteRuleRequest(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("operationSymbol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operationSymbol;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Conditions(Builder builder) {
            this.key = builder.key;
            this.operationSymbol = builder.operationSymbol;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operationSymbol
         */
        public String getOperationSymbol() {
            return this.operationSymbol;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operationSymbol; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * operationSymbol.
             */
            public Builder operationSymbol(String operationSymbol) {
                this.operationSymbol = operationSymbol;
                return this;
            }

            /**
             * value.
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
    public static class RouteChildRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childConditionRelation")
        private Long childConditionRelation;

        @com.aliyun.core.annotation.NameInMap("childRouteRuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long childRouteRuleId;

        @com.aliyun.core.annotation.NameInMap("conditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("isValidChildRule")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isValidChildRule;

        @com.aliyun.core.annotation.NameInMap("monitorSourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long monitorSourceId;

        @com.aliyun.core.annotation.NameInMap("problemLevel")
        private String problemLevel;

        private RouteChildRules(Builder builder) {
            this.childConditionRelation = builder.childConditionRelation;
            this.childRouteRuleId = builder.childRouteRuleId;
            this.conditions = builder.conditions;
            this.isValidChildRule = builder.isValidChildRule;
            this.monitorSourceId = builder.monitorSourceId;
            this.problemLevel = builder.problemLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteChildRules create() {
            return builder().build();
        }

        /**
         * @return childConditionRelation
         */
        public Long getChildConditionRelation() {
            return this.childConditionRelation;
        }

        /**
         * @return childRouteRuleId
         */
        public Long getChildRouteRuleId() {
            return this.childRouteRuleId;
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return isValidChildRule
         */
        public Boolean getIsValidChildRule() {
            return this.isValidChildRule;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return problemLevel
         */
        public String getProblemLevel() {
            return this.problemLevel;
        }

        public static final class Builder {
            private Long childConditionRelation; 
            private Long childRouteRuleId; 
            private java.util.List < Conditions> conditions; 
            private Boolean isValidChildRule; 
            private Long monitorSourceId; 
            private String problemLevel; 

            /**
             * childConditionRelation.
             */
            public Builder childConditionRelation(Long childConditionRelation) {
                this.childConditionRelation = childConditionRelation;
                return this;
            }

            /**
             * childRouteRuleId.
             */
            public Builder childRouteRuleId(Long childRouteRuleId) {
                this.childRouteRuleId = childRouteRuleId;
                return this;
            }

            /**
             * conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * isValidChildRule.
             */
            public Builder isValidChildRule(Boolean isValidChildRule) {
                this.isValidChildRule = isValidChildRule;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * problemLevel.
             */
            public Builder problemLevel(String problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            public RouteChildRules build() {
                return new RouteChildRules(this);
            } 

        } 

    }
}
