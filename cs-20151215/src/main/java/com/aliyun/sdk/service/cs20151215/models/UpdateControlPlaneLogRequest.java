// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPlaneLogRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPlaneLogRequest</p>
 */
public class UpdateControlPlaneLogRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("aliuid")
    private String aliuid;

    @Body
    @NameInMap("components")
    private java.util.List < String > components;

    @Body
    @NameInMap("log_project")
    private String logProject;

    @Body
    @NameInMap("log_ttl")
    private String logTtl;

    private UpdateControlPlaneLogRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.aliuid = builder.aliuid;
        this.components = builder.components;
        this.logProject = builder.logProject;
        this.logTtl = builder.logTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateControlPlaneLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return aliuid
     */
    public String getAliuid() {
        return this.aliuid;
    }

    /**
     * @return components
     */
    public java.util.List < String > getComponents() {
        return this.components;
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return logTtl
     */
    public String getLogTtl() {
        return this.logTtl;
    }

    public static final class Builder extends Request.Builder<UpdateControlPlaneLogRequest, Builder> {
        private String clusterId; 
        private String aliuid; 
        private java.util.List < String > components; 
        private String logProject; 
        private String logTtl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateControlPlaneLogRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.aliuid = request.aliuid;
            this.components = request.components;
            this.logProject = request.logProject;
            this.logTtl = request.logTtl;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * aliuid.
         */
        public Builder aliuid(String aliuid) {
            this.putBodyParameter("aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List < String > components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * log_project.
         */
        public Builder logProject(String logProject) {
            this.putBodyParameter("log_project", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * log_ttl.
         */
        public Builder logTtl(String logTtl) {
            this.putBodyParameter("log_ttl", logTtl);
            this.logTtl = logTtl;
            return this;
        }

        @Override
        public UpdateControlPlaneLogRequest build() {
            return new UpdateControlPlaneLogRequest(this);
        } 

    } 

}
