// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link Pod} extends {@link TeaModel}
 *
 * <p>Pod</p>
 */
public class Pod extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    @com.aliyun.core.annotation.NameInMap("PodStatus")
    private String podStatus;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    private Pod(Builder builder) {
        this.message = builder.message;
        this.podName = builder.podName;
        this.podStatus = builder.podStatus;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Pod create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return podStatus
     */
    public String getPodStatus() {
        return this.podStatus;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private String message; 
        private String podName; 
        private String podStatus; 
        private String reason; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * PodStatus.
         */
        public Builder podStatus(String podStatus) {
            this.podStatus = podStatus;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Pod build() {
            return new Pod(this);
        } 

    } 

}
