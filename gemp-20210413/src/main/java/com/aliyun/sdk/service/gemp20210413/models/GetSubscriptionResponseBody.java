// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionResponseBody</p>
 */
public class GetSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSubscriptionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionResponseBody create() {
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
         * Object
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSubscriptionResponseBody build() {
            return new GetSubscriptionResponseBody(this);
        } 

    } 

    public static class NotifyObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("notifyObjectId")
        private Long notifyObjectId;

        @com.aliyun.core.annotation.NameInMap("notifyObjectType")
        private Long notifyObjectType;

        private NotifyObjectList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.notifyObjectId = builder.notifyObjectId;
            this.notifyObjectType = builder.notifyObjectType;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyObjectId
         */
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        /**
         * @return notifyObjectType
         */
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private Long notifyObjectId; 
            private Long notifyObjectType; 

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

            /**
             * notifyObjectId.
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * notifyObjectType.
             */
            public Builder notifyObjectType(Long notifyObjectType) {
                this.notifyObjectType = notifyObjectType;
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
        private Long id;

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
        public Long getId() {
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
            private Long id; 
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
            public Builder id(Long id) {
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
        private Long instanceType;

        @com.aliyun.core.annotation.NameInMap("strategies")
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

        @com.aliyun.core.annotation.NameInMap("isValid")
        private Long isValid;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scopeObject")
        private String scopeObject;

        @com.aliyun.core.annotation.NameInMap("scopeObjectId")
        private Long scopeObjectId;

        private ScopeObjectList(Builder builder) {
            this.id = builder.id;
            this.isValid = builder.isValid;
            this.scope = builder.scope;
            this.scopeObject = builder.scopeObject;
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
         * @return isValid
         */
        public Long getIsValid() {
            return this.isValid;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeObject
         */
        public String getScopeObject() {
            return this.scopeObject;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public static final class Builder {
            private Long id; 
            private Long isValid; 
            private String scope; 
            private String scopeObject; 
            private Long scopeObjectId; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * isValid.
             */
            public Builder isValid(Long isValid) {
                this.isValid = isValid;
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
             * scopeObject.
             */
            public Builder scopeObject(String scopeObject) {
                this.scopeObject = scopeObject;
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("expiredType")
        private String expiredType;

        @com.aliyun.core.annotation.NameInMap("notifyObjectList")
        private java.util.List < NotifyObjectList> notifyObjectList;

        @com.aliyun.core.annotation.NameInMap("notifyObjectType")
        private String notifyObjectType;

        @com.aliyun.core.annotation.NameInMap("notifyStrategyList")
        private java.util.List < NotifyStrategyList> notifyStrategyList;

        @com.aliyun.core.annotation.NameInMap("period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scopeObjectList")
        private java.util.List < ScopeObjectList> scopeObjectList;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subscriptionId")
        private Long subscriptionId;

        @com.aliyun.core.annotation.NameInMap("subscriptionTitle")
        private String subscriptionTitle;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.expiredType = builder.expiredType;
            this.notifyObjectList = builder.notifyObjectList;
            this.notifyObjectType = builder.notifyObjectType;
            this.notifyStrategyList = builder.notifyStrategyList;
            this.period = builder.period;
            this.scope = builder.scope;
            this.scopeObjectList = builder.scopeObjectList;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subscriptionId = builder.subscriptionId;
            this.subscriptionTitle = builder.subscriptionTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String endTime; 
            private String expiredType; 
            private java.util.List < NotifyObjectList> notifyObjectList; 
            private String notifyObjectType; 
            private java.util.List < NotifyStrategyList> notifyStrategyList; 
            private String period; 
            private String scope; 
            private java.util.List < ScopeObjectList> scopeObjectList; 
            private String startTime; 
            private String status; 
            private Long subscriptionId; 
            private String subscriptionTitle; 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * expiredType.
             */
            public Builder expiredType(String expiredType) {
                this.expiredType = expiredType;
                return this;
            }

            /**
             * notifyObjectList.
             */
            public Builder notifyObjectList(java.util.List < NotifyObjectList> notifyObjectList) {
                this.notifyObjectList = notifyObjectList;
                return this;
            }

            /**
             * notifyObjectType.
             */
            public Builder notifyObjectType(String notifyObjectType) {
                this.notifyObjectType = notifyObjectType;
                return this;
            }

            /**
             * notifyStrategyList.
             */
            public Builder notifyStrategyList(java.util.List < NotifyStrategyList> notifyStrategyList) {
                this.notifyStrategyList = notifyStrategyList;
                return this;
            }

            /**
             * period.
             */
            public Builder period(String period) {
                this.period = period;
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
             * Array
             */
            public Builder scopeObjectList(java.util.List < ScopeObjectList> scopeObjectList) {
                this.scopeObjectList = scopeObjectList;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subscriptionId.
             */
            public Builder subscriptionId(Long subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * subscriptionTitle.
             */
            public Builder subscriptionTitle(String subscriptionTitle) {
                this.subscriptionTitle = subscriptionTitle;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
