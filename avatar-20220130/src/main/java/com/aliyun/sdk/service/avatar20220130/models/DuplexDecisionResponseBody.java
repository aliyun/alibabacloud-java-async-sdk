// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplexDecisionResponseBody} extends {@link TeaModel}
 *
 * <p>DuplexDecisionResponseBody</p>
 */
public class DuplexDecisionResponseBody extends TeaModel {
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

    private DuplexDecisionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DuplexDecisionResponseBody create() {
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
         * RequestId.
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

        public DuplexDecisionResponseBody build() {
            return new DuplexDecisionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActionType")
        private String actionType;

        @NameInMap("GrabType")
        private String grabType;

        @NameInMap("OutputText")
        private String outputText;

        private Data(Builder builder) {
            this.actionType = builder.actionType;
            this.grabType = builder.grabType;
            this.outputText = builder.outputText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return grabType
         */
        public String getGrabType() {
            return this.grabType;
        }

        /**
         * @return outputText
         */
        public String getOutputText() {
            return this.outputText;
        }

        public static final class Builder {
            private String actionType; 
            private String grabType; 
            private String outputText; 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * GrabType.
             */
            public Builder grabType(String grabType) {
                this.grabType = grabType;
                return this;
            }

            /**
             * OutputText.
             */
            public Builder outputText(String outputText) {
                this.outputText = outputText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
