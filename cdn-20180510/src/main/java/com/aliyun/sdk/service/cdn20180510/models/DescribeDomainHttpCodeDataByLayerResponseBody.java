// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainHttpCodeDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainHttpCodeDataByLayerResponseBody</p>
 */
public class DescribeDomainHttpCodeDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("HttpCodeDataInterval")
    private HttpCodeDataInterval httpCodeDataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainHttpCodeDataByLayerResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.httpCodeDataInterval = builder.httpCodeDataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainHttpCodeDataByLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return httpCodeDataInterval
     */
    public HttpCodeDataInterval getHttpCodeDataInterval() {
        return this.httpCodeDataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataInterval; 
        private HttpCodeDataInterval httpCodeDataInterval; 
        private String requestId; 

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
         * <p>The statistics of HTTP status codes returned at each time interval.</p>
         */
        public Builder httpCodeDataInterval(HttpCodeDataInterval httpCodeDataInterval) {
            this.httpCodeDataInterval = httpCodeDataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainHttpCodeDataByLayerResponseBody build() {
            return new DescribeDomainHttpCodeDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainHttpCodeDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainHttpCodeDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalValue")
        private String totalValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.totalValue = builder.totalValue;
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
         * @return totalValue
         */
        public String getTotalValue() {
            return this.totalValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private String totalValue; 
            private String value; 

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T20:35:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total number of times that HTTP status codes were returned.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder totalValue(String totalValue) {
                this.totalValue = totalValue;
                return this;
            }

            /**
             * <p>The number of times that the HTTP status code was returned.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;200&quot;: 10, &quot;206&quot;: 100}</p>
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
     * {@link DescribeDomainHttpCodeDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainHttpCodeDataByLayerResponseBody</p>
     */
    public static class HttpCodeDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private HttpCodeDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCodeDataInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public HttpCodeDataInterval build() {
                return new HttpCodeDataInterval(this);
            } 

        } 

    }
}
