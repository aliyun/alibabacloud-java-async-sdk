// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileTransResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileTransResponseBody</p>
 */
public class GetFileTransResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetFileTransResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileTransResponseBody create() {
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

        public GetFileTransResponseBody build() {
            return new GetFileTransResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TransId")
        private String transId;

        @NameInMap("TransKey")
        private String transKey;

        @NameInMap("TransStatus")
        private String transStatus;

        private Data(Builder builder) {
            this.transId = builder.transId;
            this.transKey = builder.transKey;
            this.transStatus = builder.transStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return transId
         */
        public String getTransId() {
            return this.transId;
        }

        /**
         * @return transKey
         */
        public String getTransKey() {
            return this.transKey;
        }

        /**
         * @return transStatus
         */
        public String getTransStatus() {
            return this.transStatus;
        }

        public static final class Builder {
            private String transId; 
            private String transKey; 
            private String transStatus; 

            /**
             * TransId.
             */
            public Builder transId(String transId) {
                this.transId = transId;
                return this;
            }

            /**
             * TransKey.
             */
            public Builder transKey(String transKey) {
                this.transKey = transKey;
                return this;
            }

            /**
             * TransStatus.
             */
            public Builder transStatus(String transStatus) {
                this.transStatus = transStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
