// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link SendFileResponseBody} extends {@link TeaModel}
 *
 * <p>SendFileResponseBody</p>
 */
public class SendFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SendFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(SendFileResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The details of the created tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>A unique identifier for the request. If you encounter an issue, provide this request ID to technical support for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The batch task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ehs0yoedj0xe9****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public SendFileResponseBody build() {
            return new SendFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendFileResponseBody} extends {@link TeaModel}
     *
     * <p>SendFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.androidInstanceId = model.androidInstanceId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-34pqe4r0kd9kn****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The ID of the individual task for a specific cloud phone.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4ks224ujixw****</p>
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
