// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBindingRequest} extends {@link RequestModel}
 *
 * <p>DeleteBindingRequest</p>
 */
public class DeleteBindingRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BindingKey")
    @Validation(required = true)
    private String bindingKey;

    @Body
    @NameInMap("BindingType")
    @Validation(required = true)
    private String bindingType;

    @Body
    @NameInMap("DestinationName")
    @Validation(required = true)
    private String destinationName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("SourceExchange")
    @Validation(required = true)
    private String sourceExchange;

    @Body
    @NameInMap("VirtualHost")
    @Validation(required = true)
    private String virtualHost;

    private DeleteBindingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static DeleteBindingRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBindingRequest, Builder> {
        private String regionId; 
        private String bindingKey; 
        private String bindingType; 
        private String destinationName; 
        private String instanceId; 
        private String sourceExchange; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBindingRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * BindingKey.
         */
        public Builder bindingKey(String bindingKey) {
            this.putBodyParameter("BindingKey", bindingKey);
            this.bindingKey = bindingKey;
            return this;
        }

        /**
         * BindingType.
         */
        public Builder bindingType(String bindingType) {
            this.putBodyParameter("BindingType", bindingType);
            this.bindingType = bindingType;
            return this;
        }

        /**
         * DestinationName.
         */
        public Builder destinationName(String destinationName) {
            this.putBodyParameter("DestinationName", destinationName);
            this.destinationName = destinationName;
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
         * SourceExchange.
         */
        public Builder sourceExchange(String sourceExchange) {
            this.putBodyParameter("SourceExchange", sourceExchange);
            this.sourceExchange = sourceExchange;
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
        public DeleteBindingRequest build() {
            return new DeleteBindingRequest(this);
        } 

    } 

}
