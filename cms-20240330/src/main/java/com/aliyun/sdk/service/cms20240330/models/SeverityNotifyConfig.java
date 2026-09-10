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
 * {@link SeverityNotifyConfig} extends {@link TeaModel}
 *
 * <p>SeverityNotifyConfig</p>
 */
public class SeverityNotifyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("receivers")
    private java.util.List<DirectNotifyReceiver> receivers;

    @com.aliyun.core.annotation.NameInMap("sendRecoverNotification")
    private Boolean sendRecoverNotification;

    private SeverityNotifyConfig(Builder builder) {
        this.receivers = builder.receivers;
        this.sendRecoverNotification = builder.sendRecoverNotification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SeverityNotifyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return receivers
     */
    public java.util.List<DirectNotifyReceiver> getReceivers() {
        return this.receivers;
    }

    /**
     * @return sendRecoverNotification
     */
    public Boolean getSendRecoverNotification() {
        return this.sendRecoverNotification;
    }

    public static final class Builder {
        private java.util.List<DirectNotifyReceiver> receivers; 
        private Boolean sendRecoverNotification; 

        private Builder() {
        } 

        private Builder(SeverityNotifyConfig model) {
            this.receivers = model.receivers;
            this.sendRecoverNotification = model.sendRecoverNotification;
        } 

        /**
         * <p>The list of Notification Recipients. Each recipient specifies the type, identifier, and enabled channels.</p>
         */
        public Builder receivers(java.util.List<DirectNotifyReceiver> receivers) {
            this.receivers = receivers;
            return this;
        }

        /**
         * <p>Specifies whether to send recovery notifications for this severity level. If this parameter is empty, the value falls back to the top-level sendRecoverNotification parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sendRecoverNotification(Boolean sendRecoverNotification) {
            this.sendRecoverNotification = sendRecoverNotification;
            return this;
        }

        public SeverityNotifyConfig build() {
            return new SeverityNotifyConfig(this);
        } 

    } 

}
