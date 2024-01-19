// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAgreementResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAgreementResponseBody</p>
 */
public class QueryAgreementResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("QueryAgreementResponse")
    private QueryAgreementResponse queryAgreementResponse;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAgreementResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.queryAgreementResponse = builder.queryAgreementResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgreementResponseBody create() {
        return builder().build();
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
     * @return queryAgreementResponse
     */
    public QueryAgreementResponse getQueryAgreementResponse() {
        return this.queryAgreementResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private QueryAgreementResponse queryAgreementResponse; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * QueryAgreementResponse.
         */
        public Builder queryAgreementResponse(QueryAgreementResponse queryAgreementResponse) {
            this.queryAgreementResponse = queryAgreementResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAgreementResponseBody build() {
            return new QueryAgreementResponseBody(this);
        } 

    } 

    public static class QueryAgreementResponse extends TeaModel {
        @NameInMap("AgreementNo")
        private String agreementNo;

        @NameInMap("ExternalAgreementNo")
        private String externalAgreementNo;

        @NameInMap("InvalidTime")
        private String invalidTime;

        @NameInMap("SignTime")
        private String signTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ValidTime")
        private String validTime;

        private QueryAgreementResponse(Builder builder) {
            this.agreementNo = builder.agreementNo;
            this.externalAgreementNo = builder.externalAgreementNo;
            this.invalidTime = builder.invalidTime;
            this.signTime = builder.signTime;
            this.status = builder.status;
            this.validTime = builder.validTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryAgreementResponse create() {
            return builder().build();
        }

        /**
         * @return agreementNo
         */
        public String getAgreementNo() {
            return this.agreementNo;
        }

        /**
         * @return externalAgreementNo
         */
        public String getExternalAgreementNo() {
            return this.externalAgreementNo;
        }

        /**
         * @return invalidTime
         */
        public String getInvalidTime() {
            return this.invalidTime;
        }

        /**
         * @return signTime
         */
        public String getSignTime() {
            return this.signTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validTime
         */
        public String getValidTime() {
            return this.validTime;
        }

        public static final class Builder {
            private String agreementNo; 
            private String externalAgreementNo; 
            private String invalidTime; 
            private String signTime; 
            private String status; 
            private String validTime; 

            /**
             * AgreementNo.
             */
            public Builder agreementNo(String agreementNo) {
                this.agreementNo = agreementNo;
                return this;
            }

            /**
             * ExternalAgreementNo.
             */
            public Builder externalAgreementNo(String externalAgreementNo) {
                this.externalAgreementNo = externalAgreementNo;
                return this;
            }

            /**
             * InvalidTime.
             */
            public Builder invalidTime(String invalidTime) {
                this.invalidTime = invalidTime;
                return this;
            }

            /**
             * SignTime.
             */
            public Builder signTime(String signTime) {
                this.signTime = signTime;
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
             * ValidTime.
             */
            public Builder validTime(String validTime) {
                this.validTime = validTime;
                return this;
            }

            public QueryAgreementResponse build() {
                return new QueryAgreementResponse(this);
            } 

        } 

    }
}
