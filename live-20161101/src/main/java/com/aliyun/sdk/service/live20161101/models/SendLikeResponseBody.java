// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendLikeResponseBody} extends {@link TeaModel}
 *
 * <p>SendLikeResponseBody</p>
 */
public class SendLikeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private SendLikeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLikeResponseBody create() {
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
         * Id of the request
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

        public SendLikeResponseBody build() {
            return new SendLikeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("LikeCount")
        private Integer likeCount;

        private Result(Builder builder) {
            this.likeCount = builder.likeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return likeCount
         */
        public Integer getLikeCount() {
            return this.likeCount;
        }

        public static final class Builder {
            private Integer likeCount; 

            /**
             * LikeCount.
             */
            public Builder likeCount(Integer likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
