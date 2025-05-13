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
 * {@link SubscriptionForModify} extends {@link TeaModel}
 *
 * <p>SubscriptionForModify</p>
 */
public class SubscriptionForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    private SubscriptionForModify(Builder builder) {
        this.description = builder.description;
        this.filterSetting = builder.filterSetting;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.pushingSetting = builder.pushingSetting;
        this.subscriptionName = builder.subscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionForModify create() {
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
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public static final class Builder {
        private String description; 
        private FilterSetting filterSetting; 
        private String notifyStrategyId; 
        private PushingSetting pushingSetting; 
        private String subscriptionName; 

        private Builder() {
        } 

        private Builder(SubscriptionForModify model) {
            this.description = model.description;
            this.filterSetting = model.filterSetting;
            this.notifyStrategyId = model.notifyStrategyId;
            this.pushingSetting = model.pushingSetting;
            this.subscriptionName = model.subscriptionName;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * <p>This parameter is required.</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        public SubscriptionForModify build() {
            return new SubscriptionForModify(this);
        } 

    } 

    /**
     * 
     * {@link SubscriptionForModify} extends {@link TeaModel}
     *
     * <p>SubscriptionForModify</p>
     */
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionIds")
        private java.util.List<String> alertActionIds;

        @com.aliyun.core.annotation.NameInMap("responsePlanId")
        private String responsePlanId;

        @com.aliyun.core.annotation.NameInMap("restoreActionIds")
        private java.util.List<String> restoreActionIds;

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
        public java.util.List<String> getAlertActionIds() {
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
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private java.util.List<String> alertActionIds; 
            private String responsePlanId; 
            private java.util.List<String> restoreActionIds; 
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(PushingSetting model) {
                this.alertActionIds = model.alertActionIds;
                this.responsePlanId = model.responsePlanId;
                this.restoreActionIds = model.restoreActionIds;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * alertActionIds.
             */
            public Builder alertActionIds(java.util.List<String> alertActionIds) {
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
            public Builder restoreActionIds(java.util.List<String> restoreActionIds) {
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
