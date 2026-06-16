// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ResetMem0AccountPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ResetMem0AccountPasswordResponseBody</p>
 */
public class ResetMem0AccountPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetMem0AccountPasswordResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetMem0AccountPasswordResponseBody create() {
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

        private Builder(ResetMem0AccountPasswordResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetMem0AccountPasswordResponseBody build() {
            return new ResetMem0AccountPasswordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetMem0AccountPasswordResponseBody} extends {@link TeaModel}
     *
     * <p>ResetMem0AccountPasswordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mem0ApiKey")
        private String mem0ApiKey;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Data(Builder builder) {
            this.mem0ApiKey = builder.mem0ApiKey;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mem0ApiKey
         */
        public String getMem0ApiKey() {
            return this.mem0ApiKey;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String mem0ApiKey; 
            private Integer taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mem0ApiKey = model.mem0ApiKey;
                this.taskId = model.taskId;
            } 

            /**
             * <p>API KEY</p>
             * 
             * <strong>example:</strong>
             * <p>aafdf2e7d0988ef***</p>
             */
            public Builder mem0ApiKey(String mem0ApiKey) {
                this.mem0ApiKey = mem0ApiKey;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
