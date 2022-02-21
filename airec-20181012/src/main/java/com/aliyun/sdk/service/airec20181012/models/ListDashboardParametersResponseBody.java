// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardParametersResponseBody</p>
 */
public class ListDashboardParametersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListDashboardParametersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardParametersResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListDashboardParametersResponseBody build() {
            return new ListDashboardParametersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("SceneId")
        private java.util.List < String > sceneId;

        @NameInMap("TraceId")
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
             * SceneId.
             */
            public Builder sceneId(java.util.List < String > sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * TraceId.
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
