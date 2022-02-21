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
        this.effection = builder.effection;
        this.enableStatus = builder.enableStatus;
        this.incidentLevel = builder.incidentLevel;
        this.matchCount = builder.matchCount;
        this.notifyChannels = builder.notifyChannels;
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
        private String effection; 
        private String enableStatus; 
        private String incidentLevel; 
        private Integer matchCount; 
        private java.util.List < String > notifyChannels; 
        private Long relatedServiceId; 
        private java.util.List < RouteChildRules> routeChildRules; 
        private String routeType; 
        private String ruleName; 
        private Long timeWindow; 
        private String timeWindowUnit; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteRuleRequest response) {
            super(response);
            this.assignObjectId = response.assignObjectId;
            this.assignObjectType = response.assignObjectType;
            this.childRuleRelation = response.childRuleRelation;
            this.clientToken = response.clientToken;
            this.effection = response.effection;
            this.enableStatus = response.enableStatus;
            this.incidentLevel = response.incidentLevel;
            this.matchCount = response.matchCount;
            this.notifyChannels = response.notifyChannels;
            this.relatedServiceId = response.relatedServiceId;
            this.routeChildRules = response.routeChildRules;
            this.routeType = response.routeType;
            this.ruleName = response.ruleName;
            this.timeWindow = response.timeWindow;
            this.timeWindowUnit = response.timeWindowUnit;
        } 

        /**
         * 事件分派对象ID（服务组ID 或用户ID）
         */
        public Builder assignObjectId(Long assignObjectId) {
            this.putBodyParameter("assignObjectId", assignObjectId);
            this.assignObjectId = assignObjectId;
            return this;
        }

        /**
         * 事件分派对象类型 SERVICEGROUP服务组 USER 单个用户
         */
        public Builder assignObjectType(String assignObjectType) {
            this.putBodyParameter("assignObjectType", assignObjectType);
            this.assignObjectType = assignObjectType;
            return this;
        }

        /**
         * 子规则关系AND,OR
         */
        public Builder childRuleRelation(String childRuleRelation) {
            this.putBodyParameter("childRuleRelation", childRuleRelation);
            this.childRuleRelation = childRuleRelation;
            return this;
        }

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 影响程度 LOW-一般 HIGH-严重
         */
        public Builder effection(String effection) {
            this.putBodyParameter("effection", effection);
            this.effection = effection;
            return this;
        }

        /**
         * 启用状态
         */
        public Builder enableStatus(String enableStatus) {
            this.putBodyParameter("enableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * 事件级别 P1 P2 P3 P4
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * 命中次数
         */
        public Builder matchCount(Integer matchCount) {
            this.putBodyParameter("matchCount", matchCount);
            this.matchCount = matchCount;
            return this;
        }

        /**
         * 通知渠道。 SMS 短信  EMAIL 邮件  PHONE电话  WEIXIN_GROUP 企微群 DING_GROUP钉钉群
         */
        public Builder notifyChannels(java.util.List < String > notifyChannels) {
            this.putBodyParameter("notifyChannels", notifyChannels);
            this.notifyChannels = notifyChannels;
            return this;
        }

        /**
         * 关联服务ID
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * 子规则
         */
        public Builder routeChildRules(java.util.List < RouteChildRules> routeChildRules) {
            this.putBodyParameter("routeChildRules", routeChildRules);
            this.routeChildRules = routeChildRules;
            return this;
        }

        /**
         * 路由类型：INCIDENT 触发事件 ALERT仅触发报警
         */
        public Builder routeType(String routeType) {
            this.putBodyParameter("routeType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 时间窗口
         */
        public Builder timeWindow(Long timeWindow) {
            this.putBodyParameter("timeWindow", timeWindow);
            this.timeWindow = timeWindow;
            return this;
        }

        /**
         * 时间窗口单位 MINUTE  分钟  SECOND 秒
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
             * 字段名称
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 操作符号：notContain 不包含；contain 包含；equals 等于；notEquals 不等于；
             */
            public Builder operationSymbol(String operationSymbol) {
                this.operationSymbol = operationSymbol;
                return this;
            }

            /**
             * 字段值
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

        private RouteChildRules(Builder builder) {
            this.childConditionRelation = builder.childConditionRelation;
            this.conditions = builder.conditions;
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

        public static final class Builder {
            private Long childConditionRelation; 
            private java.util.List < Conditions> conditions; 
            private Long monitorSourceId; 

            /**
             * 0-与，1-或
             */
            public Builder childConditionRelation(Long childConditionRelation) {
                this.childConditionRelation = childConditionRelation;
                return this;
            }

            /**
             * 条件
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * 监控源ID
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
