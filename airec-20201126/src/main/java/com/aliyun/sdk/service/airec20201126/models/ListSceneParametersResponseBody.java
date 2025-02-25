// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSceneParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ListSceneParametersResponseBody</p>
 */
public class ListSceneParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListSceneParametersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneParametersResponseBody create() {
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

        public ListSceneParametersResponseBody build() {
            return new ListSceneParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSceneParametersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSceneParametersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sceneId")
        private java.util.List < String > sceneId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private java.util.List < String > traceId;

        private Result(Builder builder) {
            this.sceneId = builder.sceneId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return sceneId
         */
        public java.util.List < String > getSceneId() {
            return this.sceneId;
        }

        /**
         * @return traceId
         */
        public java.util.List < String > getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private java.util.List < String > sceneId; 
            private java.util.List < String > traceId; 

            /**
             * sceneId.
             */
            public Builder sceneId(java.util.List < String > sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(java.util.List < String > traceId) {
                this.traceId = traceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
