// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListStatsEventRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStatsEventRecordsResponseBody</p>
 */
public class ListStatsEventRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListStatsEventRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatsEventRecordsResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListStatsEventRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
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

        public ListStatsEventRecordsResponseBody build() {
            return new ListStatsEventRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStatsEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStatsEventRecordsResponseBody</p>
     */
    public static class ResultResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cnt")
        private String cnt;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResultResult(Builder builder) {
            this.cnt = builder.cnt;
            this.level = builder.level;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResult create() {
            return builder().build();
        }

        /**
         * @return cnt
         */
        public String getCnt() {
            return this.cnt;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cnt; 
            private String level; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResultResult model) {
                this.cnt = model.cnt;
                this.level = model.level;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * cnt.
             */
            public Builder cnt(String cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultResult build() {
                return new ResultResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStatsEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStatsEventRecordsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<ResultResult> result;

        @com.aliyun.core.annotation.NameInMap("total")
        private String total;

        private Result(Builder builder) {
            this.result = builder.result;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<ResultResult> getResult() {
            return this.result;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ResultResult> result; 
            private String total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.result = model.result;
                this.total = model.total;
            } 

            /**
             * result.
             */
            public Builder result(java.util.List<ResultResult> result) {
                this.result = result;
                return this;
            }

            /**
             * total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
