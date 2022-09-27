// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiagnosticMetricSetRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiagnosticMetricSetRequest</p>
 */
public class ModifyDiagnosticMetricSetRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 255)
    private String description;

    @Query
    @NameInMap("MetricIds")
    private java.util.List < String > metricIds;

    @Query
    @NameInMap("MetricSetId")
    @Validation(required = true)
    private String metricSetId;

    @Query
    @NameInMap("MetricSetName")
    @Validation(maxLength = 128)
    private String metricSetName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private ModifyDiagnosticMetricSetRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.description = builder.description;
        this.metricIds = builder.metricIds;
        this.metricSetId = builder.metricSetId;
        this.metricSetName = builder.metricSetName;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiagnosticMetricSetRequest create() {
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
    public java.util.List < String > getMetricIds() {
        return this.metricIds;
    }

    /**
     * @return metricSetId
     */
    public String getMetricSetId() {
        return this.metricSetId;
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

    public static final class Builder extends Request.Builder<ModifyDiagnosticMetricSetRequest, Builder> {
        private String sourceRegionId; 
        private String description; 
        private java.util.List < String > metricIds; 
        private String metricSetId; 
        private String metricSetName; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiagnosticMetricSetRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.description = request.description;
            this.metricIds = request.metricIds;
            this.metricSetId = request.metricSetId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MetricIds.
         */
        public Builder metricIds(java.util.List < String > metricIds) {
            this.putQueryParameter("MetricIds", metricIds);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * MetricSetId.
         */
        public Builder metricSetId(String metricSetId) {
            this.putQueryParameter("MetricSetId", metricSetId);
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * MetricSetName.
         */
        public Builder metricSetName(String metricSetName) {
            this.putQueryParameter("MetricSetName", metricSetName);
            this.metricSetName = metricSetName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ModifyDiagnosticMetricSetRequest build() {
            return new ModifyDiagnosticMetricSetRequest(this);
        } 

    } 

}
