// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ListWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstanceResponseBody</p>
 */
public class ListWorkflowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListWorkflowInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about workflow instances.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>workflowId=xxx is not existed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkflowInstanceResponseBody build() {
            return new ListWorkflowInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstanceResponseBody</p>
     */
    public static class WfInstanceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WfInstanceId")
        private Long wfInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
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

            private Builder() {
            } 

            private Builder(WfInstanceInfos model) {
                this.dataTime = model.dataTime;
                this.endTime = model.endTime;
                this.scheduleTime = model.scheduleTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.wfInstanceId = model.wfInstanceId;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The data timestamp of the workflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:00</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:21</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance was scheduled to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:00</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:01</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the workflow instance. Valid values:</p>
             * <ul>
             * <li>1: pending</li>
             * <li>2: preparing</li>
             * <li>3: running</li>
             * <li>4: successful</li>
             * <li>5: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The workflow instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder wfInstanceId(Long wfInstanceId) {
                this.wfInstanceId = wfInstanceId;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link ListWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WfInstanceInfos")
        private java.util.List<WfInstanceInfos> wfInstanceInfos;

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
        public java.util.List<WfInstanceInfos> getWfInstanceInfos() {
            return this.wfInstanceInfos;
        }

        public static final class Builder {
            private java.util.List<WfInstanceInfos> wfInstanceInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.wfInstanceInfos = model.wfInstanceInfos;
            } 

            /**
             * <p>The workflow instances.</p>
             */
            public Builder wfInstanceInfos(java.util.List<WfInstanceInfos> wfInstanceInfos) {
                this.wfInstanceInfos = wfInstanceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
