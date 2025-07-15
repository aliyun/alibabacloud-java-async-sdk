// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainBpsDataByLayerResponseBody</p>
 */
public class DescribeLiveDomainBpsDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataInterval")
    private BpsDataInterval bpsDataInterval;

    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainBpsDataByLayerResponseBody(Builder builder) {
        this.bpsDataInterval = builder.bpsDataInterval;
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainBpsDataByLayerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bpsDataInterval
     */
    public BpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BpsDataInterval bpsDataInterval; 
        private String dataInterval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainBpsDataByLayerResponseBody model) {
            this.bpsDataInterval = model.bpsDataInterval;
            this.dataInterval = model.dataInterval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned at each time interval.</p>
         */
        public Builder bpsDataInterval(BpsDataInterval bpsDataInterval) {
            this.bpsDataInterval = bpsDataInterval;
            return this;
        }

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-2A48566EA967</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainBpsDataByLayerResponseBody build() {
            return new DescribeLiveDomainBpsDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainBpsDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TrafficValue")
        private String trafficValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.trafficValue = builder.trafficValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return trafficValue
         */
        public String getTrafficValue() {
            return this.trafficValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private String trafficValue; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.timeStamp = model.timeStamp;
                this.trafficValue = model.trafficValue;
                this.value = model.value;
            } 

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-15T16:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>331</p>
             */
            public Builder trafficValue(String trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            /**
             * <p>The peak bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.56</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainBpsDataByLayerResponseBody</p>
     */
    public static class BpsDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private BpsDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(BpsDataInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public BpsDataInterval build() {
                return new BpsDataInterval(this);
            } 

        } 

    }
}
