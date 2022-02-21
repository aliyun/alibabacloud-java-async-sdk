// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScheduledTaskResponseBody</p>
 */
public class CreateScheduledTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduledTaskId")
    private String scheduledTaskId;

    private CreateScheduledTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scheduledTaskId = builder.scheduledTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduledTaskId
     */
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private String scheduledTaskId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduledTaskId.
         */
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        public CreateScheduledTaskResponseBody build() {
            return new CreateScheduledTaskResponseBody(this);
        } 

    } 

}
