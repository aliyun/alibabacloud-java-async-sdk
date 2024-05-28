// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmAddressPoolLbStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressPoolLbStrategyRequest</p>
 */
public class UpdateCloudGtmAddressPoolLbStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressLbStrategy")
    private String addressLbStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
    private String sequenceLbStrategyMode;

    private UpdateCloudGtmAddressPoolLbStrategyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressLbStrategy = builder.addressLbStrategy;
        this.addressPoolId = builder.addressPoolId;
        this.clientToken = builder.clientToken;
        this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressPoolLbStrategyRequest create() {
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
     * @return addressLbStrategy
     */
    public String getAddressLbStrategy() {
        return this.addressLbStrategy;
    }

    /**
     * @return addressPoolId
     */
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return sequenceLbStrategyMode
     */
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressPoolLbStrategyRequest, Builder> {
        private String acceptLanguage; 
        private String addressLbStrategy; 
        private String addressPoolId; 
        private String clientToken; 
        private String sequenceLbStrategyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressPoolLbStrategyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressLbStrategy = request.addressLbStrategy;
            this.addressPoolId = request.addressPoolId;
            this.clientToken = request.clientToken;
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
         * AddressLbStrategy.
         */
        public Builder addressLbStrategy(String addressLbStrategy) {
            this.putQueryParameter("AddressLbStrategy", addressLbStrategy);
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }

        /**
         * AddressPoolId.
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
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
         * SequenceLbStrategyMode.
         */
        public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.putQueryParameter("SequenceLbStrategyMode", sequenceLbStrategyMode);
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }

        @Override
        public UpdateCloudGtmAddressPoolLbStrategyRequest build() {
            return new UpdateCloudGtmAddressPoolLbStrategyRequest(this);
        } 

    } 

}
