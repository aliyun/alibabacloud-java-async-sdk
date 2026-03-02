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
 * {@link MonitorNotifyStrategy} extends {@link TeaModel}
 *
 * <p>MonitorNotifyStrategy</p>
 */
public class MonitorNotifyStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channels")
    private java.util.List<String> channels;

    @com.aliyun.core.annotation.NameInMap("contactGroupIds")
    private java.util.List<Long> contactGroupIds;

    @com.aliyun.core.annotation.NameInMap("contactGroups")
    private java.util.List<MonitorContactGroup> contactGroups;

    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<Long> contactIds;

    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<MonitorContact> contacts;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("webhookIds")
    private java.util.List<Long> webhookIds;

    @com.aliyun.core.annotation.NameInMap("webhooks")
    private java.util.List<MonitorWebhook> webhooks;

    private MonitorNotifyStrategy(Builder builder) {
        this.channels = builder.channels;
        this.contactGroupIds = builder.contactGroupIds;
        this.contactGroups = builder.contactGroups;
        this.contactIds = builder.contactIds;
        this.contacts = builder.contacts;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.webhookIds = builder.webhookIds;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorNotifyStrategy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    /**
     * @return contactGroupIds
     */
    public java.util.List<Long> getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return contactGroups
     */
    public java.util.List<MonitorContactGroup> getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return contactIds
     */
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    /**
     * @return contacts
     */
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return webhookIds
     */
    public java.util.List<Long> getWebhookIds() {
        return this.webhookIds;
    }

    /**
     * @return webhooks
     */
    public java.util.List<MonitorWebhook> getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder {
        private java.util.List<String> channels; 
        private java.util.List<Long> contactGroupIds; 
        private java.util.List<MonitorContactGroup> contactGroups; 
        private java.util.List<Long> contactIds; 
        private java.util.List<MonitorContact> contacts; 
        private String endTime; 
        private Long id; 
        private String name; 
        private String requestId; 
        private String startTime; 
        private java.util.List<Long> webhookIds; 
        private java.util.List<MonitorWebhook> webhooks; 

        private Builder() {
        } 

        private Builder(MonitorNotifyStrategy model) {
            this.channels = model.channels;
            this.contactGroupIds = model.contactGroupIds;
            this.contactGroups = model.contactGroups;
            this.contactIds = model.contactIds;
            this.contacts = model.contacts;
            this.endTime = model.endTime;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.webhookIds = model.webhookIds;
            this.webhooks = model.webhooks;
        } 

        /**
         * channels.
         */
        public Builder channels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * contactGroupIds.
         */
        public Builder contactGroupIds(java.util.List<Long> contactGroupIds) {
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * contactGroups.
         */
        public Builder contactGroups(java.util.List<MonitorContactGroup> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * contactIds.
         */
        public Builder contactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
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
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * webhookIds.
         */
        public Builder webhookIds(java.util.List<Long> webhookIds) {
            this.webhookIds = webhookIds;
            return this;
        }

        /**
         * webhooks.
         */
        public Builder webhooks(java.util.List<MonitorWebhook> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public MonitorNotifyStrategy build() {
            return new MonitorNotifyStrategy(this);
        } 

    } 

}
