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
 * {@link GetRegisterCodeRequest} extends {@link RequestModel}
 *
 * <p>GetRegisterCodeRequest</p>
 */
public class GetRegisterCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    private GetRegisterCodeRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisterCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public static final class Builder extends Request.Builder<GetRegisterCodeRequest, Builder> {
        private String mqttInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegisterCodeRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
        } 

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-7mz2d******</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        @Override
        public GetRegisterCodeRequest build() {
            return new GetRegisterCodeRequest(this);
        } 

    } 

}
