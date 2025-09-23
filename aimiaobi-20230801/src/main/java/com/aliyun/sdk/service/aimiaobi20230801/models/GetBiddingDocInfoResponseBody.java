// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetBiddingDocInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBiddingDocInfoResponseBody</p>
 */
public class GetBiddingDocInfoResponseBody extends TeaModel {
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

    private GetBiddingDocInfoResponseBody(Builder builder) {
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

    public static GetBiddingDocInfoResponseBody create() {
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

        private Builder(GetBiddingDocInfoResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
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

        public GetBiddingDocInfoResponseBody build() {
            return new GetBiddingDocInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBiddingDocInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBiddingDocInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentFormat")
        private String contentFormat;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TenderDocUrl")
        private String tenderDocUrl;

        @com.aliyun.core.annotation.NameInMap("TenderFileType")
        private String tenderFileType;

        private Data(Builder builder) {
            this.content = builder.content;
            this.contentFormat = builder.contentFormat;
            this.contentType = builder.contentType;
            this.status = builder.status;
            this.step = builder.step;
            this.taskId = builder.taskId;
            this.tenderDocUrl = builder.tenderDocUrl;
            this.tenderFileType = builder.tenderFileType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentFormat
         */
        public String getContentFormat() {
            return this.contentFormat;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tenderDocUrl
         */
        public String getTenderDocUrl() {
            return this.tenderDocUrl;
        }

        /**
         * @return tenderFileType
         */
        public String getTenderFileType() {
            return this.tenderFileType;
        }

        public static final class Builder {
            private String content; 
            private String contentFormat; 
            private String contentType; 
            private Integer status; 
            private String step; 
            private String taskId; 
            private String tenderDocUrl; 
            private String tenderFileType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.contentFormat = model.contentFormat;
                this.contentType = model.contentType;
                this.status = model.status;
                this.step = model.step;
                this.taskId = model.taskId;
                this.tenderDocUrl = model.tenderDocUrl;
                this.tenderFileType = model.tenderFileType;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentFormat.
             */
            public Builder contentFormat(String contentFormat) {
                this.contentFormat = contentFormat;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TenderDocUrl.
             */
            public Builder tenderDocUrl(String tenderDocUrl) {
                this.tenderDocUrl = tenderDocUrl;
                return this;
            }

            /**
             * TenderFileType.
             */
            public Builder tenderFileType(String tenderFileType) {
                this.tenderFileType = tenderFileType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
