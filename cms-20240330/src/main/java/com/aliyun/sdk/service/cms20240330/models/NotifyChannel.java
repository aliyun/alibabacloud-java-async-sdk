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
 * {@link NotifyChannel} extends {@link TeaModel}
 *
 * <p>NotifyChannel</p>
 */
public class NotifyChannel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelType")
    private String channelType;

    @com.aliyun.core.annotation.NameInMap("enabledSubChannels")
    private java.util.List<String> enabledSubChannels;

    @com.aliyun.core.annotation.NameInMap("receivers")
    private java.util.List<String> receivers;

    private NotifyChannel(Builder builder) {
        this.channelType = builder.channelType;
        this.enabledSubChannels = builder.enabledSubChannels;
        this.receivers = builder.receivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyChannel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return enabledSubChannels
     */
    public java.util.List<String> getEnabledSubChannels() {
        return this.enabledSubChannels;
    }

    /**
     * @return receivers
     */
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public static final class Builder {
        private String channelType; 
        private java.util.List<String> enabledSubChannels; 
        private java.util.List<String> receivers; 

        private Builder() {
        } 

        private Builder(NotifyChannel model) {
            this.channelType = model.channelType;
            this.enabledSubChannels = model.enabledSubChannels;
            this.receivers = model.receivers;
        } 

        /**
         * channelType.
         */
        public Builder channelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        /**
         * enabledSubChannels.
         */
        public Builder enabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }

        /**
         * receivers.
         */
        public Builder receivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }

        public NotifyChannel build() {
            return new NotifyChannel(this);
        } 

    } 

}
