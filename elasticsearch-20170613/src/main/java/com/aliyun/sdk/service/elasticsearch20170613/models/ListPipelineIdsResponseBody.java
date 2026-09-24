// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListPipelineIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineIdsResponseBody</p>
 */
public class ListPipelineIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListPipelineIdsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListPipelineIdsResponseBody build() {
            return new ListPipelineIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineIdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineIdsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("pipelineId")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.available = model.available;
                this.code = model.code;
                this.message = model.message;
                this.pipelineId = model.pipelineId;
            } 

            /**
             * <p>Indicates whether the pipeline is available. Valid values:</p>
             * <ul>
             * <li><p>true: Available.</p>
             * </li>
             * <li><p>false: Not available.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The error code when the pipeline is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message when the pipeline is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The pipeline ID created on Kibana.</p>
             * 
             * <strong>example:</strong>
             * <p>testKibanaManagement</p>
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
