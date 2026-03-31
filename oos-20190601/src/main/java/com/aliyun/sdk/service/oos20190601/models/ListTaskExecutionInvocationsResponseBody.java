// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTaskExecutionInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskExecutionInvocationsResponseBody</p>
 */
public class ListTaskExecutionInvocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskExecutionInvocations")
    private java.util.List<TaskExecutionInvocations> taskExecutionInvocations;

    private ListTaskExecutionInvocationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskExecutionInvocations = builder.taskExecutionInvocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskExecutionInvocationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskExecutionInvocations
     */
    public java.util.List<TaskExecutionInvocations> getTaskExecutionInvocations() {
        return this.taskExecutionInvocations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskExecutionInvocations> taskExecutionInvocations; 

        private Builder() {
        } 

        private Builder(ListTaskExecutionInvocationsResponseBody model) {
            this.requestId = model.requestId;
            this.taskExecutionInvocations = model.taskExecutionInvocations;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9E011F98-4EE5-5E3A-8FA3-D38F2C531C1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskExecutionInvocations.
         */
        public Builder taskExecutionInvocations(java.util.List<TaskExecutionInvocations> taskExecutionInvocations) {
            this.taskExecutionInvocations = taskExecutionInvocations;
            return this;
        }

        public ListTaskExecutionInvocationsResponseBody build() {
            return new ListTaskExecutionInvocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskExecutionInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskExecutionInvocationsResponseBody</p>
     */
    public static class TaskExecutionInvocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationId")
        private String invocationId;

        @com.aliyun.core.annotation.NameInMap("InvocationTaskExecutionId")
        private String invocationTaskExecutionId;

        @com.aliyun.core.annotation.NameInMap("InvocationTaskName")
        private String invocationTaskName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private TaskExecutionInvocations(Builder builder) {
            this.invocationId = builder.invocationId;
            this.invocationTaskExecutionId = builder.invocationTaskExecutionId;
            this.invocationTaskName = builder.invocationTaskName;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecutionInvocations create() {
            return builder().build();
        }

        /**
         * @return invocationId
         */
        public String getInvocationId() {
            return this.invocationId;
        }

        /**
         * @return invocationTaskExecutionId
         */
        public String getInvocationTaskExecutionId() {
            return this.invocationTaskExecutionId;
        }

        /**
         * @return invocationTaskName
         */
        public String getInvocationTaskName() {
            return this.invocationTaskName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String invocationId; 
            private String invocationTaskExecutionId; 
            private String invocationTaskName; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(TaskExecutionInvocations model) {
                this.invocationId = model.invocationId;
                this.invocationTaskExecutionId = model.invocationTaskExecutionId;
                this.invocationTaskName = model.invocationTaskName;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * InvocationId.
             */
            public Builder invocationId(String invocationId) {
                this.invocationId = invocationId;
                return this;
            }

            /**
             * InvocationTaskExecutionId.
             */
            public Builder invocationTaskExecutionId(String invocationTaskExecutionId) {
                this.invocationTaskExecutionId = invocationTaskExecutionId;
                return this;
            }

            /**
             * InvocationTaskName.
             */
            public Builder invocationTaskName(String invocationTaskName) {
                this.invocationTaskName = invocationTaskName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TaskExecutionInvocations build() {
                return new TaskExecutionInvocations(this);
            } 

        } 

    }
}
