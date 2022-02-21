// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDomainQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDomainQpsDataResponseBody</p>
 */
public class DescribeScdnDomainQpsDataResponseBody extends TeaModel {
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

    private DescribeScdnDomainQpsDataResponseBody(Builder builder) {
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

    public static DescribeScdnDomainQpsDataResponseBody create() {
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

        public DescribeScdnDomainQpsDataResponseBody build() {
            return new DescribeScdnDomainQpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("AccValue")
        private String accValue;

        @NameInMap("HttpAccValue")
        private String httpAccValue;

        @NameInMap("HttpQpsValue")
        private String httpQpsValue;

        @NameInMap("HttpsAccValue")
        private String httpsAccValue;

        @NameInMap("HttpsQpsValue")
        private String httpsQpsValue;

        @NameInMap("QpsValue")
        private String qpsValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.accValue = builder.accValue;
            this.httpAccValue = builder.httpAccValue;
            this.httpQpsValue = builder.httpQpsValue;
            this.httpsAccValue = builder.httpsAccValue;
            this.httpsQpsValue = builder.httpsQpsValue;
            this.qpsValue = builder.qpsValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return accValue
         */
        public String getAccValue() {
            return this.accValue;
        }

        /**
         * @return httpAccValue
         */
        public String getHttpAccValue() {
            return this.httpAccValue;
        }

        /**
         * @return httpQpsValue
         */
        public String getHttpQpsValue() {
            return this.httpQpsValue;
        }

        /**
         * @return httpsAccValue
         */
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        /**
         * @return httpsQpsValue
         */
        public String getHttpsQpsValue() {
            return this.httpsQpsValue;
        }

        /**
         * @return qpsValue
         */
        public String getQpsValue() {
            return this.qpsValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String accValue; 
            private String httpAccValue; 
            private String httpQpsValue; 
            private String httpsAccValue; 
            private String httpsQpsValue; 
            private String qpsValue; 
            private String timeStamp; 

            /**
             * AccValue.
             */
            public Builder accValue(String accValue) {
                this.accValue = accValue;
                return this;
            }

            /**
             * HttpAccValue.
             */
            public Builder httpAccValue(String httpAccValue) {
                this.httpAccValue = httpAccValue;
                return this;
            }

            /**
             * HttpQpsValue.
             */
            public Builder httpQpsValue(String httpQpsValue) {
                this.httpQpsValue = httpQpsValue;
                return this;
            }

            /**
             * HttpsAccValue.
             */
            public Builder httpsAccValue(String httpsAccValue) {
                this.httpsAccValue = httpsAccValue;
                return this;
            }

            /**
             * HttpsQpsValue.
             */
            public Builder httpsQpsValue(String httpsQpsValue) {
                this.httpsQpsValue = httpsQpsValue;
                return this;
            }

            /**
             * QpsValue.
             */
            public Builder qpsValue(String qpsValue) {
                this.qpsValue = qpsValue;
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
