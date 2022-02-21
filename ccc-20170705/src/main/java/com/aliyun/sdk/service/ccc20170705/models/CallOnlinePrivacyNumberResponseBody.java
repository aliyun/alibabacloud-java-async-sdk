// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallOnlinePrivacyNumberResponseBody} extends {@link TeaModel}
 *
 * <p>CallOnlinePrivacyNumberResponseBody</p>
 */
public class CallOnlinePrivacyNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CallOnlinePrivacyNumberResponseBody(Builder builder) {
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

    public static CallOnlinePrivacyNumberResponseBody create() {
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

        public CallOnlinePrivacyNumberResponseBody build() {
            return new CallOnlinePrivacyNumberResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CallId")
        private String callId;

        @NameInMap("DateCreated")
        private String dateCreated;

        @NameInMap("Represent")
        private String represent;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("TelX")
        private String telX;

        private Data(Builder builder) {
            this.callId = builder.callId;
            this.dateCreated = builder.dateCreated;
            this.represent = builder.represent;
            this.statusCode = builder.statusCode;
            this.telX = builder.telX;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return dateCreated
         */
        public String getDateCreated() {
            return this.dateCreated;
        }

        /**
         * @return represent
         */
        public String getRepresent() {
            return this.represent;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return telX
         */
        public String getTelX() {
            return this.telX;
        }

        public static final class Builder {
            private String callId; 
            private String dateCreated; 
            private String represent; 
            private String statusCode; 
            private String telX; 

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * DateCreated.
             */
            public Builder dateCreated(String dateCreated) {
                this.dateCreated = dateCreated;
                return this;
            }

            /**
             * Represent.
             */
            public Builder represent(String represent) {
                this.represent = represent;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * TelX.
             */
            public Builder telX(String telX) {
                this.telX = telX;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
