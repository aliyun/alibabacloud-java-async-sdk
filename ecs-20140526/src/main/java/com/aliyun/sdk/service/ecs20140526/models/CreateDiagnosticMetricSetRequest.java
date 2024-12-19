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
 * {@link CreateDiagnosticMetricSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticMetricSetRequest</p>
 */
public class CreateDiagnosticMetricSetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> metricIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricSetName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String metricSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private CreateDiagnosticMetricSetRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.description = builder.description;
        this.metricIds = builder.metricIds;
        this.metricSetName = builder.metricSetName;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticMetricSetRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metricIds
     */
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    /**
     * @return metricSetName
     */
    public String getMetricSetName() {
        return this.metricSetName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosticMetricSetRequest, Builder> {
        private String sourceRegionId; 
        private String description; 
        private java.util.List<String> metricIds; 
        private String metricSetName; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosticMetricSetRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.description = request.description;
            this.metricIds = request.metricIds;
            this.metricSetName = request.metricSetName;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
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
         * <p>testDescription</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the request.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of diagnostic metric.</p>
         * <p>This parameter is required.</p>
         */
        public Builder metricIds(java.util.List<String> metricIds) {
            this.putQueryParameter("MetricIds", metricIds);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * <p>my_dms</p>
         * 
         * <strong>example:</strong>
         * <p>The IDs of diagnostic metrics. You can specify up to 100 diagnostic metric IDs.</p>
         */
        public Builder metricSetName(String metricSetName) {
            this.putQueryParameter("MetricSetName", metricSetName);
            this.metricSetName = metricSetName;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>Default value: instance.</p>
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
         * <p>The name of the diagnostic metric set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateDiagnosticMetricSetRequest build() {
            return new CreateDiagnosticMetricSetRequest(this);
        } 

    } 

}
