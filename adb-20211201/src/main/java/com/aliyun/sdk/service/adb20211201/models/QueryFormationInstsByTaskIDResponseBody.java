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
 * {@link QueryFormationInstsByTaskIDResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFormationInstsByTaskIDResponseBody</p>
 */
public class QueryFormationInstsByTaskIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<java.util.Map<String, ?>> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private QueryFormationInstsByTaskIDResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFormationInstsByTaskIDResponseBody create() {
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
     * @return items
     */
    public java.util.List<java.util.Map<String, ?>> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private java.util.List<java.util.Map<String, ?>> items; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(QueryFormationInstsByTaskIDResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
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

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryFormationInstsByTaskIDResponseBody build() {
            return new QueryFormationInstsByTaskIDResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFormationInstsByTaskIDResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFormationInstsByTaskIDResponseBody</p>
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastTaskInstCostTime.
             */
            public Builder lastTaskInstCostTime(String lastTaskInstCostTime) {
                this.lastTaskInstCostTime = lastTaskInstCostTime;
                return this;
            }

            /**
             * LastTaskInstID.
             */
            public Builder lastTaskInstID(String lastTaskInstID) {
                this.lastTaskInstID = lastTaskInstID;
                return this;
            }

            /**
             * LastTaskInstMessage.
             */
            public Builder lastTaskInstMessage(String lastTaskInstMessage) {
                this.lastTaskInstMessage = lastTaskInstMessage;
                return this;
            }

            /**
             * LastTaskInstState.
             */
            public Builder lastTaskInstState(String lastTaskInstState) {
                this.lastTaskInstState = lastTaskInstState;
                return this;
            }

            /**
             * ScheduleState.
             */
            public Builder scheduleState(String scheduleState) {
                this.scheduleState = scheduleState;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SyncTime.
             */
            public Builder syncTime(String syncTime) {
                this.syncTime = syncTime;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskType.
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
