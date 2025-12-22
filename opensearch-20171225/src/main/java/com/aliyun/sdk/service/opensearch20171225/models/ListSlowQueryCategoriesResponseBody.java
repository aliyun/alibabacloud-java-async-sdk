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
 * {@link ListSlowQueryCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlowQueryCategoriesResponseBody</p>
 */
public class ListSlowQueryCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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

        private Builder(ListSlowQueryCategoriesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4406F40B-A0A2-9D5D-531F-3B6936567584</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSlowQueryCategoriesResponseBody build() {
            return new ListSlowQueryCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSlowQueryCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSlowQueryCategoriesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analyzeStatus")
        private String analyzeStatus;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("start")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.analyzeStatus = model.analyzeStatus;
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * <p>The status of the analysis. Valid values:</p>
             * <ul>
             * <li>PENDING: preparing</li>
             * <li>SUCCESS: succeeded</li>
             * <li>RUNNING: running</li>
             * <li>FAILED: failed</li>
             * <li>N/A: unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;PENDING&quot;</p>
             */
            public Builder analyzeStatus(String analyzeStatus) {
                this.analyzeStatus = analyzeStatus;
                return this;
            }

            /**
             * <p>The timestamp that indicates the end of the time range to query.</p>
             * 
             * <strong>example:</strong>
             * <p>1589990340</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The timestamp that indicates the beginning of the time range to query.</p>
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
