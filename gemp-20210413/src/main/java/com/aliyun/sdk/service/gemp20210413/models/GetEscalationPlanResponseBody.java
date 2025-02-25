// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEscalationPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetEscalationPlanResponseBody</p>
 */
public class GetEscalationPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
        @com.aliyun.core.annotation.NameInMap("effection")
        private String effection;

        @com.aliyun.core.annotation.NameInMap("level")
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
             * effection.
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * level.
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
        @com.aliyun.core.annotation.NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @com.aliyun.core.annotation.NameInMap("noticeObjectName")
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
             * noticeObjectId.
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * noticeObjectName.
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
    public static class NoticeRoleObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private NoticeRoleObjectList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeRoleObjectList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NoticeRoleObjectList build() {
                return new NoticeRoleObjectList(this);
            } 

        } 

    }
    public static class ServiceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("serviceGroupName")
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * serviceGroupName.
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
        @com.aliyun.core.annotation.NameInMap("enableWebhook")
        private Boolean enableWebhook;

        @com.aliyun.core.annotation.NameInMap("escalationPlanType")
        private String escalationPlanType;

        @com.aliyun.core.annotation.NameInMap("noticeChannels")
        private String noticeChannels;

        @com.aliyun.core.annotation.NameInMap("noticeObjectList")
        private java.util.List < NoticeObjectList> noticeObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeObjects")
        private java.util.List < Long > noticeObjects;

        @com.aliyun.core.annotation.NameInMap("noticeRoleList")
        private java.util.List < Long > noticeRoleList;

        @com.aliyun.core.annotation.NameInMap("noticeRoleObjectList")
        private java.util.List < NoticeRoleObjectList> noticeRoleObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeTime")
        private Long noticeTime;

        @com.aliyun.core.annotation.NameInMap("serviceGroups")
        private java.util.List < ServiceGroups> serviceGroups;

        private EscalationPlanStrategies(Builder builder) {
            this.enableWebhook = builder.enableWebhook;
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeObjects = builder.noticeObjects;
            this.noticeRoleList = builder.noticeRoleList;
            this.noticeRoleObjectList = builder.noticeRoleObjectList;
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
         * @return noticeObjects
         */
        public java.util.List < Long > getNoticeObjects() {
            return this.noticeObjects;
        }

        /**
         * @return noticeRoleList
         */
        public java.util.List < Long > getNoticeRoleList() {
            return this.noticeRoleList;
        }

        /**
         * @return noticeRoleObjectList
         */
        public java.util.List < NoticeRoleObjectList> getNoticeRoleObjectList() {
            return this.noticeRoleObjectList;
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
            private java.util.List < Long > noticeObjects; 
            private java.util.List < Long > noticeRoleList; 
            private java.util.List < NoticeRoleObjectList> noticeRoleObjectList; 
            private Long noticeTime; 
            private java.util.List < ServiceGroups> serviceGroups; 

            /**
             * enableWebhook.
             */
            public Builder enableWebhook(Boolean enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * escalationPlanType.
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * noticeChannels.
             */
            public Builder noticeChannels(String noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * noticeObjectList.
             */
            public Builder noticeObjectList(java.util.List < NoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * noticeObjects.
             */
            public Builder noticeObjects(java.util.List < Long > noticeObjects) {
                this.noticeObjects = noticeObjects;
                return this;
            }

            /**
             * noticeRoleList.
             */
            public Builder noticeRoleList(java.util.List < Long > noticeRoleList) {
                this.noticeRoleList = noticeRoleList;
                return this;
            }

            /**
             * noticeRoleObjectList.
             */
            public Builder noticeRoleObjectList(java.util.List < NoticeRoleObjectList> noticeRoleObjectList) {
                this.noticeRoleObjectList = noticeRoleObjectList;
                return this;
            }

            /**
             * noticeTime.
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * serviceGroups.
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
        @com.aliyun.core.annotation.NameInMap("escalationPlanConditions")
        private java.util.List < EscalationPlanConditions> escalationPlanConditions;

        @com.aliyun.core.annotation.NameInMap("escalationPlanRuleId")
        private Long escalationPlanRuleId;

        @com.aliyun.core.annotation.NameInMap("escalationPlanStrategies")
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
             * escalationPlanConditions.
             */
            public Builder escalationPlanConditions(java.util.List < EscalationPlanConditions> escalationPlanConditions) {
                this.escalationPlanConditions = escalationPlanConditions;
                return this;
            }

            /**
             * escalationPlanRuleId.
             */
            public Builder escalationPlanRuleId(Long escalationPlanRuleId) {
                this.escalationPlanRuleId = escalationPlanRuleId;
                return this;
            }

            /**
             * escalationPlanStrategies.
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
        @com.aliyun.core.annotation.NameInMap("escalationPlanScopeObjects")
        private Integer escalationPlanScopeObjects;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scopeObjectDeletedType")
        private Integer scopeObjectDeletedType;

        @com.aliyun.core.annotation.NameInMap("scopeObjectId")
        private Long scopeObjectId;

        @com.aliyun.core.annotation.NameInMap("scopeObjectName")
        private String scopeObjectName;

        private EscalationPlanScopeObjects(Builder builder) {
            this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
            this.scope = builder.scope;
            this.scopeObjectDeletedType = builder.scopeObjectDeletedType;
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
         * @return escalationPlanScopeObjects
         */
        public Integer getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeObjectDeletedType
         */
        public Integer getScopeObjectDeletedType() {
            return this.scopeObjectDeletedType;
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
            private Integer escalationPlanScopeObjects; 
            private String scope; 
            private Integer scopeObjectDeletedType; 
            private Long scopeObjectId; 
            private String scopeObjectName; 

            /**
             * escalationPlanScopeObjects.
             */
            public Builder escalationPlanScopeObjects(Integer escalationPlanScopeObjects) {
                this.escalationPlanScopeObjects = escalationPlanScopeObjects;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * scopeObjectDeletedType.
             */
            public Builder scopeObjectDeletedType(Integer scopeObjectDeletedType) {
                this.scopeObjectDeletedType = scopeObjectDeletedType;
                return this;
            }

            /**
             * scopeObjectId.
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            /**
             * scopeObjectName.
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
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("escalationPlanDescription")
        private String escalationPlanDescription;

        @com.aliyun.core.annotation.NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @com.aliyun.core.annotation.NameInMap("escalationPlanName")
        private String escalationPlanName;

        @com.aliyun.core.annotation.NameInMap("escalationPlanRules")
        private java.util.List < EscalationPlanRules> escalationPlanRules;

        @com.aliyun.core.annotation.NameInMap("escalationPlanScopeObjects")
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects;

        @com.aliyun.core.annotation.NameInMap("isGlobal")
        private Boolean isGlobal;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.escalationPlanDescription = builder.escalationPlanDescription;
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
            this.escalationPlanRules = builder.escalationPlanRules;
            this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
            this.isGlobal = builder.isGlobal;
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

        /**
         * @return isGlobal
         */
        public Boolean getIsGlobal() {
            return this.isGlobal;
        }

        public static final class Builder {
            private String createTime; 
            private String escalationPlanDescription; 
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private java.util.List < EscalationPlanRules> escalationPlanRules; 
            private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 
            private Boolean isGlobal; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * escalationPlanDescription.
             */
            public Builder escalationPlanDescription(String escalationPlanDescription) {
                this.escalationPlanDescription = escalationPlanDescription;
                return this;
            }

            /**
             * escalationPlanId.
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * escalationPlanName.
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * escalationPlanRules.
             */
            public Builder escalationPlanRules(java.util.List < EscalationPlanRules> escalationPlanRules) {
                this.escalationPlanRules = escalationPlanRules;
                return this;
            }

            /**
             * escalationPlanScopeObjects.
             */
            public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
                this.escalationPlanScopeObjects = escalationPlanScopeObjects;
                return this;
            }

            /**
             * isGlobal.
             */
            public Builder isGlobal(Boolean isGlobal) {
                this.isGlobal = isGlobal;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
