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
 * {@link DescribeLiveDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainBpsDataResponseBody</p>
 */
public class DescribeLiveDomainBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataPerInterval")
    private BpsDataPerInterval bpsDataPerInterval;

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

    private DescribeLiveDomainBpsDataResponseBody(Builder builder) {
        this.bpsDataPerInterval = builder.bpsDataPerInterval;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainBpsDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bpsDataPerInterval
     */
    public BpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
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

    public static final class Builder {
        private BpsDataPerInterval bpsDataPerInterval; 
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainBpsDataResponseBody model) {
            this.bpsDataPerInterval = model.bpsDataPerInterval;
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The bandwidth data returned at each interval.</p>
         */
        public Builder bpsDataPerInterval(BpsDataPerInterval bpsDataPerInterval) {
            this.bpsDataPerInterval = bpsDataPerInterval;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds.</p>
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
         * <p>2017-12-10T09:00:00Z</p>
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
         * <p>2017-12-10T08:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainBpsDataResponseBody build() {
            return new DescribeLiveDomainBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainBpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpsValue")
        private String bpsValue;

        @com.aliyun.core.annotation.NameInMap("HttpBpsValue")
        private String httpBpsValue;

        @com.aliyun.core.annotation.NameInMap("HttpsBpsValue")
        private String httpsBpsValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.bpsValue = builder.bpsValue;
            this.httpBpsValue = builder.httpBpsValue;
            this.httpsBpsValue = builder.httpsBpsValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return bpsValue
         */
        public String getBpsValue() {
            return this.bpsValue;
        }

        /**
         * @return httpBpsValue
         */
        public String getHttpBpsValue() {
            return this.httpBpsValue;
        }

        /**
         * @return httpsBpsValue
         */
        public String getHttpsBpsValue() {
            return this.httpsBpsValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String bpsValue; 
            private String httpBpsValue; 
            private String httpsBpsValue; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.bpsValue = model.bpsValue;
                this.httpBpsValue = model.httpBpsValue;
                this.httpsBpsValue = model.httpsBpsValue;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>11288111</p>
             */
            public Builder bpsValue(String bpsValue) {
                this.bpsValue = bpsValue;
                return this;
            }

            /**
             * <p>The bandwidth over HTTP. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>11286111</p>
             */
            public Builder httpBpsValue(String httpBpsValue) {
                this.httpBpsValue = httpBpsValue;
                return this;
            }

            /**
             * <p>The bandwidth over HTTPS. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder httpsBpsValue(String httpsBpsValue) {
                this.httpsBpsValue = httpsBpsValue;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T08:00:05Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainBpsDataResponseBody</p>
     */
    public static class BpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private BpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataPerInterval create() {
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

            private Builder(BpsDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public BpsDataPerInterval build() {
                return new BpsDataPerInterval(this);
            } 

        } 

    }
}
