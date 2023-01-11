// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappBindWabaResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappBindWabaResponseBody</p>
 */
public class ChatappBindWabaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ChatappBindWabaResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappBindWabaResponseBody create() {
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

        public ChatappBindWabaResponseBody build() {
            return new ChatappBindWabaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CustSpaceId")
        private String custSpaceId;

        @NameInMap("WabaId")
        private String wabaId;

        private Data(Builder builder) {
            this.custSpaceId = builder.custSpaceId;
            this.wabaId = builder.wabaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return custSpaceId
         */
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        /**
         * @return wabaId
         */
        public String getWabaId() {
            return this.wabaId;
        }

        public static final class Builder {
            private String custSpaceId; 
            private String wabaId; 

            /**
             * 客户SpaceID
             */
            public Builder custSpaceId(String custSpaceId) {
                this.custSpaceId = custSpaceId;
                return this;
            }

            /**
             * wabaId
             */
            public Builder wabaId(String wabaId) {
                this.wabaId = wabaId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
