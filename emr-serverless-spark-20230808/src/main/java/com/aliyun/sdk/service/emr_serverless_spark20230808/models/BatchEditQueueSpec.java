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
 * {@link BatchEditQueueSpec} extends {@link TeaModel}
 *
 * <p>BatchEditQueueSpec</p>
 */
public class BatchEditQueueSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("environments")
    private java.util.List<String> environments;

    @com.aliyun.core.annotation.NameInMap("gpuSpec")
    private java.util.List<String> gpuSpec;

    @com.aliyun.core.annotation.NameInMap("resourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.NameInMap("workspaceQueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceQueueName;

    private BatchEditQueueSpec(Builder builder) {
        this.description = builder.description;
        this.environments = builder.environments;
        this.gpuSpec = builder.gpuSpec;
        this.resourceSpec = builder.resourceSpec;
        this.workspaceQueueName = builder.workspaceQueueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEditQueueSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environments
     */
    public java.util.List<String> getEnvironments() {
        return this.environments;
    }

    /**
     * @return gpuSpec
     */
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return workspaceQueueName
     */
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    public static final class Builder {
        private String description; 
        private java.util.List<String> environments; 
        private java.util.List<String> gpuSpec; 
        private ResourceSpec resourceSpec; 
        private String workspaceQueueName; 

        private Builder() {
        } 

        private Builder(BatchEditQueueSpec model) {
            this.description = model.description;
            this.environments = model.environments;
            this.gpuSpec = model.gpuSpec;
            this.resourceSpec = model.resourceSpec;
            this.workspaceQueueName = model.workspaceQueueName;
        } 

        /**
         * <p>The description of the queue. If this parameter is not specified, the description is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Development and debugging queue</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The runtime environments. If this parameter is not specified, the runtime environments are not modified.</p>
         */
        public Builder environments(java.util.List<String> environments) {
            this.environments = environments;
            return this;
        }

        /**
         * <p>The list of GPU instance types. If this parameter is not specified, the GPU specifications are not modified.</p>
         */
        public Builder gpuSpec(java.util.List<String> gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * <p>The resource specifications, which represent the absolute target value. If this parameter is not specified, only the description, environments, or GPU specifications are modified, and the quota is not recalculated.</p>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        public Builder workspaceQueueName(String workspaceQueueName) {
            this.workspaceQueueName = workspaceQueueName;
            return this;
        }

        public BatchEditQueueSpec build() {
            return new BatchEditQueueSpec(this);
        } 

    } 

}
