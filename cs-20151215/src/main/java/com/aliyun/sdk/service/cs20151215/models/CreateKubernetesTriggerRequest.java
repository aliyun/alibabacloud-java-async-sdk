// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKubernetesTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateKubernetesTriggerRequest</p>
 */
public class CreateKubernetesTriggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateKubernetesTriggerRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.clusterId = builder.clusterId;
        this.projectId = builder.projectId;
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
     * @return action
     */
    public String getAction() {
        return this.action;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateKubernetesTriggerRequest, Builder> {
        private String action; 
        private String clusterId; 
        private String projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateKubernetesTriggerRequest request) {
            super(request);
            this.action = request.action;
            this.clusterId = request.clusterId;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * The action that the trigger performs. Set the value to redeploy.
         * <p>
         * 
         * `redeploy`: redeploys the resources specified by `project_id`.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The cluster ID.
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
         * The name consists of the namespace where the application is deployed and the name of the application. The format is `${namespace}/${name}`.
         * 
         * Example: `default/test-app`.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of trigger. Valid values:
         * <p>
         * 
         * *   `deployment`: performs actions on Deployments.
         * *   `application`: performs actions on applications that are deployed in Application Center.
         * 
         * Default value: `deployment`.
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
