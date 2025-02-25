// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleNotification} extends {@link TeaModel}
 *
 * <p>AlertRuleNotification</p>
 */
public class AlertRuleNotification extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List < String > contacts;

    @com.aliyun.core.annotation.NameInMap("customWebhooks")
    private java.util.List < String > customWebhooks;

    @com.aliyun.core.annotation.NameInMap("dingWebhooks")
    private java.util.List < String > dingWebhooks;

    @com.aliyun.core.annotation.NameInMap("fsWebhooks")
    private java.util.List < String > fsWebhooks;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List < String > groups;

    @com.aliyun.core.annotation.NameInMap("notifyTime")
    private AlertRuleTimeSpan notifyTime;

    @com.aliyun.core.annotation.NameInMap("silenceTime")
    private Long silenceTime;

    @com.aliyun.core.annotation.NameInMap("slackWebhooks")
    private java.util.List < String > slackWebhooks;

    @com.aliyun.core.annotation.NameInMap("wxWebhooks")
    private java.util.List < String > wxWebhooks;

    private AlertRuleNotification(Builder builder) {
        this.contacts = builder.contacts;
        this.customWebhooks = builder.customWebhooks;
        this.dingWebhooks = builder.dingWebhooks;
        this.fsWebhooks = builder.fsWebhooks;
        this.groups = builder.groups;
        this.notifyTime = builder.notifyTime;
        this.silenceTime = builder.silenceTime;
        this.slackWebhooks = builder.slackWebhooks;
        this.wxWebhooks = builder.wxWebhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleNotification create() {
        return builder().build();
    }

    /**
     * @return contacts
     */
    public java.util.List < String > getContacts() {
        return this.contacts;
    }

    /**
     * @return customWebhooks
     */
    public java.util.List < String > getCustomWebhooks() {
        return this.customWebhooks;
    }

    /**
     * @return dingWebhooks
     */
    public java.util.List < String > getDingWebhooks() {
        return this.dingWebhooks;
    }

    /**
     * @return fsWebhooks
     */
    public java.util.List < String > getFsWebhooks() {
        return this.fsWebhooks;
    }

    /**
     * @return groups
     */
    public java.util.List < String > getGroups() {
        return this.groups;
    }

    /**
     * @return notifyTime
     */
    public AlertRuleTimeSpan getNotifyTime() {
        return this.notifyTime;
    }

    /**
     * @return silenceTime
     */
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return slackWebhooks
     */
    public java.util.List < String > getSlackWebhooks() {
        return this.slackWebhooks;
    }

    /**
     * @return wxWebhooks
     */
    public java.util.List < String > getWxWebhooks() {
        return this.wxWebhooks;
    }

    public static final class Builder {
        private java.util.List < String > contacts; 
        private java.util.List < String > customWebhooks; 
        private java.util.List < String > dingWebhooks; 
        private java.util.List < String > fsWebhooks; 
        private java.util.List < String > groups; 
        private AlertRuleTimeSpan notifyTime; 
        private Long silenceTime; 
        private java.util.List < String > slackWebhooks; 
        private java.util.List < String > wxWebhooks; 

        /**
         * contacts.
         */
        public Builder contacts(java.util.List < String > contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * customWebhooks.
         */
        public Builder customWebhooks(java.util.List < String > customWebhooks) {
            this.customWebhooks = customWebhooks;
            return this;
        }

        /**
         * dingWebhooks.
         */
        public Builder dingWebhooks(java.util.List < String > dingWebhooks) {
            this.dingWebhooks = dingWebhooks;
            return this;
        }

        /**
         * fsWebhooks.
         */
        public Builder fsWebhooks(java.util.List < String > fsWebhooks) {
            this.fsWebhooks = fsWebhooks;
            return this;
        }

        /**
         * groups.
         */
        public Builder groups(java.util.List < String > groups) {
            this.groups = groups;
            return this;
        }

        /**
         * notifyTime.
         */
        public Builder notifyTime(AlertRuleTimeSpan notifyTime) {
            this.notifyTime = notifyTime;
            return this;
        }

        /**
         * silenceTime.
         */
        public Builder silenceTime(Long silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * slackWebhooks.
         */
        public Builder slackWebhooks(java.util.List < String > slackWebhooks) {
            this.slackWebhooks = slackWebhooks;
            return this;
        }

        /**
         * wxWebhooks.
         */
        public Builder wxWebhooks(java.util.List < String > wxWebhooks) {
            this.wxWebhooks = wxWebhooks;
            return this;
        }

        public AlertRuleNotification build() {
            return new AlertRuleNotification(this);
        } 

    } 

}
