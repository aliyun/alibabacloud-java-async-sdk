// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLogstashDescriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLogstashDescriptionResponseBody</p>
 */
public class UpdateLogstashDescriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateLogstashDescriptionResponseBody build() {
            return new UpdateLogstashDescriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLogstashDescriptionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLogstashDescriptionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
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
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>logstash_name</p>
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
