// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorReportsResponseBody</p>
 */
public class ListDoctorReportsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorReportsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorReportsResponseBody build() {
            return new ListDoctorReportsResponseBody(this);
        } 

    } 

    public static class SummaryReport extends TeaModel {
        @NameInMap("Score")
        private Integer score;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("Summary")
        private String summary;

        private SummaryReport(Builder builder) {
            this.score = builder.score;
            this.suggestion = builder.suggestion;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryReport create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private Integer score; 
            private String suggestion; 
            private String summary; 

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public SummaryReport build() {
                return new SummaryReport(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ComponentTypes")
        private java.util.List < String > componentTypes;

        @NameInMap("DateTime")
        private String dateTime;

        @NameInMap("SummaryReport")
        private SummaryReport summaryReport;

        private Data(Builder builder) {
            this.componentTypes = builder.componentTypes;
            this.dateTime = builder.dateTime;
            this.summaryReport = builder.summaryReport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return componentTypes
         */
        public java.util.List < String > getComponentTypes() {
            return this.componentTypes;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return summaryReport
         */
        public SummaryReport getSummaryReport() {
            return this.summaryReport;
        }

        public static final class Builder {
            private java.util.List < String > componentTypes; 
            private String dateTime; 
            private SummaryReport summaryReport; 

            /**
             * ComponentTypes.
             */
            public Builder componentTypes(java.util.List < String > componentTypes) {
                this.componentTypes = componentTypes;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * SummaryReport.
             */
            public Builder summaryReport(SummaryReport summaryReport) {
                this.summaryReport = summaryReport;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
