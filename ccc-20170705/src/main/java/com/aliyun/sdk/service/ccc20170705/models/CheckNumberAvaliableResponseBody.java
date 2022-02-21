// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckNumberAvaliableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckNumberAvaliableResponseBody</p>
 */
public class CheckNumberAvaliableResponseBody extends TeaModel {
    @NameInMap("CalleeAvaliable")
    private CalleeAvaliable calleeAvaliable;

    @NameInMap("CallerAvaliable")
    private CallerAvaliable callerAvaliable;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckNumberAvaliableResponseBody(Builder builder) {
        this.calleeAvaliable = builder.calleeAvaliable;
        this.callerAvaliable = builder.callerAvaliable;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckNumberAvaliableResponseBody create() {
        return builder().build();
    }

    /**
     * @return calleeAvaliable
     */
    public CalleeAvaliable getCalleeAvaliable() {
        return this.calleeAvaliable;
    }

    /**
     * @return callerAvaliable
     */
    public CallerAvaliable getCallerAvaliable() {
        return this.callerAvaliable;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private CalleeAvaliable calleeAvaliable; 
        private CallerAvaliable callerAvaliable; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * CalleeAvaliable.
         */
        public Builder calleeAvaliable(CalleeAvaliable calleeAvaliable) {
            this.calleeAvaliable = calleeAvaliable;
            return this;
        }

        /**
         * CallerAvaliable.
         */
        public Builder callerAvaliable(CallerAvaliable callerAvaliable) {
            this.callerAvaliable = callerAvaliable;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public CheckNumberAvaliableResponseBody build() {
            return new CheckNumberAvaliableResponseBody(this);
        } 

    } 

    public static class CalleeAvaliable extends TeaModel {
        @NameInMap("Avaliable")
        private Boolean avaliable;

        @NameInMap("Reason")
        private String reason;

        private CalleeAvaliable(Builder builder) {
            this.avaliable = builder.avaliable;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalleeAvaliable create() {
            return builder().build();
        }

        /**
         * @return avaliable
         */
        public Boolean getAvaliable() {
            return this.avaliable;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean avaliable; 
            private String reason; 

            /**
             * Avaliable.
             */
            public Builder avaliable(Boolean avaliable) {
                this.avaliable = avaliable;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public CalleeAvaliable build() {
                return new CalleeAvaliable(this);
            } 

        } 

    }
    public static class CallerAvaliable extends TeaModel {
        @NameInMap("Avaliable")
        private Boolean avaliable;

        @NameInMap("Reason")
        private String reason;

        private CallerAvaliable(Builder builder) {
            this.avaliable = builder.avaliable;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallerAvaliable create() {
            return builder().build();
        }

        /**
         * @return avaliable
         */
        public Boolean getAvaliable() {
            return this.avaliable;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean avaliable; 
            private String reason; 

            /**
             * Avaliable.
             */
            public Builder avaliable(Boolean avaliable) {
                this.avaliable = avaliable;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public CallerAvaliable build() {
                return new CallerAvaliable(this);
            } 

        } 

    }
}
