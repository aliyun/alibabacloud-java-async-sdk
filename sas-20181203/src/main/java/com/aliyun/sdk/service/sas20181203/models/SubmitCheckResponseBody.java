// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitCheckResponseBody</p>
 */
public class SubmitCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private SubmitCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCheckResponseBody create() {
        return builder().build();
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

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String taskId; 

        /**
         * The data returned if the call is successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the configuration assessment task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public SubmitCheckResponseBody build() {
            return new SubmitCheckResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OperateCode")
        private String operateCode;

        private Data(Builder builder) {
            this.operateCode = builder.operateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return operateCode
         */
        public String getOperateCode() {
            return this.operateCode;
        }

        public static final class Builder {
            private String operateCode; 

            /**
             * The operation code of the configuration assessment task.
             * <p>
             * 
             * *   **Throttling**: frequency limit
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
