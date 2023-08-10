// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlowQueryQueriesResponseBody</p>
 */
public class ListSlowQueryQueriesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private ListSlowQueryQueriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowQueryQueriesResponseBody create() {
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
         * The return result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSlowQueryQueriesResponseBody build() {
            return new ListSlowQueryQueriesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("appQuery")
        private String appQuery;

        @NameInMap("end")
        private Integer end;

        @NameInMap("index")
        private Integer index;

        @NameInMap("start")
        private Integer start;

        private Result(Builder builder) {
            this.appQuery = builder.appQuery;
            this.end = builder.end;
            this.index = builder.index;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appQuery
         */
        public String getAppQuery() {
            return this.appQuery;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        public static final class Builder {
            private String appQuery; 
            private Integer end; 
            private Integer index; 
            private Integer start; 

            /**
             * The content of the optimization suggestion for the query.
             */
            public Builder appQuery(String appQuery) {
                this.appQuery = appQuery;
                return this;
            }

            /**
             * The end of the time range that was queried.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * The ID of the optimization suggestion.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The beginning of the time range that was queried.
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
