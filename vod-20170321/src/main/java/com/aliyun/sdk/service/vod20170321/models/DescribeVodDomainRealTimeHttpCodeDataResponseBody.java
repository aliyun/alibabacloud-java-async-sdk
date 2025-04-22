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
 * {@link DescribeVodDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealTimeHttpCodeDataResponseBody</p>
 */
public class DescribeVodDomainRealTimeHttpCodeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RealTimeHttpCodeData")
    private RealTimeHttpCodeData realTimeHttpCodeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainRealTimeHttpCodeDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.realTimeHttpCodeData = builder.realTimeHttpCodeData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeHttpCodeDataResponseBody create() {
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
     * @return realTimeHttpCodeData
     */
    public RealTimeHttpCodeData getRealTimeHttpCodeData() {
        return this.realTimeHttpCodeData;
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
        private RealTimeHttpCodeData realTimeHttpCodeData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainRealTimeHttpCodeDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.realTimeHttpCodeData = model.realTimeHttpCodeData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time interval at which data is returned. Unit: seconds.</p>
         * <p>The returned value varies based on the time range per query. Valid values: 60 (1 minute), 300 (5 minutes), and 3600 (1 hour). For more information, see the <strong>Time granularity</strong> section in the <strong>API documentation</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
         * <p>The end of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:40:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The proportion of each HTTP status code in each time interval.</p>
         */
        public Builder realTimeHttpCodeData(RealTimeHttpCodeData realTimeHttpCodeData) {
            this.realTimeHttpCodeData = realTimeHttpCodeData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:39:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodDomainRealTimeHttpCodeDataResponseBody build() {
            return new DescribeVodDomainRealTimeHttpCodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeHttpCodeDataResponseBody</p>
     */
    public static class RealTimeCodeProportionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private String proportion;

        private RealTimeCodeProportionData(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.proportion = builder.proportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeCodeProportionData create() {
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

            private Builder() {
            } 

            private Builder(RealTimeCodeProportionData model) {
                this.code = model.code;
                this.count = model.count;
                this.proportion = model.proportion;
            } 

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of the HTTP status codes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The proportion of the HTTP status code in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>28.4496124031008</p>
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            public RealTimeCodeProportionData build() {
                return new RealTimeCodeProportionData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeHttpCodeDataResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealTimeCodeProportionData")
        private java.util.List<RealTimeCodeProportionData> realTimeCodeProportionData;

        private Value(Builder builder) {
            this.realTimeCodeProportionData = builder.realTimeCodeProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return realTimeCodeProportionData
         */
        public java.util.List<RealTimeCodeProportionData> getRealTimeCodeProportionData() {
            return this.realTimeCodeProportionData;
        }

        public static final class Builder {
            private java.util.List<RealTimeCodeProportionData> realTimeCodeProportionData; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.realTimeCodeProportionData = model.realTimeCodeProportionData;
            } 

            /**
             * RealTimeCodeProportionData.
             */
            public Builder realTimeCodeProportionData(java.util.List<RealTimeCodeProportionData> realTimeCodeProportionData) {
                this.realTimeCodeProportionData = realTimeCodeProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeHttpCodeDataResponseBody</p>
     */
    public static class UsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Value value;

        private UsageData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
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
        public Value getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private Value value; 

            private Builder() {
            } 

            private Builder(UsageData model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-30T05:39:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The proportion of each HTTP status code is displayed in a data list.</p>
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainRealTimeHttpCodeDataResponseBody</p>
     */
    public static class RealTimeHttpCodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List<UsageData> usageData;

        private RealTimeHttpCodeData(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeHttpCodeData create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List<UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List<UsageData> usageData; 

            private Builder() {
            } 

            private Builder(RealTimeHttpCodeData model) {
                this.usageData = model.usageData;
            } 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List<UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public RealTimeHttpCodeData build() {
                return new RealTimeHttpCodeData(this);
            } 

        } 

    }
}
