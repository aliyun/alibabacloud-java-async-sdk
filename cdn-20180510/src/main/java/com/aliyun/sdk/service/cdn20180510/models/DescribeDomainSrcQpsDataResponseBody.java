// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSrcQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSrcQpsDataResponseBody</p>
 */
public class DescribeDomainSrcQpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SrcQpsDataPerInterval")
    private SrcQpsDataPerInterval srcQpsDataPerInterval;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainSrcQpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.srcQpsDataPerInterval = builder.srcQpsDataPerInterval;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSrcQpsDataResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcQpsDataPerInterval
     */
    public SrcQpsDataPerInterval getSrcQpsDataPerInterval() {
        return this.srcQpsDataPerInterval;
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
        private String requestId; 
        private SrcQpsDataPerInterval srcQpsDataPerInterval; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SrcQpsDataPerInterval.
         */
        public Builder srcQpsDataPerInterval(SrcQpsDataPerInterval srcQpsDataPerInterval) {
            this.srcQpsDataPerInterval = srcQpsDataPerInterval;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainSrcQpsDataResponseBody build() {
            return new DescribeDomainSrcQpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
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
    public static class SrcQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private SrcQpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcQpsDataPerInterval create() {
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

            public SrcQpsDataPerInterval build() {
                return new SrcQpsDataPerInterval(this);
            } 

        } 

    }
}
