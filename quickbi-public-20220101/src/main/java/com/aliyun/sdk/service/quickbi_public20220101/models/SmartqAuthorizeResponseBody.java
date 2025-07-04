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

        private Builder() {
        } 

        private Builder(SmartqAuthorizeResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>617277C****************ABA47E31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Array of failed user information.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The value range is as follows:</p>
         * <ul>
         * <li>true: Request succeeded</li>
         * <li>false: Request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.detailMessage = model.detailMessage;
                this.llmCube = model.llmCube;
                this.llmCubeTheme = model.llmCubeTheme;
                this.userId = model.userId;
            } 

            /**
             * <p>Reason for failure.</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_FILE_FORMAT</p>
             */
            public Builder detailMessage(String detailMessage) {
                this.detailMessage = detailMessage;
                return this;
            }

            /**
             * <p>Q&amp;A resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>617277C****************ABA47E31</p>
             */
            public Builder llmCube(String llmCube) {
                this.llmCube = llmCube;
                return this;
            }

            /**
             * <p>Analysis theme ID.</p>
             * 
             * <strong>example:</strong>
             * <p>617277C****************ABA47E31</p>
             */
            public Builder llmCubeTheme(String llmCubeTheme) {
                this.llmCubeTheme = llmCubeTheme;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>617277C****************ABA47E31</p>
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
