// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotificationGroup} extends {@link TeaModel}
 *
 * <p>NotificationGroup</p>
 */
public class NotificationGroup extends TeaModel {
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("NotificationGroupDescription")
    private String notificationGroupDescription;

    @NameInMap("NotificationGroupId")
    private String notificationGroupId;

    @NameInMap("NotificationGroupName")
    private String notificationGroupName;

    @NameInMap("NotificationGroupType")
    private String notificationGroupType;

    @NameInMap("Webhook")
    private String webhook;

    private NotificationGroup(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.notificationGroupDescription = builder.notificationGroupDescription;
        this.notificationGroupId = builder.notificationGroupId;
        this.notificationGroupName = builder.notificationGroupName;
        this.notificationGroupType = builder.notificationGroupType;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotificationGroup create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return notificationGroupDescription
     */
    public String getNotificationGroupDescription() {
        return this.notificationGroupDescription;
    }

    /**
     * @return notificationGroupId
     */
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    /**
     * @return notificationGroupName
     */
    public String getNotificationGroupName() {
        return this.notificationGroupName;
    }

    /**
     * @return notificationGroupType
     */
    public String getNotificationGroupType() {
        return this.notificationGroupType;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private String notificationGroupDescription; 
        private String notificationGroupId; 
        private String notificationGroupName; 
        private String notificationGroupType; 
        private String webhook; 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * NotificationGroupDescription.
         */
        public Builder notificationGroupDescription(String notificationGroupDescription) {
            this.notificationGroupDescription = notificationGroupDescription;
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
         * NotificationGroupName.
         */
        public Builder notificationGroupName(String notificationGroupName) {
            this.notificationGroupName = notificationGroupName;
            return this;
        }

        /**
         * NotificationGroupType.
         */
        public Builder notificationGroupType(String notificationGroupType) {
            this.notificationGroupType = notificationGroupType;
            return this;
        }

        /**
         * Webhook.
         */
        public Builder webhook(String webhook) {
            this.webhook = webhook;
            return this;
        }

        public NotificationGroup build() {
            return new NotificationGroup(this);
        } 

    } 

}
