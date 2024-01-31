// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelFeatureFGInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureFGInfoRequest</p>
 */
public class UpdateModelFeatureFGInfoRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    private UpdateModelFeatureFGInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureFGInfoRequest create() {
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

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureFGInfoRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureFGInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.content = request.content;
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

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public UpdateModelFeatureFGInfoRequest build() {
            return new UpdateModelFeatureFGInfoRequest(this);
        } 

    } 

}
