// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKubernetesTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKubernetesTriggerResponseBody</p>
 */
public class CreateKubernetesTriggerResponseBody extends TeaModel {
    @NameInMap("action")
    private String action;

    @NameInMap("cluster_id")
    private String clusterId;

    @NameInMap("id")
    private String id;

    @NameInMap("project_id")
    private String projectId;

    @NameInMap("type")
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
         * The action that the trigger performs. For example, a value of `redeploy` indicates that the trigger redeploys the application.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * The ID of the ACK cluster.
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
         * The name of the project.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of trigger.
         * <p>
         * 
         * Valid values:
         * 
         * *   `deployment`: performs actions on Deployments.
         * *   `application`: performs actions on applications that are deployed in Application Center.
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
