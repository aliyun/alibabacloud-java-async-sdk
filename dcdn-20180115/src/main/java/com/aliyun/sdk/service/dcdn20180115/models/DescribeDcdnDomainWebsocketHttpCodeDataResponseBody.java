// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
 */
public class DescribeDcdnDomainWebsocketHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("HttpCodeDataPerInterval")
    private HttpCodeDataPerInterval httpCodeDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainWebsocketHttpCodeDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.httpCodeDataPerInterval = builder.httpCodeDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBody create() {
        return builder().build();
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
     * @return httpCodeDataPerInterval
     */
    public HttpCodeDataPerInterval getHttpCodeDataPerInterval() {
        return this.httpCodeDataPerInterval;
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
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private HttpCodeDataPerInterval httpCodeDataPerInterval; 
        private String requestId; 
        private String startTime; 

        /**
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCodeDataPerInterval(HttpCodeDataPerInterval httpCodeDataPerInterval) {
            this.httpCodeDataPerInterval = httpCodeDataPerInterval;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody build() {
            return new DescribeDcdnDomainWebsocketHttpCodeDataResponseBody(this);
        } 

    } 

    public static class HttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Count")
        private Float count;

        @NameInMap("Proportion")
        private Float proportion;

        private HttpCodeDataModule(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.proportion = builder.proportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCodeDataModule create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Float getCount() {
            return this.count;
        }

        /**
         * @return proportion
         */
        public Float getProportion() {
            return this.proportion;
        }

        public static final class Builder {
            private Integer code; 
            private Float count; 
            private Float proportion; 

            /**
             * The HTTP status code returned.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder count(Float count) {
                this.count = count;
                return this;
            }

            /**
             * The proportion of the HTTP status code.
             */
            public Builder proportion(Float proportion) {
                this.proportion = proportion;
                return this;
            }

            public HttpCodeDataModule build() {
                return new HttpCodeDataModule(this);
            } 

        } 

    }
    public static class WebsocketHttpCode extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        private java.util.List < HttpCodeDataModule> httpCodeDataModule;

        private WebsocketHttpCode(Builder builder) {
            this.httpCodeDataModule = builder.httpCodeDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebsocketHttpCode create() {
            return builder().build();
        }

        /**
         * @return httpCodeDataModule
         */
        public java.util.List < HttpCodeDataModule> getHttpCodeDataModule() {
            return this.httpCodeDataModule;
        }

        public static final class Builder {
            private java.util.List < HttpCodeDataModule> httpCodeDataModule; 

            /**
             * HttpCodeDataModule.
             */
            public Builder httpCodeDataModule(java.util.List < HttpCodeDataModule> httpCodeDataModule) {
                this.httpCodeDataModule = httpCodeDataModule;
                return this;
            }

            public WebsocketHttpCode build() {
                return new WebsocketHttpCode(this);
            } 

        } 

    }
    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("WebsocketHttpCode")
        private WebsocketHttpCode websocketHttpCode;

        private DataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.websocketHttpCode = builder.websocketHttpCode;
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
         * @return websocketHttpCode
         */
        public WebsocketHttpCode getWebsocketHttpCode() {
            return this.websocketHttpCode;
        }

        public static final class Builder {
            private String timeStamp; 
            private WebsocketHttpCode websocketHttpCode; 

            /**
             * The timestamp of the returned data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The proportions of the HTTP status codes.
             */
            public Builder websocketHttpCode(WebsocketHttpCode websocketHttpCode) {
                this.websocketHttpCode = websocketHttpCode;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class HttpCodeDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private HttpCodeDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCodeDataPerInterval create() {
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

            public HttpCodeDataPerInterval build() {
                return new HttpCodeDataPerInterval(this);
            } 

        } 

    }
}
