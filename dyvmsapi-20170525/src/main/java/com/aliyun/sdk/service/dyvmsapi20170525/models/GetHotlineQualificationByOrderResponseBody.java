// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHotlineQualificationByOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotlineQualificationByOrderResponseBody</p>
 */
public class GetHotlineQualificationByOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHotlineQualificationByOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineQualificationByOrderResponseBody create() {
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
         * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHotlineQualificationByOrderResponseBody build() {
            return new GetHotlineQualificationByOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotlineQualificationByOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotlineQualificationByOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("QualificationId")
        private String qualificationId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
            this.qualificationId = builder.qualificationId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return qualificationId
         */
        public String getQualificationId() {
            return this.qualificationId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String orderId; 
            private String qualificationId; 
            private String status; 

            /**
             * <p>The ID of the qualification application ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>22456****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The qualification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1478*****</p>
             */
            public Builder qualificationId(String qualificationId) {
                this.qualificationId = qualificationId;
                return this;
            }

            /**
             * <p>The qualification state. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong></li>
             * <li><strong>OTHER</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
