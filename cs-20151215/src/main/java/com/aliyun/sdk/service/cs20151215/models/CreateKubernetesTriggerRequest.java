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
    @NameInMap("action")
    @Validation(required = true)
    private String action;

    @Body
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("project_id")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("type")
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
         * 触发器行为
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 项目名称。
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 触发器类型。默认deployment。
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
