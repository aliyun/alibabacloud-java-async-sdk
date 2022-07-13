// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommentByCreatorIdResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCommentByCreatorIdResponseBody</p>
 */
public class DeleteCommentByCreatorIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DeleteCommentByCreatorIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommentByCreatorIdResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 调用删除直播间弹幕的返回结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteCommentByCreatorIdResponseBody build() {
            return new DeleteCommentByCreatorIdResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("DeleteResult")
        private Boolean deleteResult;

        private Result(Builder builder) {
            this.deleteResult = builder.deleteResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deleteResult
         */
        public Boolean getDeleteResult() {
            return this.deleteResult;
        }

        public static final class Builder {
            private Boolean deleteResult; 

            /**
             * 删除的结果
             */
            public Builder deleteResult(Boolean deleteResult) {
                this.deleteResult = deleteResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
