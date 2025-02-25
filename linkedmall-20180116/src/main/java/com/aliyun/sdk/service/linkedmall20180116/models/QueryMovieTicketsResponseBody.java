// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryMovieTicketsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMovieTicketsResponseBody</p>
 */
public class QueryMovieTicketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MovieTicket")
    private MovieTicket movieTicket;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMovieTicketsResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.movieTicket = builder.movieTicket;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieTicketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return movieTicket
     */
    public MovieTicket getMovieTicket() {
        return this.movieTicket;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private MovieTicket movieTicket; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * MovieTicket.
         */
        public Builder movieTicket(MovieTicket movieTicket) {
            this.movieTicket = movieTicket;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMovieTicketsResponseBody build() {
            return new QueryMovieTicketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMovieTicketsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMovieTicketsResponseBody</p>
     */
    public static class MovieTicket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReturnMessage")
        private String returnMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TbOrderId")
        private String tbOrderId;

        @com.aliyun.core.annotation.NameInMap("TicketContents")
        private String ticketContents;

        private MovieTicket(Builder builder) {
            this.returnMessage = builder.returnMessage;
            this.status = builder.status;
            this.tbOrderId = builder.tbOrderId;
            this.ticketContents = builder.ticketContents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MovieTicket create() {
            return builder().build();
        }

        /**
         * @return returnMessage
         */
        public String getReturnMessage() {
            return this.returnMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tbOrderId
         */
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        /**
         * @return ticketContents
         */
        public String getTicketContents() {
            return this.ticketContents;
        }

        public static final class Builder {
            private String returnMessage; 
            private String status; 
            private String tbOrderId; 
            private String ticketContents; 

            /**
             * ReturnMessage.
             */
            public Builder returnMessage(String returnMessage) {
                this.returnMessage = returnMessage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TbOrderId.
             */
            public Builder tbOrderId(String tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            /**
             * TicketContents.
             */
            public Builder ticketContents(String ticketContents) {
                this.ticketContents = ticketContents;
                return this;
            }

            public MovieTicket build() {
                return new MovieTicket(this);
            } 

        } 

    }
}
