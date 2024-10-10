// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeChartListRequest} extends {@link RequestModel}
 *
 * <p>DescribeChartListRequest</p>
 */
public class DescribeChartListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private DescribeChartListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.projectCode = builder.projectCode;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChartListRequest create() {
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
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<DescribeChartListRequest, Builder> {
        private String lang; 
        private String projectCode; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChartListRequest request) {
            super(request);
            this.lang = request.lang;
            this.projectCode = request.projectCode;
            this.reportId = request.reportId;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The code of the report. Valid value:</p>
         * <ul>
         * <li><strong>customize_report</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customize_report</p>
         */
        public Builder projectCode(String projectCode) {
            this.putQueryParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * <p>The ID of the report.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>720549</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeChartListRequest build() {
            return new DescribeChartListRequest(this);
        } 

    } 

}
