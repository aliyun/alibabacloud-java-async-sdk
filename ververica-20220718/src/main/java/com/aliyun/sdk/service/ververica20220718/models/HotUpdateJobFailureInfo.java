// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotUpdateJobFailureInfo} extends {@link TeaModel}
 *
 * <p>HotUpdateJobFailureInfo</p>
 */
public class HotUpdateJobFailureInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failureSeverity")
    private String failureSeverity;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private HotUpdateJobFailureInfo(Builder builder) {
        this.failureSeverity = builder.failureSeverity;
        this.message = builder.message;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotUpdateJobFailureInfo create() {
        return builder().build();
    }

    /**
     * @return failureSeverity
     */
    public String getFailureSeverity() {
        return this.failureSeverity;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private String failureSeverity; 
        private String message; 
        private String reason; 

        /**
         * failureSeverity.
         */
        public Builder failureSeverity(String failureSeverity) {
            this.failureSeverity = failureSeverity;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public HotUpdateJobFailureInfo build() {
            return new HotUpdateJobFailureInfo(this);
        } 

    } 

}
