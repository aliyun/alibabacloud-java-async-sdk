// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTriggerResponseBody</p>
 */
public class CreateTriggerResponseBody extends TeaModel {
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

    private CreateTriggerResponseBody(Builder builder) {
        this.action = builder.action;
        this.clusterId = builder.clusterId;
        this.id = builder.id;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerResponseBody create() {
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
         * The action that the trigger performs. For example, a value of `redeploy` indicates that the trigger redeploys the application.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the trigger.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the trigger project.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of trigger. Default value: deployment.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateTriggerResponseBody build() {
            return new CreateTriggerResponseBody(this);
        } 

    } 

}
