// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetImageAnalyzeTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageAnalyzeTaskStatusResponseBody</p>
 */
public class GetImageAnalyzeTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetImageAnalyzeTaskStatusResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageAnalyzeTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetImageAnalyzeTaskStatusResponseBody build() {
            return new GetImageAnalyzeTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageAnalyzeTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageAnalyzeTaskStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("content_type")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("page_num")
        private Integer pageNum;

        private Data(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.pageNum = builder.pageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private Integer pageNum; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * content_type.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * page_num.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageAnalyzeTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageAnalyzeTaskStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Result(Builder builder) {
            this.data = builder.data;
            this.error = builder.error;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Data data; 
            private String error; 
            private String status; 
            private String taskId; 

            /**
             * data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageAnalyzeTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageAnalyzeTaskStatusResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pv_count")
        private Long pvCount;

        @com.aliyun.core.annotation.NameInMap("token_count")
        private Long tokenCount;

        private Usage(Builder builder) {
            this.pvCount = builder.pvCount;
            this.tokenCount = builder.tokenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return pvCount
         */
        public Long getPvCount() {
            return this.pvCount;
        }

        /**
         * @return tokenCount
         */
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public static final class Builder {
            private Long pvCount; 
            private Long tokenCount; 

            /**
             * pv_count.
             */
            public Builder pvCount(Long pvCount) {
                this.pvCount = pvCount;
                return this;
            }

            /**
             * token_count.
             */
            public Builder tokenCount(Long tokenCount) {
                this.tokenCount = tokenCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
