// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessPageSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessPageSessionResponseBody</p>
 */
public class GetAccessPageSessionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetAccessPageSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessPageSessionResponseBody create() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

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
         * Id of the request
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

        public GetAccessPageSessionResponseBody build() {
            return new GetAccessPageSessionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConnectTicket")
        private String connectTicket;

        @NameInMap("FlowId")
        private String flowId;

        private Data(Builder builder) {
            this.connectTicket = builder.connectTicket;
            this.flowId = builder.flowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectTicket
         */
        public String getConnectTicket() {
            return this.connectTicket;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        public static final class Builder {
            private String connectTicket; 
            private String flowId; 

            /**
             * ConnectTicket.
             */
            public Builder connectTicket(String connectTicket) {
                this.connectTicket = connectTicket;
                return this;
            }

            /**
             * flow ID
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
