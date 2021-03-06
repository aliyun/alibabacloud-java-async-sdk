// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEscalationPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateEscalationPlanRequest</p>
 */
public class UpdateEscalationPlanRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("escalationPlanDescription")
    private String escalationPlanDescription;

    @Body
    @NameInMap("escalationPlanId")
    @Validation(required = true)
    private Long escalationPlanId;

    @Body
    @NameInMap("escalationPlanName")
    private String escalationPlanName;

    @Body
    @NameInMap("escalationPlanRules")
    private java.util.List < EscalationPlanRules> escalationPlanRules;

    @Body
    @NameInMap("escalationPlanScopeObjects")
    private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects;

    private UpdateEscalationPlanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanDescription = builder.escalationPlanDescription;
        this.escalationPlanId = builder.escalationPlanId;
        this.escalationPlanName = builder.escalationPlanName;
        this.escalationPlanRules = builder.escalationPlanRules;
        this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEscalationPlanRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateEscalationPlanRequest, Builder> {
        private String clientToken; 
        private String escalationPlanDescription; 
        private Long escalationPlanId; 
        private String escalationPlanName; 
        private java.util.List < EscalationPlanRules> escalationPlanRules; 
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEscalationPlanRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.escalationPlanDescription = response.escalationPlanDescription;
            this.escalationPlanId = response.escalationPlanId;
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
         * ??????????????????
         */
        public Builder escalationPlanDescription(String escalationPlanDescription) {
            this.putBodyParameter("escalationPlanDescription", escalationPlanDescription);
            this.escalationPlanDescription = escalationPlanDescription;
            return this;
        }

        /**
         * ????????????id
         */
        public Builder escalationPlanId(Long escalationPlanId) {
            this.putBodyParameter("escalationPlanId", escalationPlanId);
            this.escalationPlanId = escalationPlanId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder escalationPlanName(String escalationPlanName) {
            this.putBodyParameter("escalationPlanName", escalationPlanName);
            this.escalationPlanName = escalationPlanName;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder escalationPlanRules(java.util.List < EscalationPlanRules> escalationPlanRules) {
            this.putBodyParameter("escalationPlanRules", escalationPlanRules);
            this.escalationPlanRules = escalationPlanRules;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.putBodyParameter("escalationPlanScopeObjects", escalationPlanScopeObjects);
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }

        @Override
        public UpdateEscalationPlanRequest build() {
            return new UpdateEscalationPlanRequest(this);
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
             * LOW HIGH
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * P1 P2 P3 P4
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
        private Boolean enableWebhook;

        @NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @NameInMap("noticeObjects")
        private java.util.List < Long > noticeObjects;

        @NameInMap("noticeTime")
        private Long noticeTime;

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
        public Long getNoticeTime() {
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
            private Long noticeTime; 
            private java.util.List < Long > serviceGroupIds; 

            /**
             * ?????????????????????
             */
            public Builder enableWebhook(Boolean enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * ????????????
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * ????????????id
             */
            public Builder noticeObjects(java.util.List < Long > noticeObjects) {
                this.noticeObjects = noticeObjects;
                return this;
            }

            /**
             * ????????????
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * ?????????id
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
        private java.util.List < EscalationPlanConditions> escalationPlanConditions;

        @NameInMap("escalationPlanStrategies")
        private java.util.List < EscalationPlanStrategies> escalationPlanStrategies;

        @NameInMap("escalationPlanType")
        private String escalationPlanType;

        @NameInMap("id")
        private Long id;

        private EscalationPlanRules(Builder builder) {
            this.escalationPlanConditions = builder.escalationPlanConditions;
            this.escalationPlanStrategies = builder.escalationPlanStrategies;
            this.escalationPlanType = builder.escalationPlanType;
            this.id = builder.id;
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

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List < EscalationPlanConditions> escalationPlanConditions; 
            private java.util.List < EscalationPlanStrategies> escalationPlanStrategies; 
            private String escalationPlanType; 
            private Long id; 

            /**
             * ????????????????????????
             */
            public Builder escalationPlanConditions(java.util.List < EscalationPlanConditions> escalationPlanConditions) {
                this.escalationPlanConditions = escalationPlanConditions;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder escalationPlanStrategies(java.util.List < EscalationPlanStrategies> escalationPlanStrategies) {
                this.escalationPlanStrategies = escalationPlanStrategies;
                return this;
            }

            /**
             * UN_ACKNOWLEDGE ????????? UN_FINISH ?????????
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * ??????
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public EscalationPlanRules build() {
                return new EscalationPlanRules(this);
            } 

        } 

    }
    public static class EscalationPlanScopeObjects extends TeaModel {
        @NameInMap("id")
        @Validation(required = true)
        private Long id;

        @NameInMap("scope")
        private String scope;

        @NameInMap("scopeObjectId")
        @Validation(required = true)
        private Long scopeObjectId;

        private EscalationPlanScopeObjects(Builder builder) {
            this.id = builder.id;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private Long id; 
            private String scope; 
            private Long scopeObjectId; 

            /**
             * ??????
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ????????????id
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
