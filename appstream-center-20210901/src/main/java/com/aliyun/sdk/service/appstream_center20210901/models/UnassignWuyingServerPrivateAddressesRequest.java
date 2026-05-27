// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UnassignWuyingServerPrivateAddressesRequest} extends {@link RequestModel}
 *
 * <p>UnassignWuyingServerPrivateAddressesRequest</p>
 */
public class UnassignWuyingServerPrivateAddressesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddresses")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> privateIpAddresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wuyingServerId;

    private UnassignWuyingServerPrivateAddressesRequest(Builder builder) {
        super(builder);
        this.privateIpAddresses = builder.privateIpAddresses;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignWuyingServerPrivateAddressesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privateIpAddresses
     */
    public java.util.List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<UnassignWuyingServerPrivateAddressesRequest, Builder> {
        private java.util.List<String> privateIpAddresses; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(UnassignWuyingServerPrivateAddressesRequest request) {
            super(request);
            this.privateIpAddresses = request.privateIpAddresses;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10.0.0.2&quot;,&quot;10.0.0.3&quot;]</p>
         */
        public Builder privateIpAddresses(java.util.List<String> privateIpAddresses) {
            this.putBodyParameter("PrivateIpAddresses", privateIpAddresses);
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-bp1234567890abcde</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public UnassignWuyingServerPrivateAddressesRequest build() {
            return new UnassignWuyingServerPrivateAddressesRequest(this);
        } 

    } 

}
