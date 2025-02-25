// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDomainReqTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainReqTrafficDataResponseBody</p>
 */
public class DescribeVsDomainReqTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ReqTrafficDataPerInterval")
    private ReqTrafficDataPerInterval reqTrafficDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVsDomainReqTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.reqTrafficDataPerInterval = builder.reqTrafficDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainReqTrafficDataResponseBody create() {
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
     * @return reqTrafficDataPerInterval
     */
    public ReqTrafficDataPerInterval getReqTrafficDataPerInterval() {
        return this.reqTrafficDataPerInterval;
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
        private ReqTrafficDataPerInterval reqTrafficDataPerInterval; 
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
         * ReqTrafficDataPerInterval.
         */
        public Builder reqTrafficDataPerInterval(ReqTrafficDataPerInterval reqTrafficDataPerInterval) {
            this.reqTrafficDataPerInterval = reqTrafficDataPerInterval;
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

        public DescribeVsDomainReqTrafficDataResponseBody build() {
            return new DescribeVsDomainReqTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDomainReqTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainReqTrafficDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReqTrafficValue")
        private String reqTrafficValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.reqTrafficValue = builder.reqTrafficValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return reqTrafficValue
         */
        public String getReqTrafficValue() {
            return this.reqTrafficValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String reqTrafficValue; 
            private String timeStamp; 

            /**
             * ReqTrafficValue.
             */
            public Builder reqTrafficValue(String reqTrafficValue) {
                this.reqTrafficValue = reqTrafficValue;
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
    /**
     * 
     * {@link DescribeVsDomainReqTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainReqTrafficDataResponseBody</p>
     */
    public static class ReqTrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private ReqTrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReqTrafficDataPerInterval create() {
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

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public ReqTrafficDataPerInterval build() {
                return new ReqTrafficDataPerInterval(this);
            } 

        } 

    }
}
