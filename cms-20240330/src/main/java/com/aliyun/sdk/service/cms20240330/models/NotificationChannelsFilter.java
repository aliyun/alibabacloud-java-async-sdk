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
 * {@link NotificationChannelsFilter} extends {@link TeaModel}
 *
 * <p>NotificationChannelsFilter</p>
 */
public class NotificationChannelsFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("containsContacts")
    private java.util.List<String> containsContacts;

    @com.aliyun.core.annotation.NameInMap("containsCustomWebhooks")
    private java.util.List<String> containsCustomWebhooks;

    @com.aliyun.core.annotation.NameInMap("containsDingWebhooks")
    private java.util.List<String> containsDingWebhooks;

    @com.aliyun.core.annotation.NameInMap("containsFsWebhooks")
    private java.util.List<String> containsFsWebhooks;

    @com.aliyun.core.annotation.NameInMap("containsGroups")
    private java.util.List<String> containsGroups;

    @com.aliyun.core.annotation.NameInMap("containsSlackWebhooks")
    private java.util.List<String> containsSlackWebhooks;

    @com.aliyun.core.annotation.NameInMap("containsWxWebhooks")
    private java.util.List<String> containsWxWebhooks;

    private NotificationChannelsFilter(Builder builder) {
        this.containsContacts = builder.containsContacts;
        this.containsCustomWebhooks = builder.containsCustomWebhooks;
        this.containsDingWebhooks = builder.containsDingWebhooks;
        this.containsFsWebhooks = builder.containsFsWebhooks;
        this.containsGroups = builder.containsGroups;
        this.containsSlackWebhooks = builder.containsSlackWebhooks;
        this.containsWxWebhooks = builder.containsWxWebhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotificationChannelsFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containsContacts
     */
    public java.util.List<String> getContainsContacts() {
        return this.containsContacts;
    }

    /**
     * @return containsCustomWebhooks
     */
    public java.util.List<String> getContainsCustomWebhooks() {
        return this.containsCustomWebhooks;
    }

    /**
     * @return containsDingWebhooks
     */
    public java.util.List<String> getContainsDingWebhooks() {
        return this.containsDingWebhooks;
    }

    /**
     * @return containsFsWebhooks
     */
    public java.util.List<String> getContainsFsWebhooks() {
        return this.containsFsWebhooks;
    }

    /**
     * @return containsGroups
     */
    public java.util.List<String> getContainsGroups() {
        return this.containsGroups;
    }

    /**
     * @return containsSlackWebhooks
     */
    public java.util.List<String> getContainsSlackWebhooks() {
        return this.containsSlackWebhooks;
    }

    /**
     * @return containsWxWebhooks
     */
    public java.util.List<String> getContainsWxWebhooks() {
        return this.containsWxWebhooks;
    }

    public static final class Builder {
        private java.util.List<String> containsContacts; 
        private java.util.List<String> containsCustomWebhooks; 
        private java.util.List<String> containsDingWebhooks; 
        private java.util.List<String> containsFsWebhooks; 
        private java.util.List<String> containsGroups; 
        private java.util.List<String> containsSlackWebhooks; 
        private java.util.List<String> containsWxWebhooks; 

        private Builder() {
        } 

        private Builder(NotificationChannelsFilter model) {
            this.containsContacts = model.containsContacts;
            this.containsCustomWebhooks = model.containsCustomWebhooks;
            this.containsDingWebhooks = model.containsDingWebhooks;
            this.containsFsWebhooks = model.containsFsWebhooks;
            this.containsGroups = model.containsGroups;
            this.containsSlackWebhooks = model.containsSlackWebhooks;
            this.containsWxWebhooks = model.containsWxWebhooks;
        } 

        /**
         * <p>The list of notification contacts in the rule contains any value in the array. This uses OR logic and corresponds to notification.contacts in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;张三&quot;,&quot;李四&quot;]</p>
         */
        public Builder containsContacts(java.util.List<String> containsContacts) {
            this.containsContacts = containsContacts;
            return this;
        }

        /**
         * <p>The list of custom webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.customWebhooks in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://my-service.example.com/webhook/alert%22%5D">https://my-service.example.com/webhook/alert&quot;]</a></p>
         */
        public Builder containsCustomWebhooks(java.util.List<String> containsCustomWebhooks) {
            this.containsCustomWebhooks = containsCustomWebhooks;
            return this;
        }

        /**
         * <p>The list of DingTalk webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.dingWebhooks in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://oapi.dingtalk.com/robot/send?access_token=abc123%22%5D">https://oapi.dingtalk.com/robot/send?access_token=abc123&quot;]</a></p>
         */
        public Builder containsDingWebhooks(java.util.List<String> containsDingWebhooks) {
            this.containsDingWebhooks = containsDingWebhooks;
            return this;
        }

        /**
         * <p>The list of Lark webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.fsWebhooks in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/abc123%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/abc123&quot;]</a></p>
         */
        public Builder containsFsWebhooks(java.util.List<String> containsFsWebhooks) {
            this.containsFsWebhooks = containsFsWebhooks;
            return this;
        }

        /**
         * <p>The list of contact groups in the rule contains any value in the array. This uses OR logic and corresponds to notification.groups in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;运维组&quot;,&quot;SRE团队&quot;]</p>
         */
        public Builder containsGroups(java.util.List<String> containsGroups) {
            this.containsGroups = containsGroups;
            return this;
        }

        /**
         * <p>The list of Slack webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.slackWebhooks in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX%22%5D">https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX&quot;]</a></p>
         */
        public Builder containsSlackWebhooks(java.util.List<String> containsSlackWebhooks) {
            this.containsSlackWebhooks = containsSlackWebhooks;
            return this;
        }

        /**
         * <p>The list of WeCom webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.wxWebhooks in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=abc123%22%5D">https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=abc123&quot;]</a></p>
         */
        public Builder containsWxWebhooks(java.util.List<String> containsWxWebhooks) {
            this.containsWxWebhooks = containsWxWebhooks;
            return this;
        }

        public NotificationChannelsFilter build() {
            return new NotificationChannelsFilter(this);
        } 

    } 

}
