// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link SmartqAuthorizeResponseBody} extends {@link TeaModel}
 *
 * <p>SmartqAuthorizeResponseBody</p>
 */
public class SmartqAuthorizeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SmartqAuthorizeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartqAuthorizeResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SmartqAuthorizeResponseBody build() {
            return new SmartqAuthorizeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SmartqAuthorizeResponseBody} extends {@link TeaModel}
     *
     * <p>SmartqAuthorizeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailMessage")
        private String detailMessage;

        @com.aliyun.core.annotation.NameInMap("LlmCube")
        private String llmCube;

        @com.aliyun.core.annotation.NameInMap("LlmCubeTheme")
        private String llmCubeTheme;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Result(Builder builder) {
            this.detailMessage = builder.detailMessage;
            this.llmCube = builder.llmCube;
            this.llmCubeTheme = builder.llmCubeTheme;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detailMessage
         */
        public String getDetailMessage() {
            return this.detailMessage;
        }

        /**
         * @return llmCube
         */
        public String getLlmCube() {
            return this.llmCube;
        }

        /**
         * @return llmCubeTheme
         */
        public String getLlmCubeTheme() {
            return this.llmCubeTheme;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String detailMessage; 
            private String llmCube; 
            private String llmCubeTheme; 
            private String userId; 

            /**
             * DetailMessage.
             */
            public Builder detailMessage(String detailMessage) {
                this.detailMessage = detailMessage;
                return this;
            }

            /**
             * LlmCube.
             */
            public Builder llmCube(String llmCube) {
                this.llmCube = llmCube;
                return this;
            }

            /**
             * LlmCubeTheme.
             */
            public Builder llmCubeTheme(String llmCubeTheme) {
                this.llmCubeTheme = llmCubeTheme;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
