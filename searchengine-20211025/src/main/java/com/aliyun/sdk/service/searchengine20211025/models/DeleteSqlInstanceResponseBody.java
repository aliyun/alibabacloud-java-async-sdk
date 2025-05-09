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
 * {@link DeleteSqlInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSqlInstanceResponseBody</p>
 */
public class DeleteSqlInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DeleteSqlInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSqlInstanceResponseBody create() {
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

        private Builder(DeleteSqlInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response&lt;Map&lt;String, String&gt;&gt;</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteSqlInstanceResponseBody build() {
            return new DeleteSqlInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSqlInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSqlInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.Map<String, String> result;

        private Result(Builder builder) {
            this.requestId = builder.requestId;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
        public java.util.Map<String, String> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String requestId; 
            private java.util.Map<String, String> result; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.requestId = model.requestId;
                this.result = model.result;
            } 

            /**
             * <p>id of request</p>
             * 
             * <strong>example:</strong>
             * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The result.</p>
             */
            public Builder result(java.util.Map<String, String> result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
