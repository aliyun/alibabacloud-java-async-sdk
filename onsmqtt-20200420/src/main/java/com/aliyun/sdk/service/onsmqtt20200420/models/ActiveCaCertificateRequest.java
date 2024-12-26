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
 * {@link ActiveCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>ActiveCaCertificateRequest</p>
 */
public class ActiveCaCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private ActiveCaCertificateRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveCaCertificateRequest create() {
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

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<ActiveCaCertificateRequest, Builder> {
        private String mqttInstanceId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(ActiveCaCertificateRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
            this.sn = request.sn;
        } 

        /**
         * <p>CA证书所绑定的实例ID，即云消息队列 MQTT 版的实例ID。</p>
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

        /**
         * <p>待激活CA证书的SN序列号，用于唯一标识一个CA证书。</p>
         * <p>取值范围：不超过128 Byte。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public ActiveCaCertificateRequest build() {
            return new ActiveCaCertificateRequest(this);
        } 

    } 

}
