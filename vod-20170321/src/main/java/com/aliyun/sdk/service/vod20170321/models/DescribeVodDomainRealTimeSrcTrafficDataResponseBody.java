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
 * {@link DescribeVodDomainRealTimeSrcTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealTimeSrcTrafficDataResponseBody</p>
 */
public class DescribeVodDomainRealTimeSrcTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RealTimeSrcTrafficDataPerInterval")
    private RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainRealTimeSrcTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.realTimeSrcTrafficDataPerInterval = builder.realTimeSrcTrafficDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeSrcTrafficDataResponseBody create() {
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
     * @return realTimeSrcTrafficDataPerInterval
     */
    public RealTimeSrcTrafficDataPerInterval getRealTimeSrcTrafficDataPerInterval() {
        return this.realTimeSrcTrafficDataPerInterval;
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
        private RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainRealTimeSrcTrafficDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.realTimeSrcTrafficDataPerInterval = model.realTimeSrcTrafficDataPerInterval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

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
         * RealTimeSrcTrafficDataPerInterval.
         */
        public Builder realTimeSrcTrafficDataPerInterval(RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval) {
            this.realTimeSrcTrafficDataPerInterval = realTimeSrcTrafficDataPerInterval;
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

        public DescribeVodDomainRealTimeSrcTrafficDataResponseBody build() {
            return new DescribeVodDomainRealTimeSrcTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainRealTimeSrcTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeSrcTrafficDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
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
            private String timeStamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeVodDomainRealTimeSrcTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeSrcTrafficDataResponseBody</p>
     */
    public static class RealTimeSrcTrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private RealTimeSrcTrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeSrcTrafficDataPerInterval create() {
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

            private Builder(RealTimeSrcTrafficDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public RealTimeSrcTrafficDataPerInterval build() {
                return new RealTimeSrcTrafficDataPerInterval(this);
            } 

        } 

    }
}
