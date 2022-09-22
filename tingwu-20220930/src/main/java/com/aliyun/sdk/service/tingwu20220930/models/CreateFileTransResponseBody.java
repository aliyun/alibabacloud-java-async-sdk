// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileTransResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileTransResponseBody</p>
 */
public class CreateFileTransResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFileTransResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileTransResponseBody create() {
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
         * 状态码。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回对象。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 状态说明。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID，仅用于联调。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFileTransResponseBody build() {
            return new CreateFileTransResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TransId")
        private String transId;

        @NameInMap("TransKey")
        private String transKey;

        private Data(Builder builder) {
            this.transId = builder.transId;
            this.transKey = builder.transKey;
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

        public static final class Builder {
            private String transId; 
            private String transKey; 

            /**
             * 任务ID。
             */
            public Builder transId(String transId) {
                this.transId = transId;
                return this;
            }

            /**
             * 用户创建任务时设置的任务标识。
             */
            public Builder transKey(String transKey) {
                this.transKey = transKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
