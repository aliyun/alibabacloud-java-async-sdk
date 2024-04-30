// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportListResponseBody</p>
 */
public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ReportList")
    private java.util.List < ReportList> reportList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticReportListResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.reportList = builder.reportList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportListResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return reportList
     */
    public java.util.List < ReportList> getReportList() {
        return this.reportList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List < ReportList> reportList; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The details of a diagnostic report.
         */
        public Builder reportList(java.util.List < ReportList> reportList) {
            this.reportList = reportList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportListResponseBody build() {
            return new DescribeDiagnosticReportListResponseBody(this);
        } 

    } 

    public static class ReportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiagnosticTime")
        private String diagnosticTime;

        @com.aliyun.core.annotation.NameInMap("DownloadURL")
        private String downloadURL;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private ReportList(Builder builder) {
            this.diagnosticTime = builder.diagnosticTime;
            this.downloadURL = builder.downloadURL;
            this.endTime = builder.endTime;
            this.score = builder.score;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportList create() {
            return builder().build();
        }

        /**
         * @return diagnosticTime
         */
        public String getDiagnosticTime() {
            return this.diagnosticTime;
        }

        /**
         * @return downloadURL
         */
        public String getDownloadURL() {
            return this.downloadURL;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String diagnosticTime; 
            private String downloadURL; 
            private String endTime; 
            private Integer score; 
            private String startTime; 

            /**
             * The time when the diagnosis was performed.
             */
            public Builder diagnosticTime(String diagnosticTime) {
                this.diagnosticTime = diagnosticTime;
                return this;
            }

            /**
             * The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
                return this;
            }

            /**
             * The end time of the monitoring data.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The diagnostic score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The start time of the monitoring data.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ReportList build() {
                return new ReportList(this);
            } 

        } 

    }
}
