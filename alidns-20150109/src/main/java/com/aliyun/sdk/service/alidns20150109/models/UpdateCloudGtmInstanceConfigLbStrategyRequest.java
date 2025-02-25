// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
         * <p>The language in which the returned results are displayed. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
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
         * <p>The new policy for load balancing between address pools. Valid values:</p>
         * <ul>
         * <li>round_robin: All address pools are returned for Domain Name System (DNS) requests from any source. All address pools are sorted in round-robin mode each time they are returned.</li>
         * <li>sequence: The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number indicates the priority for returning the address pool. A smaller sequence number indicates a higher priority. If the address pool with the smallest sequence number is unavailable, the address pool with the second smallest sequence number is returned.</li>
         * <li>weight: You can set a different weight value for each address pool. This way, address pools are returned based on the weight values.</li>
         * <li>source_nearest: GTM returns different address pools based on the sources of DNS requests. This way, users can access nearby address pools.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sequence</p>
         */
        public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
            this.putQueryParameter("AddressPoolLbStrategy", addressPoolLbStrategy);
            this.addressPoolLbStrategy = addressPoolLbStrategy;
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
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * <p>You can call the <a href="~~ListCloudGtmInstanceConfigs~~">ListCloudGtmInstanceConfigs</a> operation to query the configuration ID of the desired access domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Config-000**11</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the GTM 3.0 instance for which you want to modify the load balancing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is required when AddressPoolLbStrategy is set to sequence. Valid values:</p>
         * <ul>
         * <li>preemptive: The address pool with the smallest sequence number is preferentially used if this address pool is recovered.</li>
         * <li>non_preemptive: The current address pool is still used even if the address pool with the smallest sequence number is recovered.</li>
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
        public UpdateCloudGtmInstanceConfigLbStrategyRequest build() {
            return new UpdateCloudGtmInstanceConfigLbStrategyRequest(this);
        } 

    } 

}
