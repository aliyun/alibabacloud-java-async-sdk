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
 * {@link SubscriptionAndNotifyStrategyForListView} extends {@link TeaModel}
 *
 * <p>SubscriptionAndNotifyStrategyForListView</p>
 */
public class SubscriptionAndNotifyStrategyForListView extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("subscriptionUuid")
    private String subscriptionUuid;

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

    private SubscriptionAndNotifyStrategyForListView(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.migrationBatchId = builder.migrationBatchId;
        this.migrationMeta = builder.migrationMeta;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.notifyStrategyUuid = builder.notifyStrategyUuid;
        this.subscriptionUuid = builder.subscriptionUuid;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionAndNotifyStrategyForListView create() {
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
     * @return subscriptionUuid
     */
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
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
        private String subscriptionUuid; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private Integer version; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(SubscriptionAndNotifyStrategyForListView model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.enabled = model.enabled;
            this.migrationBatchId = model.migrationBatchId;
            this.migrationMeta = model.migrationMeta;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
            this.notifyStrategyUuid = model.notifyStrategyUuid;
            this.subscriptionUuid = model.subscriptionUuid;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
            this.version = model.version;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The migration batch ID. This field is empty for user-created entries and has a value for migration artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder migrationBatchId(String migrationBatchId) {
            this.migrationBatchId = migrationBatchId;
            return this;
        }

        /**
         * <p>The migration metadata JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder migrationMeta(String migrationMeta) {
            this.migrationMeta = migrationMeta;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The notification policy snapshot.</p>
         */
        public Builder notifyStrategy(NotifyStrategyForSNSView notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The UUID of the associated notifyStrategy, which is shared with the responsePlan UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * <p>The UUID of the directly bound primary subscription, which has a 1:1 association in the NOTIFY mode.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder subscriptionUuid(String subscriptionUuid) {
            this.subscriptionUuid = subscriptionUuid;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The UUID of the aggregate entity.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The optimistic lock version number.</p>
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
         * <p>Sample value</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SubscriptionAndNotifyStrategyForListView build() {
            return new SubscriptionAndNotifyStrategyForListView(this);
        } 

    } 

}
