// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRealTimeHttpCodeDataResponseBody</p>
 */
public class DescribeLiveDomainRealTimeHttpCodeDataResponseBody extends TeaModel {
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

    private DescribeLiveDomainRealTimeHttpCodeDataResponseBody(Builder builder) {
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

    public static DescribeLiveDomainRealTimeHttpCodeDataResponseBody create() {
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

        private Builder(DescribeLiveDomainRealTimeHttpCodeDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.realTimeHttpCodeData = model.realTimeHttpCodeData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time interval between the entries returned. Unit: seconds Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-30T05:40:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The proportions of HTTP status codes at each time interval.</p>
         */
        public Builder realTimeHttpCodeData(RealTimeHttpCodeData realTimeHttpCodeData) {
            this.realTimeHttpCodeData = realTimeHttpCodeData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-30T05:33:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBody build() {
            return new DescribeLiveDomainRealTimeHttpCodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRealTimeHttpCodeDataResponseBody</p>
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
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of times the HTTP status code was returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The proportion of the HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>66.046511627907</p>
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
     * {@link DescribeLiveDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRealTimeHttpCodeDataResponseBody</p>
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
     * {@link DescribeLiveDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRealTimeHttpCodeDataResponseBody</p>
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
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-11-30T05:39:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The proportions of HTTP status codes.</p>
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
     * {@link DescribeLiveDomainRealTimeHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRealTimeHttpCodeDataResponseBody</p>
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
