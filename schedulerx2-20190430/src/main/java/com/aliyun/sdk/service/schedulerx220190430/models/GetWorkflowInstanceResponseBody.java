// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowInstanceResponseBody</p>
 */
public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetWorkflowInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkflowInstanceResponseBody build() {
            return new GetWorkflowInstanceResponseBody(this);
        } 

    } 

    public static class Edges extends TeaModel {
        @NameInMap("Source")
        private Long source;

        @NameInMap("Target")
        private Long target;

        private Edges(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public Long getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Long source; 
            private Long target; 

            /**
             * Source.
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("Attempt")
        private Integer attempt;

        @NameInMap("DataTime")
        private String dataTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("JobInstanceId")
        private Long jobInstanceId;

        @NameInMap("Result")
        private String result;

        @NameInMap("ScheduleTime")
        private String scheduleTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("WorkAddr")
        private String workAddr;

        private Nodes(Builder builder) {
            this.attempt = builder.attempt;
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.jobId = builder.jobId;
            this.jobInstanceId = builder.jobInstanceId;
            this.result = builder.result;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.workAddr = builder.workAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobInstanceId
         */
        public Long getJobInstanceId() {
            return this.jobInstanceId;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return workAddr
         */
        public String getWorkAddr() {
            return this.workAddr;
        }

        public static final class Builder {
            private Integer attempt; 
            private String dataTime; 
            private String endTime; 
            private Long jobId; 
            private Long jobInstanceId; 
            private String result; 
            private String scheduleTime; 
            private String startTime; 
            private String workAddr; 

            /**
             * Attempt.
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobInstanceId.
             */
            public Builder jobInstanceId(Long jobInstanceId) {
                this.jobInstanceId = jobInstanceId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * ScheduleTime.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * WorkAddr.
             */
            public Builder workAddr(String workAddr) {
                this.workAddr = workAddr;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class WfInstanceDag extends TeaModel {
        @NameInMap("Edges")
        private java.util.List < Edges> edges;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        private WfInstanceDag(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WfInstanceDag create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List < Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List < Edges> edges; 
            private java.util.List < Nodes> nodes; 

            /**
             * Edges.
             */
            public Builder edges(java.util.List < Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public WfInstanceDag build() {
                return new WfInstanceDag(this);
            } 

        } 

    }
    public static class WfInstanceInfo extends TeaModel {
        @NameInMap("DataTime")
        private String dataTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ScheduleTime")
        private String scheduleTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        private WfInstanceInfo(Builder builder) {
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WfInstanceInfo create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dataTime; 
            private String endTime; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ScheduleTime.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public WfInstanceInfo build() {
                return new WfInstanceInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("WfInstanceDag")
        private WfInstanceDag wfInstanceDag;

        @NameInMap("WfInstanceInfo")
        private WfInstanceInfo wfInstanceInfo;

        private Data(Builder builder) {
            this.wfInstanceDag = builder.wfInstanceDag;
            this.wfInstanceInfo = builder.wfInstanceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wfInstanceDag
         */
        public WfInstanceDag getWfInstanceDag() {
            return this.wfInstanceDag;
        }

        /**
         * @return wfInstanceInfo
         */
        public WfInstanceInfo getWfInstanceInfo() {
            return this.wfInstanceInfo;
        }

        public static final class Builder {
            private WfInstanceDag wfInstanceDag; 
            private WfInstanceInfo wfInstanceInfo; 

            /**
             * WfInstanceDag.
             */
            public Builder wfInstanceDag(WfInstanceDag wfInstanceDag) {
                this.wfInstanceDag = wfInstanceDag;
                return this;
            }

            /**
             * WfInstanceInfo.
             */
            public Builder wfInstanceInfo(WfInstanceInfo wfInstanceInfo) {
                this.wfInstanceInfo = wfInstanceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
