// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Load balancing policy among addresses in the address pool:</p>
         * <ul>
         * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned. The order of all addresses is rotated each time.</li>
         * <li>sequence: Sequential, for any source of DNS resolution requests, the address with the smaller sequence number (the sequence number indicates the priority of address returns, with smaller numbers having higher priority) is returned. If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
         * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the weight ratio for resolution queries.</li>
         * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sequence</p>
         */
        public Builder addressLbStrategy(String addressLbStrategy) {
            this.putQueryParameter("AddressLbStrategy", addressLbStrategy);
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }

        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89528023225442**16</p>
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when AddressLbStrategy is set to sequence. Valid values:</p>
         * <ul>
         * <li>preemptive: The address with the smallest sequence number is preferentially used if this address is recovered.</li>
         * <li>non_preemptive: The current address is still used even if the address with the smallest sequence number is recovered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preemptive</p>
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
