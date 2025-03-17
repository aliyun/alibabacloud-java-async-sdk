// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link BatchAddFeishuUsersResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAddFeishuUsersResponseBody</p>
 */
public class BatchAddFeishuUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchAddFeishuUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddFeishuUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchAddFeishuUsersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchAddFeishuUsersResponseBody build() {
            return new BatchAddFeishuUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchAddFeishuUsersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchAddFeishuUsersResponseBody</p>
     */
    public static class FailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeDesc")
        private String codeDesc;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        private FailInfos(Builder builder) {
            this.code = builder.code;
            this.codeDesc = builder.codeDesc;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailInfos create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return codeDesc
         */
        public String getCodeDesc() {
            return this.codeDesc;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        public static final class Builder {
            private String code; 
            private String codeDesc; 
            private String input; 

            private Builder() {
            } 

            private Builder(FailInfos model) {
                this.code = model.code;
                this.codeDesc = model.codeDesc;
                this.input = model.input;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CodeDesc.
             */
            public Builder codeDesc(String codeDesc) {
                this.codeDesc = codeDesc;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            public FailInfos build() {
                return new FailInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchAddFeishuUsersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchAddFeishuUsersResponseBody</p>
     */
    public static class FailResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailInfos")
        private java.util.List<FailInfos> failInfos;

        private FailResults(Builder builder) {
            this.failInfos = builder.failInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailResults create() {
            return builder().build();
        }

        /**
         * @return failInfos
         */
        public java.util.List<FailInfos> getFailInfos() {
            return this.failInfos;
        }

        public static final class Builder {
            private java.util.List<FailInfos> failInfos; 

            private Builder() {
            } 

            private Builder(FailResults model) {
                this.failInfos = model.failInfos;
            } 

            /**
             * FailInfos.
             */
            public Builder failInfos(java.util.List<FailInfos> failInfos) {
                this.failInfos = failInfos;
                return this;
            }

            public FailResults build() {
                return new FailResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchAddFeishuUsersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchAddFeishuUsersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("FailResults")
        private java.util.List<FailResults> failResults;

        @com.aliyun.core.annotation.NameInMap("OkCount")
        private Integer okCount;

        private Result(Builder builder) {
            this.failCount = builder.failCount;
            this.failResults = builder.failResults;
            this.okCount = builder.okCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return failResults
         */
        public java.util.List<FailResults> getFailResults() {
            return this.failResults;
        }

        /**
         * @return okCount
         */
        public Integer getOkCount() {
            return this.okCount;
        }

        public static final class Builder {
            private Integer failCount; 
            private java.util.List<FailResults> failResults; 
            private Integer okCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failCount = model.failCount;
                this.failResults = model.failResults;
                this.okCount = model.okCount;
            } 

            /**
             * FailCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * FailResults.
             */
            public Builder failResults(java.util.List<FailResults> failResults) {
                this.failResults = failResults;
                return this;
            }

            /**
             * OkCount.
             */
            public Builder okCount(Integer okCount) {
                this.okCount = okCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
