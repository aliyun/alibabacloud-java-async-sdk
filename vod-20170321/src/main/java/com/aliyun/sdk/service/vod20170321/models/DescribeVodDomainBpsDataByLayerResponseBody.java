// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainBpsDataByLayerResponseBody</p>
 */
public class DescribeVodDomainBpsDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataInterval")
    private BpsDataInterval bpsDataInterval;

    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private Integer dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainBpsDataByLayerResponseBody(Builder builder) {
        this.bpsDataInterval = builder.bpsDataInterval;
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainBpsDataByLayerResponseBody create() {
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
    public Integer getDataInterval() {
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
        private Integer dataInterval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainBpsDataByLayerResponseBody model) {
            this.bpsDataInterval = model.bpsDataInterval;
            this.dataInterval = model.dataInterval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The bandwidth returned at each time interval. Unit: bit/s.</p>
         */
        public Builder bpsDataInterval(BpsDataInterval bpsDataInterval) {
            this.bpsDataInterval = bpsDataInterval;
            return this;
        }

        /**
         * <p>The time interval between the entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(Integer dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainBpsDataByLayerResponseBody build() {
            return new DescribeVodDomainBpsDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainBpsDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TrafficValue")
        private Long trafficValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

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
        public Long getTrafficValue() {
            return this.trafficValue;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private Long trafficValue; 
            private Double value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.timeStamp = model.timeStamp;
                this.trafficValue = model.trafficValue;
                this.value = model.value;
            } 

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-08T10:09:19Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder trafficValue(Long trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            /**
             * <p>The peak bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>75.33</p>
             */
            public Builder value(Double value) {
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
     * {@link DescribeVodDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainBpsDataByLayerResponseBody</p>
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
