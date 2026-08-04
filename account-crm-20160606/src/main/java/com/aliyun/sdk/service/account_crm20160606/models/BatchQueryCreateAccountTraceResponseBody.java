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
 * {@link BatchQueryCreateAccountTraceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryCreateAccountTraceResponseBody</p>
 */
public class BatchQueryCreateAccountTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Traces")
    private java.util.List<Traces> traces;

    private BatchQueryCreateAccountTraceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traces = builder.traces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryCreateAccountTraceResponseBody create() {
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
    public Boolean getSuccess() {
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
        private Boolean success; 
        private java.util.List<Traces> traces; 

        private Builder() {
        } 

        private Builder(BatchQueryCreateAccountTraceResponseBody model) {
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
        public Builder success(Boolean success) {
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

        public BatchQueryCreateAccountTraceResponseBody build() {
            return new BatchQueryCreateAccountTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryCreateAccountTraceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryCreateAccountTraceResponseBody</p>
     */
    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NowLoginEmail")
        private String nowLoginEmail;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TraceNo")
        private String traceNo;

        private Traces(Builder builder) {
            this.nowLoginEmail = builder.nowLoginEmail;
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
         * @return nowLoginEmail
         */
        public String getNowLoginEmail() {
            return this.nowLoginEmail;
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
            private String nowLoginEmail; 
            private String pk; 
            private String status; 
            private String traceNo; 

            private Builder() {
            } 

            private Builder(Traces model) {
                this.nowLoginEmail = model.nowLoginEmail;
                this.pk = model.pk;
                this.status = model.status;
                this.traceNo = model.traceNo;
            } 

            /**
             * NowLoginEmail.
             */
            public Builder nowLoginEmail(String nowLoginEmail) {
                this.nowLoginEmail = nowLoginEmail;
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
