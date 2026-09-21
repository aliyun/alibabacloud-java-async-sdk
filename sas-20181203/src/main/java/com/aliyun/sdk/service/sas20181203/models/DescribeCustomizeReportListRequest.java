// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
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
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.title = request.title;
        } 

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether the report is pinned to the top. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: No.</li>
         * <li><strong>true</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder pinned(Boolean pinned) {
            this.putQueryParameter("Pinned", pinned);
            this.pinned = pinned;
            return this;
        }

        /**
         * <p>The report status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportStatus(Integer reportStatus) {
            this.putQueryParameter("ReportStatus", reportStatus);
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * <p>The report type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Daily report.</li>
         * <li><strong>1</strong>: Weekly report.</li>
         * <li><strong>2</strong>: Monthly report.</li>
         * <li><strong>3</strong>: Custom period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportType(Integer reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The security report version. Valid values:</p>
         * <ul>
         * <li><strong>1.0.0</strong></li>
         * <li><strong>2.0.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder reportVersion(String reportVersion) {
            this.putQueryParameter("ReportVersion", reportVersion);
            this.reportVersion = reportVersion;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource directory folder.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The report name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
