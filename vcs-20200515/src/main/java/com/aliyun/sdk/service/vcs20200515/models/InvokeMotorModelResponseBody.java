// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeMotorModelResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeMotorModelResponseBody</p>
 */
public class InvokeMotorModelResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InvokeMotorModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeMotorModelResponseBody create() {
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

        public InvokeMotorModelResponseBody build() {
            return new InvokeMotorModelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("StructList")
        private String structList;

        private Data(Builder builder) {
            this.structList = builder.structList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return structList
         */
        public String getStructList() {
            return this.structList;
        }

        public static final class Builder {
            private String structList; 

            /**
             * StructList.
             */
            public Builder structList(String structList) {
                this.structList = structList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
