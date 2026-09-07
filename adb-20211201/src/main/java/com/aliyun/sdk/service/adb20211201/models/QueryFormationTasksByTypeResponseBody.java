// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link QueryFormationTasksByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFormationTasksByTypeResponseBody</p>
 */
public class QueryFormationTasksByTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFormationTasksByTypeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFormationTasksByTypeResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryFormationTasksByTypeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. OK is returned if the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFormationTasksByTypeResponseBody build() {
            return new QueryFormationTasksByTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFormationTasksByTypeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFormationTasksByTypeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastTaskInstCostTime")
        private String lastTaskInstCostTime;

        @com.aliyun.core.annotation.NameInMap("LastTaskInstID")
        private String lastTaskInstID;

        @com.aliyun.core.annotation.NameInMap("LastTaskInstMessage")
        private String lastTaskInstMessage;

        @com.aliyun.core.annotation.NameInMap("LastTaskInstState")
        private String lastTaskInstState;

        @com.aliyun.core.annotation.NameInMap("ScheduleState")
        private String scheduleState;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SyncTime")
        private String syncTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.lastTaskInstCostTime = builder.lastTaskInstCostTime;
            this.lastTaskInstID = builder.lastTaskInstID;
            this.lastTaskInstMessage = builder.lastTaskInstMessage;
            this.lastTaskInstState = builder.lastTaskInstState;
            this.scheduleState = builder.scheduleState;
            this.schema = builder.schema;
            this.sourceType = builder.sourceType;
            this.syncTime = builder.syncTime;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastTaskInstCostTime
         */
        public String getLastTaskInstCostTime() {
            return this.lastTaskInstCostTime;
        }

        /**
         * @return lastTaskInstID
         */
        public String getLastTaskInstID() {
            return this.lastTaskInstID;
        }

        /**
         * @return lastTaskInstMessage
         */
        public String getLastTaskInstMessage() {
            return this.lastTaskInstMessage;
        }

        /**
         * @return lastTaskInstState
         */
        public String getLastTaskInstState() {
            return this.lastTaskInstState;
        }

        /**
         * @return scheduleState
         */
        public String getScheduleState() {
            return this.scheduleState;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return syncTime
         */
        public String getSyncTime() {
            return this.syncTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String createTime; 
            private String lastTaskInstCostTime; 
            private String lastTaskInstID; 
            private String lastTaskInstMessage; 
            private String lastTaskInstState; 
            private String scheduleState; 
            private String schema; 
            private String sourceType; 
            private String syncTime; 
            private String taskId; 
            private String taskName; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.lastTaskInstCostTime = model.lastTaskInstCostTime;
                this.lastTaskInstID = model.lastTaskInstID;
                this.lastTaskInstMessage = model.lastTaskInstMessage;
                this.lastTaskInstState = model.lastTaskInstState;
                this.scheduleState = model.scheduleState;
                this.schema = model.schema;
                this.sourceType = model.sourceType;
                this.syncTime = model.syncTime;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-08 17:05:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The execution duration of the most recent task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder lastTaskInstCostTime(String lastTaskInstCostTime) {
                this.lastTaskInstCostTime = lastTaskInstCostTime;
                return this;
            }

            /**
             * <p>The instance ID of the most recent task.</p>
             * 
             * <strong>example:</strong>
             * <p>46872</p>
             */
            public Builder lastTaskInstID(String lastTaskInstID) {
                this.lastTaskInstID = lastTaskInstID;
                return this;
            }

            /**
             * <p>The error message of the most recent task.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder lastTaskInstMessage(String lastTaskInstMessage) {
                this.lastTaskInstMessage = lastTaskInstMessage;
                return this;
            }

            /**
             * <p>The instance status of the most recent node.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastTaskInstState(String lastTaskInstState) {
                this.lastTaskInstState = lastTaskInstState;
                return this;
            }

            /**
             * <p>The scheduling status.</p>
             * 
             * <strong>example:</strong>
             * <p>STOP</p>
             */
            public Builder scheduleState(String scheduleState) {
                this.scheduleState = scheduleState;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>sales_db</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSWAREHOUSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The scheduling frequency.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;cron\&quot;:\&quot;\&quot;,\&quot;type\&quot;:\&quot;run_on_demand\&quot;}</p>
             */
            public Builder syncTime(String syncTime) {
                this.syncTime = syncTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>CRAWLER</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
