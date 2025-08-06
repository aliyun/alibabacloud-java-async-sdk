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
 * {@link DescribeVodDomainUvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainUvDataResponseBody</p>
 */
public class DescribeVodDomainUvDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("UvDataInterval")
    private UvDataInterval uvDataInterval;

    private DescribeVodDomainUvDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.uvDataInterval = builder.uvDataInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainUvDataResponseBody create() {
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

    /**
     * @return uvDataInterval
     */
    public UvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private UvDataInterval uvDataInterval; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainUvDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.uvDataInterval = model.uvDataInterval;
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

        /**
         * UvDataInterval.
         */
        public Builder uvDataInterval(UvDataInterval uvDataInterval) {
            this.uvDataInterval = uvDataInterval;
            return this;
        }

        public DescribeVodDomainUvDataResponseBody build() {
            return new DescribeVodDomainUvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainUvDataResponseBody</p>
     */
    public static class UvDataIntervalUvDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UvDataIntervalUvDataInterval(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UvDataIntervalUvDataInterval create() {
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

            private Builder(UvDataIntervalUvDataInterval model) {
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

            public UvDataIntervalUvDataInterval build() {
                return new UvDataIntervalUvDataInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainUvDataResponseBody</p>
     */
    public static class UvDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UvDataInterval")
        private java.util.List<UvDataIntervalUvDataInterval> uvDataInterval;

        private UvDataInterval(Builder builder) {
            this.uvDataInterval = builder.uvDataInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UvDataInterval create() {
            return builder().build();
        }

        /**
         * @return uvDataInterval
         */
        public java.util.List<UvDataIntervalUvDataInterval> getUvDataInterval() {
            return this.uvDataInterval;
        }

        public static final class Builder {
            private java.util.List<UvDataIntervalUvDataInterval> uvDataInterval; 

            private Builder() {
            } 

            private Builder(UvDataInterval model) {
                this.uvDataInterval = model.uvDataInterval;
            } 

            /**
             * UvDataInterval.
             */
            public Builder uvDataInterval(java.util.List<UvDataIntervalUvDataInterval> uvDataInterval) {
                this.uvDataInterval = uvDataInterval;
                return this;
            }

            public UvDataInterval build() {
                return new UvDataInterval(this);
            } 

        } 

    }
}
