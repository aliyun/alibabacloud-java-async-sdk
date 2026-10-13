// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListFaultReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFaultReportsResponseBody</p>
 */
public class ListFaultReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFaultReportsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.nextToken = builder.nextToken;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaultReportsResponseBody create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reports
     */
    public java.util.List<Reports> getReports() {
        return this.reports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String nextToken; 
        private java.util.List<Reports> reports; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFaultReportsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.nextToken = model.nextToken;
            this.reports = model.reports;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The fault report details.</p>
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFaultReportsResponseBody build() {
            return new ListFaultReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFaultReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFaultReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiagnosisType")
        private String diagnosisType;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Reports(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.diagnosisType = builder.diagnosisType;
            this.finishTime = builder.finishTime;
            this.nodeId = builder.nodeId;
            this.reportId = builder.reportId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diagnosisType
         */
        public String getDiagnosisType() {
            return this.diagnosisType;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String diagnosisType; 
            private String finishTime; 
            private String nodeId; 
            private String reportId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.diagnosisType = model.diagnosisType;
                this.finishTime = model.finishTime;
                this.nodeId = model.nodeId;
                this.reportId = model.reportId;
                this.status = model.status;
            } 

            /**
             * <p>The time when the fault report was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07 17:41:33</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the fault report.</p>
             * 
             * <strong>example:</strong>
             * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The diagnosis type.</p>
             * 
             * <strong>example:</strong>
             * <p>QUICK</p>
             */
            public Builder diagnosisType(String diagnosisType) {
                this.diagnosisType = diagnosisType;
                return this;
            }

            /**
             * <p>The time when the fault report was resolved. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07 17:41:33</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-3A244BE3</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The fault report ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100184932123</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The status of the fault report.</p>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
