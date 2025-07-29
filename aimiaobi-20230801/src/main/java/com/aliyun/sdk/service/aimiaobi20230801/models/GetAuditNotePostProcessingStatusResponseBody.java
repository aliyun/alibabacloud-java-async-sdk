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
 * {@link GetAuditNotePostProcessingStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditNotePostProcessingStatusResponseBody</p>
 */
public class GetAuditNotePostProcessingStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private GetAuditNotePostProcessingStatusResponseBody(Builder builder) {
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

    public static GetAuditNotePostProcessingStatusResponseBody create() {
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

        private Builder(GetAuditNotePostProcessingStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataNotExists</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAuditNotePostProcessingStatusResponseBody build() {
            return new GetAuditNotePostProcessingStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuditNotePostProcessingStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditNotePostProcessingStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletionTime")
        private String completionTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private String noteId;

        @com.aliyun.core.annotation.NameInMap("ProcessedLines")
        private Integer processedLines;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalLines")
        private Integer totalLines;

        private Data(Builder builder) {
            this.completionTime = builder.completionTime;
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.noteId = builder.noteId;
            this.processedLines = builder.processedLines;
            this.status = builder.status;
            this.totalLines = builder.totalLines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completionTime
         */
        public String getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return noteId
         */
        public String getNoteId() {
            return this.noteId;
        }

        /**
         * @return processedLines
         */
        public Integer getProcessedLines() {
            return this.processedLines;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalLines
         */
        public Integer getTotalLines() {
            return this.totalLines;
        }

        public static final class Builder {
            private String completionTime; 
            private String createTime; 
            private String errorMessage; 
            private String noteId; 
            private Integer processedLines; 
            private String status; 
            private Integer totalLines; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.completionTime = model.completionTime;
                this.createTime = model.createTime;
                this.errorMessage = model.errorMessage;
                this.noteId = model.noteId;
                this.processedLines = model.processedLines;
                this.status = model.status;
                this.totalLines = model.totalLines;
            } 

            /**
             * CompletionTime.
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NoteId.
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * ProcessedLines.
             */
            public Builder processedLines(Integer processedLines) {
                this.processedLines = processedLines;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalLines.
             */
            public Builder totalLines(Integer totalLines) {
                this.totalLines = totalLines;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
