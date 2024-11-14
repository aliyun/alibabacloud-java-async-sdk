// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAICoachTaskPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICoachTaskPageResponseBody</p>
 */
public class ListAICoachTaskPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskList")
    private java.util.List < TaskList> taskList;

    private ListAICoachTaskPageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachTaskPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskList
     */
    public java.util.List < TaskList> getTaskList() {
        return this.taskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TaskList> taskList; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D7F2B74F-63F2-5DD6-95E4-F408EAD6617E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskList.
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        public ListAICoachTaskPageResponseBody build() {
            return new ListAICoachTaskPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICoachTaskPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachTaskPageResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("studentId")
        private String studentId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private TaskList(Builder builder) {
            this.finishTime = builder.finishTime;
            this.status = builder.status;
            this.studentId = builder.studentId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return studentId
         */
        public String getStudentId() {
            return this.studentId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String finishTime; 
            private String status; 
            private String studentId; 
            private String taskId; 

            /**
             * finishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * studentId.
             */
            public Builder studentId(String studentId) {
                this.studentId = studentId;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
