// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseInstanceRequest} extends {@link RequestModel}
 *
 * <p>PauseInstanceRequest</p>
 */
public class PauseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private PauseInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<PauseInstanceRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(PauseInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The HSM ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public PauseInstanceRequest build() {
            return new PauseInstanceRequest(this);
        } 

    } 

}
