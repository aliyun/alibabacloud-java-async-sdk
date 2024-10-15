// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryVoiceFileAuditInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVoiceFileAuditInfoResponseBody</p>
 */
public class QueryVoiceFileAuditInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * <p>The value OK indicates that the request was successful. For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryVoiceFileAuditInfoResponseBody build() {
            return new QueryVoiceFileAuditInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVoiceFileAuditInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVoiceFileAuditInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditState")
        private String auditState;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        @com.aliyun.core.annotation.NameInMap("VoiceCode")
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
             * <p>The review state of the voice file. Valid values:</p>
             * <ul>
             * <li><strong>AUDIT_STATE_INIT</strong>: The voice file was under review.</li>
             * <li><strong>AUDIT_STATE_PASS</strong>: The voice file was approved.</li>
             * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The voice file was rejected.</li>
             * <li><strong>AUDIT_STATE_UPLOADING</strong>: The voice file was approved and is being uploaded.</li>
             * <li><strong>AUDIT_STATE_REDOING</strong>: The voice file was being reprocessed.</li>
             * <li><strong>AUDIT_SATE_CANCEL</strong>: The review of the voice file was canceled.</li>
             * <li><strong>AUDIT_PAUSE</strong>: The review of the voice file was suspended.</li>
             * <li><strong>AUDIT_ORDER_FINISHED</strong>: The voice file was approved by the ticket system and was waiting for the review of the Internet service provider (ISP).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIT_STATE_NOT_PASS</p>
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * <p>The reason why the voice file was rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>This business is not supported</p>
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * <p>The code of the voice file.</p>
             * 
             * <strong>example:</strong>
             * <p>8501d2eb-efbb-471f-xxx8-****.wav</p>
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
