// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeInstanceDiagnosisResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDiagnosisResultResponseBody</p>
 */
public class DescribeInstanceDiagnosisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeInstanceDiagnosisResultResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDiagnosisResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeInstanceDiagnosisResultResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>AccessDeniedDetail</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceDiagnosisResultResponseBody build() {
            return new DescribeInstanceDiagnosisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceDiagnosisResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceDiagnosisResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BestPractice")
        private String bestPractice;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("EvaluationTime")
        private Long evaluationTime;

        @com.aliyun.core.annotation.NameInMap("FullScore")
        private Double fullScore;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ReportDate")
        private String reportDate;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Data(Builder builder) {
            this.bestPractice = builder.bestPractice;
            this.description = builder.description;
            this.dimension = builder.dimension;
            this.evaluationTime = builder.evaluationTime;
            this.fullScore = builder.fullScore;
            this.instanceId = builder.instanceId;
            this.introduction = builder.introduction;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.reportDate = builder.reportDate;
            this.score = builder.score;
            this.status = builder.status;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bestPractice
         */
        public String getBestPractice() {
            return this.bestPractice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return evaluationTime
         */
        public Long getEvaluationTime() {
            return this.evaluationTime;
        }

        /**
         * @return fullScore
         */
        public Double getFullScore() {
            return this.fullScore;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return reportDate
         */
        public String getReportDate() {
            return this.reportDate;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String bestPractice; 
            private String description; 
            private String dimension; 
            private Long evaluationTime; 
            private Double fullScore; 
            private String instanceId; 
            private String introduction; 
            private String itemId; 
            private String itemName; 
            private String reportDate; 
            private Double score; 
            private String status; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bestPractice = model.bestPractice;
                this.description = model.description;
                this.dimension = model.dimension;
                this.evaluationTime = model.evaluationTime;
                this.fullScore = model.fullScore;
                this.instanceId = model.instanceId;
                this.introduction = model.introduction;
                this.itemId = model.itemId;
                this.itemName = model.itemName;
                this.reportDate = model.reportDate;
                this.score = model.score;
                this.status = model.status;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The best practices.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder bestPractice(String bestPractice) {
                this.bestPractice = bestPractice;
                return this;
            }

            /**
             * <p>The diagnosis item description.</p>
             * 
             * <strong>example:</strong>
             * <p>Unreasonable partitioning and bucketing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The evaluation dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>table_analysis</p>
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The evaluation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-08T02:12:32Z</p>
             */
            public Builder evaluationTime(Long evaluationTime) {
                this.evaluationTime = evaluationTime;
                return this;
            }

            /**
             * <p>The full score of the evaluation item.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder fullScore(Double fullScore) {
                this.fullScore = fullScore;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-b25e21e243889XXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The evaluation item introduction.</p>
             * 
             * <strong>example:</strong>
             * <p>for autotest</p>
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * <p>The evaluation item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>02cf887a</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The evaluation item name.</p>
             * 
             * <strong>example:</strong>
             * <p>Unreasonable partitioning and bucketing</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The report date in the YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-08</p>
             */
            public Builder reportDate(String reportDate) {
                this.reportDate = reportDate;
                return this;
            }

            /**
             * <p>The diagnosis score.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The status list. Valid values:</p>
             * <ul>
             * <li><p>healthy</p>
             * </li>
             * <li><p>info</p>
             * </li>
             * <li><p>medium</p>
             * </li>
             * <li><p>critical</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The diagnosis suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>No bucket exceeds 5 GB in size. The evaluation result is healthy</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
