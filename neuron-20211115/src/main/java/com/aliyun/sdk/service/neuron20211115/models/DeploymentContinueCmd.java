// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeploymentContinueCmd} extends {@link TeaModel}
 *
 * <p>DeploymentContinueCmd</p>
 */
public class DeploymentContinueCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deploymentId;

    private DeploymentContinueCmd(Builder builder) {
        this.deploymentId = builder.deploymentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentContinueCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentId
     */
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public static final class Builder {
        private Long deploymentId; 

        private Builder() {
        } 

        private Builder(DeploymentContinueCmd model) {
            this.deploymentId = model.deploymentId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deploymentId(Long deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public DeploymentContinueCmd build() {
            return new DeploymentContinueCmd(this);
        } 

    } 

}
