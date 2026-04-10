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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DirectNotifyChannel> channels;

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
            this.silenceTimeSecs = model.silenceTimeSecs;
            this.type = model.type;
            this.utcOffset = model.utcOffset;
        } 

        /**
         * <p>一周中发送通知的星期，1-7</p>
         */
        public Builder activeDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }

        /**
         * <p>每天通知生效结束时间</p>
         */
        public Builder activeEndTime(String activeEndTime) {
            this.activeEndTime = activeEndTime;
            return this;
        }

        /**
         * <p>每天通知生效开始时间</p>
         */
        public Builder activeStartTime(String activeStartTime) {
            this.activeStartTime = activeStartTime;
            return this;
        }

        /**
         * <p>通知渠道列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder channels(java.util.List<DirectNotifyChannel> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>通道沉默周期（秒）</p>
         */
        public Builder silenceTimeSecs(Integer silenceTimeSecs) {
            this.silenceTimeSecs = silenceTimeSecs;
            return this;
        }

        /**
         * <p>通知配置类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>UTC 时区偏移量</p>
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
