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
 * {@link NotifyPolicyConfig} extends {@link TeaModel}
 *
 * <p>NotifyPolicyConfig</p>
 */
public class NotifyPolicyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyStrategy")
    private NotifyStrategyConfig notifyStrategy;

    @com.aliyun.core.annotation.NameInMap("responsePlan")
    private ResponsePlanConfig responsePlan;

    @com.aliyun.core.annotation.NameInMap("subscription")
    private SubscriptionConfig subscription;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private NotifyPolicyConfig(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.responsePlan = builder.responsePlan;
        this.subscription = builder.subscription;
        this.uuid = builder.uuid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyPolicyConfig create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyStrategy
     */
    public NotifyStrategyConfig getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return responsePlan
     */
    public ResponsePlanConfig getResponsePlan() {
        return this.responsePlan;
    }

    /**
     * @return subscription
     */
    public SubscriptionConfig getSubscription() {
        return this.subscription;
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
        private String name; 
        private NotifyStrategyConfig notifyStrategy; 
        private ResponsePlanConfig responsePlan; 
        private SubscriptionConfig subscription; 
        private String uuid; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(NotifyPolicyConfig model) {
            this.description = model.description;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
            this.responsePlan = model.responsePlan;
            this.subscription = model.subscription;
            this.uuid = model.uuid;
            this.version = model.version;
        } 

        /**
         * <p>The description of the policy, which helps identify its purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境告警通知策略</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The policy name. We recommend that you specify this parameter for the Create operation. If a policy with the same name already exists in the workspace, ConflictName (409) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境告警通知策略</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The notification strategy sub-entity, which includes noise reduction, notification routing, channels, and custom templates. Required for the Create operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder notifyStrategy(NotifyStrategyConfig notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The response plan sub-entity, which includes upgrade, repeated notification, automatic recovery, and action integration. Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder responsePlan(ResponsePlanConfig responsePlan) {
            this.responsePlan = responsePlan;
            return this;
        }

        /**
         * <p>The subscription sub-entity, which includes event filtering, cross-workspace routing, and legacy product event subscription switches. Optional. If not specified, all events in the current workspace are subscribed to.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder subscription(SubscriptionConfig subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * <p>The unique identifier of the policy. Required for the Update operation. Omitted for the Create operation because it is generated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>04779a183add4f2ca06ab440f16cc580</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>Required for the Update operation. The write succeeds only when this value matches the backend record. If the values do not match, OptimisticLockFailed is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public NotifyPolicyConfig build() {
            return new NotifyPolicyConfig(this);
        } 

    } 

}
