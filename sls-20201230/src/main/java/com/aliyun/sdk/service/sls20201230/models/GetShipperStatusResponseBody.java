// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetShipperStatusResponseBody</p>
 */
public class GetShipperStatusResponseBody extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("statistics")
    private Statistics statistics;

    @NameInMap("tasks")
    private Tasks tasks;

    @NameInMap("total")
    private Long total;

    private GetShipperStatusResponseBody(Builder builder) {
        this.count = builder.count;
        this.statistics = builder.statistics;
        this.tasks = builder.tasks;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShipperStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return statistics
     */
    public Statistics getStatistics() {
        return this.statistics;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long count; 
        private Statistics statistics; 
        private Tasks tasks; 
        private Long total; 

        /**
         * 当前页返回的任务个数。
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * 任务汇总状态统计。
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * 任务总数。
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetShipperStatusResponseBody build() {
            return new GetShipperStatusResponseBody(this);
        } 

    } 

    public static class Statistics extends TeaModel {
        @NameInMap("fail")
        private Long fail;

        @NameInMap("running")
        private Long running;

        @NameInMap("success")
        private Long success;

        private Statistics(Builder builder) {
            this.fail = builder.fail;
            this.running = builder.running;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public Long getFail() {
            return this.fail;
        }

        /**
         * @return running
         */
        public Long getRunning() {
            return this.running;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Long fail; 
            private Long running; 
            private Long success; 

            /**
             * 运行失败的任务数量。
             */
            public Builder fail(Long fail) {
                this.fail = fail;
                return this;
            }

            /**
             * 正在运行的任务数量。
             */
            public Builder running(Long running) {
                this.running = running;
                return this;
            }

            /**
             * 成功完成的任务数量。
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("taskCode")
        private String taskCode;

        @NameInMap("taskCreateTime")
        private Long taskCreateTime;

        @NameInMap("taskDataLines")
        private Integer taskDataLines;

        @NameInMap("taskFinishTime")
        private Long taskFinishTime;

        @NameInMap("taskLastDataReceiveTime")
        private Long taskLastDataReceiveTime;

        @NameInMap("taskMessage")
        private String taskMessage;

        @NameInMap("taskStatus")
        private String taskStatus;

        private Tasks(Builder builder) {
            this.id = builder.id;
            this.taskCode = builder.taskCode;
            this.taskCreateTime = builder.taskCreateTime;
            this.taskDataLines = builder.taskDataLines;
            this.taskFinishTime = builder.taskFinishTime;
            this.taskLastDataReceiveTime = builder.taskLastDataReceiveTime;
            this.taskMessage = builder.taskMessage;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskCreateTime
         */
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        /**
         * @return taskDataLines
         */
        public Integer getTaskDataLines() {
            return this.taskDataLines;
        }

        /**
         * @return taskFinishTime
         */
        public Long getTaskFinishTime() {
            return this.taskFinishTime;
        }

        /**
         * @return taskLastDataReceiveTime
         */
        public Long getTaskLastDataReceiveTime() {
            return this.taskLastDataReceiveTime;
        }

        /**
         * @return taskMessage
         */
        public String getTaskMessage() {
            return this.taskMessage;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String id; 
            private String taskCode; 
            private Long taskCreateTime; 
            private Integer taskDataLines; 
            private Long taskFinishTime; 
            private Long taskLastDataReceiveTime; 
            private String taskMessage; 
            private String taskStatus; 

            /**
             * 任务 id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 任务错误码。
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
                return this;
            }

            /**
             * 投递任务创建时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * taskDataLines.
             */
            public Builder taskDataLines(Integer taskDataLines) {
                this.taskDataLines = taskDataLines;
                return this;
            }

            /**
             * 投递任务结束时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
             */
            public Builder taskFinishTime(Long taskFinishTime) {
                this.taskFinishTime = taskFinishTime;
                return this;
            }

            /**
             * 投递任务中的最近一条日志到达服务端时间（非日志时间，是服务端接收时间）。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
             */
            public Builder taskLastDataReceiveTime(Long taskLastDataReceiveTime) {
                this.taskLastDataReceiveTime = taskLastDataReceiveTime;
                return this;
            }

            /**
             * 投递任务失败时的具体错误信息。
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * 任务当前状态，可以是 running、success、fail 三种状态之一。
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
