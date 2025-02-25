// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link HotUpdateJobStatus} extends {@link TeaModel}
 *
 * <p>HotUpdateJobStatus</p>
 */
public class HotUpdateJobStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failure")
    private HotUpdateJobFailureInfo failure;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private HotUpdateJobStatus(Builder builder) {
        this.failure = builder.failure;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotUpdateJobStatus create() {
        return builder().build();
    }

    /**
     * @return failure
     */
    public HotUpdateJobFailureInfo getFailure() {
        return this.failure;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private HotUpdateJobFailureInfo failure; 
        private String requestId; 
        private String status; 

        /**
         * failure.
         */
        public Builder failure(HotUpdateJobFailureInfo failure) {
            this.failure = failure;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public HotUpdateJobStatus build() {
            return new HotUpdateJobStatus(this);
        } 

    } 

}
