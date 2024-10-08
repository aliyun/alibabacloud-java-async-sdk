// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBenchmarkTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBenchmarkTaskResponseBody</p>
 */
public class CreateBenchmarkTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Benchmark  task [foo] is Creating</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the region where the stress testing task is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>benchmark-larec-test-1076</p>
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
