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
 * {@link DescribeDomainRealTimeByteHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeByteHitRateDataResponseBody</p>
 */
public class DescribeDomainRealTimeByteHitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainRealTimeByteHitRateDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeByteHitRateDataResponseBody create() {
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

        public DescribeDomainRealTimeByteHitRateDataResponseBody build() {
            return new DescribeDomainRealTimeByteHitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainRealTimeByteHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeByteHitRateDataResponseBody</p>
     */
    public static class ByteHitRateDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteHitRate")
        private Float byteHitRate;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The byte hit ratio. The byte hit ratio is measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8956940476262277</p>
             */
            public Builder byteHitRate(Float byteHitRate) {
                this.byteHitRate = byteHitRate;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-30T05:40:00Z</p>
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
    /**
     * 
     * {@link DescribeDomainRealTimeByteHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeByteHitRateDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteHitRateDataModel")
        private java.util.List<ByteHitRateDataModel> byteHitRateDataModel;

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
        public java.util.List<ByteHitRateDataModel> getByteHitRateDataModel() {
            return this.byteHitRateDataModel;
        }

        public static final class Builder {
            private java.util.List<ByteHitRateDataModel> byteHitRateDataModel; 

            /**
             * ByteHitRateDataModel.
             */
            public Builder byteHitRateDataModel(java.util.List<ByteHitRateDataModel> byteHitRateDataModel) {
                this.byteHitRateDataModel = byteHitRateDataModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
