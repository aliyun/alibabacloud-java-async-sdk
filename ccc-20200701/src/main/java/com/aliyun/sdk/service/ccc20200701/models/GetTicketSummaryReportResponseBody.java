// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetTicketSummaryReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketSummaryReportResponseBody</p>
 */
public class GetTicketSummaryReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTicketSummaryReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketSummaryReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getHttpStatusCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTicketSummaryReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EAF3C248-E123-441B-A545-B6CD02E98EED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTicketSummaryReportResponseBody build() {
            return new GetTicketSummaryReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketSummaryReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketSummaryReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TicketsAssigned")
        private String ticketsAssigned;

        @com.aliyun.core.annotation.NameInMap("TicketsCreated")
        private String ticketsCreated;

        @com.aliyun.core.annotation.NameInMap("TicketsParticipated")
        private String ticketsParticipated;

        private Data(Builder builder) {
            this.ticketsAssigned = builder.ticketsAssigned;
            this.ticketsCreated = builder.ticketsCreated;
            this.ticketsParticipated = builder.ticketsParticipated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ticketsAssigned
         */
        public String getTicketsAssigned() {
            return this.ticketsAssigned;
        }

        /**
         * @return ticketsCreated
         */
        public String getTicketsCreated() {
            return this.ticketsCreated;
        }

        /**
         * @return ticketsParticipated
         */
        public String getTicketsParticipated() {
            return this.ticketsParticipated;
        }

        public static final class Builder {
            private String ticketsAssigned; 
            private String ticketsCreated; 
            private String ticketsParticipated; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ticketsAssigned = model.ticketsAssigned;
                this.ticketsCreated = model.ticketsCreated;
                this.ticketsParticipated = model.ticketsParticipated;
            } 

            /**
             * <p>Number of tickets pending processing.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ticketsAssigned(String ticketsAssigned) {
                this.ticketsAssigned = ticketsAssigned;
                return this;
            }

            /**
             * <p>Number of tickets created.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ticketsCreated(String ticketsCreated) {
                this.ticketsCreated = ticketsCreated;
                return this;
            }

            /**
             * <p>Number of tickets processed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ticketsParticipated(String ticketsParticipated) {
                this.ticketsParticipated = ticketsParticipated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
