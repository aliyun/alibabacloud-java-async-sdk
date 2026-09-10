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
 * {@link NotifyConfigUnified} extends {@link TeaModel}
 *
 * <p>NotifyConfigUnified</p>
 */
public class NotifyConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activeDays")
    private java.util.List<Integer> activeDays;

    @com.aliyun.core.annotation.NameInMap("activeEndTime")
    private String activeEndTime;

    @com.aliyun.core.annotation.NameInMap("activeStartTime")
    private String activeStartTime;

    @com.aliyun.core.annotation.NameInMap("channels")
    private java.util.List<DirectNotifyChannel> channels;

    @com.aliyun.core.annotation.NameInMap("notifyStrategies")
    private java.util.List<String> notifyStrategies;

    @com.aliyun.core.annotation.NameInMap("sendRecoverNotification")
    private Boolean sendRecoverNotification;

    @com.aliyun.core.annotation.NameInMap("severityChannels")
    private java.util.Map<String, SeverityNotifyConfig> severityChannels;

    @com.aliyun.core.annotation.NameInMap("silenceTimeSecs")
    private Integer silenceTimeSecs;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("utcOffset")
    private String utcOffset;

    private NotifyConfigUnified(Builder builder) {
        this.activeDays = builder.activeDays;
        this.activeEndTime = builder.activeEndTime;
        this.activeStartTime = builder.activeStartTime;
        this.channels = builder.channels;
        this.notifyStrategies = builder.notifyStrategies;
        this.sendRecoverNotification = builder.sendRecoverNotification;
        this.severityChannels = builder.severityChannels;
        this.silenceTimeSecs = builder.silenceTimeSecs;
        this.type = builder.type;
        this.utcOffset = builder.utcOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeDays
     */
    public java.util.List<Integer> getActiveDays() {
        return this.activeDays;
    }

    /**
     * @return activeEndTime
     */
    public String getActiveEndTime() {
        return this.activeEndTime;
    }

    /**
     * @return activeStartTime
     */
    public String getActiveStartTime() {
        return this.activeStartTime;
    }

    /**
     * @return channels
     */
    public java.util.List<DirectNotifyChannel> getChannels() {
        return this.channels;
    }

    /**
     * @return notifyStrategies
     */
    public java.util.List<String> getNotifyStrategies() {
        return this.notifyStrategies;
    }

    /**
     * @return sendRecoverNotification
     */
    public Boolean getSendRecoverNotification() {
        return this.sendRecoverNotification;
    }

    /**
     * @return severityChannels
     */
    public java.util.Map<String, SeverityNotifyConfig> getSeverityChannels() {
        return this.severityChannels;
    }

    /**
     * @return silenceTimeSecs
     */
    public Integer getSilenceTimeSecs() {
        return this.silenceTimeSecs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return utcOffset
     */
    public String getUtcOffset() {
        return this.utcOffset;
    }

    public static final class Builder {
        private java.util.List<Integer> activeDays; 
        private String activeEndTime; 
        private String activeStartTime; 
        private java.util.List<DirectNotifyChannel> channels; 
        private java.util.List<String> notifyStrategies; 
        private Boolean sendRecoverNotification; 
        private java.util.Map<String, SeverityNotifyConfig> severityChannels; 
        private Integer silenceTimeSecs; 
        private String type; 
        private String utcOffset; 

        private Builder() {
        } 

        private Builder(NotifyConfigUnified model) {
            this.activeDays = model.activeDays;
            this.activeEndTime = model.activeEndTime;
            this.activeStartTime = model.activeStartTime;
            this.channels = model.channels;
            this.notifyStrategies = model.notifyStrategies;
            this.sendRecoverNotification = model.sendRecoverNotification;
            this.severityChannels = model.severityChannels;
            this.silenceTimeSecs = model.silenceTimeSecs;
            this.type = model.type;
            this.utcOffset = model.utcOffset;
        } 

        /**
         * <p>The days of the week on which notifications are sent, 1-7.</p>
         */
        public Builder activeDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }

        /**
         * <p>The daily notification effective end time.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00</p>
         */
        public Builder activeEndTime(String activeEndTime) {
            this.activeEndTime = activeEndTime;
            return this;
        }

        /**
         * <p>The daily notification effective start time.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        public Builder activeStartTime(String activeStartTime) {
            this.activeStartTime = activeStartTime;
            return this;
        }

        /**
         * <p>The list of notification channels.</p>
         */
        public Builder channels(java.util.List<DirectNotifyChannel> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The list of notification policy IDs (type=NOTIFY_POLICY, currently a maximum of 1 is supported. Mutually exclusive with the DIRECT_NOTIFY fields channels/silenceTimeSecs/activeDays/activeStartTime/activeEndTime/utcOffset).</p>
         */
        public Builder notifyStrategies(java.util.List<String> notifyStrategies) {
            this.notifyStrategies = notifyStrategies;
            return this;
        }

        /**
         * <p>Specifies whether to send recovery notifications (type=DIRECT_NOTIFY). Default value: true. Each severity level in severityChannels can independently override this setting.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sendRecoverNotification(Boolean sendRecoverNotification) {
            this.sendRecoverNotification = sendRecoverNotification;
            return this;
        }

        /**
         * <p>The Notification Recipients and channels configured by severity level (type=DIRECT_NOTIFY, new mode, mutually exclusive with channels). The key is the severity level: CRITICAL/ERROR/WARNING/INFO.</p>
         */
        public Builder severityChannels(java.util.Map<String, SeverityNotifyConfig> severityChannels) {
            this.severityChannels = severityChannels;
            return this;
        }

        /**
         * <p>The mute for epoch in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder silenceTimeSecs(Integer silenceTimeSecs) {
            this.silenceTimeSecs = silenceTimeSecs;
            return this;
        }

        /**
         * <p>The notification configuration type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_NOTIFY</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The UTC time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        public Builder utcOffset(String utcOffset) {
            this.utcOffset = utcOffset;
            return this;
        }

        public NotifyConfigUnified build() {
            return new NotifyConfigUnified(this);
        } 

    } 

}
