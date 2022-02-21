// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineIdsResponseBody</p>
 */
public class ListPipelineIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListPipelineIdsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineIdsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListPipelineIdsResponseBody build() {
            return new ListPipelineIdsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("available")
        private Boolean available;

        @NameInMap("code")
        private String code;

        @NameInMap("message")
        private String message;

        @NameInMap("pipelineId")
        private String pipelineId;

        private Result(Builder builder) {
            this.available = builder.available;
            this.code = builder.code;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
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
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        public static final class Builder {
            private Boolean available; 
            private String code; 
            private String message; 
            private String pipelineId; 

            /**
             * available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

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
             * pipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
