// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricGroupRequest</p>
 */
public class UpdateMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateMetricGroupRequest(Builder builder) {
        super(builder);
        this.metricGroupId = builder.metricGroupId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateMetricGroupRequest, Builder> {
        private String metricGroupId; 
        private String regionId; 
        private String description; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricGroupRequest request) {
            super(request);
            this.metricGroupId = request.metricGroupId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.putPathParameter("MetricGroupId", metricGroupId);
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMetricGroupRequest build() {
            return new UpdateMetricGroupRequest(this);
        } 

    } 

}
