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

        private Builder() {
        } 

        private Builder(CreateTriggerResponseBody model) {
            this.action = model.action;
            this.clusterId = model.clusterId;
            this.id = model.id;
            this.projectId = model.projectId;
            this.type = model.type;
        } 

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
         * <p>c93095129fc41463aa455d89444fd****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>102536</p>
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
         * <p>The type of trigger. Default value: deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
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
