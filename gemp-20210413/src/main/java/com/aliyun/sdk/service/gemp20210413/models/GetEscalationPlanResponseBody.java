// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEscalationPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetEscalationPlanResponseBody</p>
 */
public class GetEscalationPlanResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetEscalationPlanResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEscalationPlanResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEscalationPlanResponseBody build() {
            return new GetEscalationPlanResponseBody(this);
        } 

    } 

    public static class EscalationPlanConditions extends TeaModel {
        @NameInMap("effection")
        private String effection;

        @NameInMap("level")
        private String level;

        private EscalationPlanConditions(Builder builder) {
            this.effection = builder.effection;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlanConditions create() {
            return builder().build();
        }

        /**
         * @return effection
         */
        public String getEffection() {
            return this.effection;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String effection; 
            private String level; 

            /**
             * 影响等级
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * 事件等级
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public EscalationPlanConditions build() {
                return new EscalationPlanConditions(this);
            } 

        } 

    }
    public static class NoticeObjectList extends TeaModel {
        @NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @NameInMap("noticeObjectName")
        private String noticeObjectName;

        private NoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeObjectList create() {
            return builder().build();
        }

        /**
         * @return noticeObjectId
         */
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        /**
         * @return noticeObjectName
         */
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 

            /**
             * 通知对象id
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * 通知对象名称
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            public NoticeObjectList build() {
                return new NoticeObjectList(this);
            } 

        } 

    }
    public static class ServiceGroups extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        private ServiceGroups(Builder builder) {
            this.id = builder.id;
            this.serviceGroupName = builder.serviceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroups create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public static final class Builder {
            private Long id; 
            private String serviceGroupName; 

            /**
             * 服务组id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 服务组名称
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            public ServiceGroups build() {
                return new ServiceGroups(this);
            } 

        } 

    }
    public static class EscalationPlanStrategies extends TeaModel {
        @NameInMap("enableWebhook")
        private Boolean enableWebhook;

        @NameInMap("escalationPlanType")
        private String escalationPlanType;

        @NameInMap("noticeChannels")
        private String noticeChannels;

        @NameInMap("noticeObjectList")
        private java.util.List < NoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        private Long noticeTime;

        @NameInMap("serviceGroups")
        private java.util.List < ServiceGroups> serviceGroups;

        private EscalationPlanStrategies(Builder builder) {
            this.enableWebhook = builder.enableWebhook;
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeTime = builder.noticeTime;
            this.serviceGroups = builder.serviceGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlanStrategies create() {
            return builder().build();
        }

        /**
         * @return enableWebhook
         */
        public Boolean getEnableWebhook() {
            return this.enableWebhook;
        }

        /**
         * @return escalationPlanType
         */
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        /**
         * @return noticeChannels
         */
        public String getNoticeChannels() {
            return this.noticeChannels;
        }

        /**
         * @return noticeObjectList
         */
        public java.util.List < NoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        /**
         * @return noticeTime
         */
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        /**
         * @return serviceGroups
         */
        public java.util.List < ServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

        public static final class Builder {
            private Boolean enableWebhook; 
            private String escalationPlanType; 
            private String noticeChannels; 
            private java.util.List < NoticeObjectList> noticeObjectList; 
            private Long noticeTime; 
            private java.util.List < ServiceGroups> serviceGroups; 

            /**
             * 是否支持群通知
             */
            public Builder enableWebhook(Boolean enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * 升级计划类型
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * 通知对象渠道
             */
            public Builder noticeChannels(String noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * 通知对象列表
             */
            public Builder noticeObjectList(java.util.List < NoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * 通知时间
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * 服务组列表
             */
            public Builder serviceGroups(java.util.List < ServiceGroups> serviceGroups) {
                this.serviceGroups = serviceGroups;
                return this;
            }

            public EscalationPlanStrategies build() {
                return new EscalationPlanStrategies(this);
            } 

        } 

    }
    public static class EscalationPlanRules extends TeaModel {
        @NameInMap("escalationPlanConditions")
        private java.util.List < EscalationPlanConditions> escalationPlanConditions;

        @NameInMap("escalationPlanRuleId")
        private Long escalationPlanRuleId;

        @NameInMap("escalationPlanStrategies")
        private java.util.List < EscalationPlanStrategies> escalationPlanStrategies;

        private EscalationPlanRules(Builder builder) {
            this.escalationPlanConditions = builder.escalationPlanConditions;
            this.escalationPlanRuleId = builder.escalationPlanRuleId;
            this.escalationPlanStrategies = builder.escalationPlanStrategies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlanRules create() {
            return builder().build();
        }

        /**
         * @return escalationPlanConditions
         */
        public java.util.List < EscalationPlanConditions> getEscalationPlanConditions() {
            return this.escalationPlanConditions;
        }

        /**
         * @return escalationPlanRuleId
         */
        public Long getEscalationPlanRuleId() {
            return this.escalationPlanRuleId;
        }

        /**
         * @return escalationPlanStrategies
         */
        public java.util.List < EscalationPlanStrategies> getEscalationPlanStrategies() {
            return this.escalationPlanStrategies;
        }

        public static final class Builder {
            private java.util.List < EscalationPlanConditions> escalationPlanConditions; 
            private Long escalationPlanRuleId; 
            private java.util.List < EscalationPlanStrategies> escalationPlanStrategies; 

            /**
             * 升级计划条件
             */
            public Builder escalationPlanConditions(java.util.List < EscalationPlanConditions> escalationPlanConditions) {
                this.escalationPlanConditions = escalationPlanConditions;
                return this;
            }

            /**
             * 升级计划id
             */
            public Builder escalationPlanRuleId(Long escalationPlanRuleId) {
                this.escalationPlanRuleId = escalationPlanRuleId;
                return this;
            }

            /**
             * 升级计划策略
             */
            public Builder escalationPlanStrategies(java.util.List < EscalationPlanStrategies> escalationPlanStrategies) {
                this.escalationPlanStrategies = escalationPlanStrategies;
                return this;
            }

            public EscalationPlanRules build() {
                return new EscalationPlanRules(this);
            } 

        } 

    }
    public static class EscalationPlanScopeObjects extends TeaModel {
        @NameInMap("scope")
        private String scope;

        @NameInMap("scopeObjectId")
        private Long scopeObjectId;

        @NameInMap("scopeObjectName")
        private String scopeObjectName;

        private EscalationPlanScopeObjects(Builder builder) {
            this.scope = builder.scope;
            this.scopeObjectId = builder.scopeObjectId;
            this.scopeObjectName = builder.scopeObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlanScopeObjects create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        /**
         * @return scopeObjectName
         */
        public String getScopeObjectName() {
            return this.scopeObjectName;
        }

        public static final class Builder {
            private String scope; 
            private Long scopeObjectId; 
            private String scopeObjectName; 

            /**
             * 范围对象类型
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 范围对象id
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            /**
             * 范围对象名称
             */
            public Builder scopeObjectName(String scopeObjectName) {
                this.scopeObjectName = scopeObjectName;
                return this;
            }

            public EscalationPlanScopeObjects build() {
                return new EscalationPlanScopeObjects(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("escalationPlanDescription")
        private String escalationPlanDescription;

        @NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @NameInMap("escalationPlanName")
        private String escalationPlanName;

        @NameInMap("escalationPlanRules")
        private java.util.List < EscalationPlanRules> escalationPlanRules;

        @NameInMap("escalationPlanScopeObjects")
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.escalationPlanDescription = builder.escalationPlanDescription;
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
            this.escalationPlanRules = builder.escalationPlanRules;
            this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return escalationPlanDescription
         */
        public String getEscalationPlanDescription() {
            return this.escalationPlanDescription;
        }

        /**
         * @return escalationPlanId
         */
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        /**
         * @return escalationPlanName
         */
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        /**
         * @return escalationPlanRules
         */
        public java.util.List < EscalationPlanRules> getEscalationPlanRules() {
            return this.escalationPlanRules;
        }

        /**
         * @return escalationPlanScopeObjects
         */
        public java.util.List < EscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        public static final class Builder {
            private String createTime; 
            private String escalationPlanDescription; 
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private java.util.List < EscalationPlanRules> escalationPlanRules; 
            private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 升级计划描述
             */
            public Builder escalationPlanDescription(String escalationPlanDescription) {
                this.escalationPlanDescription = escalationPlanDescription;
                return this;
            }

            /**
             * 升级计划id
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * 升级计划名称
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * 升级计划规则列表
             */
            public Builder escalationPlanRules(java.util.List < EscalationPlanRules> escalationPlanRules) {
                this.escalationPlanRules = escalationPlanRules;
                return this;
            }

            /**
             * 升级计划范围对象列表
             */
            public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
                this.escalationPlanScopeObjects = escalationPlanScopeObjects;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
