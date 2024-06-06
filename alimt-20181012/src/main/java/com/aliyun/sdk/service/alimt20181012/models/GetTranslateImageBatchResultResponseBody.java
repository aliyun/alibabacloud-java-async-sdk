// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranslateImageBatchResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranslateImageBatchResultResponseBody</p>
 */
public class GetTranslateImageBatchResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTranslateImageBatchResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranslateImageBatchResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public GetTranslateImageBatchResultResponseBody build() {
            return new GetTranslateImageBatchResultResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("FinalImageUrl")
        private String finalImageUrl;

        @com.aliyun.core.annotation.NameInMap("InPaintingUrl")
        private String inPaintingUrl;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SourceImageUrl")
        private String sourceImageUrl;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TemplateJson")
        private String templateJson;

        private Result(Builder builder) {
            this.code = builder.code;
            this.finalImageUrl = builder.finalImageUrl;
            this.inPaintingUrl = builder.inPaintingUrl;
            this.message = builder.message;
            this.sourceImageUrl = builder.sourceImageUrl;
            this.success = builder.success;
            this.templateJson = builder.templateJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return finalImageUrl
         */
        public String getFinalImageUrl() {
            return this.finalImageUrl;
        }

        /**
         * @return inPaintingUrl
         */
        public String getInPaintingUrl() {
            return this.inPaintingUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return sourceImageUrl
         */
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return templateJson
         */
        public String getTemplateJson() {
            return this.templateJson;
        }

        public static final class Builder {
            private Integer code; 
            private String finalImageUrl; 
            private String inPaintingUrl; 
            private String message; 
            private String sourceImageUrl; 
            private Boolean success; 
            private String templateJson; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * FinalImageUrl.
             */
            public Builder finalImageUrl(String finalImageUrl) {
                this.finalImageUrl = finalImageUrl;
                return this;
            }

            /**
             * InPaintingUrl.
             */
            public Builder inPaintingUrl(String inPaintingUrl) {
                this.inPaintingUrl = inPaintingUrl;
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
             * SourceImageUrl.
             */
            public Builder sourceImageUrl(String sourceImageUrl) {
                this.sourceImageUrl = sourceImageUrl;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TemplateJson.
             */
            public Builder templateJson(String templateJson) {
                this.templateJson = templateJson;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.result = builder.result;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Result> result; 
            private String status; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
