// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSrcHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSrcHttpCodeDataResponseBody</p>
 */
public class DescribeDomainSrcHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("HttpCodeData")
    private HttpCodeData httpCodeData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainSrcHttpCodeDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.httpCodeData = builder.httpCodeData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSrcHttpCodeDataResponseBody create() {
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
     * @return httpCodeData
     */
    public HttpCodeData getHttpCodeData() {
        return this.httpCodeData;
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
        private HttpCodeData httpCodeData; 
        private String requestId; 
        private String startTime; 

        /**
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The proportions of HTTP status codes at each time interval.
         */
        public Builder httpCodeData(HttpCodeData httpCodeData) {
            this.httpCodeData = httpCodeData;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainSrcHttpCodeDataResponseBody build() {
            return new DescribeDomainSrcHttpCodeDataResponseBody(this);
        } 

    } 

    public static class CodeProportionData extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private String count;

        @NameInMap("Proportion")
        private String proportion;

        private CodeProportionData(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.proportion = builder.proportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeProportionData create() {
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

            /**
             * The HTTP status code returned.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The total number of entries.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The proportion of the HTTP status code.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            public CodeProportionData build() {
                return new CodeProportionData(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @NameInMap("CodeProportionData")
        private java.util.List < CodeProportionData> codeProportionData;

        private Value(Builder builder) {
            this.codeProportionData = builder.codeProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return codeProportionData
         */
        public java.util.List < CodeProportionData> getCodeProportionData() {
            return this.codeProportionData;
        }

        public static final class Builder {
            private java.util.List < CodeProportionData> codeProportionData; 

            /**
             * CodeProportionData.
             */
            public Builder codeProportionData(java.util.List < CodeProportionData> codeProportionData) {
                this.codeProportionData = codeProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class UsageData extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
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

            /**
             * The timestamp of the returned data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The proportions of the HTTP status codes.
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
    public static class HttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        private java.util.List < UsageData> usageData;

        private HttpCodeData(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCodeData create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List < UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List < UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List < UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public HttpCodeData build() {
                return new HttpCodeData(this);
            } 

        } 

    }
}
