// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscriptionRequest</p>
 */
public class UpdateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expiredType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expiredType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyObjectList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < NotifyObjectList> notifyObjectList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyObjectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyStrategyList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < NotifyStrategyList> notifyStrategyList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    private String period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scopeObjectList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ScopeObjectList> scopeObjectList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long subscriptionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionTitle;

    private UpdateSubscriptionRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.expiredType = builder.expiredType;
        this.notifyObjectList = builder.notifyObjectList;
        this.notifyObjectType = builder.notifyObjectType;
        this.notifyStrategyList = builder.notifyStrategyList;
        this.period = builder.period;
        this.scope = builder.scope;
        this.scopeObjectList = builder.scopeObjectList;
        this.startTime = builder.startTime;
        this.subscriptionId = builder.subscriptionId;
        this.subscriptionTitle = builder.subscriptionTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return expiredType
     */
    public String getExpiredType() {
        return this.expiredType;
    }

    /**
     * @return notifyObjectList
     */
    public java.util.List < NotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    /**
     * @return notifyObjectType
     */
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    /**
     * @return notifyStrategyList
     */
    public java.util.List < NotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return scopeObjectList
     */
    public java.util.List < ScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subscriptionId
     */
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * @return subscriptionTitle
     */
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public static final class Builder extends Request.Builder<UpdateSubscriptionRequest, Builder> {
        private String endTime; 
        private String expiredType; 
        private java.util.List < NotifyObjectList> notifyObjectList; 
        private String notifyObjectType; 
        private java.util.List < NotifyStrategyList> notifyStrategyList; 
        private String period; 
        private String scope; 
        private java.util.List < ScopeObjectList> scopeObjectList; 
        private String startTime; 
        private Long subscriptionId; 
        private String subscriptionTitle; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscriptionRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.expiredType = request.expiredType;
            this.notifyObjectList = request.notifyObjectList;
            this.notifyObjectType = request.notifyObjectType;
            this.notifyStrategyList = request.notifyStrategyList;
            this.period = request.period;
            this.scope = request.scope;
            this.scopeObjectList = request.scopeObjectList;
            this.startTime = request.startTime;
            this.subscriptionId = request.subscriptionId;
            this.subscriptionTitle = request.subscriptionTitle;
        } 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * expiredType.
         */
        public Builder expiredType(String expiredType) {
            this.putBodyParameter("expiredType", expiredType);
            this.expiredType = expiredType;
            return this;
        }

        /**
         * notifyObjectList.
         */
        public Builder notifyObjectList(java.util.List < NotifyObjectList> notifyObjectList) {
            this.putBodyParameter("notifyObjectList", notifyObjectList);
            this.notifyObjectList = notifyObjectList;
            return this;
        }

        /**
         * notifyObjectType.
         */
        public Builder notifyObjectType(String notifyObjectType) {
            this.putBodyParameter("notifyObjectType", notifyObjectType);
            this.notifyObjectType = notifyObjectType;
            return this;
        }

        /**
         * notifyStrategyList.
         */
        public Builder notifyStrategyList(java.util.List < NotifyStrategyList> notifyStrategyList) {
            this.putBodyParameter("notifyStrategyList", notifyStrategyList);
            this.notifyStrategyList = notifyStrategyList;
            return this;
        }

        /**
         * period.
         */
        public Builder period(String period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * scopeObjectList.
         */
        public Builder scopeObjectList(java.util.List < ScopeObjectList> scopeObjectList) {
            this.putBodyParameter("scopeObjectList", scopeObjectList);
            this.scopeObjectList = scopeObjectList;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * subscriptionId.
         */
        public Builder subscriptionId(Long subscriptionId) {
            this.putBodyParameter("subscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * subscriptionTitle.
         */
        public Builder subscriptionTitle(String subscriptionTitle) {
            this.putBodyParameter("subscriptionTitle", subscriptionTitle);
            this.subscriptionTitle = subscriptionTitle;
            return this;
        }

        @Override
        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(this);
        } 

    } 

    public static class NotifyObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("notifyObjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long notifyObjectId;

        private NotifyObjectList(Builder builder) {
            this.id = builder.id;
            this.notifyObjectId = builder.notifyObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyObjectList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return notifyObjectId
         */
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public static final class Builder {
            private Long id; 
            private Long notifyObjectId; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * notifyObjectId.
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            public NotifyObjectList build() {
                return new NotifyObjectList(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("effection")
        private String effection;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("problemNotifyType")
        private String problemNotifyType;

        private Conditions(Builder builder) {
            this.action = builder.action;
            this.effection = builder.effection;
            this.level = builder.level;
            this.problemNotifyType = builder.problemNotifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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

        /**
         * @return problemNotifyType
         */
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

        public static final class Builder {
            private String action; 
            private String effection; 
            private String level; 
            private String problemNotifyType; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

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

            /**
             * problemNotifyType.
             */
            public Builder problemNotifyType(String problemNotifyType) {
                this.problemNotifyType = problemNotifyType;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class PeriodChannel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nonWorkday")
        private String nonWorkday;

        @com.aliyun.core.annotation.NameInMap("workday")
        private String workday;

        private PeriodChannel(Builder builder) {
            this.nonWorkday = builder.nonWorkday;
            this.workday = builder.workday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodChannel create() {
            return builder().build();
        }

        /**
         * @return nonWorkday
         */
        public String getNonWorkday() {
            return this.nonWorkday;
        }

        /**
         * @return workday
         */
        public String getWorkday() {
            return this.workday;
        }

        public static final class Builder {
            private String nonWorkday; 
            private String workday; 

            /**
             * nonWorkday.
             */
            public Builder nonWorkday(String nonWorkday) {
                this.nonWorkday = nonWorkday;
                return this;
            }

            /**
             * workday.
             */
            public Builder workday(String workday) {
                this.workday = workday;
                return this;
            }

            public PeriodChannel build() {
                return new PeriodChannel(this);
            } 

        } 

    }
    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("periodChannel")
        private PeriodChannel periodChannel;

        private Strategies(Builder builder) {
            this.channels = builder.channels;
            this.conditions = builder.conditions;
            this.id = builder.id;
            this.periodChannel = builder.periodChannel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return periodChannel
         */
        public PeriodChannel getPeriodChannel() {
            return this.periodChannel;
        }

        public static final class Builder {
            private String channels; 
            private java.util.List < Conditions> conditions; 
            private String id; 
            private PeriodChannel periodChannel; 

            /**
             * channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * periodChannel.
             */
            public Builder periodChannel(PeriodChannel periodChannel) {
                this.periodChannel = periodChannel;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
    public static class NotifyStrategyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long instanceType;

        @com.aliyun.core.annotation.NameInMap("strategies")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Strategies> strategies;

        private NotifyStrategyList(Builder builder) {
            this.instanceType = builder.instanceType;
            this.strategies = builder.strategies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyStrategyList create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public Long getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return strategies
         */
        public java.util.List < Strategies> getStrategies() {
            return this.strategies;
        }

        public static final class Builder {
            private Long instanceType; 
            private java.util.List < Strategies> strategies; 

            /**
             * instanceType.
             */
            public Builder instanceType(Long instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * strategies.
             */
            public Builder strategies(java.util.List < Strategies> strategies) {
                this.strategies = strategies;
                return this;
            }

            public NotifyStrategyList build() {
                return new NotifyStrategyList(this);
            } 

        } 

    }
    public static class ScopeObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("scopeObjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long scopeObjectId;

        private ScopeObjectList(Builder builder) {
            this.id = builder.id;
            this.scopeObjectId = builder.scopeObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeObjectList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public static final class Builder {
            private Long id; 
            private Long scopeObjectId; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * scopeObjectId.
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            public ScopeObjectList build() {
                return new ScopeObjectList(this);
            } 

        } 

    }
}
