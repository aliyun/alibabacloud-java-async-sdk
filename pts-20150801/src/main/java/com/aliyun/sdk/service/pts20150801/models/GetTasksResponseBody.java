// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTasksResponseBody} extends {@link TeaModel}
 *
 * <p>GetTasksResponseBody</p>
 */
public class GetTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private String tasks;

    private GetTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public String getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private String tasks; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(String tasks) {
            this.tasks = tasks;
            return this;
        }

        public GetTasksResponseBody build() {
            return new GetTasksResponseBody(this);
        } 

    } 

}
