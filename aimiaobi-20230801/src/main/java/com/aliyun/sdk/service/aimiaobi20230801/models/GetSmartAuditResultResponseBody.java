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
 * {@link GetSmartAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartAuditResultResponseBody</p>
 */
public class GetSmartAuditResultResponseBody extends TeaModel {
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

    private GetSmartAuditResultResponseBody(Builder builder) {
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

    public static GetSmartAuditResultResponseBody create() {
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

        private Builder(GetSmartAuditResultResponseBody model) {
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
         * <p>xxxxx</p>
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

        public GetSmartAuditResultResponseBody build() {
            return new GetSmartAuditResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmartAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartAuditResultResponseBody</p>
     */
    public static class ErrorItemDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("ContextOffset")
        private Integer contextOffset;

        @com.aliyun.core.annotation.NameInMap("ErrorLevel")
        private Integer errorLevel;

        @com.aliyun.core.annotation.NameInMap("ErrorWord")
        private String errorWord;

        @com.aliyun.core.annotation.NameInMap("MajorCode")
        private String majorCode;

        @com.aliyun.core.annotation.NameInMap("MajorCodeDesc")
        private String majorCodeDesc;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RightWord")
        private String rightWord;

        @com.aliyun.core.annotation.NameInMap("SubClassCode")
        private String subClassCode;

        @com.aliyun.core.annotation.NameInMap("SubClassDesc")
        private String subClassDesc;

        private ErrorItemDetails(Builder builder) {
            this.checkId = builder.checkId;
            this.context = builder.context;
            this.contextOffset = builder.contextOffset;
            this.errorLevel = builder.errorLevel;
            this.errorWord = builder.errorWord;
            this.majorCode = builder.majorCode;
            this.majorCodeDesc = builder.majorCodeDesc;
            this.offset = builder.offset;
            this.reason = builder.reason;
            this.rightWord = builder.rightWord;
            this.subClassCode = builder.subClassCode;
            this.subClassDesc = builder.subClassDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorItemDetails create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return contextOffset
         */
        public Integer getContextOffset() {
            return this.contextOffset;
        }

        /**
         * @return errorLevel
         */
        public Integer getErrorLevel() {
            return this.errorLevel;
        }

        /**
         * @return errorWord
         */
        public String getErrorWord() {
            return this.errorWord;
        }

        /**
         * @return majorCode
         */
        public String getMajorCode() {
            return this.majorCode;
        }

        /**
         * @return majorCodeDesc
         */
        public String getMajorCodeDesc() {
            return this.majorCodeDesc;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return rightWord
         */
        public String getRightWord() {
            return this.rightWord;
        }

        /**
         * @return subClassCode
         */
        public String getSubClassCode() {
            return this.subClassCode;
        }

        /**
         * @return subClassDesc
         */
        public String getSubClassDesc() {
            return this.subClassDesc;
        }

        public static final class Builder {
            private String checkId; 
            private String context; 
            private Integer contextOffset; 
            private Integer errorLevel; 
            private String errorWord; 
            private String majorCode; 
            private String majorCodeDesc; 
            private Integer offset; 
            private String reason; 
            private String rightWord; 
            private String subClassCode; 
            private String subClassDesc; 

            private Builder() {
            } 

            private Builder(ErrorItemDetails model) {
                this.checkId = model.checkId;
                this.context = model.context;
                this.contextOffset = model.contextOffset;
                this.errorLevel = model.errorLevel;
                this.errorWord = model.errorWord;
                this.majorCode = model.majorCode;
                this.majorCodeDesc = model.majorCodeDesc;
                this.offset = model.offset;
                this.reason = model.reason;
                this.rightWord = model.rightWord;
                this.subClassCode = model.subClassCode;
                this.subClassDesc = model.subClassDesc;
            } 

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * Context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * ContextOffset.
             */
            public Builder contextOffset(Integer contextOffset) {
                this.contextOffset = contextOffset;
                return this;
            }

            /**
             * ErrorLevel.
             */
            public Builder errorLevel(Integer errorLevel) {
                this.errorLevel = errorLevel;
                return this;
            }

            /**
             * ErrorWord.
             */
            public Builder errorWord(String errorWord) {
                this.errorWord = errorWord;
                return this;
            }

            /**
             * MajorCode.
             */
            public Builder majorCode(String majorCode) {
                this.majorCode = majorCode;
                return this;
            }

            /**
             * MajorCodeDesc.
             */
            public Builder majorCodeDesc(String majorCodeDesc) {
                this.majorCodeDesc = majorCodeDesc;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RightWord.
             */
            public Builder rightWord(String rightWord) {
                this.rightWord = rightWord;
                return this;
            }

            /**
             * SubClassCode.
             */
            public Builder subClassCode(String subClassCode) {
                this.subClassCode = subClassCode;
                return this;
            }

            /**
             * SubClassDesc.
             */
            public Builder subClassDesc(String subClassDesc) {
                this.subClassDesc = subClassDesc;
                return this;
            }

            public ErrorItemDetails build() {
                return new ErrorItemDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartAuditResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorItemDetails")
        private java.util.List<ErrorItemDetails> errorItemDetails;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.errorItemDetails = builder.errorItemDetails;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorItemDetails
         */
        public java.util.List<ErrorItemDetails> getErrorItemDetails() {
            return this.errorItemDetails;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<ErrorItemDetails> errorItemDetails; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorItemDetails = model.errorItemDetails;
                this.status = model.status;
            } 

            /**
             * ErrorItemDetails.
             */
            public Builder errorItemDetails(java.util.List<ErrorItemDetails> errorItemDetails) {
                this.errorItemDetails = errorItemDetails;
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
