// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SendLikeResponseBody} extends {@link TeaModel}
 *
 * <p>SendLikeResponseBody</p>
 */
public class SendLikeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

        private Builder(SendLikeResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public SendLikeResponseBody build() {
            return new SendLikeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendLikeResponseBody} extends {@link TeaModel}
     *
     * <p>SendLikeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LikeCount")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.likeCount = model.likeCount;
            } 

            /**
             * <p>The number of likes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
