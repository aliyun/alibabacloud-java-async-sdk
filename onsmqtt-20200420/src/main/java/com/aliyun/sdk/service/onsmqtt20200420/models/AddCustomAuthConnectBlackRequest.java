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
 * {@link AddCustomAuthConnectBlackRequest} extends {@link RequestModel}
 *
 * <p>AddCustomAuthConnectBlackRequest</p>
 */
public class AddCustomAuthConnectBlackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private AddCustomAuthConnectBlackRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomAuthConnectBlackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AddCustomAuthConnectBlackRequest, Builder> {
        private String clientId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomAuthConnectBlackRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The client ID of the device whose connections you want to disable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@test</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-i7m26mf****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public AddCustomAuthConnectBlackRequest build() {
            return new AddCustomAuthConnectBlackRequest(this);
        } 

    } 

}
