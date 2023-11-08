// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExchangeRequest} extends {@link RequestModel}
 *
 * <p>CreateExchangeRequest</p>
 */
public class CreateExchangeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AlternateExchange")
    private String alternateExchange;

    @Body
    @NameInMap("AutoDeleteState")
    @Validation(required = true)
    private Boolean autoDeleteState;

    @Body
    @NameInMap("ExchangeName")
    @Validation(required = true)
    private String exchangeName;

    @Body
    @NameInMap("ExchangeType")
    @Validation(required = true)
    private String exchangeType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Internal")
    @Validation(required = true)
    private Boolean internal;

    @Body
    @NameInMap("VirtualHost")
    @Validation(required = true)
    private String virtualHost;

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

    public static final class Builder extends Request.Builder<CreateExchangeRequest, Builder> {
        private String regionId; 
        private String alternateExchange; 
        private Boolean autoDeleteState; 
        private String exchangeName; 
        private String exchangeType; 
        private String instanceId; 
        private Boolean internal; 
        private String virtualHost; 

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
         * AlternateExchange.
         */
        public Builder alternateExchange(String alternateExchange) {
            this.putBodyParameter("AlternateExchange", alternateExchange);
            this.alternateExchange = alternateExchange;
            return this;
        }

        /**
         * AutoDeleteState.
         */
        public Builder autoDeleteState(Boolean autoDeleteState) {
            this.putBodyParameter("AutoDeleteState", autoDeleteState);
            this.autoDeleteState = autoDeleteState;
            return this;
        }

        /**
         * ExchangeName.
         */
        public Builder exchangeName(String exchangeName) {
            this.putBodyParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * ExchangeType.
         */
        public Builder exchangeType(String exchangeType) {
            this.putBodyParameter("ExchangeType", exchangeType);
            this.exchangeType = exchangeType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Internal.
         */
        public Builder internal(Boolean internal) {
            this.putBodyParameter("Internal", internal);
            this.internal = internal;
            return this;
        }

        /**
         * VirtualHost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public CreateExchangeRequest build() {
            return new CreateExchangeRequest(this);
        } 

    } 

}
