// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ListAgentMJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentMJobInfoResponseBody</p>
 */
public class ListAgentMJobInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAgentMJobInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentMJobInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAgentMJobInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message, if an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D10B9203-1A6A-49DA-AE56-4D160DD37DBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false/null: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAgentMJobInfoResponseBody build() {
            return new ListAgentMJobInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentMJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentMJobInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEndTime")
        private String dataEndTime;

        @com.aliyun.core.annotation.NameInMap("DataStartTime")
        private String dataStartTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private String taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private String taskStartTime;

        private Data(Builder builder) {
            this.dataEndTime = builder.dataEndTime;
            this.dataStartTime = builder.dataStartTime;
            this.id = builder.id;
            this.message = builder.message;
            this.status = builder.status;
            this.taskEndTime = builder.taskEndTime;
            this.taskId = builder.taskId;
            this.taskStartTime = builder.taskStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEndTime
         */
        public String getDataEndTime() {
            return this.dataEndTime;
        }

        /**
         * @return dataStartTime
         */
        public String getDataStartTime() {
            return this.dataStartTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskEndTime
         */
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStartTime
         */
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        public static final class Builder {
            private String dataEndTime; 
            private String dataStartTime; 
            private Long id; 
            private String message; 
            private String status; 
            private String taskEndTime; 
            private String taskId; 
            private String taskStartTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataEndTime = model.dataEndTime;
                this.dataStartTime = model.dataStartTime;
                this.id = model.id;
                this.message = model.message;
                this.status = model.status;
                this.taskEndTime = model.taskEndTime;
                this.taskId = model.taskId;
                this.taskStartTime = model.taskStartTime;
            } 

            /**
             * <p>The end time of the scan range.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 20:00:00</p>
             */
            public Builder dataEndTime(String dataEndTime) {
                this.dataEndTime = dataEndTime;
                return this;
            }

            /**
             * <p>The start time of the scan range.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 19:00:00</p>
             */
            public Builder dataStartTime(String dataStartTime) {
                this.dataStartTime = dataStartTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The error message, if an error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>queing: The task is queued.</li>
             * <li>readyAnalysis: The task is pending analysis.</li>
             * <li>running: The task is running.</li>
             * <li>error: The task failed.</li>
             * <li>finish: The task is complete.</li>
             * <li>fileUploadUser: The user-specified file is uploaded.</li>
             * <li>fileUploadSystem: The system-generated file is uploaded.</li>
             * <li>expired: The task has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The actual end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 20:00:00</p>
             */
            public Builder taskEndTime(String taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * <p>The scheduled task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20250728-8B43DF47-24DB-1CED-8D74-2AB204187D45</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The actual start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 19:00:00</p>
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
