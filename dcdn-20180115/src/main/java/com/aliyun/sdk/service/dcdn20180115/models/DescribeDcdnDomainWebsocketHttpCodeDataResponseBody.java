// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
 */
public class DescribeDcdnDomainWebsocketHttpCodeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("HttpCodeDataPerInterval")
    private HttpCodeDataPerInterval httpCodeDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-01T13:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         */
        public Builder httpCodeDataPerInterval(HttpCodeDataPerInterval httpCodeDataPerInterval) {
            this.httpCodeDataPerInterval = httpCodeDataPerInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91FC2D9D-B042-4634-8A5C-7B8E7482C22D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-01T05:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody build() {
            return new DescribeDcdnDomainWebsocketHttpCodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
     */
    public static class HttpCodeDataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Float count;

        @com.aliyun.core.annotation.NameInMap("Proportion")
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
             * <p>The HTTP status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder count(Float count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The proportion of the HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
     */
    public static class WebsocketHttpCode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpCodeDataModule")
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
    /**
     * 
     * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("WebsocketHttpCode")
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
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-03-01T13:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The proportions of the HTTP status codes.</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainWebsocketHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketHttpCodeDataResponseBody</p>
     */
    public static class HttpCodeDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
