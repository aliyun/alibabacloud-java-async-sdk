// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTriggerResponseBody</p>
 */
public class CreateTriggerResponseBody extends TeaModel {
    @NameInMap("id")
    private String id;

    @NameInMap("cluster_id")
    private String clusterId;

    @NameInMap("project_id")
    private String projectId;

    @NameInMap("type")
    private String type;

    @NameInMap("action")
    private String action;

    private CreateTriggerResponseBody(Builder builder) {
        this.id = builder.id;
        this.clusterId = builder.clusterId;
        this.projectId = builder.projectId;
        this.type = builder.type;
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder {
        private String id; 
        private String clusterId; 
        private String projectId; 
        private String type; 
        private String action; 

        /**
         * The ID of the trigger.
         */
        public Builder id(String id) {
            this.id = id;
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
         * The name of the trigger project.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of the trigger. Default value: deployment.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The behavior of the trigger. For example, "redeploy": redeployment.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        public CreateTriggerResponseBody build() {
            return new CreateTriggerResponseBody(this);
        } 

    } 

}
