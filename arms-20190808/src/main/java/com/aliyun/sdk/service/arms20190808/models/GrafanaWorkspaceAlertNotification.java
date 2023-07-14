// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceAlertNotification} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceAlertNotification</p>
 */
public class GrafanaWorkspaceAlertNotification extends TeaModel {
    @NameInMap("id")
    private Long id;

    @NameInMap("isArms")
    private Boolean isArms;

    @NameInMap("isDefault")
    private Boolean isDefault;

    @NameInMap("name")
    private String name;

    @NameInMap("sendReminder")
    private Boolean sendReminder;

    @NameInMap("settings")
    private String settings;

    @NameInMap("type")
    private String type;

    @NameInMap("uid")
    private String uid;

    private GrafanaWorkspaceAlertNotification(Builder builder) {
        this.id = builder.id;
        this.isArms = builder.isArms;
        this.isDefault = builder.isDefault;
        this.name = builder.name;
        this.sendReminder = builder.sendReminder;
        this.settings = builder.settings;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceAlertNotification create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isArms
     */
    public Boolean getIsArms() {
        return this.isArms;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sendReminder
     */
    public Boolean getSendReminder() {
        return this.sendReminder;
    }

    /**
     * @return settings
     */
    public String getSettings() {
        return this.settings;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Long id; 
        private Boolean isArms; 
        private Boolean isDefault; 
        private String name; 
        private Boolean sendReminder; 
        private String settings; 
        private String type; 
        private String uid; 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * isArms.
         */
        public Builder isArms(Boolean isArms) {
            this.isArms = isArms;
            return this;
        }

        /**
         * isDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
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
         * sendReminder.
         */
        public Builder sendReminder(Boolean sendReminder) {
            this.sendReminder = sendReminder;
            return this;
        }

        /**
         * settings.
         */
        public Builder settings(String settings) {
            this.settings = settings;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GrafanaWorkspaceAlertNotification build() {
            return new GrafanaWorkspaceAlertNotification(this);
        } 

    } 

}
