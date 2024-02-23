// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVoiceFileAuditInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVoiceFileAuditInfoResponseBody</p>
 */
public class QueryVoiceFileAuditInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryVoiceFileAuditInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVoiceFileAuditInfoResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * The value OK indicates that the request was successful. For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryVoiceFileAuditInfoResponseBody build() {
            return new QueryVoiceFileAuditInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuditState")
        private String auditState;

        @NameInMap("RejectInfo")
        private String rejectInfo;

        @NameInMap("VoiceCode")
        private String voiceCode;

        private Data(Builder builder) {
            this.auditState = builder.auditState;
            this.rejectInfo = builder.rejectInfo;
            this.voiceCode = builder.voiceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditState
         */
        public String getAuditState() {
            return this.auditState;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        /**
         * @return voiceCode
         */
        public String getVoiceCode() {
            return this.voiceCode;
        }

        public static final class Builder {
            private String auditState; 
            private String rejectInfo; 
            private String voiceCode; 

            /**
             * The review state of the voice file. Valid values:
             * <p>
             * 
             * *   **AUDIT_STATE_INIT**: The voice file was under review.
             * *   **AUDIT_STATE_PASS**: The voice file was approved.
             * *   **AUDIT_STATE_NOT_PASS**: The voice file was rejected.
             * *   **AUDIT_STATE_UPLOADING**: The voice file was approved and is being uploaded.
             * *   **AUDIT_STATE_REDOING**: The voice file was being reprocessed.
             * *   **AUDIT_SATE_CANCEL**: The review of the voice file was canceled.
             * *   **AUDIT_PAUSE**: The review of the voice file was suspended.
             * *   **AUDIT_ORDER_FINISHED**: The voice file was approved by the ticket system and was waiting for the review of the Internet service provider (ISP).
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * The reason why the voice file was rejected.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * The code of the voice file.
             */
            public Builder voiceCode(String voiceCode) {
                this.voiceCode = voiceCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
