// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceTaskResponseBody</p>
 */
public class ListInstanceTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceTaskResponseBody build() {
            return new ListInstanceTaskResponseBody(this);
        } 

    } 

    public static class SubProgressInfos extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("FinishedNum")
        private Integer finishedNum;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("TotalNum")
        private Integer totalNum;

        @NameInMap("Type")
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
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * FinishedNum.
             */
            public Builder finishedNum(Integer finishedNum) {
                this.finishedNum = finishedNum;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * Type.
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
    public static class Result extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SubProgressInfos")
        private java.util.List < SubProgressInfos> subProgressInfos;

        @NameInMap("TotalProgress")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SubProgressInfos.
             */
            public Builder subProgressInfos(java.util.List < SubProgressInfos> subProgressInfos) {
                this.subProgressInfos = subProgressInfos;
                return this;
            }

            /**
             * TotalProgress.
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
