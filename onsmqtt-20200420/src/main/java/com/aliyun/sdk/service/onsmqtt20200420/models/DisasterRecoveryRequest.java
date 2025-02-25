// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link DisasterRecoveryRequest} extends {@link RequestModel}
 *
 * <p>DisasterRecoveryRequest</p>
 */
public class DisasterRecoveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoveryInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recoveryInstanceId;

    private DisasterRecoveryRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.recoveryInstanceId = builder.recoveryInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisasterRecoveryRequest create() {
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

    /**
     * @return recoveryInstanceId
     */
    public String getRecoveryInstanceId() {
        return this.recoveryInstanceId;
    }

    public static final class Builder extends Request.Builder<DisasterRecoveryRequest, Builder> {
        private String instanceId; 
        private String recoveryInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisasterRecoveryRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.recoveryInstanceId = request.recoveryInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxx</p>
         */
        public Builder recoveryInstanceId(String recoveryInstanceId) {
            this.putBodyParameter("RecoveryInstanceId", recoveryInstanceId);
            this.recoveryInstanceId = recoveryInstanceId;
            return this;
        }

        @Override
        public DisasterRecoveryRequest build() {
            return new DisasterRecoveryRequest(this);
        } 

    } 

}
