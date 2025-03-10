// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRankingModelResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRankingModelResponseBody</p>
 */
public class ModifyRankingModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ModifyRankingModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRankingModelResponseBody create() {
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
         * <p>The data source of the filtering table. Only MaxCompute tables are supported.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyRankingModelResponseBody build() {
            return new ModifyRankingModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyRankingModelResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyRankingModelResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map < String, ? > meta;

        @com.aliyun.core.annotation.NameInMap("rankingModelId")
        private String rankingModelId;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.Map < String, ? > meta; 
            private String rankingModelId; 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-11T09:47:43.000Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-11T09:47:43.000Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p><strong>null</strong></p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>test1234</p>
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
