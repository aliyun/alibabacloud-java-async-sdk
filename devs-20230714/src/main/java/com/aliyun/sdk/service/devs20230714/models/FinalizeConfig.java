// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link FinalizeConfig} extends {@link TeaModel}
 *
 * <p>FinalizeConfig</p>
 */
public class FinalizeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<?> steps;

    private FinalizeConfig(Builder builder) {
        this.steps = builder.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinalizeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return steps
     */
    public java.util.List<?> getSteps() {
        return this.steps;
    }

    public static final class Builder {
        private java.util.List<?> steps; 

        private Builder() {
        } 

        private Builder(FinalizeConfig model) {
            this.steps = model.steps;
        } 

        /**
         * steps.
         */
        public Builder steps(java.util.List<?> steps) {
            this.steps = steps;
            return this;
        }

        public FinalizeConfig build() {
            return new FinalizeConfig(this);
        } 

    } 

}
