// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusScanTaskSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanTaskSummaryResponseBody</p>
 */
public class ListVirusScanTaskSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private ListVirusScanTaskSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTaskSummaryResponseBody create() {
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(ListVirusScanTaskSummaryResponseBody model) {
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

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
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListVirusScanTaskSummaryResponseBody build() {
            return new ListVirusScanTaskSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanTaskSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTaskSummaryResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("VirusFileCount")
        private Long virusFileCount;

        private Tasks(Builder builder) {
            this.taskId = builder.taskId;
            this.virusFileCount = builder.virusFileCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return virusFileCount
         */
        public Long getVirusFileCount() {
            return this.virusFileCount;
        }

        public static final class Builder {
            private String taskId; 
            private Long virusFileCount; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.taskId = model.taskId;
                this.virusFileCount = model.virusFileCount;
            } 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * VirusFileCount.
             */
            public Builder virusFileCount(Long virusFileCount) {
                this.virusFileCount = virusFileCount;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
