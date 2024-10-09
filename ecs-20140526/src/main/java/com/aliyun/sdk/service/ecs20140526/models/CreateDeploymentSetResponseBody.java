// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDeploymentSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeploymentSetResponseBody</p>
 */
public class CreateDeploymentSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4pzq****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
