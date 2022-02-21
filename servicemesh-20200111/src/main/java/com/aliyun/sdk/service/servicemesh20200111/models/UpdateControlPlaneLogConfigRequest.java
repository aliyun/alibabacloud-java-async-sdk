// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPlaneLogConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPlaneLogConfigRequest</p>
 */
public class UpdateControlPlaneLogConfigRequest extends Request {
    @Body
    @NameInMap("Enabled")
    @Validation(required = true)
    private Boolean enabled;

    @Body
    @NameInMap("Project")
    private String project;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpdateControlPlaneLogConfigRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.project = builder.project;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateControlPlaneLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateControlPlaneLogConfigRequest, Builder> {
        private Boolean enabled; 
        private String project; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateControlPlaneLogConfigRequest response) {
            super(response);
            this.enabled = response.enabled;
            this.project = response.project;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putBodyParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpdateControlPlaneLogConfigRequest build() {
            return new UpdateControlPlaneLogConfigRequest(this);
        } 

    } 

}
