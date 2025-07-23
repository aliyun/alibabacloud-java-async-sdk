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
 * {@link AlertRuleSend} extends {@link TeaModel}
 *
 * <p>AlertRuleSend</p>
 */
public class AlertRuleSend extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private AlertRuleAction action;

    @com.aliyun.core.annotation.NameInMap("notification")
    private AlertRuleNotification notification;

    @com.aliyun.core.annotation.NameInMap("sendToArms")
    private Boolean sendToArms;

    private AlertRuleSend(Builder builder) {
        this.action = builder.action;
        this.notification = builder.notification;
        this.sendToArms = builder.sendToArms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleSend create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return sendToArms
     */
    public Boolean getSendToArms() {
        return this.sendToArms;
    }

    public static final class Builder {
        private AlertRuleAction action; 
        private AlertRuleNotification notification; 
        private Boolean sendToArms; 

        private Builder() {
        } 

        private Builder(AlertRuleSend model) {
            this.action = model.action;
            this.notification = model.notification;
            this.sendToArms = model.sendToArms;
        } 

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

        /**
         * sendToArms.
         */
        public Builder sendToArms(Boolean sendToArms) {
            this.sendToArms = sendToArms;
            return this;
        }

        public AlertRuleSend build() {
            return new AlertRuleSend(this);
        } 

    } 

}
