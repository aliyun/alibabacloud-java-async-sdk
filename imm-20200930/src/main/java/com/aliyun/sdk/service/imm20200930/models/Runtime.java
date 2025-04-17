// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Runtime} extends {@link TeaModel}
 *
 * <p>Runtime</p>
 */
public class Runtime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hyperparameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private Hyperparameters hyperparameters;

    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Resource resource;

    private Runtime(Builder builder) {
        this.hyperparameters = builder.hyperparameters;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Runtime create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hyperparameters
     */
    public Hyperparameters getHyperparameters() {
        return this.hyperparameters;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    public static final class Builder {
        private Hyperparameters hyperparameters; 
        private Resource resource; 

        private Builder() {
        } 

        private Builder(Runtime model) {
            this.hyperparameters = model.hyperparameters;
            this.resource = model.resource;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hyperparameters(Hyperparameters hyperparameters) {
            this.hyperparameters = hyperparameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public Runtime build() {
            return new Runtime(this);
        } 

    } 

}
