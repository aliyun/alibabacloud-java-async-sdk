// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallInPoolTransferConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallInPoolTransferConfigResponseBody</p>
 */
public class QueryCallInPoolTransferConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCallInPoolTransferConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallInPoolTransferConfigResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
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

        public QueryCallInPoolTransferConfigResponseBody build() {
            return new QueryCallInPoolTransferConfigResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("Called")
        private String called;

        private Details(Builder builder) {
            this.called = builder.called;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return called
         */
        public String getCalled() {
            return this.called;
        }

        public static final class Builder {
            private String called; 

            /**
             * The number used to transfer the call.
             */
            public Builder called(String called) {
                this.called = called;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CalledRouteMode")
        private String calledRouteMode;

        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("TransferTimeout")
        private String transferTimeout;

        private Data(Builder builder) {
            this.calledRouteMode = builder.calledRouteMode;
            this.details = builder.details;
            this.gmtCreate = builder.gmtCreate;
            this.transferTimeout = builder.transferTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calledRouteMode
         */
        public String getCalledRouteMode() {
            return this.calledRouteMode;
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return transferTimeout
         */
        public String getTransferTimeout() {
            return this.transferTimeout;
        }

        public static final class Builder {
            private String calledRouteMode; 
            private java.util.List < Details> details; 
            private Long gmtCreate; 
            private String transferTimeout; 

            /**
             * The call mode. Valid values:
             * <p>
             * 
             * *   **roundRobin**
             * *   **random**
             */
            public Builder calledRouteMode(String calledRouteMode) {
                this.calledRouteMode = calledRouteMode;
                return this;
            }

            /**
             * The details of the response parameters.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * The time when the call transfer task was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The timeout period for transferring the call.
             */
            public Builder transferTimeout(String transferTimeout) {
                this.transferTimeout = transferTimeout;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
