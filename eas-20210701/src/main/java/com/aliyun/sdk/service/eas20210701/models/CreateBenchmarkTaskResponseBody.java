// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBenchmarkTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBenchmarkTaskResponseBody</p>
 */
public class CreateBenchmarkTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskName")
    private String taskName;

    private CreateBenchmarkTaskResponseBody(Builder builder) {
        this.message = builder.message;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBenchmarkTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String message; 
        private String region; 
        private String requestId; 
        private String taskName; 

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the region where the stress testing task is performed.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the stress testing task.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateBenchmarkTaskResponseBody build() {
            return new CreateBenchmarkTaskResponseBody(this);
        } 

    } 

}
