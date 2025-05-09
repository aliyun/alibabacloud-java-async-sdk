// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainRealTimeBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainRealTimeBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainRealTimeBpsDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainRealTimeBpsDataResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainRealTimeBpsDataResponseBody build() {
            return new DescribeDcdnDomainRealTimeBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRealTimeBpsDataResponseBody</p>
     */
    public static class BpsModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private BpsModel(Builder builder) {
            this.bps = builder.bps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsModel create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float bps; 
            private String timeStamp; 

            /**
             * <p>The bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>16710625.733333332</p>
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-02T11:05:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public BpsModel build() {
                return new BpsModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRealTimeBpsDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpsModel")
        private java.util.List < BpsModel> bpsModel;

        private Data(Builder builder) {
            this.bpsModel = builder.bpsModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bpsModel
         */
        public java.util.List < BpsModel> getBpsModel() {
            return this.bpsModel;
        }

        public static final class Builder {
            private java.util.List < BpsModel> bpsModel; 

            /**
             * BpsModel.
             */
            public Builder bpsModel(java.util.List < BpsModel> bpsModel) {
                this.bpsModel = bpsModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
