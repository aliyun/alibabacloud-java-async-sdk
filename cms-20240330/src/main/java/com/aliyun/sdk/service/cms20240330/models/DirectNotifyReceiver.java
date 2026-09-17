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
 * {@link DirectNotifyReceiver} extends {@link TeaModel}
 *
 * <p>DirectNotifyReceiver</p>
 */
public class DirectNotifyReceiver extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channels")
    private java.util.List<String> channels;

    @com.aliyun.core.annotation.NameInMap("identifiers")
    private java.util.List<String> identifiers;

    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private DirectNotifyReceiver(Builder builder) {
        this.channels = builder.channels;
        this.identifiers = builder.identifiers;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectNotifyReceiver create() {
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
     * @return identifiers
     */
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private java.util.List<String> channels; 
        private java.util.List<String> identifiers; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(DirectNotifyReceiver model) {
            this.channels = model.channels;
            this.identifiers = model.identifiers;
            this.targetType = model.targetType;
        } 

        /**
         * <p>The list of notification methods. This parameter is valid only for personnel types (CONTACT/GROUP/DUTY). Valid values: SMS, CALL, EMAIL.</p>
         */
        public Builder channels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The list of Notification Recipient identifiers. For personnel types, this is the identifier of a contact, contact group, or on-call schedule. For IM types, this is the webhook identifier.</p>
         */
        public Builder identifiers(java.util.List<String> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * <p>The Notification Recipient object type. Personnel types (CONTACT/GROUP/DUTY) require the channels parameter to specify notification methods. IM types (DINGTALK/FEISHU/SLACK/WEIXIN/WEBHOOK) do not require the channels parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTACT</p>
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public DirectNotifyReceiver build() {
            return new DirectNotifyReceiver(this);
        } 

    } 

}
