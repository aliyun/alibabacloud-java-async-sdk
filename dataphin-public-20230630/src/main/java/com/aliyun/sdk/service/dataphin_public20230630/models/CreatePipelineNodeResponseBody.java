// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreatePipelineNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePipelineNodeResponseBody</p>
 */
public class CreatePipelineNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreatePipelineNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreatePipelineNodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreatePipelineNodeResponseBody build() {
            return new CreatePipelineNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePipelineNodeResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePipelineNodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCodeList")
        private java.util.List<String> errorCodeList;

        @com.aliyun.core.annotation.NameInMap("ErrorMessageList")
        private java.util.List<String> errorMessageList;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        private Data(Builder builder) {
            this.errorCodeList = builder.errorCodeList;
            this.errorMessageList = builder.errorMessageList;
            this.pipelineId = builder.pipelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCodeList
         */
        public java.util.List<String> getErrorCodeList() {
            return this.errorCodeList;
        }

        /**
         * @return errorMessageList
         */
        public java.util.List<String> getErrorMessageList() {
            return this.errorMessageList;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public static final class Builder {
            private java.util.List<String> errorCodeList; 
            private java.util.List<String> errorMessageList; 
            private Long pipelineId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCodeList = model.errorCodeList;
                this.errorMessageList = model.errorMessageList;
                this.pipelineId = model.pipelineId;
            } 

            /**
             * ErrorCodeList.
             */
            public Builder errorCodeList(java.util.List<String> errorCodeList) {
                this.errorCodeList = errorCodeList;
                return this;
            }

            /**
             * ErrorMessageList.
             */
            public Builder errorMessageList(java.util.List<String> errorMessageList) {
                this.errorMessageList = errorMessageList;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
