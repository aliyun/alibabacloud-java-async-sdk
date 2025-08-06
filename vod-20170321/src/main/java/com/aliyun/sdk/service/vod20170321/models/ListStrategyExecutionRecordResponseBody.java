// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListStrategyExecutionRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListStrategyExecutionRecordResponseBody</p>
 */
public class ListStrategyExecutionRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionRecordList")
    private java.util.List<ExecutionRecordList> executionRecordList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListStrategyExecutionRecordResponseBody(Builder builder) {
        this.executionRecordList = builder.executionRecordList;
        this.maxResults = builder.maxResults;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStrategyExecutionRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionRecordList
     */
    public java.util.List<ExecutionRecordList> getExecutionRecordList() {
        return this.executionRecordList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ExecutionRecordList> executionRecordList; 
        private Integer maxResults; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListStrategyExecutionRecordResponseBody model) {
            this.executionRecordList = model.executionRecordList;
            this.maxResults = model.maxResults;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * ExecutionRecordList.
         */
        public Builder executionRecordList(java.util.List<ExecutionRecordList> executionRecordList) {
            this.executionRecordList = executionRecordList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListStrategyExecutionRecordResponseBody build() {
            return new ListStrategyExecutionRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStrategyExecutionRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListStrategyExecutionRecordResponseBody</p>
     */
    public static class ExecutionRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("JobParams")
        private String jobParams;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaName")
        private String mediaName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        private ExecutionRecordList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.jobParams = builder.jobParams;
            this.mediaId = builder.mediaId;
            this.mediaName = builder.mediaName;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.strategyType = builder.strategyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionRecordList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return jobParams
         */
        public String getJobParams() {
            return this.jobParams;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaName
         */
        public String getMediaName() {
            return this.mediaName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String executeTime; 
            private String jobParams; 
            private String mediaId; 
            private String mediaName; 
            private String status; 
            private String strategyId; 
            private String strategyName; 
            private String strategyType; 

            private Builder() {
            } 

            private Builder(ExecutionRecordList model) {
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.executeTime = model.executeTime;
                this.jobParams = model.jobParams;
                this.mediaId = model.mediaId;
                this.mediaName = model.mediaName;
                this.status = model.status;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
                this.strategyType = model.strategyType;
            } 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * JobParams.
             */
            public Builder jobParams(String jobParams) {
                this.jobParams = jobParams;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaName.
             */
            public Builder mediaName(String mediaName) {
                this.mediaName = mediaName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            public ExecutionRecordList build() {
                return new ExecutionRecordList(this);
            } 

        } 

    }
}
