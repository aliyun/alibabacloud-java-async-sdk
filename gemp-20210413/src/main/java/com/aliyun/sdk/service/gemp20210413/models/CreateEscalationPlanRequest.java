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

    @Body
    @NameInMap("isGlobal")
    private Boolean isGlobal;

    private CreateEscalationPlanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanDescription = builder.escalationPlanDescription;
        this.escalationPlanName = builder.escalationPlanName;
        this.escalationPlanRules = builder.escalationPlanRules;
        this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
        this.isGlobal = builder.isGlobal;
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

    /**
     * @return isGlobal
     */
    public Boolean getIsGlobal() {
        return this.isGlobal;
    }

    public static final class Builder extends Request.Builder<CreateEscalationPlanRequest, Builder> {
        private String clientToken; 
        private String escalationPlanDescription; 
        private String escalationPlanName; 
        private java.util.List < EscalationPlanRules> escalationPlanRules; 
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 
        private Boolean isGlobal; 

        private Builder() {
            super();
        } 

        private Builder(CreateEscalationPlanRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.escalationPlanDescription = request.escalationPlanDescription;
            this.escalationPlanName = request.escalationPlanName;
            this.escalationPlanRules = request.escalationPlanRules;
            this.escalationPlanScopeObjects = request.escalationPlanScopeObjects;
            this.isGlobal = request.isGlobal;
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
         * escalationPlanDescription.
         */
        public Builder escalationPlanDescription(String escalationPlanDescription) {
            this.putBodyParameter("escalationPlanDescription", escalationPlanDescription);
            this.escalationPlanDescription = escalationPlanDescription;
            return this;
        }

        /**
         * escalationPlanName.
         */
        public Builder escalationPlanName(String escalationPlanName) {
            this.putBodyParameter("escalationPlanName", escalationPlanName);
            this.escalationPlanName = escalationPlanName;
            return this;
        }

        /**
         * escalationPlanRules.
         */
        public Builder escalationPlanRules(java.util.List < EscalationPlanRules> escalationPlanRules) {
            this.putBodyParameter("escalationPlanRules", escalationPlanRules);
            this.escalationPlanRules = escalationPlanRules;
            return this;
        }

        /**
         * escalationPlanScopeObjects.
         */
        public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.putBodyParameter("escalationPlanScopeObjects", escalationPlanScopeObjects);
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }

        /**
         * isGlobal.
         */
        public Builder isGlobal(Boolean isGlobal) {
            this.putBodyParameter("isGlobal", isGlobal);
            this.isGlobal = isGlobal;
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
    public static class EscalationPlanStrategies extends TeaModel {
        @NameInMap("enableWebhook")
        @Validation(required = true)
        private Boolean enableWebhook;

        @NameInMap("escalationPlanType")
        private String escalationPlanType;

        @NameInMap("noticeChannels")
        @Validation(required = true)
        private java.util.List < String > noticeChannels;

        @NameInMap("noticeObjects")
        @Validation(required = true)
        private java.util.List < Long > noticeObjects;

        @NameInMap("noticeRoleList")
        private java.util.List < Long > noticeRoleList;

        @NameInMap("noticeTime")
        @Validation(required = true)
        private String noticeTime;

        @NameInMap("serviceGroupIds")
        private java.util.List < Long > serviceGroupIds;

        private EscalationPlanStrategies(Builder builder) {
            this.enableWebhook = builder.enableWebhook;
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjects = builder.noticeObjects;
            this.noticeRoleList = builder.noticeRoleList;
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
         * @return escalationPlanType
         */
        public String getEscalationPlanType() {
            return this.escalationPlanType;
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
         * @return noticeRoleList
         */
        public java.util.List < Long > getNoticeRoleList() {
            return this.noticeRoleList;
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
            private String escalationPlanType; 
            private java.util.List < String > noticeChannels; 
            private java.util.List < Long > noticeObjects; 
            private java.util.List < Long > noticeRoleList; 
            private String noticeTime; 
            private java.util.List < Long > serviceGroupIds; 

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
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
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
             * noticeTime.
             */
            public Builder noticeTime(String noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * serviceGroupIds.
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
             * escalationPlanConditions.
             */
            public Builder escalationPlanConditions(java.util.List < EscalationPlanConditions> escalationPlanConditions) {
                this.escalationPlanConditions = escalationPlanConditions;
                return this;
            }

            /**
             * escalationPlanStrategies.
             */
            public Builder escalationPlanStrategies(java.util.List < EscalationPlanStrategies> escalationPlanStrategies) {
                this.escalationPlanStrategies = escalationPlanStrategies;
                return this;
            }

            /**
             * escalationPlanType.
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
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * scopeObjectId.
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
