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
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.action = builder.action;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerRequest create() {
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
     * @return action
     */
    public String getAction() {
        return this.action;
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

    public static final class Builder extends Request.Builder<CreateTriggerRequest, Builder> {
        private String clusterId; 
        private String action; 
        private String projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.action = request.action;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c68deb844dc6d480eb775be611fdf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The action that the trigger performs. Set the value to redeploy.</p>
         * <p><code>redeploy</code>: redeploys the resources specified by <code>project_id</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>redeploy</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>The name of the trigger project.</p>
         * <p>The name consists of the namespace where the application is deployed and the name of the application. The format is <code>${namespace}/${name}</code>.</p>
         * <p>Example: <code>default/test-app</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default/test-app</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of trigger. Valid values:</p>
         * <ul>
         * <li><code>deployment</code>: performs actions on Deployments.</li>
         * <li><code>application</code>: performs actions on applications that are deployed in Application Center.</li>
         * </ul>
         * <p>Default value: <code>deployment</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

}
