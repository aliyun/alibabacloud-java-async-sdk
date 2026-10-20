// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link UpdateControlPlaneLogRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPlaneLogRequest</p>
 */
public class UpdateControlPlaneLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliuid")
    private String aliuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<String> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("log_project")
    private String logProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("log_ttl")
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
    public java.util.List<String> getComponents() {
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
        private java.util.List<String> components; 
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>162981*****</p>
         */
        public Builder aliuid(String aliuid) {
            this.putBodyParameter("aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * <p>The list of components for which control plane logging is enabled.</p>
         */
        public Builder components(java.util.List<String> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * <p>The name of the SLS project used to store control plane component logs.</p>
         * <p>Default value: k8s-log-$Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder logProject(String logProject) {
            this.putBodyParameter("log_project", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The log retention period in the SLS Logstore. Valid values: 1 to 3000. Unit: days.</p>
         * <p>Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
