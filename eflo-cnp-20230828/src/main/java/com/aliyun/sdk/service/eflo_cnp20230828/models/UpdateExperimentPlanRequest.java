// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link UpdateExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentPlanRequest</p>
 */
public class UpdateExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planTemplateName;

    private UpdateExperimentPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.planId = builder.planId;
        this.planTemplateName = builder.planTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentPlanRequest create() {
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
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return planTemplateName
     */
    public String getPlanTemplateName() {
        return this.planTemplateName;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentPlanRequest, Builder> {
        private String regionId; 
        private Long planId; 
        private String planTemplateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.planId = request.planId;
            this.planTemplateName = request.planTemplateName;
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
         * <p>Experiment plan ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        public Builder planId(Long planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>Experiment plan name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder planTemplateName(String planTemplateName) {
            this.putQueryParameter("PlanTemplateName", planTemplateName);
            this.planTemplateName = planTemplateName;
            return this;
        }

        @Override
        public UpdateExperimentPlanRequest build() {
            return new UpdateExperimentPlanRequest(this);
        } 

    } 

}
