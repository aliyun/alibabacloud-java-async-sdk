// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * MetaData.
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * Spec.
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
