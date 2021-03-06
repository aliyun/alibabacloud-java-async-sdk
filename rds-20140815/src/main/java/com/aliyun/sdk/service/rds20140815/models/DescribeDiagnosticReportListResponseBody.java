// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportListResponseBody</p>
 */
public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @NameInMap("ReportList")
    private java.util.List < ReportList> reportList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticReportListResponseBody(Builder builder) {
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
        private java.util.List < ReportList> reportList; 
        private String requestId; 

        /**
         * ReportList.
         */
        public Builder reportList(java.util.List < ReportList> reportList) {
            this.reportList = reportList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DiagnosticTime")
        private String diagnosticTime;

        @NameInMap("DownloadURL")
        private String downloadURL;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("StartTime")
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
             * DiagnosticTime.
             */
            public Builder diagnosticTime(String diagnosticTime) {
                this.diagnosticTime = diagnosticTime;
                return this;
            }

            /**
             * DownloadURL.
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
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
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * StartTime.
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
