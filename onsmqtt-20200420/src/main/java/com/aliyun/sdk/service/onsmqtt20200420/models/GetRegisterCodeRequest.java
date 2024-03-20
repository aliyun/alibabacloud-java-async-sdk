// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisterCodeRequest} extends {@link RequestModel}
 *
 * <p>GetRegisterCodeRequest</p>
 */
public class GetRegisterCodeRequest extends Request {
    @Query
    @NameInMap("MqttInstanceId")
    @Validation(required = true)
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
         * MqttInstanceId.
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
