// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketProductFeature} extends {@link TeaModel}
 *
 * <p>HiMarketProductFeature</p>
 */
public class HiMarketProductFeature extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("modelFeature")
    private HiMarketModelFeature modelFeature;

    private HiMarketProductFeature(Builder builder) {
        this.modelFeature = builder.modelFeature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketProductFeature create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelFeature
     */
    public HiMarketModelFeature getModelFeature() {
        return this.modelFeature;
    }

    public static final class Builder {
        private HiMarketModelFeature modelFeature; 

        private Builder() {
        } 

        private Builder(HiMarketProductFeature model) {
            this.modelFeature = model.modelFeature;
        } 

        /**
         * modelFeature.
         */
        public Builder modelFeature(HiMarketModelFeature modelFeature) {
            this.modelFeature = modelFeature;
            return this;
        }

        public HiMarketProductFeature build() {
            return new HiMarketProductFeature(this);
        } 

    } 

}
