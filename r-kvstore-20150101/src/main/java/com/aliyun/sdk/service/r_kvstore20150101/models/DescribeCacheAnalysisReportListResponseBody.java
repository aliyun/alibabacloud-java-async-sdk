// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisReportListResponseBody</p>
 */
public class DescribeCacheAnalysisReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyTasks")
    private DailyTasks dailyTasks;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCacheAnalysisReportListResponseBody(Builder builder) {
        this.dailyTasks = builder.dailyTasks;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheAnalysisReportListResponseBody create() {
        return builder().build();
    }

    /**
     * @return dailyTasks
     */
    public DailyTasks getDailyTasks() {
        return this.dailyTasks;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DailyTasks dailyTasks; 
        private String instanceId; 
        private String requestId; 

        /**
         * Details of the offline key analytics tasks.
         */
        public Builder dailyTasks(DailyTasks dailyTasks) {
            this.dailyTasks = dailyTasks;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCacheAnalysisReportListResponseBody build() {
            return new DescribeCacheAnalysisReportListResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Task(Builder builder) {
            this.nodeId = builder.nodeId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String nodeId; 
            private String startTime; 
            private String status; 
            private String taskId; 

            /**
             * The ID of the child node in the cluster instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The start time of the offline key analytics task.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the offline key analytics task. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **running**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List < Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    public static class DailyTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private Tasks tasks;

        private DailyTask(Builder builder) {
            this.date = builder.date;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyTask create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return tasks
         */
        public Tasks getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String date; 
            private Tasks tasks; 

            /**
             * The date when the offline key analytics task was performed.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Details of the offline key analytics tasks.
             */
            public Builder tasks(Tasks tasks) {
                this.tasks = tasks;
                return this;
            }

            public DailyTask build() {
                return new DailyTask(this);
            } 

        } 

    }
    public static class DailyTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyTask")
        private java.util.List < DailyTask> dailyTask;

        private DailyTasks(Builder builder) {
            this.dailyTask = builder.dailyTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyTasks create() {
            return builder().build();
        }

        /**
         * @return dailyTask
         */
        public java.util.List < DailyTask> getDailyTask() {
            return this.dailyTask;
        }

        public static final class Builder {
            private java.util.List < DailyTask> dailyTask; 

            /**
             * DailyTask.
             */
            public Builder dailyTask(java.util.List < DailyTask> dailyTask) {
                this.dailyTask = dailyTask;
                return this;
            }

            public DailyTasks build() {
                return new DailyTasks(this);
            } 

        } 

    }
}
