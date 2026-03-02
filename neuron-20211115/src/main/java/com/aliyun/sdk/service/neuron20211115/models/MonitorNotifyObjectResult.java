// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorNotifyObjectResult} extends {@link TeaModel}
 *
 * <p>MonitorNotifyObjectResult</p>
 */
public class MonitorNotifyObjectResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactGroups")
    private java.util.List<MonitorContactGroup> contactGroups;

    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<MonitorContact> contacts;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("webhooks")
    private java.util.List<MonitorWebhook> webhooks;

    private MonitorNotifyObjectResult(Builder builder) {
        this.contactGroups = builder.contactGroups;
        this.contacts = builder.contacts;
        this.requestId = builder.requestId;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorNotifyObjectResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public java.util.List<MonitorContactGroup> getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return contacts
     */
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webhooks
     */
    public java.util.List<MonitorWebhook> getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder {
        private java.util.List<MonitorContactGroup> contactGroups; 
        private java.util.List<MonitorContact> contacts; 
        private String requestId; 
        private java.util.List<MonitorWebhook> webhooks; 

        private Builder() {
        } 

        private Builder(MonitorNotifyObjectResult model) {
            this.contactGroups = model.contactGroups;
            this.contacts = model.contacts;
            this.requestId = model.requestId;
            this.webhooks = model.webhooks;
        } 

        /**
         * contactGroups.
         */
        public Builder contactGroups(java.util.List<MonitorContactGroup> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * contacts.
         */
        public Builder contacts(java.util.List<MonitorContact> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * webhooks.
         */
        public Builder webhooks(java.util.List<MonitorWebhook> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public MonitorNotifyObjectResult build() {
            return new MonitorNotifyObjectResult(this);
        } 

    } 

}
