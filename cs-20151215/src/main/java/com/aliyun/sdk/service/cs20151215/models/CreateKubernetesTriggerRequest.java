// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKubernetesTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateKubernetesTriggerRequest</p>
 */
public class CreateKubernetesTriggerRequest extends Request {
    @Body
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("project_id")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("action")
    @Validation(required = true)
    private String action;

    @Body
    @NameInMap("type")
    private String type;

    private CreateKubernetesTriggerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.projectId = builder.projectId;
        this.action = builder.action;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKubernetesTriggerRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateKubernetesTriggerRequest, Builder> {
        private String clusterId; 
        private String projectId; 
        private String action; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateKubernetesTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.projectId = request.projectId;
            this.action = request.action;
            this.type = request.type;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the trigger project.
         * <p>
         * 
         * The namespace and application name of the application. The format is "${namespace}/${name}".
         * 
         * Valid values: default/test-app ".
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The behavior of the trigger. Valid values:
         * <p>
         * 
         * "redeploy": redeploys the resources defined in "project_id.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The type of the trigger. Valid values:
         * <p>
         * 
         * -"deployment": triggers for stateless applications.
         * 
         * -"application": triggers for application center applications.
         * 
         * Default value: "deployment ".
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateKubernetesTriggerRequest build() {
            return new CreateKubernetesTriggerRequest(this);
        } 

    } 

}
