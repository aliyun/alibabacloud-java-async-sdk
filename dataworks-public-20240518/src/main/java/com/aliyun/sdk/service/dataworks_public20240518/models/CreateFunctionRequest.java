// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionRequest</p>
 */
public class CreateFunctionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private CreateFunctionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<CreateFunctionRequest, Builder> {
        private String regionId; 
        private String projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.spec = request.spec;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateFunctionRequest build() {
            return new CreateFunctionRequest(this);
        } 

    } 

}
