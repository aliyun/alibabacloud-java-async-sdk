// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmInstanceConfigLbStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmInstanceConfigLbStrategyRequest</p>
 */
public class UpdateCloudGtmInstanceConfigLbStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolLbStrategy")
    private String addressPoolLbStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
    private String sequenceLbStrategyMode;

    private UpdateCloudGtmInstanceConfigLbStrategyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolLbStrategy = builder.addressPoolLbStrategy;
        this.clientToken = builder.clientToken;
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
        this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmInstanceConfigLbStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return addressPoolLbStrategy
     */
    public String getAddressPoolLbStrategy() {
        return this.addressPoolLbStrategy;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sequenceLbStrategyMode
     */
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmInstanceConfigLbStrategyRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolLbStrategy; 
        private String clientToken; 
        private String configId; 
        private String instanceId; 
        private String sequenceLbStrategyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmInstanceConfigLbStrategyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolLbStrategy = request.addressPoolLbStrategy;
            this.clientToken = request.clientToken;
            this.configId = request.configId;
            this.instanceId = request.instanceId;
            this.sequenceLbStrategyMode = request.sequenceLbStrategyMode;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AddressPoolLbStrategy.
         */
        public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
            this.putQueryParameter("AddressPoolLbStrategy", addressPoolLbStrategy);
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SequenceLbStrategyMode.
         */
        public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.putQueryParameter("SequenceLbStrategyMode", sequenceLbStrategyMode);
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }

        @Override
        public UpdateCloudGtmInstanceConfigLbStrategyRequest build() {
            return new UpdateCloudGtmInstanceConfigLbStrategyRequest(this);
        } 

    } 

}
