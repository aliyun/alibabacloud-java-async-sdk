// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiagnosticReportAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticReportAttributesRequest</p>
 */
public class DescribeDiagnosticReportAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    private DescribeDiagnosticReportAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.regionId = builder.regionId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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

    public static final class Builder extends Request.Builder<DescribeDiagnosticReportAttributesRequest, Builder> {
        private String sourceRegionId; 
        private String regionId; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosticReportAttributesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.regionId = request.regionId;
            this.reportId = request.reportId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The region ID of the diagnostic report. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the diagnostic report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-i-uf6i0tv2refv8wz*****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeDiagnosticReportAttributesRequest build() {
            return new DescribeDiagnosticReportAttributesRequest(this);
        } 

    } 

}
