// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link BatchQueryModifyLoginEmailTraceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryModifyLoginEmailTraceResponseBody</p>
 */
public class BatchQueryModifyLoginEmailTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Traces")
    private java.util.List<Traces> traces;

    private BatchQueryModifyLoginEmailTraceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traces = builder.traces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryModifyLoginEmailTraceResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return traces
     */
    public java.util.List<Traces> getTraces() {
        return this.traces;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 
        private java.util.List<Traces> traces; 

        private Builder() {
        } 

        private Builder(BatchQueryModifyLoginEmailTraceResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traces = model.traces;
        } 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Traces.
         */
        public Builder traces(java.util.List<Traces> traces) {
            this.traces = traces;
            return this;
        }

        public BatchQueryModifyLoginEmailTraceResponseBody build() {
            return new BatchQueryModifyLoginEmailTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryModifyLoginEmailTraceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryModifyLoginEmailTraceResponseBody</p>
     */
    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewLoginEmail")
        private String newLoginEmail;

        @com.aliyun.core.annotation.NameInMap("NowLoginEmail")
        private String nowLoginEmail;

        @com.aliyun.core.annotation.NameInMap("OldLoginEmail")
        private String oldLoginEmail;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TraceNo")
        private String traceNo;

        private Traces(Builder builder) {
            this.newLoginEmail = builder.newLoginEmail;
            this.nowLoginEmail = builder.nowLoginEmail;
            this.oldLoginEmail = builder.oldLoginEmail;
            this.pk = builder.pk;
            this.status = builder.status;
            this.traceNo = builder.traceNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traces create() {
            return builder().build();
        }

        /**
         * @return newLoginEmail
         */
        public String getNewLoginEmail() {
            return this.newLoginEmail;
        }

        /**
         * @return nowLoginEmail
         */
        public String getNowLoginEmail() {
            return this.nowLoginEmail;
        }

        /**
         * @return oldLoginEmail
         */
        public String getOldLoginEmail() {
            return this.oldLoginEmail;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return traceNo
         */
        public String getTraceNo() {
            return this.traceNo;
        }

        public static final class Builder {
            private String newLoginEmail; 
            private String nowLoginEmail; 
            private String oldLoginEmail; 
            private String pk; 
            private String status; 
            private String traceNo; 

            private Builder() {
            } 

            private Builder(Traces model) {
                this.newLoginEmail = model.newLoginEmail;
                this.nowLoginEmail = model.nowLoginEmail;
                this.oldLoginEmail = model.oldLoginEmail;
                this.pk = model.pk;
                this.status = model.status;
                this.traceNo = model.traceNo;
            } 

            /**
             * NewLoginEmail.
             */
            public Builder newLoginEmail(String newLoginEmail) {
                this.newLoginEmail = newLoginEmail;
                return this;
            }

            /**
             * NowLoginEmail.
             */
            public Builder nowLoginEmail(String nowLoginEmail) {
                this.nowLoginEmail = nowLoginEmail;
                return this;
            }

            /**
             * OldLoginEmail.
             */
            public Builder oldLoginEmail(String oldLoginEmail) {
                this.oldLoginEmail = oldLoginEmail;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
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
             * TraceNo.
             */
            public Builder traceNo(String traceNo) {
                this.traceNo = traceNo;
                return this;
            }

            public Traces build() {
                return new Traces(this);
            } 

        } 

    }
}
