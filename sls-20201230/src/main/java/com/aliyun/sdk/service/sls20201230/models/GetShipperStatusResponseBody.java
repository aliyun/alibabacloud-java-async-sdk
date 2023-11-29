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
         * The number of log shipping jobs returned on the current page.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * The statistics about log shipping jobs.
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * The details of log shipping jobs.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * The total number of log shipping jobs.
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
             * The number of log shipping jobs that are in the fail state.
             */
            public Builder fail(Long fail) {
                this.fail = fail;
                return this;
            }

            /**
             * The number of log shipping jobs that are in the running state.
             */
            public Builder running(Long running) {
                this.running = running;
                return this;
            }

            /**
             * The number of log shipping jobs that are in the success state.
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
             * The ID of the log shipping job.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The error code of the log shipping job.
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
                return this;
            }

            /**
             * The start time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * The number of logs that are shipped in the log shipping job.
             */
            public Builder taskDataLines(Integer taskDataLines) {
                this.taskDataLines = taskDataLines;
                return this;
            }

            /**
             * The end time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder taskFinishTime(Long taskFinishTime) {
                this.taskFinishTime = taskFinishTime;
                return this;
            }

            /**
             * The time when Simple Log Service receives the most recent log of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder taskLastDataReceiveTime(Long taskLastDataReceiveTime) {
                this.taskLastDataReceiveTime = taskLastDataReceiveTime;
                return this;
            }

            /**
             * The error message of the log shipping job.
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * The status of the log shipping job. Valid values: running, success, and fail.
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
