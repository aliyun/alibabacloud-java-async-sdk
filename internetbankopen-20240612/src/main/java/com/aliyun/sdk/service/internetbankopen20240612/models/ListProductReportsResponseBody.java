// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.internetbankopen20240612.models;

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
 * {@link ListProductReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductReportsResponseBody</p>
 */
public class ListProductReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProductReportsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProductReportsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query results of the periodic report list, which includes the Reports array. The array is empty if no available reports exist.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identity of the request, which is used for Tracing Analysis and troubleshooting. Provide this identity when troubleshooting exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>9634F2B3-B59C-5475-BA9F-96D95271882C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProductReportsResponseBody build() {
            return new ListProductReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodEnd")
        private String periodEnd;

        @com.aliyun.core.annotation.NameInMap("PeriodStart")
        private String periodStart;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        private Reports(Builder builder) {
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.productCode = builder.productCode;
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return periodEnd
         */
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        /**
         * @return periodStart
         */
        public String getPeriodStart() {
            return this.periodStart;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private String periodEnd; 
            private String periodStart; 
            private String productCode; 
            private String reportId; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.periodEnd = model.periodEnd;
                this.periodStart = model.periodStart;
                this.productCode = model.productCode;
                this.reportId = model.reportId;
            } 

            /**
             * <p>The end time of the natural week to which the report belongs, exclusive. The natural week ends at 00:00:00 on the following Monday in UTC+8 (Asia/Shanghai). This field is transformed to UTC RFC 3339 format and ends with Z. The example corresponds to 00:00:00 on Monday, November 9, 2026, UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-08T16:00:00Z</p>
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * <p>The start time of the natural week to which the report belongs, inclusive. The natural week is calculated based on UTC+8 (Asia/Shanghai) and starts at 00:00:00 on Monday. This field is transformed to UTC RFC 3339 format and ends with Z. The example corresponds to 00:00:00 on Monday, November 2, 2026, UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-01T16:00:00Z</p>
             */
            public Builder periodStart(String periodStart) {
                this.periodStart = periodStart;
                return this;
            }

            /**
             * <p>The product code of the data product to which the report belongs. This is consistent with the ProductCode of the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudsec.demo.v1</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The unique ID of the periodic report. Pass this value as the reportId parameter to GetAiReport to query the current status of the report and obtain the download URL when it is available.</p>
             * 
             * <strong>example:</strong>
             * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductReportsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reports")
        private java.util.List<Reports> reports;

        private Data(Builder builder) {
            this.reports = builder.reports;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return reports
         */
        public java.util.List<Reports> getReports() {
            return this.reports;
        }

        public static final class Builder {
            private java.util.List<Reports> reports; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.reports = model.reports;
            } 

            /**
             * <p>The available report records sorted by period in descending order. By default, up to ten records are returned. If LatestOnly is set to true, at most one record is returned. The array is empty if no reports exist. A single natural week may have multiple report records; use ReportId to distinguish them. The list does not contain download URLs. The actual download status is subject to GetAiReport.</p>
             */
            public Builder reports(java.util.List<Reports> reports) {
                this.reports = reports;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
