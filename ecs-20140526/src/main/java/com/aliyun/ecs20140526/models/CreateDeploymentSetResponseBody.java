// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeploymentSetResponseBody</p>
 */
public class CreateDeploymentSetResponseBody extends TeaModel {
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeploymentSetResponseBody(Builder builder) {
        this.deploymentSetId = builder.deploymentSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deploymentSetId; 
        private String requestId; 

        /**
         * The ID of the deployment set.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeploymentSetResponseBody build() {
            return new CreateDeploymentSetResponseBody(this);
        } 

    } 

}
