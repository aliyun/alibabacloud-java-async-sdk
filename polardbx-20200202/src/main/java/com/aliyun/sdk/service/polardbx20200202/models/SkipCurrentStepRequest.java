// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link SkipCurrentStepRequest} extends {@link RequestModel}
 *
 * <p>SkipCurrentStepRequest</p>
 */
public class SkipCurrentStepRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentStep")
    private String currentStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    private String slinkTaskId;

    private SkipCurrentStepRequest(Builder builder) {
        super(builder);
        this.currentStep = builder.currentStep;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipCurrentStepRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentStep
     */
    public String getCurrentStep() {
        return this.currentStep;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public static final class Builder extends Request.Builder<SkipCurrentStepRequest, Builder> {
        private String currentStep; 
        private String regionId; 
        private String slinkTaskId; 

        private Builder() {
            super();
        } 

        private Builder(SkipCurrentStepRequest request) {
            super(request);
            this.currentStep = request.currentStep;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
        } 

        /**
         * CurrentStep.
         */
        public Builder currentStep(String currentStep) {
            this.putQueryParameter("CurrentStep", currentStep);
            this.currentStep = currentStep;
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
         * SlinkTaskId.
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        @Override
        public SkipCurrentStepRequest build() {
            return new SkipCurrentStepRequest(this);
        } 

    } 

}
