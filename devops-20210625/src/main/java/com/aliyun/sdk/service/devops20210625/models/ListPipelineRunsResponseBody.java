// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRunsResponseBody</p>
 */
public class ListPipelineRunsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("pipelineRuns")
    private java.util.List < PipelineRuns> pipelineRuns;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListPipelineRunsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nextToken = builder.nextToken;
        this.pipelineRuns = builder.pipelineRuns;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRunsResponseBody create() {
        return builder().build();
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pipelineRuns
     */
    public java.util.List < PipelineRuns> getPipelineRuns() {
        return this.pipelineRuns;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String nextToken; 
        private java.util.List < PipelineRuns> pipelineRuns; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 下一个分页token，为空时，表示没有下一页
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 流水线运行实例
         */
        public Builder pipelineRuns(java.util.List < PipelineRuns> pipelineRuns) {
            this.pipelineRuns = pipelineRuns;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPipelineRunsResponseBody build() {
            return new ListPipelineRunsResponseBody(this);
        } 

    } 

    public static class PipelineRuns extends TeaModel {
        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("pipelineId")
        private Long pipelineId;

        @NameInMap("pipelineRunId")
        private Long pipelineRunId;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("status")
        private String status;

        @NameInMap("triggerMode")
        private Long triggerMode;

        private PipelineRuns(Builder builder) {
            this.creatorAccountId = builder.creatorAccountId;
            this.endTime = builder.endTime;
            this.pipelineId = builder.pipelineId;
            this.pipelineRunId = builder.pipelineRunId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRuns create() {
            return builder().build();
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineRunId
         */
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerMode
         */
        public Long getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String creatorAccountId; 
            private Long endTime; 
            private Long pipelineId; 
            private Long pipelineRunId; 
            private Long startTime; 
            private String status; 
            private Long triggerMode; 

            /**
             * 运行人阿里云账号id
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 流水线id
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * 流水线实例id
             */
            public Builder pipelineRunId(Long pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 运行状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 触发模式
             */
            public Builder triggerMode(Long triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public PipelineRuns build() {
                return new PipelineRuns(this);
            } 

        } 

    }
}
