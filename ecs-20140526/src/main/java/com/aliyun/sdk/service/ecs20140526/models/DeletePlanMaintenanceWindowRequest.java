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
 * {@link DeletePlanMaintenanceWindowRequest} extends {@link RequestModel}
 *
 * <p>DeletePlanMaintenanceWindowRequest</p>
 */
public class DeletePlanMaintenanceWindowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planWindowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeletePlanMaintenanceWindowRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.planWindowId = builder.planWindowId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlanMaintenanceWindowRequest create() {
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
     * @return planWindowId
     */
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePlanMaintenanceWindowRequest, Builder> {
        private String sourceRegionId; 
        private String planWindowId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePlanMaintenanceWindowRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.planWindowId = request.planWindowId;
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pw-bp12kkvnebe7hksqnx9w</p>
         */
        public Builder planWindowId(String planWindowId) {
            this.putQueryParameter("PlanWindowId", planWindowId);
            this.planWindowId = planWindowId;
            return this;
        }

        /**
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

        @Override
        public DeletePlanMaintenanceWindowRequest build() {
            return new DeletePlanMaintenanceWindowRequest(this);
        } 

    } 

}
