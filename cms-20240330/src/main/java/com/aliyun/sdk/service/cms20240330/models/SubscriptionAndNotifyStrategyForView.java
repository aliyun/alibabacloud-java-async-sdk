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
 * {@link SubscriptionAndNotifyStrategyForView} extends {@link TeaModel}
 *
 * <p>SubscriptionAndNotifyStrategyForView</p>
 */
public class SubscriptionAndNotifyStrategyForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("migrationBatchId")
    private String migrationBatchId;

    @com.aliyun.core.annotation.NameInMap("migrationMeta")
    private String migrationMeta;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyStrategy")
    private NotifyStrategyForSNSView notifyStrategy;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyUuid")
    private String notifyStrategyUuid;

    @com.aliyun.core.annotation.NameInMap("responsePlan")
    private IncidentResponsePlanForSNSView responsePlan;

    @com.aliyun.core.annotation.NameInMap("subscription")
    private SubscriptionForSNSView subscription;

    @com.aliyun.core.annotation.NameInMap("subscriptionUuid")
    private String subscriptionUuid;

    @com.aliyun.core.annotation.NameInMap("subscriptions")
    private java.util.List<SubscriptionForView> subscriptions;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private SubscriptionAndNotifyStrategyForView(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.migrationBatchId = builder.migrationBatchId;
        this.migrationMeta = builder.migrationMeta;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.notifyStrategyUuid = builder.notifyStrategyUuid;
        this.responsePlan = builder.responsePlan;
        this.subscription = builder.subscription;
        this.subscriptionUuid = builder.subscriptionUuid;
        this.subscriptions = builder.subscriptions;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionAndNotifyStrategyForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return migrationBatchId
     */
    public String getMigrationBatchId() {
        return this.migrationBatchId;
    }

    /**
     * @return migrationMeta
     */
    public String getMigrationMeta() {
        return this.migrationMeta;
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
    public NotifyStrategyForSNSView getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return notifyStrategyUuid
     */
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    /**
     * @return responsePlan
     */
    public IncidentResponsePlanForSNSView getResponsePlan() {
        return this.responsePlan;
    }

    /**
     * @return subscription
     */
    public SubscriptionForSNSView getSubscription() {
        return this.subscription;
    }

    /**
     * @return subscriptionUuid
     */
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
    }

    /**
     * @return subscriptions
     */
    public java.util.List<SubscriptionForView> getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
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

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private Boolean enabled; 
        private String migrationBatchId; 
        private String migrationMeta; 
        private String name; 
        private NotifyStrategyForSNSView notifyStrategy; 
        private String notifyStrategyUuid; 
        private IncidentResponsePlanForSNSView responsePlan; 
        private SubscriptionForSNSView subscription; 
        private String subscriptionUuid; 
        private java.util.List<SubscriptionForView> subscriptions; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private Integer version; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(SubscriptionAndNotifyStrategyForView model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.enabled = model.enabled;
            this.migrationBatchId = model.migrationBatchId;
            this.migrationMeta = model.migrationMeta;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
            this.notifyStrategyUuid = model.notifyStrategyUuid;
            this.responsePlan = model.responsePlan;
            this.subscription = model.subscription;
            this.subscriptionUuid = model.subscriptionUuid;
            this.subscriptions = model.subscriptions;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
            this.version = model.version;
            this.workspace = model.workspace;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
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
         * migrationBatchId.
         */
        public Builder migrationBatchId(String migrationBatchId) {
            this.migrationBatchId = migrationBatchId;
            return this;
        }

        /**
         * migrationMeta.
         */
        public Builder migrationMeta(String migrationMeta) {
            this.migrationMeta = migrationMeta;
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
         * notifyStrategy.
         */
        public Builder notifyStrategy(NotifyStrategyForSNSView notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * notifyStrategyUuid.
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * responsePlan.
         */
        public Builder responsePlan(IncidentResponsePlanForSNSView responsePlan) {
            this.responsePlan = responsePlan;
            return this;
        }

        /**
         * subscription.
         */
        public Builder subscription(SubscriptionForSNSView subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * subscriptionUuid.
         */
        public Builder subscriptionUuid(String subscriptionUuid) {
            this.subscriptionUuid = subscriptionUuid;
            return this;
        }

        /**
         * subscriptions.
         */
        public Builder subscriptions(java.util.List<SubscriptionForView> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SubscriptionAndNotifyStrategyForView build() {
            return new SubscriptionAndNotifyStrategyForView(this);
        } 

    } 

}
