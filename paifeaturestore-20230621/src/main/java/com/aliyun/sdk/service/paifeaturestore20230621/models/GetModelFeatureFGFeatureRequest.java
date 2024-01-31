// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelFeatureFGFeatureRequest} extends {@link RequestModel}
 *
 * <p>GetModelFeatureFGFeatureRequest</p>
 */
public class GetModelFeatureFGFeatureRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    private GetModelFeatureFGFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelFeatureFGFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    public static final class Builder extends Request.Builder<GetModelFeatureFGFeatureRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelFeatureFGFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        @Override
        public GetModelFeatureFGFeatureRequest build() {
            return new GetModelFeatureFGFeatureRequest(this);
        } 

    } 

}
