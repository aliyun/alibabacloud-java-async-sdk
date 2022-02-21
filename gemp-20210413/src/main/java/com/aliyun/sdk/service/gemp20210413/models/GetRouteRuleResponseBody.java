// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRouteRuleResponseBody</p>
 */
public class GetRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetRouteRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRouteRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * 规则详情
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRouteRuleResponseBody build() {
            return new GetRouteRuleResponseBody(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("operationSymbol")
        private String operationSymbol;

        @NameInMap("value")
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
             * 条件可以
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 操作符
             */
            public Builder operationSymbol(String operationSymbol) {
                this.operationSymbol = operationSymbol;
                return this;
            }

            /**
             * 匹配值
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
    public static class EventRouteChildRules extends TeaModel {
        @NameInMap("childConditionRelation")
        private Long childConditionRelation;

        @NameInMap("childRouteRuleId")
        private Long childRouteRuleId;

        @NameInMap("conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("isValidChildRule")
        private Boolean isValidChildRule;

        @NameInMap("monitorIntegrationConfigId")
        private Long monitorIntegrationConfigId;

        @NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        @NameInMap("parentRuleId")
        private Long parentRuleId;

        private EventRouteChildRules(Builder builder) {
            this.childConditionRelation = builder.childConditionRelation;
            this.childRouteRuleId = builder.childRouteRuleId;
            this.conditions = builder.conditions;
            this.isValidChildRule = builder.isValidChildRule;
            this.monitorIntegrationConfigId = builder.monitorIntegrationConfigId;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
            this.parentRuleId = builder.parentRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventRouteChildRules create() {
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
         * @return monitorIntegrationConfigId
         */
        public Long getMonitorIntegrationConfigId() {
            return this.monitorIntegrationConfigId;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return parentRuleId
         */
        public Long getParentRuleId() {
            return this.parentRuleId;
        }

        public static final class Builder {
            private Long childConditionRelation; 
            private Long childRouteRuleId; 
            private java.util.List < Conditions> conditions; 
            private Boolean isValidChildRule; 
            private Long monitorIntegrationConfigId; 
            private Long monitorSourceId; 
            private String monitorSourceName; 
            private Long parentRuleId; 

            /**
             * 子条件计算关系，0-与，1-或
             */
            public Builder childConditionRelation(Long childConditionRelation) {
                this.childConditionRelation = childConditionRelation;
                return this;
            }

            /**
             * 子规则ID
             */
            public Builder childRouteRuleId(Long childRouteRuleId) {
                this.childRouteRuleId = childRouteRuleId;
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
             * 是否有效得规则true有效 false无效
             */
            public Builder isValidChildRule(Boolean isValidChildRule) {
                this.isValidChildRule = isValidChildRule;
                return this;
            }

            /**
             * 集成配置ID
             */
            public Builder monitorIntegrationConfigId(Long monitorIntegrationConfigId) {
                this.monitorIntegrationConfigId = monitorIntegrationConfigId;
                return this;
            }

            /**
             * 监控源ID
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * 监控源名称
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            /**
             * 规则ID
             */
            public Builder parentRuleId(Long parentRuleId) {
                this.parentRuleId = parentRuleId;
                return this;
            }

            public EventRouteChildRules build() {
                return new EventRouteChildRules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("assignObjectId")
        private Long assignObjectId;

        @NameInMap("assignObjectName")
        private String assignObjectName;

        @NameInMap("assignObjectType")
        private String assignObjectType;

        @NameInMap("childRuleRelation")
        private String childRuleRelation;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("effection")
        private String effection;

        @NameInMap("enableStatus")
        private String enableStatus;

        @NameInMap("eventRouteChildRules")
        private java.util.List < EventRouteChildRules> eventRouteChildRules;

        @NameInMap("incidentLevel")
        private String incidentLevel;

        @NameInMap("matchCount")
        private Long matchCount;

        @NameInMap("notifyChannelNames")
        private java.util.List < String > notifyChannelNames;

        @NameInMap("notifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("routeType")
        private String routeType;

        @NameInMap("ruleName")
        private String ruleName;

        @NameInMap("timeWindow")
        private Integer timeWindow;

        @NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.assignObjectId = builder.assignObjectId;
            this.assignObjectName = builder.assignObjectName;
            this.assignObjectType = builder.assignObjectType;
            this.childRuleRelation = builder.childRuleRelation;
            this.createTime = builder.createTime;
            this.effection = builder.effection;
            this.enableStatus = builder.enableStatus;
            this.eventRouteChildRules = builder.eventRouteChildRules;
            this.incidentLevel = builder.incidentLevel;
            this.matchCount = builder.matchCount;
            this.notifyChannelNames = builder.notifyChannelNames;
            this.notifyChannels = builder.notifyChannels;
            this.relatedServiceId = builder.relatedServiceId;
            this.relatedServiceName = builder.relatedServiceName;
            this.routeRuleId = builder.routeRuleId;
            this.routeType = builder.routeType;
            this.ruleName = builder.ruleName;
            this.timeWindow = builder.timeWindow;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assignObjectId
         */
        public Long getAssignObjectId() {
            return this.assignObjectId;
        }

        /**
         * @return assignObjectName
         */
        public String getAssignObjectName() {
            return this.assignObjectName;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return eventRouteChildRules
         */
        public java.util.List < EventRouteChildRules> getEventRouteChildRules() {
            return this.eventRouteChildRules;
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
         * @return notifyChannelNames
         */
        public java.util.List < String > getNotifyChannelNames() {
            return this.notifyChannelNames;
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
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long assignObjectId; 
            private String assignObjectName; 
            private String assignObjectType; 
            private String childRuleRelation; 
            private String createTime; 
            private String effection; 
            private String enableStatus; 
            private java.util.List < EventRouteChildRules> eventRouteChildRules; 
            private String incidentLevel; 
            private Long matchCount; 
            private java.util.List < String > notifyChannelNames; 
            private java.util.List < String > notifyChannels; 
            private Long relatedServiceId; 
            private String relatedServiceName; 
            private Long routeRuleId; 
            private String routeType; 
            private String ruleName; 
            private Integer timeWindow; 
            private String updateTime; 

            /**
             * 事件分派对象ID（服务组ID 或用户ID）
             */
            public Builder assignObjectId(Long assignObjectId) {
                this.assignObjectId = assignObjectId;
                return this;
            }

            /**
             * 通知对象名称
             */
            public Builder assignObjectName(String assignObjectName) {
                this.assignObjectName = assignObjectName;
                return this;
            }

            /**
             * 事件分派对象类型 SERVICEGROUP 服务组  USER 单个用户
             */
            public Builder assignObjectType(String assignObjectType) {
                this.assignObjectType = assignObjectType;
                return this;
            }

            /**
             * 子规则关系，0与，1或
             */
            public Builder childRuleRelation(String childRuleRelation) {
                this.childRuleRelation = childRuleRelation;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 影响程度  LOW一般  HIGH-严重
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * 是否启用  DISABLE禁用 ENABLE 启用
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * 子规则
             */
            public Builder eventRouteChildRules(java.util.List < EventRouteChildRules> eventRouteChildRules) {
                this.eventRouteChildRules = eventRouteChildRules;
                return this;
            }

            /**
             * 事件级别 P1 P2 P3 P4
             */
            public Builder incidentLevel(String incidentLevel) {
                this.incidentLevel = incidentLevel;
                return this;
            }

            /**
             * 命中次数
             */
            public Builder matchCount(Long matchCount) {
                this.matchCount = matchCount;
                return this;
            }

            /**
             * 通知渠道名称
             */
            public Builder notifyChannelNames(java.util.List < String > notifyChannelNames) {
                this.notifyChannelNames = notifyChannelNames;
                return this;
            }

            /**
             * 通知渠道
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * 关联服务ID
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * 关联服务名称
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * 规则ID
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * 路由类型：INCIDENT 触发事件 ALERT 仅触发报警
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * 流转规则名字
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * 时间窗口
             */
            public Builder timeWindow(Integer timeWindow) {
                this.timeWindow = timeWindow;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
