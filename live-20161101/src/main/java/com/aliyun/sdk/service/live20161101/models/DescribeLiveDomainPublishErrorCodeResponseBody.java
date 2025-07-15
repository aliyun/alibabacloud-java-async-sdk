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
 * {@link DescribeLiveDomainPublishErrorCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainPublishErrorCodeResponseBody</p>
 */
public class DescribeLiveDomainPublishErrorCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RealTimeCodeData")
    private java.util.List<RealTimeCodeData> realTimeCodeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainPublishErrorCodeResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.realTimeCodeData = builder.realTimeCodeData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainPublishErrorCodeResponseBody create() {
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
     * @return realTimeCodeData
     */
    public java.util.List<RealTimeCodeData> getRealTimeCodeData() {
        return this.realTimeCodeData;
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
        private java.util.List<RealTimeCodeData> realTimeCodeData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainPublishErrorCodeResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.realTimeCodeData = model.realTimeCodeData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time granularity of the query. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:10:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The proportions of error codes at each time interval.</p>
         */
        public Builder realTimeCodeData(java.util.List<RealTimeCodeData> realTimeCodeData) {
            this.realTimeCodeData = realTimeCodeData;
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
         * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainPublishErrorCodeResponseBody build() {
            return new DescribeLiveDomainPublishErrorCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainPublishErrorCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainPublishErrorCodeResponseBody</p>
     */
    public static class CodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private String proportion;

        private CodeData(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.proportion = builder.proportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeData create() {
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

            private Builder(CodeData model) {
                this.code = model.code;
                this.count = model.count;
                this.proportion = model.proportion;
            } 

            /**
             * <p>The response code. Valid values:</p>
             * <ul>
             * <li>3: The data read timed out.</li>
             * <li>4: A data write error occurred.</li>
             * <li>6: The data write timed out.</li>
             * <li>200: The request is successful.</li>
             * <li>500: An unknown internal error occurred.</li>
             * <li>501: The stream ingest failed.</li>
             * <li>502: The signaling operation timed out.</li>
             * <li>401: A stream ingest parameter is invalid.</li>
             * <li>403: The stream ingest authentication failed.</li>
             * </ul>
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
             * <p>66.04</p>
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            public CodeData build() {
                return new CodeData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainPublishErrorCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainPublishErrorCodeResponseBody</p>
     */
    public static class RealTimeCodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeData")
        private java.util.List<CodeData> codeData;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private RealTimeCodeData(Builder builder) {
            this.codeData = builder.codeData;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeCodeData create() {
            return builder().build();
        }

        /**
         * @return codeData
         */
        public java.util.List<CodeData> getCodeData() {
            return this.codeData;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private java.util.List<CodeData> codeData; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(RealTimeCodeData model) {
                this.codeData = model.codeData;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The proportions of error codes.</p>
             */
            public Builder codeData(java.util.List<CodeData> codeData) {
                this.codeData = codeData;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T09:01:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public RealTimeCodeData build() {
                return new RealTimeCodeData(this);
            } 

        } 

    }
}
