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
 * {@link CreateKubernetesTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKubernetesTriggerResponseBody</p>
 */
public class CreateKubernetesTriggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("project_id")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateKubernetesTriggerResponseBody(Builder builder) {
        this.action = builder.action;
        this.clusterId = builder.clusterId;
        this.id = builder.id;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKubernetesTriggerResponseBody create() {
        return builder().build();
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder {
        private String action; 
        private String clusterId; 
        private String id; 
        private String projectId; 
        private String type; 

        /**
         * <p>The action that the trigger performs. For example, a value of <code>redeploy</code> indicates that the trigger redeploys the application.</p>
         * 
         * <strong>example:</strong>
         * <p>redeploy</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the trigger project.</p>
         * 
         * <strong>example:</strong>
         * <p>default/test-app</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of trigger.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>deployment</code>: performs actions on Deployments.</li>
         * <li><code>application</code>: performs actions on applications that are deployed in Application Center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateKubernetesTriggerResponseBody build() {
            return new CreateKubernetesTriggerResponseBody(this);
        } 

    } 

}
