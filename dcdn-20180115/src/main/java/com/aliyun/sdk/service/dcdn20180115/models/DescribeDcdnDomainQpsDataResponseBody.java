// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainQpsDataResponseBody</p>
 */
public class DescribeDcdnDomainQpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("QpsDataPerInterval")
    private QpsDataPerInterval qpsDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainQpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.qpsDataPerInterval = builder.qpsDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainQpsDataResponseBody create() {
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
     * @return qpsDataPerInterval
     */
    public QpsDataPerInterval getQpsDataPerInterval() {
        return this.qpsDataPerInterval;
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
        private QpsDataPerInterval qpsDataPerInterval; 
        private String requestId; 
        private String startTime; 

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
         * <p>2017-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The QPS returned at each time interval.</p>
         */
        public Builder qpsDataPerInterval(QpsDataPerInterval qpsDataPerInterval) {
            this.qpsDataPerInterval = qpsDataPerInterval;
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

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainQpsDataResponseBody build() {
            return new DescribeDcdnDomainQpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainQpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Float acc;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpAcc")
        private Float dynamicHttpAcc;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpQps")
        private Float dynamicHttpQps;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpsAcc")
        private Float dynamicHttpsAcc;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpsQps")
        private Float dynamicHttpsQps;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Float qps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpAcc")
        private Float staticHttpAcc;

        @com.aliyun.core.annotation.NameInMap("StaticHttpQps")
        private Float staticHttpQps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpsAcc")
        private Float staticHttpsAcc;

        @com.aliyun.core.annotation.NameInMap("StaticHttpsQps")
        private Float staticHttpsQps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.acc = builder.acc;
            this.dynamicHttpAcc = builder.dynamicHttpAcc;
            this.dynamicHttpQps = builder.dynamicHttpQps;
            this.dynamicHttpsAcc = builder.dynamicHttpsAcc;
            this.dynamicHttpsQps = builder.dynamicHttpsQps;
            this.qps = builder.qps;
            this.staticHttpAcc = builder.staticHttpAcc;
            this.staticHttpQps = builder.staticHttpQps;
            this.staticHttpsAcc = builder.staticHttpsAcc;
            this.staticHttpsQps = builder.staticHttpsQps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Float getAcc() {
            return this.acc;
        }

        /**
         * @return dynamicHttpAcc
         */
        public Float getDynamicHttpAcc() {
            return this.dynamicHttpAcc;
        }

        /**
         * @return dynamicHttpQps
         */
        public Float getDynamicHttpQps() {
            return this.dynamicHttpQps;
        }

        /**
         * @return dynamicHttpsAcc
         */
        public Float getDynamicHttpsAcc() {
            return this.dynamicHttpsAcc;
        }

        /**
         * @return dynamicHttpsQps
         */
        public Float getDynamicHttpsQps() {
            return this.dynamicHttpsQps;
        }

        /**
         * @return qps
         */
        public Float getQps() {
            return this.qps;
        }

        /**
         * @return staticHttpAcc
         */
        public Float getStaticHttpAcc() {
            return this.staticHttpAcc;
        }

        /**
         * @return staticHttpQps
         */
        public Float getStaticHttpQps() {
            return this.staticHttpQps;
        }

        /**
         * @return staticHttpsAcc
         */
        public Float getStaticHttpsAcc() {
            return this.staticHttpsAcc;
        }

        /**
         * @return staticHttpsQps
         */
        public Float getStaticHttpsQps() {
            return this.staticHttpsQps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float acc; 
            private Float dynamicHttpAcc; 
            private Float dynamicHttpQps; 
            private Float dynamicHttpsAcc; 
            private Float dynamicHttpsQps; 
            private Float qps; 
            private Float staticHttpAcc; 
            private Float staticHttpQps; 
            private Float staticHttpsAcc; 
            private Float staticHttpsQps; 
            private String timeStamp; 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder acc(Float acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The number of requests for dynamic content delivery over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dynamicHttpAcc(Float dynamicHttpAcc) {
                this.dynamicHttpAcc = dynamicHttpAcc;
                return this;
            }

            /**
             * <p>The QPS for dynamic content delivery over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dynamicHttpQps(Float dynamicHttpQps) {
                this.dynamicHttpQps = dynamicHttpQps;
                return this;
            }

            /**
             * <p>The number of requests for dynamic content delivery over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dynamicHttpsAcc(Float dynamicHttpsAcc) {
                this.dynamicHttpsAcc = dynamicHttpsAcc;
                return this;
            }

            /**
             * <p>The QPS for dynamic content delivery over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dynamicHttpsQps(Float dynamicHttpsQps) {
                this.dynamicHttpsQps = dynamicHttpsQps;
                return this;
            }

            /**
             * <p>The total QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0.56</p>
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The number of requests for static content delivery over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staticHttpAcc(Float staticHttpAcc) {
                this.staticHttpAcc = staticHttpAcc;
                return this;
            }

            /**
             * <p>The QPS for static content delivery over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staticHttpQps(Float staticHttpQps) {
                this.staticHttpQps = staticHttpQps;
                return this;
            }

            /**
             * <p>The number of requests for static content delivery over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staticHttpsAcc(Float staticHttpsAcc) {
                this.staticHttpsAcc = staticHttpsAcc;
                return this;
            }

            /**
             * <p>The QPS for static content delivery over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staticHttpsQps(Float staticHttpsQps) {
                this.staticHttpsQps = staticHttpsQps;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T21:00:00Z</p>
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
     * {@link DescribeDcdnDomainQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainQpsDataResponseBody</p>
     */
    public static class QpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private QpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QpsDataPerInterval create() {
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

            public QpsDataPerInterval build() {
                return new QpsDataPerInterval(this);
            } 

        } 

    }
}
