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
 * {@link SubscriptionForSNSView} extends {@link TeaModel}
 *
 * <p>SubscriptionForSNSView</p>
 */
public class SubscriptionForSNSView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyUuid")
    private String notifyStrategyUuid;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("subscribeLegacyEvent")
    private Boolean subscribeLegacyEvent;

    @com.aliyun.core.annotation.NameInMap("subscriptionType")
    private String subscriptionType;

    @com.aliyun.core.annotation.NameInMap("syncFromType")
    private String syncFromType;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private SubscriptionForSNSView(Builder builder) {
        this.createTime = builder.createTime;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.mode = builder.mode;
        this.name = builder.name;
        this.notifyStrategyUuid = builder.notifyStrategyUuid;
        this.regionId = builder.regionId;
        this.subscribeLegacyEvent = builder.subscribeLegacyEvent;
        this.subscriptionType = builder.subscriptionType;
        this.syncFromType = builder.syncFromType;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.workspace = builder.workspace;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionForSNSView create() {
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
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyStrategyUuid
     */
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subscribeLegacyEvent
     */
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return syncFromType
     */
    public String getSyncFromType() {
        return this.syncFromType;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return workspaceFilterSetting
     */
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static final class Builder {
        private String createTime; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private String mode; 
        private String name; 
        private String notifyStrategyUuid; 
        private String regionId; 
        private Boolean subscribeLegacyEvent; 
        private String subscriptionType; 
        private String syncFromType; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private String workspace; 
        private WorkspaceFilterSetting workspaceFilterSetting; 

        private Builder() {
        } 

        private Builder(SubscriptionForSNSView model) {
            this.createTime = model.createTime;
            this.enable = model.enable;
            this.filterSetting = model.filterSetting;
            this.mode = model.mode;
            this.name = model.name;
            this.notifyStrategyUuid = model.notifyStrategyUuid;
            this.regionId = model.regionId;
            this.subscribeLegacyEvent = model.subscribeLegacyEvent;
            this.subscriptionType = model.subscriptionType;
            this.syncFromType = model.syncFromType;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
            this.workspace = model.workspace;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * <p>The time when the subscription was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the subscription is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The filter configuration.</p>
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>The lifecycle mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The subscription name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The reverse association to the SNS (= snsUuid).</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Indicates whether the subscription includes legacy product events (CMS 1.0, ARMS, or SLS events where workspace is null). Valid values: true: Subscribed. false or null: Not subscribed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder subscribeLegacyEvent(Boolean subscribeLegacyEvent) {
            this.subscribeLegacyEvent = subscribeLegacyEvent;
            return this;
        }

        /**
         * <p>The subscription type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * <p>The sync source type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder syncFromType(String syncFromType) {
            this.syncFromType = syncFromType;
            return this;
        }

        /**
         * <p>The time when the subscription was last updated.</p>
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
         * <p>The subscription UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The workspace filter configuration.</p>
         */
        public Builder workspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
            this.workspaceFilterSetting = workspaceFilterSetting;
            return this;
        }

        public SubscriptionForSNSView build() {
            return new SubscriptionForSNSView(this);
        } 

    } 

}
