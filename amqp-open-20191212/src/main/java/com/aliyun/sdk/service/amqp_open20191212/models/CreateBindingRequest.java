// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBindingRequest} extends {@link RequestModel}
 *
 * <p>CreateBindingRequest</p>
 */
public class CreateBindingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Argument")
    private String argument;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindingKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindingKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindingType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindingType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceExchange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceExchange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualHost;

    private CreateBindingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.argument = builder.argument;
        this.bindingKey = builder.bindingKey;
        this.bindingType = builder.bindingType;
        this.destinationName = builder.destinationName;
        this.instanceId = builder.instanceId;
        this.sourceExchange = builder.sourceExchange;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return argument
     */
    public String getArgument() {
        return this.argument;
    }

    /**
     * @return bindingKey
     */
    public String getBindingKey() {
        return this.bindingKey;
    }

    /**
     * @return bindingType
     */
    public String getBindingType() {
        return this.bindingType;
    }

    /**
     * @return destinationName
     */
    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sourceExchange
     */
    public String getSourceExchange() {
        return this.sourceExchange;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<CreateBindingRequest, Builder> {
        private String regionId; 
        private String argument; 
        private String bindingKey; 
        private String bindingType; 
        private String destinationName; 
        private String instanceId; 
        private String sourceExchange; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(CreateBindingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.argument = request.argument;
            this.bindingKey = request.bindingKey;
            this.bindingType = request.bindingType;
            this.destinationName = request.destinationName;
            this.instanceId = request.instanceId;
            this.sourceExchange = request.sourceExchange;
            this.virtualHost = request.virtualHost;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The key-value pairs that are configured for the headers attributes of a message. One or more key-value pairs can be concatenated to configure the headers attributes of a message. You must specify the x-match attribute as one of the valid values. You can specify custom values for other attributes. Valid values of the x-match attribute:
         * <p>
         * 
         * *   \*\*all: \*\*A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.
         * *   \*\*any: \*\*A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.
         * 
         * Separate the attributes with semicolons (;). Separate the key and value of an attribute with a colon (:). Example: x-match:all;type:report;format:pdf. This parameter is available for only headers exchanges. You can set this parameter to an arbitrary value for other types of exchanges.
         */
        public Builder argument(String argument) {
            this.putBodyParameter("Argument", argument);
            this.argument = argument;
            return this;
        }

        /**
         * The binding key.
         * <p>
         * 
         * *   If the source exchange is not a topic exchange, the binding key must meet the following conventions:
         * 
         *     *   The binding key can contain only letters, digits, hyphens (-), underscores (\_), periods (.), forward slashes (/), and at signs (@).
         *     *   The binding key must be 1 to 255 characters in length.
         * 
         * *   If the source exchange is a topic exchange, the binding key must meet the following conventions:
         * 
         *     *   The binding key can contain letters, digits, hyphens (-), underscores (\_), asterisks (\*), periods (.), number signs (#), forward slashes (/), and at signs (@).
         *     *   The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be preceded by a period (.). If a number sign (#) or an asterisk (\*) is used in the middle of a binding key, the number sign (#) or asterisk (\*) must be preceded and followed by a period (.).
         *     *   The binding key must be 1 to 255 characters in length.
         */
        public Builder bindingKey(String bindingKey) {
            this.putBodyParameter("BindingKey", bindingKey);
            this.bindingKey = bindingKey;
            return this;
        }

        /**
         * The type of the object that you want to bind to the source exchange. Valid values:
         * <p>
         * 
         * *   \*\*0: \*\*Queue
         * *   \*\*1: \*\*Exchange
         */
        public Builder bindingType(String bindingType) {
            this.putBodyParameter("BindingType", bindingType);
            this.bindingType = bindingType;
            return this;
        }

        /**
         * The name of the object that you want to bind to the source exchange. You must create the object in the ApsaraMQ for RabbitMQ console in advance. The vhost of the object is the same as the vhost to which the source exchange specified by **SourceExchange** belongs. The vhost of the source exchange is the one specified by **VirtualHost**.
         */
        public Builder destinationName(String destinationName) {
            this.putBodyParameter("DestinationName", destinationName);
            this.destinationName = destinationName;
            return this;
        }

        /**
         * The ID of the ApsaraMQ for RabbitMQ instance.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the source exchange. You must create the source exchange in the ApsaraMQ for RabbitMQ console in advance.
         */
        public Builder sourceExchange(String sourceExchange) {
            this.putBodyParameter("SourceExchange", sourceExchange);
            this.sourceExchange = sourceExchange;
            return this;
        }

        /**
         * The virtual host (vhost) name. You must create the vhost in the ApsaraMQ for RabbitMQ console in advance. The object specified by **DestinationName** and the source exchange specified by **SourceExchange** must belong to the vhost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public CreateBindingRequest build() {
            return new CreateBindingRequest(this);
        } 

    } 

}
