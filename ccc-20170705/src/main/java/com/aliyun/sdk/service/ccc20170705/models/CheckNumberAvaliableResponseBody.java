// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link CheckNumberAvaliableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckNumberAvaliableResponseBody</p>
 */
public class CheckNumberAvaliableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CalleeAvaliable")
    private CalleeAvaliable calleeAvaliable;

    @com.aliyun.core.annotation.NameInMap("CallerAvaliable")
    private CallerAvaliable callerAvaliable;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckNumberAvaliableResponseBody model) {
            this.calleeAvaliable = model.calleeAvaliable;
            this.callerAvaliable = model.callerAvaliable;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link CheckNumberAvaliableResponseBody} extends {@link TeaModel}
     *
     * <p>CheckNumberAvaliableResponseBody</p>
     */
    public static class CalleeAvaliable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avaliable")
        private Boolean avaliable;

        @com.aliyun.core.annotation.NameInMap("Reason")
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

            private Builder() {
            } 

            private Builder(CalleeAvaliable model) {
                this.avaliable = model.avaliable;
                this.reason = model.reason;
            } 

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
    /**
     * 
     * {@link CheckNumberAvaliableResponseBody} extends {@link TeaModel}
     *
     * <p>CheckNumberAvaliableResponseBody</p>
     */
    public static class CallerAvaliable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avaliable")
        private Boolean avaliable;

        @com.aliyun.core.annotation.NameInMap("Reason")
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

            private Builder() {
            } 

            private Builder(CallerAvaliable model) {
                this.avaliable = model.avaliable;
                this.reason = model.reason;
            } 

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
