// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDoctorReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorReportsResponseBody</p>
 */
public class ListDoctorReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The reports.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorReportsResponseBody build() {
            return new ListDoctorReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorReportsResponseBody</p>
     */
    public static class SummaryReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Summary")
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
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The optimization suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The summary of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>eastbuy-mse-plugin-auth</p>
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
    /**
     * 
     * {@link ListDoctorReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorReportsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentTypes")
        private java.util.List < String > componentTypes;

        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("SummaryReport")
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
             * <p>The component types.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>compute</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>hive</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>hdfs</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>yarn</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>oss</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>hbase</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder componentTypes(java.util.List < String > componentTypes) {
                this.componentTypes = componentTypes;
                return this;
            }

            /**
             * <p>The date on which the report was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-29</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>The summary of the report.</p>
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
