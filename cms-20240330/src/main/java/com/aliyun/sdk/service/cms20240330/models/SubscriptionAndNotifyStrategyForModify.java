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
         * <p>The description of the alert policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to monitor the CPU utilization of ECS instances</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Read-only. This parameter does not take effect even if specified. The backend forcibly sets this parameter to true during creation and retains the current value during updates. To enable or disable the policy, call the EnableAlertPolicy or DisableAlertPolicy operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Policy Name of the alert policy. If this parameter is not specified, the backend derives Policy Name from notifyStrategy.</p>
         * 
         * <strong>example:</strong>
         * <p>my-alert-policy</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The notification configuration that defines noise reduction rules, notification channel routing, and templates. This parameter is required for Create operations.</p>
         */
        public Builder notifyStrategy(NotifyStrategyForSNSModify notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The event management configuration that defines recovery notifications, repeat notifications, automatic recovery, and escalation policies.</p>
         */
        public Builder responsePlan(IncidentResponsePlanForSNSModify responsePlan) {
            this.responsePlan = responsePlan;
            return this;
        }

        /**
         * <p>The single primary subscription configuration that defines event filter conditions. This parameter is mutually exclusive with subscriptions. Do not specify both parameters at the same time.</p>
         */
        public Builder subscription(SubscriptionForSNSModify subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * <p>Dedicated to Update operations. Performs batch create, update, or remove adjustments on member subscriptions.</p>
         */
        public Builder subscriptions(java.util.List<SubscriptionOp> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * <p>The unique identifier of the alert policy. This parameter is required for Update operations. Do not specify this parameter for Create operations because the backend automatically generates the value.</p>
         * 
         * <strong>example:</strong>
         * <p>7076c75c-c804-461e-975f-c6f9ed5af745</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The optimistic lock version number. This parameter is required for Update operations and must match the current value on the backend. Otherwise, a 409 VersionConflict error is returned. The version number increments by 1 after each successful update.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
