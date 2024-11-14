// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetReportRequest} extends {@link RequestModel}
 *
 * <p>GetReportRequest</p>
 */
public class GetReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    private GetReportRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.regionId = builder.regionId;
        this.reportId = builder.reportId;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<GetReportRequest, Builder> {
        private String appName; 
        private String regionId; 
        private String reportId; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(GetReportRequest request) {
            super(request);
            this.appName = request.appName;
            this.regionId = request.regionId;
            this.reportId = request.reportId;
            this.reportType = request.reportType;
        } 

        /**
         * <p>Optional, AppName only takes effect when ReportType=present.</p>
         * 
         * <strong>example:</strong>
         * <p>App1</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Region name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>When ReportType=history, ReportId is required to query historical reports based on ReportId.</p>
         * 
         * <strong>example:</strong>
         * <p>report-74fbea80e802xxxx</p>
         */
        public Builder reportId(String reportId) {
            this.putBodyParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>Optional values: history/present.</p>
         * 
         * <strong>example:</strong>
         * <p>history</p>
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public GetReportRequest build() {
            return new GetReportRequest(this);
        } 

    } 

}
