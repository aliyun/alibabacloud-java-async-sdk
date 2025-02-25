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
 * {@link GetHistoricalCampaignReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistoricalCampaignReportResponseBody</p>
 */
public class GetHistoricalCampaignReportResponseBody extends TeaModel {
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

    private GetHistoricalCampaignReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalCampaignReportResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
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

        public GetHistoricalCampaignReportResponseBody build() {
            return new GetHistoricalCampaignReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHistoricalCampaignReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalCampaignReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonRate")
        private Float abandonRate;

        @com.aliyun.core.annotation.NameInMap("AbandonedRate")
        private Float abandonedRate;

        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Float answerRate;

        @com.aliyun.core.annotation.NameInMap("CallsAbandoned")
        private Long callsAbandoned;

        @com.aliyun.core.annotation.NameInMap("CallsConnected")
        private Long callsConnected;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("ConnectedRate")
        private Float connectedRate;

        @com.aliyun.core.annotation.NameInMap("OccupancyRate")
        private Float occupancyRate;

        private Data(Builder builder) {
            this.abandonRate = builder.abandonRate;
            this.abandonedRate = builder.abandonedRate;
            this.answerRate = builder.answerRate;
            this.callsAbandoned = builder.callsAbandoned;
            this.callsConnected = builder.callsConnected;
            this.callsDialed = builder.callsDialed;
            this.connectedRate = builder.connectedRate;
            this.occupancyRate = builder.occupancyRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abandonRate
         */
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        /**
         * @return abandonedRate
         */
        public Float getAbandonedRate() {
            return this.abandonedRate;
        }

        /**
         * @return answerRate
         */
        public Float getAnswerRate() {
            return this.answerRate;
        }

        /**
         * @return callsAbandoned
         */
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        /**
         * @return callsConnected
         */
        public Long getCallsConnected() {
            return this.callsConnected;
        }

        /**
         * @return callsDialed
         */
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        /**
         * @return connectedRate
         */
        public Float getConnectedRate() {
            return this.connectedRate;
        }

        /**
         * @return occupancyRate
         */
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public static final class Builder {
            private Float abandonRate; 
            private Float abandonedRate; 
            private Float answerRate; 
            private Long callsAbandoned; 
            private Long callsConnected; 
            private Long callsDialed; 
            private Float connectedRate; 
            private Float occupancyRate; 

            /**
             * AbandonRate.
             */
            public Builder abandonRate(Float abandonRate) {
                this.abandonRate = abandonRate;
                return this;
            }

            /**
             * AbandonedRate.
             */
            public Builder abandonedRate(Float abandonedRate) {
                this.abandonedRate = abandonedRate;
                return this;
            }

            /**
             * AnswerRate.
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * CallsAbandoned.
             */
            public Builder callsAbandoned(Long callsAbandoned) {
                this.callsAbandoned = callsAbandoned;
                return this;
            }

            /**
             * CallsConnected.
             */
            public Builder callsConnected(Long callsConnected) {
                this.callsConnected = callsConnected;
                return this;
            }

            /**
             * CallsDialed.
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * ConnectedRate.
             */
            public Builder connectedRate(Float connectedRate) {
                this.connectedRate = connectedRate;
                return this;
            }

            /**
             * OccupancyRate.
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
