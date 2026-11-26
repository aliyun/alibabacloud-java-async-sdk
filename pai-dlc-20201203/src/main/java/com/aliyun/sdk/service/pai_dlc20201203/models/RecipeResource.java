// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RecipeResource} extends {@link TeaModel}
 *
 * <p>RecipeResource</p>
 */
public class RecipeResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Specs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RecipeSpec> specs;

    private RecipeResource(Builder builder) {
        this.resourceType = builder.resourceType;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return specs
     */
    public java.util.List<RecipeSpec> getSpecs() {
        return this.specs;
    }

    public static final class Builder {
        private String resourceType; 
        private java.util.List<RecipeSpec> specs; 

        private Builder() {
        } 

        private Builder(RecipeResource model) {
            this.resourceType = model.resourceType;
            this.specs = model.specs;
        } 

        /**
         * <p>The resource pool type. Valid values: train, eval, and inference. If left empty, the storage layer uses the default value based on the associated slot. For training child tables, TrainResource must be set to train and InferenceResource must be set to inference. For evaluation child tables, the resource must be set to eval. Cross-type sharing is not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The JSON array of resource specifications. It uses the CustomJob resource shape (flat pod_count, ecs_spec, cpu, memory, gpu, gpu_type, shared_memory, and quota_id). It is required and passed through as-is. Currently, the path that starts an RLJob from a Recipe only consumes a single train specification and a single quota, and does not support ecs_spec. Support for multiple specifications, multiple quotas, and ecs_spec will be available when the RLJob side enables these features.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;PodCount&quot;:1,&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;A100&quot;,&quot;QuotaId&quot;:&quot;quotag2uo09dyp40&quot;}]</p>
         */
        public Builder specs(java.util.List<RecipeSpec> specs) {
            this.specs = specs;
            return this;
        }

        public RecipeResource build() {
            return new RecipeResource(this);
        } 

    } 

}
