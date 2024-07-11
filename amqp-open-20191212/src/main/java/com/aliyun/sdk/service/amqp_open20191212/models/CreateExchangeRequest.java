// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExchangeRequest} extends {@link RequestModel}
 *
 * <p>CreateExchangeRequest</p>
 */
public class CreateExchangeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlternateExchange")
    private String alternateExchange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDeleteState")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoDeleteState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExchangeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExchangeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Internal")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean internal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XDelayedType")
    private String xDelayedType;

    private CreateExchangeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alternateExchange = builder.alternateExchange;
        this.autoDeleteState = builder.autoDeleteState;
        this.exchangeName = builder.exchangeName;
        this.exchangeType = builder.exchangeType;
        this.instanceId = builder.instanceId;
        this.internal = builder.internal;
        this.virtualHost = builder.virtualHost;
        this.xDelayedType = builder.xDelayedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExchangeRequest create() {
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
     * @return alternateExchange
     */
    public String getAlternateExchange() {
        return this.alternateExchange;
    }

    /**
     * @return autoDeleteState
     */
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    /**
     * @return exchangeName
     */
    public String getExchangeName() {
        return this.exchangeName;
    }

    /**
     * @return exchangeType
     */
    public String getExchangeType() {
        return this.exchangeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internal
     */
    public Boolean getInternal() {
        return this.internal;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    /**
     * @return xDelayedType
     */
    public String getXDelayedType() {
        return this.xDelayedType;
    }

    public static final class Builder extends Request.Builder<CreateExchangeRequest, Builder> {
        private String regionId; 
        private String alternateExchange; 
        private Boolean autoDeleteState; 
        private String exchangeName; 
        private String exchangeType; 
        private String instanceId; 
        private Boolean internal; 
        private String virtualHost; 
        private String xDelayedType; 

        private Builder() {
            super();
        } 

        private Builder(CreateExchangeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alternateExchange = request.alternateExchange;
            this.autoDeleteState = request.autoDeleteState;
            this.exchangeName = request.exchangeName;
            this.exchangeType = request.exchangeType;
            this.instanceId = request.instanceId;
            this.internal = request.internal;
            this.virtualHost = request.virtualHost;
            this.xDelayedType = request.xDelayedType;
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
         * The alternate exchange. An alternate exchange is used to receive messages that fail to be routed to queues from the current exchange.
         */
        public Builder alternateExchange(String alternateExchange) {
            this.putBodyParameter("AlternateExchange", alternateExchange);
            this.alternateExchange = alternateExchange;
            return this;
        }

        /**
         * Specifies whether to automatically delete the exchange. Valid values:
         * <p>
         * 
         * *   **true**: If the last queue that is bound to the exchange is unbound, the exchange is automatically deleted.
         * *   **false**: If the last queue that is bound to the exchange is unbound, the exchange is not automatically deleted.
         */
        public Builder autoDeleteState(Boolean autoDeleteState) {
            this.putBodyParameter("AutoDeleteState", autoDeleteState);
            this.autoDeleteState = autoDeleteState;
            return this;
        }

        /**
         * The name of the exchange that you want to create. The exchange name must meet the following conventions:
         * <p>
         * 
         * *   The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs (@).
         * *   After the exchange is created, you cannot change its name. If you want to change its name, delete the exchange and create another exchange.
         */
        public Builder exchangeName(String exchangeName) {
            this.putBodyParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * The exchange type. Valid values:
         * <p>
         * 
         * *   **DIRECT**: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
         * *   **TOPIC**: This type of exchange is similar to direct exchanges. An exchange of this type routes a message to one or more queues based on the results of the fuzzy match or multi-condition match between the routing key of the message and the binding keys of the current exchange.
         * *   **FANOUT**: An exchange of this type routes all received messages to all queues bound to this exchange. You can use a fanout exchange to broadcast messages.
         * *   **HEADERS**: This type of exchange is similar to direct exchanges. The only difference is that a headers exchange routes messages based on the headers attributes instead of routing keys. When you bind a headers exchange to a queue, you must configure binding attributes in the key-value format for the binding. When you send a message to a headers exchange, you must configure the headers attributes in the key-value format for the message. After a headers exchange receives a message, the exchange routes the message based on the matching results between the headers attributes of the message and the binding attributes of the bound queues.
         * *   **X-CONSISTENT-HASH**: An exchange of this type allows you to perform hash calculations on routing keys or header values and use consistent hashing to route a message to different queues.
         */
        public Builder exchangeType(String exchangeType) {
            this.putBodyParameter("ExchangeType", exchangeType);
            this.exchangeType = exchangeType;
            return this;
        }

        /**
         * The ID of the ApsaraMQ for RabbitMQ for which you want to create an exchange.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether the exchange is an internal exchange. Valid values:
         * <p>
         * 
         * *   **false**
         * *   **true**
         */
        public Builder internal(Boolean internal) {
            this.putBodyParameter("Internal", internal);
            this.internal = internal;
            return this;
        }

        /**
         * The name of the vhost to which the exchange that you want to create belongs.
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        /**
         * XDelayedType.
         */
        public Builder xDelayedType(String xDelayedType) {
            this.putBodyParameter("XDelayedType", xDelayedType);
            this.xDelayedType = xDelayedType;
            return this;
        }

        @Override
        public CreateExchangeRequest build() {
            return new CreateExchangeRequest(this);
        } 

    } 

}
