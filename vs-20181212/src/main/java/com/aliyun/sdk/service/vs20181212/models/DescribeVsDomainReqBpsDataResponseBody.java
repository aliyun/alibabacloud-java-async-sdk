// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainReqBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainReqBpsDataResponseBody</p>
 */
public class DescribeVsDomainReqBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ReqBpsDataPerInterval")
    private ReqBpsDataPerInterval reqBpsDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVsDomainReqBpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.reqBpsDataPerInterval = builder.reqBpsDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainReqBpsDataResponseBody create() {
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
     * @return reqBpsDataPerInterval
     */
    public ReqBpsDataPerInterval getReqBpsDataPerInterval() {
        return this.reqBpsDataPerInterval;
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
        private ReqBpsDataPerInterval reqBpsDataPerInterval; 
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
         * ReqBpsDataPerInterval.
         */
        public Builder reqBpsDataPerInterval(ReqBpsDataPerInterval reqBpsDataPerInterval) {
            this.reqBpsDataPerInterval = reqBpsDataPerInterval;
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

        public DescribeVsDomainReqBpsDataResponseBody build() {
            return new DescribeVsDomainReqBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReqBpsValue")
        private String reqBpsValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.reqBpsValue = builder.reqBpsValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return reqBpsValue
         */
        public String getReqBpsValue() {
            return this.reqBpsValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String reqBpsValue; 
            private String timeStamp; 

            /**
             * ReqBpsValue.
             */
            public Builder reqBpsValue(String reqBpsValue) {
                this.reqBpsValue = reqBpsValue;
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
    public static class ReqBpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private ReqBpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReqBpsDataPerInterval create() {
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

            public ReqBpsDataPerInterval build() {
                return new ReqBpsDataPerInterval(this);
            } 

        } 

    }
}
