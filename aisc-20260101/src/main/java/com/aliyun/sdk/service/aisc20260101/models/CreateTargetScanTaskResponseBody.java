// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateTargetScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTargetScanTaskResponseBody</p>
 */
public class CreateTargetScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateTargetScanTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTargetScanTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateTargetScanTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The creation result, which contains the TaskId of the new scan task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which is used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTargetScanTaskResponseBody build() {
            return new CreateTargetScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTargetScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTargetScanTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskId = model.taskId;
            } 

            /**
             * <p>The unique identifier of the scan task. The initial task status is PREPARING (asynchronous preparation in progress). You can call ListScanTasksByTarget to query the task status and progress.</p>
             * 
             * <strong>example:</strong>
             * <p>task-abc123def4567</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
