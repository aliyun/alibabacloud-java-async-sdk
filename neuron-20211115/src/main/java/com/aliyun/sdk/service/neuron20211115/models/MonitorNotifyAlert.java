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
 * {@link MonitorNotifyAlert} extends {@link TeaModel}
 *
 * <p>MonitorNotifyAlert</p>
 */
public class MonitorNotifyAlert extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactGroups")
    private java.util.List<MonitorContactGroup> contactGroups;

    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<MonitorContact> contacts;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notifyChannels")
    private java.util.List<String> notifyChannels;

    @com.aliyun.core.annotation.NameInMap("ruleNames")
    private java.util.List<String> ruleNames;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("webhooks")
    private java.util.List<MonitorWebhook> webhooks;

    private MonitorNotifyAlert(Builder builder) {
        this.contactGroups = builder.contactGroups;
        this.contacts = builder.contacts;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.name = builder.name;
        this.notifyChannels = builder.notifyChannels;
        this.ruleNames = builder.ruleNames;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorNotifyAlert create() {
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
     * @return notifyChannels
     */
    public java.util.List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    /**
     * @return ruleNames
     */
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String endTime; 
        private Long id; 
        private String name; 
        private java.util.List<String> notifyChannels; 
        private java.util.List<String> ruleNames; 
        private String startTime; 
        private String type; 
        private java.util.List<MonitorWebhook> webhooks; 

        private Builder() {
        } 

        private Builder(MonitorNotifyAlert model) {
            this.contactGroups = model.contactGroups;
            this.contacts = model.contacts;
            this.endTime = model.endTime;
            this.id = model.id;
            this.name = model.name;
            this.notifyChannels = model.notifyChannels;
            this.ruleNames = model.ruleNames;
            this.startTime = model.startTime;
            this.type = model.type;
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
         * notifyChannels.
         */
        public Builder notifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }

        /**
         * ruleNames.
         */
        public Builder ruleNames(java.util.List<String> ruleNames) {
            this.ruleNames = ruleNames;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>日志</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * webhooks.
         */
        public Builder webhooks(java.util.List<MonitorWebhook> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public MonitorNotifyAlert build() {
            return new MonitorNotifyAlert(this);
        } 

    } 

}
