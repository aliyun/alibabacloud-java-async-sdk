// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportListResponseBody</p>
 */
public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ReportList")
    private java.util.List<ReportList> reportList;

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
    public java.util.List<ReportList> getReportList() {
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
        private java.util.List<ReportList> reportList; 
        private String requestId; 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The details of a diagnostic report.</p>
         */
        public Builder reportList(java.util.List<ReportList> reportList) {
            this.reportList = reportList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B7E9A79C-DE1B-4398-845F-D654FC0958BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportListResponseBody build() {
            return new DescribeDiagnosticReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportListResponseBody</p>
     */
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
             * <p>The time when the diagnosis was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-17T12:46:09Z</p>
             */
            public Builder diagnosticTime(String diagnosticTime) {
                this.diagnosticTime = diagnosticTime;
                return this;
            }

            /**
             * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsreport-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx">http://rdsreport-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx</a></p>
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
                return this;
            }

            /**
             * <p>The end time of the monitoring data.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-10T15:31:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The diagnostic score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The start time of the monitoring data.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-10T15:30:00Z</p>
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
