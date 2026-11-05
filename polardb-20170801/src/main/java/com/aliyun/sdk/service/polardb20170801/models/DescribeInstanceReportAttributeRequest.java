// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeInstanceReportAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceReportAttributeRequest</p>
 */
public class DescribeInstanceReportAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private DescribeInstanceReportAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceReportAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeInstanceReportAttributeRequest, Builder> {
        private String regionId; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceReportAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.reportId = request.reportId;
        } 

        /**
         * <p>The ID of the region where the instance resides.</p>
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
         * <p>The ID of the instance inspection report to query.</p>
         * 
         * <strong>example:</strong>
         * <p>report-001</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeInstanceReportAttributeRequest build() {
            return new DescribeInstanceReportAttributeRequest(this);
        } 

    } 

}
