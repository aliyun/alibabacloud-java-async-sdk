// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteRuleRequest</p>
 */
public class UpdateRouteRuleRequest extends Request {
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
    private String childRuleRelation;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("effection")
    @Validation(required = true)
    private String effection;

    @Body
    @NameInMap("incidentLevel")
    @Validation(required = true)
    private String incidentLevel;

    @Body
    @NameInMap("matchCount")
    @Validation(required = true)
    private Long matchCount;

    @Body
    @NameInMap("notifyChannels")
    @Validation(required = true)
    private java.util.List < String > notifyChannels;

    @Body
    @NameInMap("relatedServiceId")
    @Validation(required = true)
    private Long relatedServiceId;

    @Body
    @NameInMap("routeChildRules")
    @Validation(required = true)
    private java.util.List < RouteChildRules> routeChildRules;

    @Body
    @NameInMap("routeRuleId")
    @Validation(required = true)
    private Long routeRuleId;

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
    private Integer timeWindow;

    @Body
    @NameInMap("timeWindowUnit")
    @Validation(required = true)
    private String timeWindowUnit;

    private UpdateRouteRuleRequest(Builder builder) {
        super(builder);
        this.assignObjectId = builder.assignObjectId;
        this.assignObjectType = builder.assignObjectType;
        this.childRuleRelation = builder.childRuleRelation;
        this.clientToken = builder.clientToken;
        this.effection = builder.effection;
        this.incidentLevel = builder.incidentLevel;
        this.matchCount = builder.matchCount;
        this.notifyChannels = builder.notifyChannels;
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
        private String effection; 
        private String incidentLevel; 
        private Long matchCount; 
        private java.util.List < String > notifyChannels; 
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

        private Builder(UpdateRouteRuleRequest response) {
            super(response);
            this.assignObjectId = response.assignObjectId;
            this.assignObjectType = response.assignObjectType;
            this.childRuleRelation = response.childRuleRelation;
            this.clientToken = response.clientToken;
            this.effection = response.effection;
            this.incidentLevel = response.incidentLevel;
            this.matchCount = response.matchCount;
            this.notifyChannels = response.notifyChannels;
            this.relatedServiceId = response.relatedServiceId;
            this.routeChildRules = response.routeChildRules;
            this.routeRuleId = response.routeRuleId;
            this.routeType = response.routeType;
            this.ruleName = response.ruleName;
            this.timeWindow = response.timeWindow;
            this.timeWindowUnit = response.timeWindowUnit;
        } 

        /**
         * ??????????????????ID????????????ID ?????????ID???
         */
        public Builder assignObjectId(Long assignObjectId) {
            this.putBodyParameter("assignObjectId", assignObjectId);
            this.assignObjectId = assignObjectId;
            return this;
        }

        /**
         * ???????????????????????? SERVICEGROUP?????????  USER ????????????
         */
        public Builder assignObjectType(String assignObjectType) {
            this.putBodyParameter("assignObjectType", assignObjectType);
            this.assignObjectType = assignObjectType;
            return this;
        }

        /**
         * AND
         */
        public Builder childRuleRelation(String childRuleRelation) {
            this.putBodyParameter("childRuleRelation", childRuleRelation);
            this.childRuleRelation = childRuleRelation;
            return this;
        }

        /**
         * ?????????
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ???????????? LOW-?????? HIGH-??????
         */
        public Builder effection(String effection) {
            this.putBodyParameter("effection", effection);
            this.effection = effection;
            return this;
        }

        /**
         * ???????????? 1-P1 2-P2 3-P3 4-P4
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * ????????????
         */
        public Builder matchCount(Long matchCount) {
            this.putBodyParameter("matchCount", matchCount);
            this.matchCount = matchCount;
            return this;
        }

        /**
         * ????????????    SMS ??????  EMAIL  ??????  PHONE  ??????  WEIXIN_GROUP ????????? DING_GROUP ?????????
         */
        public Builder notifyChannels(java.util.List < String > notifyChannels) {
            this.putBodyParameter("notifyChannels", notifyChannels);
            this.notifyChannels = notifyChannels;
            return this;
        }

        /**
         * ????????????ID
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * ?????????
         */
        public Builder routeChildRules(java.util.List < RouteChildRules> routeChildRules) {
            this.putBodyParameter("routeChildRules", routeChildRules);
            this.routeChildRules = routeChildRules;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        /**
         * ???????????????INCIDENT ???????????? ALERT ???????????????
         */
        public Builder routeType(String routeType) {
            this.putBodyParameter("routeType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * ????????????
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder timeWindow(Integer timeWindow) {
            this.putBodyParameter("timeWindow", timeWindow);
            this.timeWindow = timeWindow;
            return this;
        }

        /**
         * ?????????????????? MINUTE ??????  SECOND ???
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
             * ??????
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * ?????????
             */
            public Builder operationSymbol(String operationSymbol) {
                this.operationSymbol = operationSymbol;
                return this;
            }

            /**
             * ????????????
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

        @NameInMap("childRouteRuleId")
        @Validation(required = true)
        private Long childRouteRuleId;

        @NameInMap("conditions")
        @Validation(required = true)
        private java.util.List < Conditions> conditions;

        @NameInMap("isValidChildRule")
        @Validation(required = true)
        private Boolean isValidChildRule;

        @NameInMap("monitorSourceId")
        @Validation(required = true)
        private Long monitorSourceId;

        private RouteChildRules(Builder builder) {
            this.childConditionRelation = builder.childConditionRelation;
            this.childRouteRuleId = builder.childRouteRuleId;
            this.conditions = builder.conditions;
            this.isValidChildRule = builder.isValidChildRule;
            this.monitorSourceId = builder.monitorSourceId;
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

        public static final class Builder {
            private Long childConditionRelation; 
            private Long childRouteRuleId; 
            private java.util.List < Conditions> conditions; 
            private Boolean isValidChildRule; 
            private Long monitorSourceId; 

            /**
             * ?????????????????????
             */
            public Builder childConditionRelation(Long childConditionRelation) {
                this.childConditionRelation = childConditionRelation;
                return this;
            }

            /**
             * ?????????ID ??????????????????
             */
            public Builder childRouteRuleId(Long childRouteRuleId) {
                this.childRouteRuleId = childRouteRuleId;
                return this;
            }

            /**
             * ??????
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * true  ???????????????  false???????????????
             */
            public Builder isValidChildRule(Boolean isValidChildRule) {
                this.isValidChildRule = isValidChildRule;
                return this;
            }

            /**
             * ?????????ID
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            public RouteChildRules build() {
                return new RouteChildRules(this);
            } 

        } 

    }
}
