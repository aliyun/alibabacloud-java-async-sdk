// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link GetTableGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableGenerationResponseBody</p>
 */
public class GetTableGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetTableGenerationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableGenerationResponseBody create() {
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

        private Builder(GetTableGenerationResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
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

        public GetTableGenerationResponseBody build() {
            return new GetTableGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableGenerationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generationId")
        private Long generationId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.generationId = builder.generationId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return generationId
         */
        public Long getGenerationId() {
            return this.generationId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long generationId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.generationId = model.generationId;
                this.status = model.status;
            } 

            /**
             * <p>generationId</p>
             * 
             * <strong>example:</strong>
             * <p>1708674867</p>
             */
            public Builder generationId(Long generationId) {
                this.generationId = generationId;
                return this;
            }

            /**
             * <p>starting, building, ready, stopped, failed</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
