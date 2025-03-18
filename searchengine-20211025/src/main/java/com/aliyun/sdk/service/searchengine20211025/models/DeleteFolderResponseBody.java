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
 * {@link DeleteFolderResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFolderResponseBody</p>
 */
public class DeleteFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DeleteFolderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFolderResponseBody create() {
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

        private Builder(DeleteFolderResponseBody model) {
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
         * <p>Response&lt;Map&lt;String, String&gt;&gt;</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteFolderResponseBody build() {
            return new DeleteFolderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteFolderResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteFolderResponseBody</p>
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
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The result</p>
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
