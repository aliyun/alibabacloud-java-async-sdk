// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListSlowQueryQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlowQueryQueriesResponseBody</p>
 */
public class ListSlowQueryQueriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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

        private Builder(ListSlowQueryQueriesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EB250CA0-ACFD-C5DE-17CD-01445BFE8AE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSlowQueryQueriesResponseBody build() {
            return new ListSlowQueryQueriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSlowQueryQueriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSlowQueryQueriesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appQuery")
        private String appQuery;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("start")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.appQuery = model.appQuery;
                this.end = model.end;
                this.index = model.index;
                this.start = model.start;
            } 

            /**
             * <p>The content of the optimization suggestion for the query.</p>
             * 
             * <strong>example:</strong>
             * <p>no data</p>
             */
            public Builder appQuery(String appQuery) {
                this.appQuery = appQuery;
                return this;
            }

            /**
             * <p>The end of the time range that was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1589990340</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The ID of the optimization suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The beginning of the time range that was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1589986800</p>
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
