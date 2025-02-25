// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainRealTimeReqHitRateDataResponseBody</p>
 */
public class DescribeDcdnDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainRealTimeReqHitRateDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainRealTimeReqHitRateDataResponseBody create() {
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
         * <p>The list of byte hit ratios.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainRealTimeReqHitRateDataResponseBody build() {
            return new DescribeDcdnDomainRealTimeReqHitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRealTimeReqHitRateDataResponseBody</p>
     */
    public static class ReqHitRateDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReqHitRate")
        private Float reqHitRate;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The request hit ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8956940476262277</p>
             */
            public Builder reqHitRate(Float reqHitRate) {
                this.reqHitRate = reqHitRate;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-10-20T04:00:00Z</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRealTimeReqHitRateDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReqHitRateDataModel")
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
