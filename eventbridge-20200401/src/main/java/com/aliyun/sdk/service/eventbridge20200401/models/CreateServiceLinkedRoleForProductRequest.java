// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateServiceLinkedRoleForProductRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleForProductRequest</p>
 */
public class CreateServiceLinkedRoleForProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productName;

    private CreateServiceLinkedRoleForProductRequest(Builder builder) {
        super(builder);
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleForProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleForProductRequest, Builder> {
        private String productName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleForProductRequest request) {
            super(request);
            this.productName = request.productName;
        } 

        /**
         * <p>The name of the cloud service or the service-linked role (SLR) that is associated with the service.</p>
         * <ul>
         * <li><p>AliyunServiceRoleForEventBridgeSendToFC: Delivers events to Function Compute (FC).</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToSMS: Delivers events as text messages to Short Message Service (SMS).</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToDirectMail: Delivers events as emails to Alibaba Cloud DirectMail.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceRocketMQ: Integrates messages from ApsaraMQ for RocketMQ instances into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceMNS: Integrates Message Service (MNS) into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeConnectVPC: Lets EventBridge access your Virtual Private Cloud (VPC) network.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceActionTrail: Uses operation records from ActionTrail as event sources.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceRabbitMQ: Integrates ApsaraMQ for RabbitMQ instances into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToRabbitMQ: Delivers EventBridge events to ApsaraMQ for RabbitMQ instances.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToRocketMQ: Delivers EventBridge events to ApsaraMQ for RocketMQ instances.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceCMS: Integrates CloudMonitor (CMS) into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToKafka: Delivers EventBridge events to ApsaraMQ for Kafka clusters.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceKafka: Integrates ApsaraMQ for Kafka into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToRDS: Delivers EventBridge events to Relational Database Service (RDS) instances.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSendToSAE: Delivers EventBridge events to Serverless App Engine (SAE) applications.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceMqtt: Integrates ApsaraMQ for MQTT into EventBridge.</p>
         * </li>
         * <li><p>AliyunServiceRoleForEventBridgeSourceSLS: Integrates Simple Log Service (SLS) into EventBridge.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForEventBridgeSendToMNS</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleForProductRequest build() {
            return new CreateServiceLinkedRoleForProductRequest(this);
        } 

    } 

}
