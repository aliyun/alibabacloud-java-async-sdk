// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceTaskResponseBody</p>
 */
public class ListInstanceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListInstanceTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The progress of the task that is running on the instance.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceTaskResponseBody build() {
            return new ListInstanceTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceTaskResponseBody</p>
     */
    public static class SubProgressInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("finishedNum")
        private Integer finishedNum;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("totalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SubProgressInfos(Builder builder) {
            this.detail = builder.detail;
            this.finishedNum = builder.finishedNum;
            this.progress = builder.progress;
            this.totalNum = builder.totalNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProgressInfos create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return finishedNum
         */
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String detail; 
            private Integer finishedNum; 
            private Integer progress; 
            private Integer totalNum; 
            private String type; 

            /**
             * <p>The detailed description of subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>data import progress info</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The number of completed subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder finishedNum(Integer finishedNum) {
                this.finishedNum = finishedNum;
                return this;
            }

            /**
             * <p>The progress of subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The total number of subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>The type of subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubProgressInfos build() {
                return new SubProgressInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("subProgressInfos")
        private java.util.List < SubProgressInfos> subProgressInfos;

        @com.aliyun.core.annotation.NameInMap("totalProgress")
        private Integer totalProgress;

        private Result(Builder builder) {
            this.name = builder.name;
            this.subProgressInfos = builder.subProgressInfos;
            this.totalProgress = builder.totalProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subProgressInfos
         */
        public java.util.List < SubProgressInfos> getSubProgressInfos() {
            return this.subProgressInfos;
        }

        /**
         * @return totalProgress
         */
        public Integer getTotalProgress() {
            return this.totalProgress;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < SubProgressInfos> subProgressInfos; 
            private Integer totalProgress; 

            /**
             * <p>The name of the step. Example: DATA_IMPORT. The value indicates that data is being imported.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_IMPORT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about the progress of subtasks.</p>
             */
            public Builder subProgressInfos(java.util.List < SubProgressInfos> subProgressInfos) {
                this.subProgressInfos = subProgressInfos;
                return this;
            }

            /**
             * <p>The overall progress of the current task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalProgress(Integer totalProgress) {
                this.totalProgress = totalProgress;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
