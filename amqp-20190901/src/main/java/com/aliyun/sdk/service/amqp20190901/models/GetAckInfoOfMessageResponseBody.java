// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAckInfoOfMessageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAckInfoOfMessageResponseBody</p>
 */
public class GetAckInfoOfMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAckInfoOfMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAckInfoOfMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAckInfoOfMessageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAckInfoOfMessageResponseBody build() {
            return new GetAckInfoOfMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAckInfoOfMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAckInfoOfMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckErrorInfo")
        private String ackErrorInfo;

        @com.aliyun.core.annotation.NameInMap("AckResult")
        private String ackResult;

        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.Map<String, ?> property;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private Data(Builder builder) {
            this.ackErrorInfo = builder.ackErrorInfo;
            this.ackResult = builder.ackResult;
            this.action = builder.action;
            this.code = builder.code;
            this.property = builder.property;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ackErrorInfo
         */
        public String getAckErrorInfo() {
            return this.ackErrorInfo;
        }

        /**
         * @return ackResult
         */
        public String getAckResult() {
            return this.ackResult;
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return property
         */
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String ackErrorInfo; 
            private String ackResult; 
            private String action; 
            private String code; 
            private java.util.Map<String, ?> property; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ackErrorInfo = model.ackErrorInfo;
                this.ackResult = model.ackResult;
                this.action = model.action;
                this.code = model.code;
                this.property = model.property;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * AckErrorInfo.
             */
            public Builder ackErrorInfo(String ackErrorInfo) {
                this.ackErrorInfo = ackErrorInfo;
                return this;
            }

            /**
             * AckResult.
             */
            public Builder ackResult(String ackResult) {
                this.ackResult = ackResult;
                return this;
            }

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Property.
             */
            public Builder property(java.util.Map<String, ?> property) {
                this.property = property;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
