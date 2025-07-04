// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeReqHitRateDataResponseBody</p>
 */
public class DescribeDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDomainRealTimeReqHitRateDataResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>70A26B11-3673-479C-AEA8-E03FC5D3496D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainRealTimeReqHitRateDataResponseBody build() {
            return new DescribeDomainRealTimeReqHitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeReqHitRateDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ReqHitRateDataModel model) {
                this.reqHitRate = model.reqHitRate;
                this.timeStamp = model.timeStamp;
            } 

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
             * <p>2018-01-02T11:26:00Z</p>
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
     * {@link DescribeDomainRealTimeReqHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeReqHitRateDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReqHitRateDataModel")
        private java.util.List<ReqHitRateDataModel> reqHitRateDataModel;

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
        public java.util.List<ReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

        public static final class Builder {
            private java.util.List<ReqHitRateDataModel> reqHitRateDataModel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.reqHitRateDataModel = model.reqHitRateDataModel;
            } 

            /**
             * ReqHitRateDataModel.
             */
            public Builder reqHitRateDataModel(java.util.List<ReqHitRateDataModel> reqHitRateDataModel) {
                this.reqHitRateDataModel = reqHitRateDataModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
