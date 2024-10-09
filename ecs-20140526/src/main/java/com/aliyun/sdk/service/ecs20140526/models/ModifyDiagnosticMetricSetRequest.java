// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDiagnosticMetricSetRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiagnosticMetricSetRequest</p>
 */
public class ModifyDiagnosticMetricSetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricIds")
    private java.util.List < String > metricIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricSetId;

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
         * <p>The new description of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>connection diagnostics</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of diagnostic metric N.</p>
         */
        public Builder metricIds(java.util.List < String > metricIds) {
            this.putQueryParameter("MetricIds", metricIds);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * <p>The ID of the diagnostic metric set.</p>
         * <p>This parameter is required.</p>
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
         * <p>The new name of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>remoteConnectError</p>
         */
        public Builder metricSetName(String metricSetName) {
            this.putQueryParameter("MetricSetName", metricSetName);
            this.metricSetName = metricSetName;
            return this;
        }

        /**
         * <p>The region ID of the diagnostic metric set. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The type of the resource.</p>
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
        public ModifyDiagnosticMetricSetRequest build() {
            return new ModifyDiagnosticMetricSetRequest(this);
        } 

    } 

}
