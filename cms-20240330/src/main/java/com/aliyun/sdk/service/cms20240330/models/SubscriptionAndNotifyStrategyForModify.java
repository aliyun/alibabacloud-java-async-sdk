// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubscriptionAndNotifyStrategyForModify} extends {@link TeaModel}
 *
 * <p>SubscriptionAndNotifyStrategyForModify</p>
 */
public class SubscriptionAndNotifyStrategyForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyStrategy")
    private NotifyStrategyForSNSModify notifyStrategy;

    @com.aliyun.core.annotation.NameInMap("responsePlan")
    private IncidentResponsePlanForSNSModify responsePlan;

    @com.aliyun.core.annotation.NameInMap("subscription")
    private SubscriptionForSNSModify subscription;

    @com.aliyun.core.annotation.NameInMap("subscriptions")
    private java.util.List<SubscriptionOp> subscriptions;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private SubscriptionAndNotifyStrategyForModify(Builder builder) {
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.responsePlan = builder.responsePlan;
        this.subscription = builder.subscription;
        this.subscriptions = builder.subscriptions;
        this.uuid = builder.uuid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionAndNotifyStrategyForModify create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyStrategy
     */
    public NotifyStrategyForSNSModify getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return responsePlan
     */
    public IncidentResponsePlanForSNSModify getResponsePlan() {
        return this.responsePlan;
    }

    /**
     * @return subscription
     */
    public SubscriptionForSNSModify getSubscription() {
        return this.subscription;
    }

    /**
     * @return subscriptions
     */
    public java.util.List<SubscriptionOp> getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String description; 
        private Boolean enabled; 
        private String name; 
        private NotifyStrategyForSNSModify notifyStrategy; 
        private IncidentResponsePlanForSNSModify responsePlan; 
        private SubscriptionForSNSModify subscription; 
        private java.util.List<SubscriptionOp> subscriptions; 
        private String uuid; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(SubscriptionAndNotifyStrategyForModify model) {
            this.description = model.description;
            this.enabled = model.enabled;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
            this.responsePlan = model.responsePlan;
            this.subscription = model.subscription;
            this.subscriptions = model.subscriptions;
            this.uuid = model.uuid;
            this.version = model.version;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>可省略，后端会从 notifyStrategy 派生</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * notifyStrategy.
         */
        public Builder notifyStrategy(NotifyStrategyForSNSModify notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * responsePlan.
         */
        public Builder responsePlan(IncidentResponsePlanForSNSModify responsePlan) {
            this.responsePlan = responsePlan;
            return this;
        }

        /**
         * subscription.
         */
        public Builder subscription(SubscriptionForSNSModify subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * <p>Update 专用，对成员订阅做 create/update/remove 批量调整</p>
         */
        public Builder subscriptions(java.util.List<SubscriptionOp> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * <p>Update 必填，Create 可省略由后端生成</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>Update 必填，与后端记录一致才能写入；不一致返回 OPTIMISTIC_LOCK_FAILED</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public SubscriptionAndNotifyStrategyForModify build() {
            return new SubscriptionAndNotifyStrategyForModify(this);
        } 

    } 

}
