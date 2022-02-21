// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDomainHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDomainHttpCodeDataResponseBody</p>
 */
public class DescribeScdnDomainHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DataPerInterval")
    private DataPerInterval dataPerInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeScdnDomainHttpCodeDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.dataPerInterval = builder.dataPerInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnDomainHttpCodeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return dataPerInterval
     */
    public DataPerInterval getDataPerInterval() {
        return this.dataPerInterval;
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
        private String dataInterval; 
        private DataPerInterval dataPerInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DataPerInterval.
         */
        public Builder dataPerInterval(DataPerInterval dataPerInterval) {
            this.dataPerInterval = dataPerInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeScdnDomainHttpCodeDataResponseBody build() {
            return new DescribeScdnDomainHttpCodeDataResponseBody(this);
        } 

    } 

    public static class HttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private String count;

        @NameInMap("Proportion")
        private String proportion;

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
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return proportion
         */
        public String getProportion() {
            return this.proportion;
        }

        public static final class Builder {
            private String code; 
            private String count; 
            private String proportion; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Proportion.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            public HttpCodeDataModule build() {
                return new HttpCodeDataModule(this);
            } 

        } 

    }
    public static class HttpCodeDataPerInterval extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        private java.util.List < HttpCodeDataModule> httpCodeDataModule;

        private HttpCodeDataPerInterval(Builder builder) {
            this.httpCodeDataModule = builder.httpCodeDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCodeDataPerInterval create() {
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

            public HttpCodeDataPerInterval build() {
                return new HttpCodeDataPerInterval(this);
            } 

        } 

    }
    public static class DataModule extends TeaModel {
        @NameInMap("HttpCodeDataPerInterval")
        private HttpCodeDataPerInterval httpCodeDataPerInterval;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.httpCodeDataPerInterval = builder.httpCodeDataPerInterval;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return httpCodeDataPerInterval
         */
        public HttpCodeDataPerInterval getHttpCodeDataPerInterval() {
            return this.httpCodeDataPerInterval;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private HttpCodeDataPerInterval httpCodeDataPerInterval; 
            private String timeStamp; 

            /**
             * HttpCodeDataPerInterval.
             */
            public Builder httpCodeDataPerInterval(HttpCodeDataPerInterval httpCodeDataPerInterval) {
                this.httpCodeDataPerInterval = httpCodeDataPerInterval;
                return this;
            }

            /**
             * TimeStamp.
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
    public static class DataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private DataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPerInterval create() {
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

            public DataPerInterval build() {
                return new DataPerInterval(this);
            } 

        } 

    }
}
