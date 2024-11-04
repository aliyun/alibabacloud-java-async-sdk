// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleSend} extends {@link TeaModel}
 *
 * <p>AlertRuleSend</p>
 */
public class AlertRuleSend extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private AlertRuleAction action;

    @com.aliyun.core.annotation.NameInMap("notification")
    private AlertRuleNotification notification;

    private AlertRuleSend(Builder builder) {
        this.action = builder.action;
        this.notification = builder.notification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleSend create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public AlertRuleAction getAction() {
        return this.action;
    }

    /**
     * @return notification
     */
    public AlertRuleNotification getNotification() {
        return this.notification;
    }

    public static final class Builder {
        private AlertRuleAction action; 
        private AlertRuleNotification notification; 

        /**
         * action.
         */
        public Builder action(AlertRuleAction action) {
            this.action = action;
            return this;
        }

        /**
         * notification.
         */
        public Builder notification(AlertRuleNotification notification) {
            this.notification = notification;
            return this;
        }

        public AlertRuleSend build() {
            return new AlertRuleSend(this);
        } 

    } 

}
