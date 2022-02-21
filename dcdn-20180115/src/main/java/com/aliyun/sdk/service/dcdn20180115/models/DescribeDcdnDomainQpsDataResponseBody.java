// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainQpsDataResponseBody</p>
 */
public class DescribeDcdnDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("QpsDataPerInterval")
    private QpsDataPerInterval qpsDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
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
         * QpsDataPerInterval.
         */
        public Builder qpsDataPerInterval(QpsDataPerInterval qpsDataPerInterval) {
            this.qpsDataPerInterval = qpsDataPerInterval;
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

        public DescribeDcdnDomainQpsDataResponseBody build() {
            return new DescribeDcdnDomainQpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Acc")
        private Float acc;

        @NameInMap("DynamicHttpAcc")
        private Float dynamicHttpAcc;

        @NameInMap("DynamicHttpQps")
        private Float dynamicHttpQps;

        @NameInMap("DynamicHttpsAcc")
        private Float dynamicHttpsAcc;

        @NameInMap("DynamicHttpsQps")
        private Float dynamicHttpsQps;

        @NameInMap("Qps")
        private Float qps;

        @NameInMap("StaticHttpAcc")
        private Float staticHttpAcc;

        @NameInMap("StaticHttpQps")
        private Float staticHttpQps;

        @NameInMap("StaticHttpsAcc")
        private Float staticHttpsAcc;

        @NameInMap("StaticHttpsQps")
        private Float staticHttpsQps;

        @NameInMap("TimeStamp")
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
             * Acc.
             */
            public Builder acc(Float acc) {
                this.acc = acc;
                return this;
            }

            /**
             * DynamicHttpAcc.
             */
            public Builder dynamicHttpAcc(Float dynamicHttpAcc) {
                this.dynamicHttpAcc = dynamicHttpAcc;
                return this;
            }

            /**
             * DynamicHttpQps.
             */
            public Builder dynamicHttpQps(Float dynamicHttpQps) {
                this.dynamicHttpQps = dynamicHttpQps;
                return this;
            }

            /**
             * DynamicHttpsAcc.
             */
            public Builder dynamicHttpsAcc(Float dynamicHttpsAcc) {
                this.dynamicHttpsAcc = dynamicHttpsAcc;
                return this;
            }

            /**
             * DynamicHttpsQps.
             */
            public Builder dynamicHttpsQps(Float dynamicHttpsQps) {
                this.dynamicHttpsQps = dynamicHttpsQps;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            /**
             * StaticHttpAcc.
             */
            public Builder staticHttpAcc(Float staticHttpAcc) {
                this.staticHttpAcc = staticHttpAcc;
                return this;
            }

            /**
             * StaticHttpQps.
             */
            public Builder staticHttpQps(Float staticHttpQps) {
                this.staticHttpQps = staticHttpQps;
                return this;
            }

            /**
             * StaticHttpsAcc.
             */
            public Builder staticHttpsAcc(Float staticHttpsAcc) {
                this.staticHttpsAcc = staticHttpsAcc;
                return this;
            }

            /**
             * StaticHttpsQps.
             */
            public Builder staticHttpsQps(Float staticHttpsQps) {
                this.staticHttpsQps = staticHttpsQps;
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
    public static class QpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
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
