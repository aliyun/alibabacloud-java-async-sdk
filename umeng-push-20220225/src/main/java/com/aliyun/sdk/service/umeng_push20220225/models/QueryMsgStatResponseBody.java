// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

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
 * {@link QueryMsgStatResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMsgStatResponseBody</p>
 */
public class QueryMsgStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMsgStatResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMsgStatResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryMsgStatResponseBody build() {
            return new QueryMsgStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMsgStatResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMsgStatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accept")
        private Long accept;

        @com.aliyun.core.annotation.NameInMap("Arrive")
        private Long arrive;

        @com.aliyun.core.annotation.NameInMap("ClosePush")
        private Long closePush;

        @com.aliyun.core.annotation.NameInMap("Dismiss")
        private Long dismiss;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("Open")
        private Long open;

        @com.aliyun.core.annotation.NameInMap("Sent")
        private Long sent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.accept = builder.accept;
            this.arrive = builder.arrive;
            this.closePush = builder.closePush;
            this.dismiss = builder.dismiss;
            this.msgId = builder.msgId;
            this.open = builder.open;
            this.sent = builder.sent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accept
         */
        public Long getAccept() {
            return this.accept;
        }

        /**
         * @return arrive
         */
        public Long getArrive() {
            return this.arrive;
        }

        /**
         * @return closePush
         */
        public Long getClosePush() {
            return this.closePush;
        }

        /**
         * @return dismiss
         */
        public Long getDismiss() {
            return this.dismiss;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return open
         */
        public Long getOpen() {
            return this.open;
        }

        /**
         * @return sent
         */
        public Long getSent() {
            return this.sent;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long accept; 
            private Long arrive; 
            private Long closePush; 
            private Long dismiss; 
            private String msgId; 
            private Long open; 
            private Long sent; 
            private Integer status; 

            /**
             * Accept.
             */
            public Builder accept(Long accept) {
                this.accept = accept;
                return this;
            }

            /**
             * Arrive.
             */
            public Builder arrive(Long arrive) {
                this.arrive = arrive;
                return this;
            }

            /**
             * ClosePush.
             */
            public Builder closePush(Long closePush) {
                this.closePush = closePush;
                return this;
            }

            /**
             * Dismiss.
             */
            public Builder dismiss(Long dismiss) {
                this.dismiss = dismiss;
                return this;
            }

            /**
             * MsgId.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * Open.
             */
            public Builder open(Long open) {
                this.open = open;
                return this;
            }

            /**
             * Sent.
             */
            public Builder sent(Long sent) {
                this.sent = sent;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
