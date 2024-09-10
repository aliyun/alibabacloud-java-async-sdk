// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarStrategyTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarStrategyTaskDetailResponseBody</p>
 */
public class DescribeSoarStrategyTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskDetail")
    private TaskDetail taskDetail;

    private DescribeSoarStrategyTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskDetail = builder.taskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskDetail
     */
    public TaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TaskDetail taskDetail; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the task.
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public DescribeSoarStrategyTaskDetailResponseBody build() {
            return new DescribeSoarStrategyTaskDetailResponseBody(this);
        } 

    } 

    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private String logInfo;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("ProcessInfo")
        private String processInfo;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private TaskDetail(Builder builder) {
            this.logInfo = builder.logInfo;
            this.params = builder.params;
            this.processInfo = builder.processInfo;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetail create() {
            return builder().build();
        }

        /**
         * @return logInfo
         */
        public String getLogInfo() {
            return this.logInfo;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return processInfo
         */
        public String getProcessInfo() {
            return this.processInfo;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String logInfo; 
            private String params; 
            private String processInfo; 
            private String taskName; 

            /**
             * The operational log information of the task.
             */
            public Builder logInfo(String logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            /**
             * The parameters of the task.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * The process information of the task.
             */
            public Builder processInfo(String processInfo) {
                this.processInfo = processInfo;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
}
