// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiCallDetailPageResponseBody</p>
 */
public class QueryAiCallDetailPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiCallDetailPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiCallDetailPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiCallDetailPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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

        public QueryAiCallDetailPageResponseBody build() {
            return new QueryAiCallDetailPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallDetailPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("CallResult")
        private String callResult;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingTime")
        private Long callingTime;

        @com.aliyun.core.annotation.NameInMap("ConversationDuration")
        private Long conversationDuration;

        @com.aliyun.core.annotation.NameInMap("ConversationRecord")
        private String conversationRecord;

        @com.aliyun.core.annotation.NameInMap("ConversationTurnCount")
        private Long conversationTurnCount;

        @com.aliyun.core.annotation.NameInMap("DetailId")
        private String detailId;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("ImportedTime")
        private Long importedTime;

        @com.aliyun.core.annotation.NameInMap("MajorIntent")
        private String majorIntent;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("RecordingFilePath")
        private String recordingFilePath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private List(Builder builder) {
            this.batchId = builder.batchId;
            this.callResult = builder.callResult;
            this.calledNumber = builder.calledNumber;
            this.callingTime = builder.callingTime;
            this.conversationDuration = builder.conversationDuration;
            this.conversationRecord = builder.conversationRecord;
            this.conversationTurnCount = builder.conversationTurnCount;
            this.detailId = builder.detailId;
            this.failedReason = builder.failedReason;
            this.importedTime = builder.importedTime;
            this.majorIntent = builder.majorIntent;
            this.options = builder.options;
            this.outId = builder.outId;
            this.recordingFilePath = builder.recordingFilePath;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return callResult
         */
        public String getCallResult() {
            return this.callResult;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingTime
         */
        public Long getCallingTime() {
            return this.callingTime;
        }

        /**
         * @return conversationDuration
         */
        public Long getConversationDuration() {
            return this.conversationDuration;
        }

        /**
         * @return conversationRecord
         */
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        /**
         * @return conversationTurnCount
         */
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        /**
         * @return detailId
         */
        public String getDetailId() {
            return this.detailId;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return importedTime
         */
        public Long getImportedTime() {
            return this.importedTime;
        }

        /**
         * @return majorIntent
         */
        public String getMajorIntent() {
            return this.majorIntent;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return recordingFilePath
         */
        public String getRecordingFilePath() {
            return this.recordingFilePath;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String batchId; 
            private String callResult; 
            private String calledNumber; 
            private Long callingTime; 
            private Long conversationDuration; 
            private String conversationRecord; 
            private Long conversationTurnCount; 
            private String detailId; 
            private String failedReason; 
            private Long importedTime; 
            private String majorIntent; 
            private String options; 
            private String outId; 
            private String recordingFilePath; 
            private Long status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.batchId = model.batchId;
                this.callResult = model.callResult;
                this.calledNumber = model.calledNumber;
                this.callingTime = model.callingTime;
                this.conversationDuration = model.conversationDuration;
                this.conversationRecord = model.conversationRecord;
                this.conversationTurnCount = model.conversationTurnCount;
                this.detailId = model.detailId;
                this.failedReason = model.failedReason;
                this.importedTime = model.importedTime;
                this.majorIntent = model.majorIntent;
                this.options = model.options;
                this.outId = model.outId;
                this.recordingFilePath = model.recordingFilePath;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * BatchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * CallResult.
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingTime.
             */
            public Builder callingTime(Long callingTime) {
                this.callingTime = callingTime;
                return this;
            }

            /**
             * ConversationDuration.
             */
            public Builder conversationDuration(Long conversationDuration) {
                this.conversationDuration = conversationDuration;
                return this;
            }

            /**
             * ConversationRecord.
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
                return this;
            }

            /**
             * ConversationTurnCount.
             */
            public Builder conversationTurnCount(Long conversationTurnCount) {
                this.conversationTurnCount = conversationTurnCount;
                return this;
            }

            /**
             * DetailId.
             */
            public Builder detailId(String detailId) {
                this.detailId = detailId;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * ImportedTime.
             */
            public Builder importedTime(Long importedTime) {
                this.importedTime = importedTime;
                return this;
            }

            /**
             * MajorIntent.
             */
            public Builder majorIntent(String majorIntent) {
                this.majorIntent = majorIntent;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * RecordingFilePath.
             */
            public Builder recordingFilePath(String recordingFilePath) {
                this.recordingFilePath = recordingFilePath;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallDetailPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
