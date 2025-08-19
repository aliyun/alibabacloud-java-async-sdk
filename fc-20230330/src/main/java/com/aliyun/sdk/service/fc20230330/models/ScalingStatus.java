// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ScalingStatus} extends {@link TeaModel}
 *
 * <p>ScalingStatus</p>
 */
public class ScalingStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("resourceCount")
    private Long resourceCount;

    private ScalingStatus(Builder builder) {
        this.currentError = builder.currentError;
        this.resourceCount = builder.resourceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return resourceCount
     */
    public Long getResourceCount() {
        return this.resourceCount;
    }

    public static final class Builder {
        private String currentError; 
        private Long resourceCount; 

        private Builder() {
        } 

        private Builder(ScalingStatus model) {
            this.currentError = model.currentError;
            this.resourceCount = model.resourceCount;
        } 

        /**
         * currentError.
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * resourceCount.
         */
        public Builder resourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        public ScalingStatus build() {
            return new ScalingStatus(this);
        } 

    } 

}
