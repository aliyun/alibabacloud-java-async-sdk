// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Props")
    private String props;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutingKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routingKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.body = builder.body;
        this.consoleSessionId = builder.consoleSessionId;
        this.exchangeName = builder.exchangeName;
        this.instanceId = builder.instanceId;
        this.messageId = builder.messageId;
        this.props = builder.props;
        this.routingKey = builder.routingKey;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return exchangeName
     */
    public String getExchangeName() {
        return this.exchangeName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return props
     */
    public String getProps() {
        return this.props;
    }

    /**
     * @return routingKey
     */
    public String getRoutingKey() {
        return this.routingKey;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String regionId; 
        private String body; 
        private String consoleSessionId; 
        private String exchangeName; 
        private String instanceId; 
        private String messageId; 
        private String props; 
        private String routingKey; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.body = request.body;
            this.consoleSessionId = request.consoleSessionId;
            this.exchangeName = request.exchangeName;
            this.instanceId = request.instanceId;
            this.messageId = request.messageId;
            this.props = request.props;
            this.routingKey = request.routingKey;
            this.vhostName = request.vhostName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exchangeName(String exchangeName) {
            this.putQueryParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * Props.
         */
        public Builder props(String props) {
            this.putQueryParameter("Props", props);
            this.props = props;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routingKey(String routingKey) {
            this.putQueryParameter("RoutingKey", routingKey);
            this.routingKey = routingKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
