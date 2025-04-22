// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainQpsDataResponseBody</p>
 */
public class DescribeVodDomainQpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("QpsDataInterval")
    private QpsDataInterval qpsDataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainQpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.qpsDataInterval = builder.qpsDataInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainQpsDataResponseBody create() {
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
     * @return qpsDataInterval
     */
    public QpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
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
        private QpsDataInterval qpsDataInterval; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainQpsDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.qpsDataInterval = model.qpsDataInterval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

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
         * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-02T15:59:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of QPS records at each interval.</p>
         */
        public Builder qpsDataInterval(QpsDataInterval qpsDataInterval) {
            this.qpsDataInterval = qpsDataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-02T15:50:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodDomainQpsDataResponseBody build() {
            return new DescribeVodDomainQpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainQpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccDomesticValue")
        private String accDomesticValue;

        @com.aliyun.core.annotation.NameInMap("AccOverseasValue")
        private String accOverseasValue;

        @com.aliyun.core.annotation.NameInMap("AccValue")
        private String accValue;

        @com.aliyun.core.annotation.NameInMap("DomesticValue")
        private String domesticValue;

        @com.aliyun.core.annotation.NameInMap("HttpsAccDomesticValue")
        private String httpsAccDomesticValue;

        @com.aliyun.core.annotation.NameInMap("HttpsAccOverseasValue")
        private String httpsAccOverseasValue;

        @com.aliyun.core.annotation.NameInMap("HttpsAccValue")
        private String httpsAccValue;

        @com.aliyun.core.annotation.NameInMap("HttpsDomesticValue")
        private String httpsDomesticValue;

        @com.aliyun.core.annotation.NameInMap("HttpsOverseasValue")
        private String httpsOverseasValue;

        @com.aliyun.core.annotation.NameInMap("HttpsValue")
        private String httpsValue;

        @com.aliyun.core.annotation.NameInMap("OverseasValue")
        private String overseasValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.accDomesticValue = builder.accDomesticValue;
            this.accOverseasValue = builder.accOverseasValue;
            this.accValue = builder.accValue;
            this.domesticValue = builder.domesticValue;
            this.httpsAccDomesticValue = builder.httpsAccDomesticValue;
            this.httpsAccOverseasValue = builder.httpsAccOverseasValue;
            this.httpsAccValue = builder.httpsAccValue;
            this.httpsDomesticValue = builder.httpsDomesticValue;
            this.httpsOverseasValue = builder.httpsOverseasValue;
            this.httpsValue = builder.httpsValue;
            this.overseasValue = builder.overseasValue;
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return accDomesticValue
         */
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        /**
         * @return accOverseasValue
         */
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        /**
         * @return accValue
         */
        public String getAccValue() {
            return this.accValue;
        }

        /**
         * @return domesticValue
         */
        public String getDomesticValue() {
            return this.domesticValue;
        }

        /**
         * @return httpsAccDomesticValue
         */
        public String getHttpsAccDomesticValue() {
            return this.httpsAccDomesticValue;
        }

        /**
         * @return httpsAccOverseasValue
         */
        public String getHttpsAccOverseasValue() {
            return this.httpsAccOverseasValue;
        }

        /**
         * @return httpsAccValue
         */
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        /**
         * @return httpsDomesticValue
         */
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        /**
         * @return httpsOverseasValue
         */
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        /**
         * @return httpsValue
         */
        public String getHttpsValue() {
            return this.httpsValue;
        }

        /**
         * @return overseasValue
         */
        public String getOverseasValue() {
            return this.overseasValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String accDomesticValue; 
            private String accOverseasValue; 
            private String accValue; 
            private String domesticValue; 
            private String httpsAccDomesticValue; 
            private String httpsAccOverseasValue; 
            private String httpsAccValue; 
            private String httpsDomesticValue; 
            private String httpsOverseasValue; 
            private String httpsValue; 
            private String overseasValue; 
            private String timeStamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.accDomesticValue = model.accDomesticValue;
                this.accOverseasValue = model.accOverseasValue;
                this.accValue = model.accValue;
                this.domesticValue = model.domesticValue;
                this.httpsAccDomesticValue = model.httpsAccDomesticValue;
                this.httpsAccOverseasValue = model.httpsAccOverseasValue;
                this.httpsAccValue = model.httpsAccValue;
                this.httpsDomesticValue = model.httpsDomesticValue;
                this.httpsOverseasValue = model.httpsOverseasValue;
                this.httpsValue = model.httpsValue;
                this.overseasValue = model.overseasValue;
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * <p>The number of requests in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accDomesticValue(String accDomesticValue) {
                this.accDomesticValue = accDomesticValue;
                return this;
            }

            /**
             * <p>The number of requests outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accOverseasValue(String accOverseasValue) {
                this.accOverseasValue = accOverseasValue;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accValue(String accValue) {
                this.accValue = accValue;
                return this;
            }

            /**
             * <p>The QPS data in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * <p>The QPS that is calculated based on the HTTPS requests sent to POPs in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsAccDomesticValue(String httpsAccDomesticValue) {
                this.httpsAccDomesticValue = httpsAccDomesticValue;
                return this;
            }

            /**
             * <p>The number of HTTPS requests sent to POPs outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsAccOverseasValue(String httpsAccOverseasValue) {
                this.httpsAccOverseasValue = httpsAccOverseasValue;
                return this;
            }

            /**
             * <p>The number of HTTPS requests sent to POPs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsAccValue(String httpsAccValue) {
                this.httpsAccValue = httpsAccValue;
                return this;
            }

            /**
             * <p>The QPS that is calculated based on the HTTPS requests sent to POPs in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsDomesticValue(String httpsDomesticValue) {
                this.httpsDomesticValue = httpsDomesticValue;
                return this;
            }

            /**
             * <p>The QPS that is calculated based on the HTTPS requests sent to POPs outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsOverseasValue(String httpsOverseasValue) {
                this.httpsOverseasValue = httpsOverseasValue;
                return this;
            }

            /**
             * <p>The QPS that is calculated based on the HTTPS requests sent to points of presence (POPs).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * <p>The QPS data outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-27 10:10:58</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link DescribeVodDomainQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainQpsDataResponseBody</p>
     */
    public static class QpsDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private QpsDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QpsDataInterval create() {
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

            private Builder(QpsDataInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public QpsDataInterval build() {
                return new QpsDataInterval(this);
            } 

        } 

    }
}
