// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCallInPoolTransferConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallInPoolTransferConfigResponseBody</p>
 */
public class QueryCallInPoolTransferConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
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
        public Builder data(Data data) {
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
         * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCallInPoolTransferConfigResponseBody build() {
            return new QueryCallInPoolTransferConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCallInPoolTransferConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCallInPoolTransferConfigResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Called")
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
             * <p>The number used to transfer the call.</p>
             * 
             * <strong>example:</strong>
             * <p>400****</p>
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
    /**
     * 
     * {@link QueryCallInPoolTransferConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCallInPoolTransferConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledRouteMode")
        private String calledRouteMode;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("TransferTimeout")
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
             * <p>The call mode. Valid values:</p>
             * <ul>
             * <li><strong>roundRobin</strong></li>
             * <li><strong>random</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>random</p>
             */
            public Builder calledRouteMode(String calledRouteMode) {
                this.calledRouteMode = calledRouteMode;
                return this;
            }

            /**
             * <p>The details of the response parameters.</p>
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The time when the call transfer task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1623137002000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timeout period for transferring the call.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
