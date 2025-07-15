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
 * {@link DescribeLiveDomainTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainTrafficDataResponseBody</p>
 */
public class DescribeLiveDomainTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TrafficDataPerInterval")
    private TrafficDataPerInterval trafficDataPerInterval;

    private DescribeLiveDomainTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.trafficDataPerInterval = builder.trafficDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainTrafficDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficDataPerInterval
     */
    public TrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private TrafficDataPerInterval trafficDataPerInterval; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainTrafficDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.trafficDataPerInterval = model.trafficDataPerInterval;
        } 

        /**
         * <p>The time granularity of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T14:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The network traffic data that was collected at each interval.</p>
         */
        public Builder trafficDataPerInterval(TrafficDataPerInterval trafficDataPerInterval) {
            this.trafficDataPerInterval = trafficDataPerInterval;
            return this;
        }

        public DescribeLiveDomainTrafficDataResponseBody build() {
            return new DescribeLiveDomainTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainTrafficDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpTrafficValue")
        private String httpTrafficValue;

        @com.aliyun.core.annotation.NameInMap("HttpsTrafficValue")
        private String httpsTrafficValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TrafficValue")
        private String trafficValue;

        private DataModule(Builder builder) {
            this.httpTrafficValue = builder.httpTrafficValue;
            this.httpsTrafficValue = builder.httpsTrafficValue;
            this.timeStamp = builder.timeStamp;
            this.trafficValue = builder.trafficValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return httpTrafficValue
         */
        public String getHttpTrafficValue() {
            return this.httpTrafficValue;
        }

        /**
         * @return httpsTrafficValue
         */
        public String getHttpsTrafficValue() {
            return this.httpsTrafficValue;
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

        public static final class Builder {
            private String httpTrafficValue; 
            private String httpsTrafficValue; 
            private String timeStamp; 
            private String trafficValue; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.httpTrafficValue = model.httpTrafficValue;
                this.httpsTrafficValue = model.httpsTrafficValue;
                this.timeStamp = model.timeStamp;
                this.trafficValue = model.trafficValue;
            } 

            /**
             * <p>The traffic over HTTP. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpTrafficValue(String httpTrafficValue) {
                this.httpTrafficValue = httpTrafficValue;
                return this;
            }

            /**
             * <p>The traffic over HTTPS. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>454680793</p>
             */
            public Builder httpsTrafficValue(String httpsTrafficValue) {
                this.httpsTrafficValue = httpsTrafficValue;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T15:00:05Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>454680793</p>
             */
            public Builder trafficValue(String trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainTrafficDataResponseBody</p>
     */
    public static class TrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private TrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficDataPerInterval create() {
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

            private Builder(TrafficDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public TrafficDataPerInterval build() {
                return new TrafficDataPerInterval(this);
            } 

        } 

    }
}
