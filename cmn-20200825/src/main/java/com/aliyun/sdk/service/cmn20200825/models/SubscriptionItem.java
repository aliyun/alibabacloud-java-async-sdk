// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscriptionItem} extends {@link TeaModel}
 *
 * <p>SubscriptionItem</p>
 */
public class SubscriptionItem extends TeaModel {
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @NameInMap("Language")
    private String language;

    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @NameInMap("NotificationGroupId")
    private String notificationGroupId;

    @NameInMap("NotificationMode")
    private String notificationMode;

    @NameInMap("RecoveryNotice")
    private Integer recoveryNotice;

    @NameInMap("SubscriptionItemId")
    private String subscriptionItemId;

    @NameInMap("SubscriptionType")
    private String subscriptionType;

    @NameInMap("SuppressionStrategy")
    private String suppressionStrategy;

    @NameInMap("TriggerTimes")
    private Integer triggerTimes;

    private SubscriptionItem(Builder builder) {
        this.alarmStatus = builder.alarmStatus;
        this.language = builder.language;
        this.monitorItemId = builder.monitorItemId;
        this.notificationGroupId = builder.notificationGroupId;
        this.notificationMode = builder.notificationMode;
        this.recoveryNotice = builder.recoveryNotice;
        this.subscriptionItemId = builder.subscriptionItemId;
        this.subscriptionType = builder.subscriptionType;
        this.suppressionStrategy = builder.suppressionStrategy;
        this.triggerTimes = builder.triggerTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionItem create() {
        return builder().build();
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return notificationGroupId
     */
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    /**
     * @return notificationMode
     */
    public String getNotificationMode() {
        return this.notificationMode;
    }

    /**
     * @return recoveryNotice
     */
    public Integer getRecoveryNotice() {
        return this.recoveryNotice;
    }

    /**
     * @return subscriptionItemId
     */
    public String getSubscriptionItemId() {
        return this.subscriptionItemId;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return suppressionStrategy
     */
    public String getSuppressionStrategy() {
        return this.suppressionStrategy;
    }

    /**
     * @return triggerTimes
     */
    public Integer getTriggerTimes() {
        return this.triggerTimes;
    }

    public static final class Builder {
        private String alarmStatus; 
        private String language; 
        private String monitorItemId; 
        private String notificationGroupId; 
        private String notificationMode; 
        private Integer recoveryNotice; 
        private String subscriptionItemId; 
        private String subscriptionType; 
        private String suppressionStrategy; 
        private Integer triggerTimes; 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }

        /**
         * NotificationGroupId.
         */
        public Builder notificationGroupId(String notificationGroupId) {
            this.notificationGroupId = notificationGroupId;
            return this;
        }

        /**
         * NotificationMode.
         */
        public Builder notificationMode(String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }

        /**
         * RecoveryNotice.
         */
        public Builder recoveryNotice(Integer recoveryNotice) {
            this.recoveryNotice = recoveryNotice;
            return this;
        }

        /**
         * SubscriptionItemId.
         */
        public Builder subscriptionItemId(String subscriptionItemId) {
            this.subscriptionItemId = subscriptionItemId;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * SuppressionStrategy.
         */
        public Builder suppressionStrategy(String suppressionStrategy) {
            this.suppressionStrategy = suppressionStrategy;
            return this;
        }

        /**
         * TriggerTimes.
         */
        public Builder triggerTimes(Integer triggerTimes) {
            this.triggerTimes = triggerTimes;
            return this;
        }

        public SubscriptionItem build() {
            return new SubscriptionItem(this);
        } 

    } 

}
