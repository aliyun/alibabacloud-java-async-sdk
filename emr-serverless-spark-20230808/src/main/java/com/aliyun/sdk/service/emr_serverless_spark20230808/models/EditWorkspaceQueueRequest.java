// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link EditWorkspaceQueueRequest} extends {@link RequestModel}
 *
 * <p>EditWorkspaceQueueRequest</p>
 */
public class EditWorkspaceQueueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environments")
    private java.util.List<String> environments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceQueueName")
    private String workspaceQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private EditWorkspaceQueueRequest(Builder builder) {
        super(builder);
        this.environments = builder.environments;
        this.resourceSpec = builder.resourceSpec;
        this.workspaceId = builder.workspaceId;
        this.workspaceQueueName = builder.workspaceQueueName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditWorkspaceQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environments
     */
    public java.util.List<String> getEnvironments() {
        return this.environments;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceQueueName
     */
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EditWorkspaceQueueRequest, Builder> {
        private java.util.List<String> environments; 
        private ResourceSpec resourceSpec; 
        private String workspaceId; 
        private String workspaceQueueName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EditWorkspaceQueueRequest request) {
            super(request);
            this.environments = request.environments;
            this.resourceSpec = request.resourceSpec;
            this.workspaceId = request.workspaceId;
            this.workspaceQueueName = request.workspaceQueueName;
            this.regionId = request.regionId;
        } 

        /**
         * environments.
         */
        public Builder environments(java.util.List<String> environments) {
            this.putBodyParameter("environments", environments);
            this.environments = environments;
            return this;
        }

        /**
         * resourceSpec.
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            this.putBodyParameter("resourceSpec", resourceSpec);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * workspaceQueueName.
         */
        public Builder workspaceQueueName(String workspaceQueueName) {
            this.putBodyParameter("workspaceQueueName", workspaceQueueName);
            this.workspaceQueueName = workspaceQueueName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EditWorkspaceQueueRequest build() {
            return new EditWorkspaceQueueRequest(this);
        } 

    } 

    /**
     * 
     * {@link EditWorkspaceQueueRequest} extends {@link TeaModel}
     *
     * <p>EditWorkspaceQueueRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Long cu;

        private ResourceSpec(Builder builder) {
            this.cu = builder.cu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Long getCu() {
            return this.cu;
        }

        public static final class Builder {
            private Long cu; 

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cu = model.cu;
            } 

            /**
             * cu.
             */
            public Builder cu(Long cu) {
                this.cu = cu;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
}
