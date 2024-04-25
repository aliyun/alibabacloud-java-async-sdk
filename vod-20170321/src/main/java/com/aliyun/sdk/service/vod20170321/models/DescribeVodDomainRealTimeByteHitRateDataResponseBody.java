// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainRealTimeByteHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealTimeByteHitRateDataResponseBody</p>
 */
public class DescribeVodDomainRealTimeByteHitRateDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainRealTimeByteHitRateDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeByteHitRateDataResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponseBody build() {
            return new DescribeVodDomainRealTimeByteHitRateDataResponseBody(this);
        } 

    } 

    public static class ByteHitRateDataModel extends TeaModel {
        @NameInMap("ByteHitRate")
        private Float byteHitRate;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private ByteHitRateDataModel(Builder builder) {
            this.byteHitRate = builder.byteHitRate;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ByteHitRateDataModel create() {
            return builder().build();
        }

        /**
         * @return byteHitRate
         */
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float byteHitRate; 
            private String timeStamp; 

            /**
             * ByteHitRate.
             */
            public Builder byteHitRate(Float byteHitRate) {
                this.byteHitRate = byteHitRate;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public ByteHitRateDataModel build() {
                return new ByteHitRateDataModel(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ByteHitRateDataModel")
        private java.util.List < ByteHitRateDataModel> byteHitRateDataModel;

        private Data(Builder builder) {
            this.byteHitRateDataModel = builder.byteHitRateDataModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return byteHitRateDataModel
         */
        public java.util.List < ByteHitRateDataModel> getByteHitRateDataModel() {
            return this.byteHitRateDataModel;
        }

        public static final class Builder {
            private java.util.List < ByteHitRateDataModel> byteHitRateDataModel; 

            /**
             * ByteHitRateDataModel.
             */
            public Builder byteHitRateDataModel(java.util.List < ByteHitRateDataModel> byteHitRateDataModel) {
                this.byteHitRateDataModel = byteHitRateDataModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
