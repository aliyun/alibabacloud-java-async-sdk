// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeReqHitRateDataResponseBody</p>
 */
public class DescribeDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainRealTimeReqHitRateDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeReqHitRateDataResponseBody create() {
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainRealTimeReqHitRateDataResponseBody build() {
            return new DescribeDomainRealTimeReqHitRateDataResponseBody(this);
        } 

    } 

    public static class ReqHitRateDataModel extends TeaModel {
        @NameInMap("ReqHitRate")
        private Float reqHitRate;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private ReqHitRateDataModel(Builder builder) {
            this.reqHitRate = builder.reqHitRate;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReqHitRateDataModel create() {
            return builder().build();
        }

        /**
         * @return reqHitRate
         */
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float reqHitRate; 
            private String timeStamp; 

            /**
             * The request hit ratio.
             */
            public Builder reqHitRate(Float reqHitRate) {
                this.reqHitRate = reqHitRate;
                return this;
            }

            /**
             * The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public ReqHitRateDataModel build() {
                return new ReqHitRateDataModel(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        private java.util.List < ReqHitRateDataModel> reqHitRateDataModel;

        private Data(Builder builder) {
            this.reqHitRateDataModel = builder.reqHitRateDataModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return reqHitRateDataModel
         */
        public java.util.List < ReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

        public static final class Builder {
            private java.util.List < ReqHitRateDataModel> reqHitRateDataModel; 

            /**
             * ReqHitRateDataModel.
             */
            public Builder reqHitRateDataModel(java.util.List < ReqHitRateDataModel> reqHitRateDataModel) {
                this.reqHitRateDataModel = reqHitRateDataModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
