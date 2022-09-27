// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticReportRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticReportRequest</p>
 */
public class CreateDiagnosticReportRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MetricSetId")
    private String metricSetId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private CreateDiagnosticReportRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
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
         * 开始时间，只对不需要在GuestOS内执行云助手指令的诊断指标生效
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 诊断指标集合ID，如果为空，会使用EcsInstance的默认诊断指标集合。
         */
        public Builder metricSetId(String metricSetId) {
            this.putQueryParameter("MetricSetId", metricSetId);
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 资源ID，如i-bp1io7xxxutup5l2y4vt
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 开始时间，只对不需要在GuestOS内执行云助手指令的诊断指标生效
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
