// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateVirusEventsResponseBody} extends {@link TeaModel}
 *
 * <p>OperateVirusEventsResponseBody</p>
 */
public class OperateVirusEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Long taskId;

    private OperateVirusEventsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVirusEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private Long taskId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task to handle multiple alert events at a time.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public OperateVirusEventsResponseBody build() {
            return new OperateVirusEventsResponseBody(this);
        } 

    } 

}
