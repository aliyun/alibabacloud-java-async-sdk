// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExchangeRequest} extends {@link RequestModel}
 *
 * <p>DeleteExchangeRequest</p>
 */
public class DeleteExchangeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ExchangeName")
    @Validation(required = true)
    private String exchangeName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("VirtualHost")
    @Validation(required = true)
    private String virtualHost;

    private DeleteExchangeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.exchangeName = builder.exchangeName;
        this.instanceId = builder.instanceId;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExchangeRequest create() {
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
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<DeleteExchangeRequest, Builder> {
        private String regionId; 
        private String exchangeName; 
        private String instanceId; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExchangeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.exchangeName = request.exchangeName;
            this.instanceId = request.instanceId;
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
         * ExchangeName.
         */
        public Builder exchangeName(String exchangeName) {
            this.putBodyParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
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
         * VirtualHost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public DeleteExchangeRequest build() {
            return new DeleteExchangeRequest(this);
        } 

    } 

}
