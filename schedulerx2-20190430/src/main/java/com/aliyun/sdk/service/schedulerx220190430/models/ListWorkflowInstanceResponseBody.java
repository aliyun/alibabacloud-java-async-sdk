// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstanceResponseBody</p>
 */
public class ListWorkflowInstanceResponseBody extends TeaModel {
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

    private ListWorkflowInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstanceResponseBody create() {
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

        public ListWorkflowInstanceResponseBody build() {
            return new ListWorkflowInstanceResponseBody(this);
        } 

    } 

    public static class WfInstanceInfos extends TeaModel {
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

        @NameInMap("WfInstanceId")
        private Long wfInstanceId;

        @NameInMap("WorkflowId")
        private Long workflowId;

        private WfInstanceInfos(Builder builder) {
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.wfInstanceId = builder.wfInstanceId;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WfInstanceInfos create() {
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

        /**
         * @return wfInstanceId
         */
        public Long getWfInstanceId() {
            return this.wfInstanceId;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String dataTime; 
            private String endTime; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 
            private Long wfInstanceId; 
            private Long workflowId; 

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

            /**
             * WfInstanceId.
             */
            public Builder wfInstanceId(Long wfInstanceId) {
                this.wfInstanceId = wfInstanceId;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public WfInstanceInfos build() {
                return new WfInstanceInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("WfInstanceInfos")
        private java.util.List < WfInstanceInfos> wfInstanceInfos;

        private Data(Builder builder) {
            this.wfInstanceInfos = builder.wfInstanceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wfInstanceInfos
         */
        public java.util.List < WfInstanceInfos> getWfInstanceInfos() {
            return this.wfInstanceInfos;
        }

        public static final class Builder {
            private java.util.List < WfInstanceInfos> wfInstanceInfos; 

            /**
             * WfInstanceInfos.
             */
            public Builder wfInstanceInfos(java.util.List < WfInstanceInfos> wfInstanceInfos) {
                this.wfInstanceInfos = wfInstanceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
