// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRankingModelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRankingModelResponseBody</p>
 */
public class DeleteRankingModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DeleteRankingModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRankingModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteRankingModelResponseBody build() {
            return new DeleteRankingModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRankingModelResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteRankingModelResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map < String, ? > meta;

        @com.aliyun.core.annotation.NameInMap("rankingModelId")
        private String rankingModelId;

        private Result(Builder builder) {
            this.meta = builder.meta;
            this.rankingModelId = builder.rankingModelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public java.util.Map < String, ? > getMeta() {
            return this.meta;
        }

        /**
         * @return rankingModelId
         */
        public String getRankingModelId() {
            return this.rankingModelId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > meta; 
            private String rankingModelId; 

            /**
             * <p>meta</p>
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * rankingModelId.
             */
            public Builder rankingModelId(String rankingModelId) {
                this.rankingModelId = rankingModelId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
