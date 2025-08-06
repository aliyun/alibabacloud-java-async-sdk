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
 * {@link DescribeVodDomainHttpCodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainHttpCodeDataResponseBody</p>
 */
public class DescribeVodDomainHttpCodeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("HttpCodeData")
    private HttpCodeData httpCodeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainHttpCodeDataResponseBody(Builder builder) {
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

    public static DescribeVodDomainHttpCodeDataResponseBody create() {
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

        private Builder() {
        } 

        private Builder(DescribeVodDomainHttpCodeDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.httpCodeData = model.httpCodeData;
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
         * HttpCodeData.
         */
        public Builder httpCodeData(HttpCodeData httpCodeData) {
            this.httpCodeData = httpCodeData;
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

        public DescribeVodDomainHttpCodeDataResponseBody build() {
            return new DescribeVodDomainHttpCodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainHttpCodeDataResponseBody</p>
     */
    public static class CodeProportionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Proportion")
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

            private Builder() {
            } 

            private Builder(CodeProportionData model) {
                this.code = model.code;
                this.count = model.count;
                this.proportion = model.proportion;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Proportion.
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
    /**
     * 
     * {@link DescribeVodDomainHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainHttpCodeDataResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeProportionData")
        private java.util.List<CodeProportionData> codeProportionData;

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
        public java.util.List<CodeProportionData> getCodeProportionData() {
            return this.codeProportionData;
        }

        public static final class Builder {
            private java.util.List<CodeProportionData> codeProportionData; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.codeProportionData = model.codeProportionData;
            } 

            /**
             * CodeProportionData.
             */
            public Builder codeProportionData(java.util.List<CodeProportionData> codeProportionData) {
                this.codeProportionData = codeProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainHttpCodeDataResponseBody</p>
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
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeVodDomainHttpCodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainHttpCodeDataResponseBody</p>
     */
    public static class HttpCodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List<UsageData> usageData;

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
        public java.util.List<UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List<UsageData> usageData; 

            private Builder() {
            } 

            private Builder(HttpCodeData model) {
                this.usageData = model.usageData;
            } 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List<UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public HttpCodeData build() {
                return new HttpCodeData(this);
            } 

        } 

    }
}
