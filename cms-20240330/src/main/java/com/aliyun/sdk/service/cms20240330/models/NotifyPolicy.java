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
 * {@link NotifyPolicy} extends {@link TeaModel}
 *
 * <p>NotifyPolicy</p>
 */
public class NotifyPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyStrategy")
    private NotifyStrategyDetail notifyStrategy;

    @com.aliyun.core.annotation.NameInMap("responsePlan")
    private ResponsePlanDetail responsePlan;

    @com.aliyun.core.annotation.NameInMap("subscription")
    private SubscriptionDetail subscription;

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

    private NotifyPolicy(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.responsePlan = builder.responsePlan;
        this.subscription = builder.subscription;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyPolicy create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyStrategy
     */
    public NotifyStrategyDetail getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return responsePlan
     */
    public ResponsePlanDetail getResponsePlan() {
        return this.responsePlan;
    }

    /**
     * @return subscription
     */
    public SubscriptionDetail getSubscription() {
        return this.subscription;
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
        private String name; 
        private NotifyStrategyDetail notifyStrategy; 
        private ResponsePlanDetail responsePlan; 
        private SubscriptionDetail subscription; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private Integer version; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(NotifyPolicy model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.enabled = model.enabled;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
            this.responsePlan = model.responsePlan;
            this.subscription = model.subscription;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
            this.version = model.version;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The creation time. The value is a UNIX timestamp string in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710000000000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境告警通知策略</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the policy is enabled. This is a read-only field controlled by the Enable or Disable operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境告警通知策略</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The notification policy sub-entity details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder notifyStrategy(NotifyStrategyDetail notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The response plan sub-entity details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder responsePlan(ResponsePlanDetail responsePlan) {
            this.responsePlan = responsePlan;
            return this;
        }

        /**
         * <p>The subscription sub-entity details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder subscription(SubscriptionDetail subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * <p>The update time. The value is a UNIX timestamp string in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710000000000</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The unique identifier of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>04779a183add4f2ca06ab440f16cc580</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The optimistic locking version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The workspace identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-xxxx-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public NotifyPolicy build() {
            return new NotifyPolicy(this);
        } 

    } 

}
