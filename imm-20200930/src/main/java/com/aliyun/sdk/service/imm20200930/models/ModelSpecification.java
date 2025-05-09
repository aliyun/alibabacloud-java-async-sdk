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
 * {@link ModelSpecification} extends {@link TeaModel}
 *
 * <p>ModelSpecification</p>
 */
public class ModelSpecification extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaData")
    @com.aliyun.core.annotation.Validation(required = true)
    private MetaData metaData;

    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private Spec spec;

    private ModelSpecification(Builder builder) {
        this.metaData = builder.metaData;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSpecification create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaData
     */
    public MetaData getMetaData() {
        return this.metaData;
    }

    /**
     * @return spec
     */
    public Spec getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private MetaData metaData; 
        private Spec spec; 

        private Builder() {
        } 

        private Builder(ModelSpecification model) {
            this.metaData = model.metaData;
            this.spec = model.spec;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder spec(Spec spec) {
            this.spec = spec;
            return this;
        }

        public ModelSpecification build() {
            return new ModelSpecification(this);
        } 

    } 

}
