// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogsResponseBody</p>
 */
public class ListLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogsResponseBody create() {
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

        private Builder(ListLogsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ListResult</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListLogsResponseBody build() {
            return new ListLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<?> result;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.result = builder.result;
            this.totalCount = builder.totalCount;
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
        public java.util.List<?> getResult() {
            return this.result;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<?> result; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.result = model.result;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The result.</p>
             */
            public Builder result(java.util.List<?> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries returned</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
