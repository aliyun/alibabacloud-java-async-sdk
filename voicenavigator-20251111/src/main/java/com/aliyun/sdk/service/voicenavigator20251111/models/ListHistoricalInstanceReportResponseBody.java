// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ListHistoricalInstanceReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoricalInstanceReportResponseBody</p>
 */
public class ListHistoricalInstanceReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHistoricalInstanceReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoricalInstanceReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListHistoricalInstanceReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of error parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHistoricalInstanceReportResponseBody build() {
            return new ListHistoricalInstanceReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalInstanceReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsRejected")
        private Long callsRejected;

        @com.aliyun.core.annotation.NameInMap("CallsResolved")
        private Long callsResolved;

        @com.aliyun.core.annotation.NameInMap("ConfiguredConcurrency")
        private Long configuredConcurrency;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LabelBreakdown")
        private String labelBreakdown;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("RejectionBreakdown")
        private String rejectionBreakdown;

        @com.aliyun.core.annotation.NameInMap("ReleaseReasonBreakdown")
        private String releaseReasonBreakdown;

        @com.aliyun.core.annotation.NameInMap("TalkTurnsDistribution")
        private String talkTurnsDistribution;

        @com.aliyun.core.annotation.NameInMap("TotalInputTokens")
        private Long totalInputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalOutputTokens")
        private Long totalOutputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("UsedConcurrency")
        private Long usedConcurrency;

        private List(Builder builder) {
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.callsRejected = builder.callsRejected;
            this.callsResolved = builder.callsResolved;
            this.configuredConcurrency = builder.configuredConcurrency;
            this.instanceId = builder.instanceId;
            this.labelBreakdown = builder.labelBreakdown;
            this.maxTalkTime = builder.maxTalkTime;
            this.rejectionBreakdown = builder.rejectionBreakdown;
            this.releaseReasonBreakdown = builder.releaseReasonBreakdown;
            this.talkTurnsDistribution = builder.talkTurnsDistribution;
            this.totalInputTokens = builder.totalInputTokens;
            this.totalOutputTokens = builder.totalOutputTokens;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalTokens = builder.totalTokens;
            this.usedConcurrency = builder.usedConcurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return callsHandled
         */
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        /**
         * @return callsRejected
         */
        public Long getCallsRejected() {
            return this.callsRejected;
        }

        /**
         * @return callsResolved
         */
        public Long getCallsResolved() {
            return this.callsResolved;
        }

        /**
         * @return configuredConcurrency
         */
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return labelBreakdown
         */
        public String getLabelBreakdown() {
            return this.labelBreakdown;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return rejectionBreakdown
         */
        public String getRejectionBreakdown() {
            return this.rejectionBreakdown;
        }

        /**
         * @return releaseReasonBreakdown
         */
        public String getReleaseReasonBreakdown() {
            return this.releaseReasonBreakdown;
        }

        /**
         * @return talkTurnsDistribution
         */
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
        }

        /**
         * @return totalInputTokens
         */
        public Long getTotalInputTokens() {
            return this.totalInputTokens;
        }

        /**
         * @return totalOutputTokens
         */
        public Long getTotalOutputTokens() {
            return this.totalOutputTokens;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return usedConcurrency
         */
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

        public static final class Builder {
            private Long callsHandled; 
            private Long callsOffered; 
            private Long callsRejected; 
            private Long callsResolved; 
            private Long configuredConcurrency; 
            private String instanceId; 
            private String labelBreakdown; 
            private Long maxTalkTime; 
            private String rejectionBreakdown; 
            private String releaseReasonBreakdown; 
            private String talkTurnsDistribution; 
            private Long totalInputTokens; 
            private Long totalOutputTokens; 
            private Long totalTalkTime; 
            private Long totalTokens; 
            private Long usedConcurrency; 

            private Builder() {
            } 

            private Builder(List model) {
                this.callsHandled = model.callsHandled;
                this.callsOffered = model.callsOffered;
                this.callsRejected = model.callsRejected;
                this.callsResolved = model.callsResolved;
                this.configuredConcurrency = model.configuredConcurrency;
                this.instanceId = model.instanceId;
                this.labelBreakdown = model.labelBreakdown;
                this.maxTalkTime = model.maxTalkTime;
                this.rejectionBreakdown = model.rejectionBreakdown;
                this.releaseReasonBreakdown = model.releaseReasonBreakdown;
                this.talkTurnsDistribution = model.talkTurnsDistribution;
                this.totalInputTokens = model.totalInputTokens;
                this.totalOutputTokens = model.totalOutputTokens;
                this.totalTalkTime = model.totalTalkTime;
                this.totalTokens = model.totalTokens;
                this.usedConcurrency = model.usedConcurrency;
            } 

            /**
             * <p>The number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>The number of offered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * <p>The number of rejected calls.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder callsRejected(Long callsRejected) {
                this.callsRejected = callsRejected;
                return this;
            }

            /**
             * <p>The number of calls classified as resolved by the large language model (LLM).</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder callsResolved(Long callsResolved) {
                this.callsResolved = callsResolved;
                return this;
            }

            /**
             * <p>The most recent concurrency configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder configuredConcurrency(Long configuredConcurrency) {
                this.configuredConcurrency = configuredConcurrency;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>38d5fb05092b469e86b6061ad7945437</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The breakdown of labels.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;label1&quot;:{ 
             *      &quot;label1_sub1&quot;:10,
             *      &quot;label1_sub2&quot;:2
             * }
             * }</p>
             */
            public Builder labelBreakdown(String labelBreakdown) {
                this.labelBreakdown = labelBreakdown;
                return this;
            }

            /**
             * <p>The maximum talk time in milliseconds (ms).</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>The breakdown of rejection reasons.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;ConcurrentLimitExceeded&quot;:3
             * }</p>
             */
            public Builder rejectionBreakdown(String rejectionBreakdown) {
                this.rejectionBreakdown = rejectionBreakdown;
                return this;
            }

            /**
             * <p>A breakdown of release reasons for answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;SilenceTimeout&quot;:1,
             *   &quot;TurnsLimitExceeded&quot;:1,
             *    &quot;Exception&quot;:1,
             *    &quot;Transferred&quot;:1,
             *    &quot;Normal&quot;:1
             * }</p>
             */
            public Builder releaseReasonBreakdown(String releaseReasonBreakdown) {
                this.releaseReasonBreakdown = releaseReasonBreakdown;
                return this;
            }

            /**
             * <p>The distribution of conversation turns.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;1&quot;:2,
             *   &quot;10&quot;:3
             * }</p>
             */
            public Builder talkTurnsDistribution(String talkTurnsDistribution) {
                this.talkTurnsDistribution = talkTurnsDistribution;
                return this;
            }

            /**
             * <p>Reserved for future use.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalInputTokens(Long totalInputTokens) {
                this.totalInputTokens = totalInputTokens;
                return this;
            }

            /**
             * <p>Reserved for future use.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalOutputTokens(Long totalOutputTokens) {
                this.totalOutputTokens = totalOutputTokens;
                return this;
            }

            /**
             * <p>The total talk time in milliseconds (ms).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Reserved for future use.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * <p>The peak number of concurrent calls.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder usedConcurrency(Long usedConcurrency) {
                this.usedConcurrency = usedConcurrency;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalInstanceReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of historical reports for the instances.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
