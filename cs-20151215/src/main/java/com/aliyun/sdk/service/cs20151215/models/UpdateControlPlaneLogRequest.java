// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > components;

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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder aliuid(String aliuid) {
            this.putBodyParameter("aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * The control plane components for which you want to enable log collection.
         */
        public Builder components(java.util.List < String > components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * The name of the Simple Log Service project that you want to use to store the logs of control plane components.
         * <p>
         * 
         * Default value: k8s-log-$Cluster ID.
         */
        public Builder logProject(String logProject) {
            this.putBodyParameter("log_project", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * The retention period of the log data stored in the Logstore. Valid values: 1 to 3000. Unit: days.
         * <p>
         * 
         * Default value: 30.
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
