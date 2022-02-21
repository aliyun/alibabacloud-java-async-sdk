// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLogstashDescriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLogstashDescriptionResponseBody</p>
 */
public class UpdateLogstashDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateLogstashDescriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogstashDescriptionResponseBody create() {
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

        public UpdateLogstashDescriptionResponseBody build() {
            return new UpdateLogstashDescriptionResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("description")
        private String description;

        private Result(Builder builder) {
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String description; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
