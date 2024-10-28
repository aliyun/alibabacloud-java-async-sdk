// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskInstanceLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInstanceLogResponseBody</p>
 */
public class GetTaskInstanceLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceLog")
    private String taskInstanceLog;

    private GetTaskInstanceLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInstanceLog = builder.taskInstanceLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskInstanceLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInstanceLog
     */
    public String getTaskInstanceLog() {
        return this.taskInstanceLog;
    }

    public static final class Builder {
        private String requestId; 
        private String taskInstanceLog; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskInstanceLog.
         */
        public Builder taskInstanceLog(String taskInstanceLog) {
            this.taskInstanceLog = taskInstanceLog;
            return this;
        }

        public GetTaskInstanceLogResponseBody build() {
            return new GetTaskInstanceLogResponseBody(this);
        } 

    } 

}
