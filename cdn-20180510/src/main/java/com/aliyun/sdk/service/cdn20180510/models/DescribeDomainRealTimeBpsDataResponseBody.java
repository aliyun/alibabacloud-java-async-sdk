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
 * {@link DescribeDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeBpsDataResponseBody</p>
 */
public class DescribeDomainRealTimeBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainRealTimeBpsDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeBpsDataResponseBody create() {
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

        private Builder(DescribeDomainRealTimeBpsDataResponseBody model) {
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
         * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainRealTimeBpsDataResponseBody build() {
            return new DescribeDomainRealTimeBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeBpsDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BpsModel model) {
                this.bps = model.bps;
                this.timeStamp = model.timeStamp;
            } 

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
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-30T05:41:00Z</p>
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
     * {@link DescribeDomainRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainRealTimeBpsDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpsModel")
        private java.util.List<BpsModel> bpsModel;

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
        public java.util.List<BpsModel> getBpsModel() {
            return this.bpsModel;
        }

        public static final class Builder {
            private java.util.List<BpsModel> bpsModel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bpsModel = model.bpsModel;
            } 

            /**
             * BpsModel.
             */
            public Builder bpsModel(java.util.List<BpsModel> bpsModel) {
                this.bpsModel = bpsModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
