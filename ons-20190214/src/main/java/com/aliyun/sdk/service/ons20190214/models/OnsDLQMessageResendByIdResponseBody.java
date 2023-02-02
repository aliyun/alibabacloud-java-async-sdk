// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessageResendByIdResponseBody} extends {@link TeaModel}
 *
 * <p>OnsDLQMessageResendByIdResponseBody</p>
 */
public class OnsDLQMessageResendByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsDLQMessageResendByIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsDLQMessageResendByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned messages.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsDLQMessageResendByIdResponseBody build() {
            return new OnsDLQMessageResendByIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MsgId")
        private java.util.List < String > msgId;

        private Data(Builder builder) {
            this.msgId = builder.msgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return msgId
         */
        public java.util.List < String > getMsgId() {
            return this.msgId;
        }

        public static final class Builder {
            private java.util.List < String > msgId; 

            /**
             * MsgId.
             */
            public Builder msgId(java.util.List < String > msgId) {
                this.msgId = msgId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
