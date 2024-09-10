// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeReportListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomizeReportListRequest</p>
 */
public class DescribeCustomizeReportListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pinned")
    private Boolean pinned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    private Integer reportStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private Integer reportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportVersion")
    private String reportVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private DescribeCustomizeReportListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.pinned = builder.pinned;
        this.reportStatus = builder.reportStatus;
        this.reportType = builder.reportType;
        this.reportVersion = builder.reportVersion;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeReportListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pinned
     */
    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * @return reportStatus
     */
    public Integer getReportStatus() {
        return this.reportStatus;
    }

    /**
     * @return reportType
     */
    public Integer getReportType() {
        return this.reportType;
    }

    /**
     * @return reportVersion
     */
    public String getReportVersion() {
        return this.reportVersion;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<DescribeCustomizeReportListRequest, Builder> {
        private String lang; 
        private Boolean pinned; 
        private Integer reportStatus; 
        private Integer reportType; 
        private String reportVersion; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomizeReportListRequest request) {
            super(request);
            this.lang = request.lang;
            this.pinned = request.pinned;
            this.reportStatus = request.reportStatus;
            this.reportType = request.reportType;
            this.reportVersion = request.reportVersion;
            this.title = request.title;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to pin the report. Valid values:
         * <p>
         * 
         * *   **false**
         * *   **true**
         */
        public Builder pinned(Boolean pinned) {
            this.putQueryParameter("Pinned", pinned);
            this.pinned = pinned;
            return this;
        }

        /**
         * The state of the report. Valid values:
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: enabled
         */
        public Builder reportStatus(Integer reportStatus) {
            this.putQueryParameter("ReportStatus", reportStatus);
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * The type of the report. Valid values:
         * <p>
         * 
         * *   **0**: daily report
         * *   **1**: weekly report
         * *   **2**: monthly report
         * *   **3**: report whose statistics are collected in a custom time range
         */
        public Builder reportType(Integer reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * The report version. Valid values:
         * <p>
         * 
         * *   **1.0.0**
         * *   **2.0.0**
         */
        public Builder reportVersion(String reportVersion) {
            this.putQueryParameter("ReportVersion", reportVersion);
            this.reportVersion = reportVersion;
            return this;
        }

        /**
         * The name of the report.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public DescribeCustomizeReportListRequest build() {
            return new DescribeCustomizeReportListRequest(this);
        } 

    } 

}
