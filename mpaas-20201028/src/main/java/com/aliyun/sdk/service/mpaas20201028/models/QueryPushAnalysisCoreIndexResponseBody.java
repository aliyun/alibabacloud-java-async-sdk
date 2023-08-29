// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushAnalysisCoreIndexResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushAnalysisCoreIndexResponseBody</p>
 */
public class QueryPushAnalysisCoreIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private ResultContent resultContent;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private QueryPushAnalysisCoreIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushAnalysisCoreIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryPushAnalysisCoreIndexResponseBody build() {
            return new QueryPushAnalysisCoreIndexResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ArrivalNum")
        private Float arrivalNum;

        @NameInMap("ArrivalRate")
        private Float arrivalRate;

        @NameInMap("IgnoreNum")
        private Float ignoreNum;

        @NameInMap("IgnoreRate")
        private Float ignoreRate;

        @NameInMap("OpenNum")
        private Float openNum;

        @NameInMap("OpenRate")
        private Float openRate;

        @NameInMap("PushNum")
        private Float pushNum;

        @NameInMap("PushTotalNum")
        private Float pushTotalNum;

        private Data(Builder builder) {
            this.arrivalNum = builder.arrivalNum;
            this.arrivalRate = builder.arrivalRate;
            this.ignoreNum = builder.ignoreNum;
            this.ignoreRate = builder.ignoreRate;
            this.openNum = builder.openNum;
            this.openRate = builder.openRate;
            this.pushNum = builder.pushNum;
            this.pushTotalNum = builder.pushTotalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return arrivalNum
         */
        public Float getArrivalNum() {
            return this.arrivalNum;
        }

        /**
         * @return arrivalRate
         */
        public Float getArrivalRate() {
            return this.arrivalRate;
        }

        /**
         * @return ignoreNum
         */
        public Float getIgnoreNum() {
            return this.ignoreNum;
        }

        /**
         * @return ignoreRate
         */
        public Float getIgnoreRate() {
            return this.ignoreRate;
        }

        /**
         * @return openNum
         */
        public Float getOpenNum() {
            return this.openNum;
        }

        /**
         * @return openRate
         */
        public Float getOpenRate() {
            return this.openRate;
        }

        /**
         * @return pushNum
         */
        public Float getPushNum() {
            return this.pushNum;
        }

        /**
         * @return pushTotalNum
         */
        public Float getPushTotalNum() {
            return this.pushTotalNum;
        }

        public static final class Builder {
            private Float arrivalNum; 
            private Float arrivalRate; 
            private Float ignoreNum; 
            private Float ignoreRate; 
            private Float openNum; 
            private Float openRate; 
            private Float pushNum; 
            private Float pushTotalNum; 

            /**
             * ArrivalNum.
             */
            public Builder arrivalNum(Float arrivalNum) {
                this.arrivalNum = arrivalNum;
                return this;
            }

            /**
             * ArrivalRate.
             */
            public Builder arrivalRate(Float arrivalRate) {
                this.arrivalRate = arrivalRate;
                return this;
            }

            /**
             * IgnoreNum.
             */
            public Builder ignoreNum(Float ignoreNum) {
                this.ignoreNum = ignoreNum;
                return this;
            }

            /**
             * IgnoreRate.
             */
            public Builder ignoreRate(Float ignoreRate) {
                this.ignoreRate = ignoreRate;
                return this;
            }

            /**
             * OpenNum.
             */
            public Builder openNum(Float openNum) {
                this.openNum = openNum;
                return this;
            }

            /**
             * OpenRate.
             */
            public Builder openRate(Float openRate) {
                this.openRate = openRate;
                return this;
            }

            /**
             * PushNum.
             */
            public Builder pushNum(Float pushNum) {
                this.pushNum = pushNum;
                return this;
            }

            /**
             * PushTotalNum.
             */
            public Builder pushTotalNum(Float pushTotalNum) {
                this.pushTotalNum = pushTotalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @NameInMap("Data")
        private Data data;

        private ResultContent(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        public static final class Builder {
            private Data data; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
