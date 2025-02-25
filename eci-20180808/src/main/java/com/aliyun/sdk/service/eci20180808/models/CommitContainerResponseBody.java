// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommitContainerResponseBody} extends {@link TeaModel}
 *
 * <p>CommitContainerResponseBody</p>
 */
public class CommitContainerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CommitContainerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitContainerResponseBody create() {
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
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB8D2B22-D636-4182-****-1FC9DBDAD66F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bp18cwvrb3v9tjk0tekz</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CommitContainerResponseBody build() {
            return new CommitContainerResponseBody(this);
        } 

    } 

}
