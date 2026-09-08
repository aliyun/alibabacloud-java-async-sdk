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
 * {@link CreateDiagnosticReportRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticReportRequest</p>
 */
public class CreateDiagnosticReportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalOptions")
    private java.util.Map<String, String> additionalOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricSetId")
    private String metricSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateDiagnosticReportRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.additionalOptions = builder.additionalOptions;
        this.endTime = builder.endTime;
        this.metricSetId = builder.metricSetId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticReportRequest create() {
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
     * @return additionalOptions
     */
    public java.util.Map<String, String> getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricSetId
     */
    public String getMetricSetId() {
        return this.metricSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosticReportRequest, Builder> {
        private String sourceRegionId; 
        private java.util.Map<String, String> additionalOptions; 
        private String endTime; 
        private String metricSetId; 
        private String regionId; 
        private String resourceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosticReportRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.additionalOptions = request.additionalOptions;
            this.endTime = request.endTime;
            this.metricSetId = request.metricSetId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.startTime = request.startTime;
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
         * AdditionalOptions.
         */
        public Builder additionalOptions(java.util.Map<String, String> additionalOptions) {
            String additionalOptionsShrink = shrink(additionalOptions, "AdditionalOptions", "json");
            this.putQueryParameter("AdditionalOptions", additionalOptionsShrink);
            this.additionalOptions = additionalOptions;
            return this;
        }

        /**
         * <p>The end time. Takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be run in the guest OS.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T14:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The diagnostic metric set ID. If left empty, the default diagnostic metric set dms-instancedefault for ECS instances is used.</p>
         * 
         * <strong>example:</strong>
         * <p>dms-uf6i0tv2refv8wz*****</p>
         */
        public Builder metricSetId(String metricSetId) {
            this.putQueryParameter("MetricSetId", metricSetId);
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6i0tv2refv8wz*****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The start time. Takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be run in the guest OS.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T12:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateDiagnosticReportRequest build() {
            return new CreateDiagnosticReportRequest(this);
        } 

    } 

}
