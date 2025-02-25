// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubscriptionForView} extends {@link TeaModel}
 *
 * <p>SubscriptionForView</p>
 */
public class SubscriptionForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private SubscriptionForView(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.pushingSetting = builder.pushingSetting;
        this.subscriptionId = builder.subscriptionId;
        this.subscriptionName = builder.subscriptionName;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionForView create() {
        return builder().build();
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
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return pushingSetting
     */
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    /**
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private String notifyStrategyId; 
        private PushingSetting pushingSetting; 
        private String subscriptionId; 
        private String subscriptionName; 
        private String updateTime; 
        private String userId; 
        private String workspace; 

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
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * notifyStrategyId.
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * pushingSetting.
         */
        public Builder pushingSetting(PushingSetting pushingSetting) {
            this.pushingSetting = pushingSetting;
            return this;
        }

        /**
         * subscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
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
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SubscriptionForView build() {
            return new SubscriptionForView(this);
        } 

    } 

    /**
     * 
     * {@link SubscriptionForView} extends {@link TeaModel}
     *
     * <p>SubscriptionForView</p>
     */
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionIds")
        private java.util.List < String > alertActionIds;

        @com.aliyun.core.annotation.NameInMap("responsePlanId")
        private String responsePlanId;

        @com.aliyun.core.annotation.NameInMap("restoreActionIds")
        private java.util.List < String > restoreActionIds;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        private String templateUuid;

        private PushingSetting(Builder builder) {
            this.alertActionIds = builder.alertActionIds;
            this.responsePlanId = builder.responsePlanId;
            this.restoreActionIds = builder.restoreActionIds;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushingSetting create() {
            return builder().build();
        }

        /**
         * @return alertActionIds
         */
        public java.util.List < String > getAlertActionIds() {
            return this.alertActionIds;
        }

        /**
         * @return responsePlanId
         */
        public String getResponsePlanId() {
            return this.responsePlanId;
        }

        /**
         * @return restoreActionIds
         */
        public java.util.List < String > getRestoreActionIds() {
            return this.restoreActionIds;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private java.util.List < String > alertActionIds; 
            private String responsePlanId; 
            private java.util.List < String > restoreActionIds; 
            private String templateUuid; 

            /**
             * alertActionIds.
             */
            public Builder alertActionIds(java.util.List < String > alertActionIds) {
                this.alertActionIds = alertActionIds;
                return this;
            }

            /**
             * responsePlanId.
             */
            public Builder responsePlanId(String responsePlanId) {
                this.responsePlanId = responsePlanId;
                return this;
            }

            /**
             * restoreActionIds.
             */
            public Builder restoreActionIds(java.util.List < String > restoreActionIds) {
                this.restoreActionIds = restoreActionIds;
                return this;
            }

            /**
             * templateUuid.
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public PushingSetting build() {
                return new PushingSetting(this);
            } 

        } 

    }
}
