// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("elasticResource")
    private ResourceSpec elasticResource;

    @com.aliyun.core.annotation.NameInMap("fixedResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceSpec fixedResource;

    private Resource(Builder builder) {
        this.elasticResource = builder.elasticResource;
        this.fixedResource = builder.fixedResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticResource
     */
    public ResourceSpec getElasticResource() {
        return this.elasticResource;
    }

    /**
     * @return fixedResource
     */
    public ResourceSpec getFixedResource() {
        return this.fixedResource;
    }

    public static final class Builder {
        private ResourceSpec elasticResource; 
        private ResourceSpec fixedResource; 

        private Builder() {
        } 

        private Builder(Resource model) {
            this.elasticResource = model.elasticResource;
            this.fixedResource = model.fixedResource;
        } 

        /**
         * elasticResource.
         */
        public Builder elasticResource(ResourceSpec elasticResource) {
            this.elasticResource = elasticResource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fixedResource(ResourceSpec fixedResource) {
            this.fixedResource = fixedResource;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}
