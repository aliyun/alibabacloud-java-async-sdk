// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchFileResponseBody} extends {@link TeaModel}
 *
 * <p>FetchFileResponseBody</p>
 */
public class FetchFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private FetchFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchFileResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public FetchFileResponseBody build() {
            return new FetchFileResponseBody(this);
        } 

    } 

}
