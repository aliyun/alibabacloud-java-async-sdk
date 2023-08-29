// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainHttpCodeDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainHttpCodeDataByLayerResponseBody</p>
 */
public class DescribeDcdnDomainHttpCodeDataByLayerResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("HttpCodeDataInterval")
    private HttpCodeDataInterval httpCodeDataInterval;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainHttpCodeDataByLayerResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.httpCodeDataInterval = builder.httpCodeDataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainHttpCodeDataByLayerResponseBody create() {
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
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The distribution of HTTP status codes at each time interval.
         */
        public Builder httpCodeDataInterval(HttpCodeDataInterval httpCodeDataInterval) {
            this.httpCodeDataInterval = httpCodeDataInterval;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainHttpCodeDataByLayerResponseBody build() {
            return new DescribeDcdnDomainHttpCodeDataByLayerResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TotalValue")
        private String totalValue;

        @NameInMap("Value")
        private java.util.Map < String, ? > value;

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
        public java.util.Map < String, ? > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private String totalValue; 
            private java.util.Map < String, ? > value; 

            /**
             * The timestamp of the returned data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total number of times that HTTP status codes were returned.
             */
            public Builder totalValue(String totalValue) {
                this.totalValue = totalValue;
                return this;
            }

            /**
             * The number of times that the HTTP status code was returned.
             */
            public Builder value(java.util.Map < String, ? > value) {
                this.value = value;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class HttpCodeDataInterval extends TeaModel {
        @NameInMap("DataModule")
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
