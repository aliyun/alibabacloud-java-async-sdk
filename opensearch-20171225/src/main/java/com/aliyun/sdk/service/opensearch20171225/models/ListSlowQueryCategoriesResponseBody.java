// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlowQueryCategoriesResponseBody</p>
 */
public class ListSlowQueryCategoriesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private ListSlowQueryCategoriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowQueryCategoriesResponseBody create() {
        return builder().build();
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSlowQueryCategoriesResponseBody build() {
            return new ListSlowQueryCategoriesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("analyzeStatus")
        private String analyzeStatus;

        @NameInMap("end")
        private Integer end;

        @NameInMap("start")
        private Integer start;

        private Result(Builder builder) {
            this.analyzeStatus = builder.analyzeStatus;
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return analyzeStatus
         */
        public String getAnalyzeStatus() {
            return this.analyzeStatus;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        public static final class Builder {
            private String analyzeStatus; 
            private Integer end; 
            private Integer start; 

            /**
             * The status of the analysis. Valid values:
             * <p>
             * 
             * *   PENDING: preparing
             * *   SUCCESS: succeeded
             * *   RUNNING: running
             * *   FAILED: failed
             * *   N/A: unknown
             */
            public Builder analyzeStatus(String analyzeStatus) {
                this.analyzeStatus = analyzeStatus;
                return this;
            }

            /**
             * The timestamp that indicates the end of the time range to query.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * The timestamp that indicates the beginning of the time range to query.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
