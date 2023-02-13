// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RedeployInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RedeployInstanceResponseBody</p>
 */
public class RedeployInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private RedeployInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RedeployInstanceResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the redeployment task.
         * <p>
         * 
         * You can call the [DescribeTasks](~~25622~~) operation to query the migration result.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RedeployInstanceResponseBody build() {
            return new RedeployInstanceResponseBody(this);
        } 

    } 

}
