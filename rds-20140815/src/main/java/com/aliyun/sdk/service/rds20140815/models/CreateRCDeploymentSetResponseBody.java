// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRCDeploymentSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRCDeploymentSetResponseBody</p>
 */
public class CreateRCDeploymentSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRCDeploymentSetResponseBody(Builder builder) {
        this.deploymentSetId = builder.deploymentSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCDeploymentSetResponseBody create() {
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
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-uf6c8qerk019bj1l****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRCDeploymentSetResponseBody build() {
            return new CreateRCDeploymentSetResponseBody(this);
        } 

    } 

}
