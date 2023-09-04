// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteRuleRequest</p>
 */
public class CreateRouteRuleRequest extends Request {
    @Body
    @NameInMap("assignObjectId")
    @Validation(required = true)
    private Long assignObjectId;

    @Body
    @NameInMap("assignObjectType")
    @Validation(required = true)
    private String assignObjectType;

    @Body
    @NameInMap("childRuleRelation")
    @Validation(required = true)
    private String childRuleRelation;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("convergenceFields")
    private java.util.List < String > convergenceFields;

    @Body
    @NameInMap("convergenceType")
    private Integer convergenceType;

    @Body
    @NameInMap("coverageProblemLevels")
    private java.util.List < String > coverageProblemLevels;

    @Body
    @NameInMap("effection")
    @Validation(required = true)
    private String effection;

    @Body
    @NameInMap("enableStatus")
    private String enableStatus;

    @Body
    @NameInMap("incidentLevel")
    @Validation(required = true)
    private String incidentLevel;

    @Body
    @NameInMap("matchCount")
    @Validation(required = true)
    private Integer matchCount;

    @Body
    @NameInMap("notifyChannels")
    @Validation(required = true)
    private java.util.List < String > notifyChannels;

    @Body
    @NameInMap("problemEffectionServices")
    private java.util.List < Long > problemEffectionServices;

    @Body
    @NameInMap("problemLevelGroup")
    private java.util.Map < String, ProblemLevelGroupValue > problemLevelGroup;

    @Body
    @NameInMap("relatedServiceId")
    @Validation(required = true)
    private Long relatedServiceId;

    @Body
    @NameInMap("routeChildRules")
    @Validation(required = true)
    private java.util.List < RouteChildRules> routeChildRules;

    @Body
    @NameInMap("routeType")
    @Validation(required = true)
    private String routeType;

    @Body
    @NameInMap("ruleName")
    @Validation(required = true)
    private String ruleName;

    @Body
    @NameInMap("timeWindow")
    @Validation(required = true)
    private Long timeWindow;

    @Body
    @NameInMap("timeWindowUnit")
    @Validation(required = true)
    private String timeWindowUnit;

    private CreateRouteRuleRequest(Builder builder) {
        super(builder);
        this.assignObjectId = builder.assignObjectId;
        this.assignObjectType = builder.assignObjectType;
        this.childRuleRelation = builder.childRuleRelation;
        this.clientToken = builder.clientToken;
        this.convergenceFields = builder.convergenceFields;
        this.convergenceType = builder.convergenceType;
        this.coverageProblemLevels = builder.coverageProblemLevels;
        this.effection = builder.effection;
        this.enableStatus = builder.enableStatus;
        this.incidentLevel = builder.incidentLevel;
        this.matchCount = builder.matchCount;
        this.notifyChannels = builder.notifyChannels;
        this.problemEffectionServices = builder.problemEffectionServices;
        this.problemLevelGroup = builder.problemLevelGroup;
        this.relatedServiceId = builder.relatedServiceId;
        this.routeChildRules = builder.routeChildRules;
        this.routeType = builder.routeType;
        this.ruleName = builder.ruleName;
        this.timeWindow = builder.timeWindow;
        this.timeWindowUnit = builder.timeWindowUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteRuleRequest create() {
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
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
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
    public Integer getMatchCount() {
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
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * @return timeWindowUnit
     */
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public static final class Builder extends Request.Builder<CreateRouteRuleRequest, Builder> {
        private Long assignObjectId; 
        private String assignObjectType; 
        private String childRuleRelation; 
        private String clientToken; 
        private java.util.List < String > convergenceFields; 
        private Integer convergenceType; 
        private java.util.List < String > coverageProblemLevels; 
        private String effection; 
        private String enableStatus; 
        private String incidentLevel; 
        private Integer matchCount; 
        private java.util.List < String > notifyChannels; 
        private java.util.List < Long > problemEffectionServices; 
        private java.util.Map < String, ProblemLevelGroupValue > problemLevelGroup; 
        private Long relatedServiceId; 
        private java.util.List < RouteChildRules> routeChildRules; 
        private String routeType; 
        private String ruleName; 
        private Long timeWindow; 
        private String timeWindowUnit; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteRuleRequest request) {
            super(request);
            this.assignObjectId = request.assignObjectId;
            this.assignObjectType = request.assignObjectType;
            this.childRuleRelation = request.childRuleRelation;
            this.clientToken = request.clientToken;
            this.convergenceFields = request.convergenceFields;
            this.convergenceType = request.convergenceType;
            this.coverageProblemLevels = request.coverageProblemLevels;
            this.effection = request.effection;
            this.enableStatus = request.enableStatus;
            this.incidentLevel = request.incidentLevel;
            this.matchCount = request.matchCount;
            this.notifyChannels = request.notifyChannels;
            this.problemEffectionServices = request.problemEffectionServices;
            this.problemLevelGroup = request.problemLevelGroup;
            this.relatedServiceId = request.relatedServiceId;
            this.routeChildRules = request.routeChildRules;
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
         * enableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putBodyParameter("enableStatus", enableStatus);
            this.enableStatus = enableStatus;
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
        public Builder matchCount(Integer matchCount) {
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
        public Builder timeWindow(Long timeWindow) {
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
        public CreateRouteRuleRequest build() {
            return new CreateRouteRuleRequest(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("operationSymbol")
        @Validation(required = true)
        private String operationSymbol;

        @NameInMap("value")
        @Validation(required = true)
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
        @NameInMap("childConditionRelation")
        private Long childConditionRelation;

        @NameInMap("conditions")
        @Validation(required = true)
        private java.util.List < Conditions> conditions;

        @NameInMap("monitorSourceId")
        @Validation(required = true)
        private Long monitorSourceId;

        @NameInMap("problemLevel")
        private String problemLevel;

        private RouteChildRules(Builder builder) {
            this.childConditionRelation = builder.childConditionRelation;
            this.conditions = builder.conditions;
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
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
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
            private java.util.List < Conditions> conditions; 
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
             * conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
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
