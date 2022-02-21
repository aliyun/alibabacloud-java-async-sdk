// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEscalationPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateEscalationPlanRequest</p>
 */
public class CreateEscalationPlanRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("escalationPlanDescription")
    @Validation(required = true)
    private String escalationPlanDescription;

    @Body
    @NameInMap("escalationPlanName")
    @Validation(required = true)
    private String escalationPlanName;

    @Body
    @NameInMap("escalationPlanRules")
    @Validation(required = true)
    private java.util.List < EscalationPlanRules> escalationPlanRules;

    @Body
    @NameInMap("escalationPlanScopeObjects")
    @Validation(required = true)
    private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects;

    private CreateEscalationPlanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanDescription = builder.escalationPlanDescription;
        this.escalationPlanName = builder.escalationPlanName;
        this.escalationPlanRules = builder.escalationPlanRules;
        this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEscalationPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return escalationPlanDescription
     */
    public String getEscalationPlanDescription() {
        return this.escalationPlanDescription;
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

    public static final class Builder extends Request.Builder<CreateEscalationPlanRequest, Builder> {
        private String clientToken; 
        private String escalationPlanDescription; 
        private String escalationPlanName; 
        private java.util.List < EscalationPlanRules> escalationPlanRules; 
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 

        private Builder() {
            super();
        } 

        private Builder(CreateEscalationPlanRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.escalationPlanDescription = response.escalationPlanDescription;
            this.escalationPlanName = response.escalationPlanName;
            this.escalationPlanRules = response.escalationPlanRules;
            this.escalationPlanScopeObjects = response.escalationPlanScopeObjects;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 升级计划描述
         */
        public Builder escalationPlanDescription(String escalationPlanDescription) {
            this.putBodyParameter("escalationPlanDescription", escalationPlanDescription);
            this.escalationPlanDescription = escalationPlanDescription;
            return this;
        }

        /**
         * 升级计划名称
         */
        public Builder escalationPlanName(String escalationPlanName) {
            this.putBodyParameter("escalationPlanName", escalationPlanName);
            this.escalationPlanName = escalationPlanName;
            return this;
        }

        /**
         * 升级计划规则列表
         */
        public Builder escalationPlanRules(java.util.List < EscalationPlanRules> escalationPlanRules) {
            this.putBodyParameter("escalationPlanRules", escalationPlanRules);
            this.escalationPlanRules = escalationPlanRules;
            return this;
        }

        /**
         * 升级计划范围对象列表
         */
        public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.putBodyParameter("escalationPlanScopeObjects", escalationPlanScopeObjects);
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }

        @Override
        public CreateEscalationPlanRequest build() {
            return new CreateEscalationPlanRequest(this);
        } 

    } 

    public static class EscalationPlanConditions extends TeaModel {
        @NameInMap("effection")
        @Validation(required = true)
        private String effection;

        @NameInMap("level")
        @Validation(required = true)
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
    public static class EscalationPlanStrategies extends TeaModel {
        @NameInMap("enableWebhook")
        @Validation(required = true)
        private Boolean enableWebhook;

        @NameInMap("noticeChannels")
        @Validation(required = true)
        private java.util.List < String > noticeChannels;

        @NameInMap("noticeObjects")
        @Validation(required = true)
        private java.util.List < Long > noticeObjects;

        @NameInMap("noticeTime")
        @Validation(required = true)
        private String noticeTime;

        @NameInMap("serviceGroupIds")
        private java.util.List < Long > serviceGroupIds;

        private EscalationPlanStrategies(Builder builder) {
            this.enableWebhook = builder.enableWebhook;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjects = builder.noticeObjects;
            this.noticeTime = builder.noticeTime;
            this.serviceGroupIds = builder.serviceGroupIds;
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
         * @return noticeChannels
         */
        public java.util.List < String > getNoticeChannels() {
            return this.noticeChannels;
        }

        /**
         * @return noticeObjects
         */
        public java.util.List < Long > getNoticeObjects() {
            return this.noticeObjects;
        }

        /**
         * @return noticeTime
         */
        public String getNoticeTime() {
            return this.noticeTime;
        }

        /**
         * @return serviceGroupIds
         */
        public java.util.List < Long > getServiceGroupIds() {
            return this.serviceGroupIds;
        }

        public static final class Builder {
            private Boolean enableWebhook; 
            private java.util.List < String > noticeChannels; 
            private java.util.List < Long > noticeObjects; 
            private String noticeTime; 
            private java.util.List < Long > serviceGroupIds; 

            /**
             * 是否支持群通知
             */
            public Builder enableWebhook(Boolean enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * 升级通知策略
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * 升级通知对象id列表
             */
            public Builder noticeObjects(java.util.List < Long > noticeObjects) {
                this.noticeObjects = noticeObjects;
                return this;
            }

            /**
             * 通知时间
             */
            public Builder noticeTime(String noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * 服务组id
             */
            public Builder serviceGroupIds(java.util.List < Long > serviceGroupIds) {
                this.serviceGroupIds = serviceGroupIds;
                return this;
            }

            public EscalationPlanStrategies build() {
                return new EscalationPlanStrategies(this);
            } 

        } 

    }
    public static class EscalationPlanRules extends TeaModel {
        @NameInMap("escalationPlanConditions")
        @Validation(required = true)
        private java.util.List < EscalationPlanConditions> escalationPlanConditions;

        @NameInMap("escalationPlanStrategies")
        @Validation(required = true)
        private java.util.List < EscalationPlanStrategies> escalationPlanStrategies;

        @NameInMap("escalationPlanType")
        @Validation(required = true)
        private String escalationPlanType;

        private EscalationPlanRules(Builder builder) {
            this.escalationPlanConditions = builder.escalationPlanConditions;
            this.escalationPlanStrategies = builder.escalationPlanStrategies;
            this.escalationPlanType = builder.escalationPlanType;
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
         * @return escalationPlanStrategies
         */
        public java.util.List < EscalationPlanStrategies> getEscalationPlanStrategies() {
            return this.escalationPlanStrategies;
        }

        /**
         * @return escalationPlanType
         */
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public static final class Builder {
            private java.util.List < EscalationPlanConditions> escalationPlanConditions; 
            private java.util.List < EscalationPlanStrategies> escalationPlanStrategies; 
            private String escalationPlanType; 

            /**
             * 升级条件
             */
            public Builder escalationPlanConditions(java.util.List < EscalationPlanConditions> escalationPlanConditions) {
                this.escalationPlanConditions = escalationPlanConditions;
                return this;
            }

            /**
             * 升级策略
             */
            public Builder escalationPlanStrategies(java.util.List < EscalationPlanStrategies> escalationPlanStrategies) {
                this.escalationPlanStrategies = escalationPlanStrategies;
                return this;
            }

            /**
             * 升级类型
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
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
        @Validation(required = true)
        private Long scopeObjectId;

        private EscalationPlanScopeObjects(Builder builder) {
            this.scope = builder.scope;
            this.scopeObjectId = builder.scopeObjectId;
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

        public static final class Builder {
            private String scope; 
            private Long scopeObjectId; 

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

            public EscalationPlanScopeObjects build() {
                return new EscalationPlanScopeObjects(this);
            } 

        } 

    }
}
