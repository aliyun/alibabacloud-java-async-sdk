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
 * {@link NotifyPolicySummary} extends {@link TeaModel}
 *
 * <p>NotifyPolicySummary</p>
 */
public class NotifyPolicySummary extends TeaModel {
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

    private NotifyPolicySummary(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.notifyStrategy = builder.notifyStrategy;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyPolicySummary create() {
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
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private Integer version; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(NotifyPolicySummary model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.enabled = model.enabled;
            this.name = model.name;
            this.notifyStrategy = model.notifyStrategy;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * notifyStrategy.
         */
        public Builder notifyStrategy(NotifyStrategyDetail notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
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

        public NotifyPolicySummary build() {
            return new NotifyPolicySummary(this);
        } 

    } 

}
