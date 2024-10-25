// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddNetworkInterfaceToInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddNetworkInterfaceToInstanceRequest</p>
 */
public class AddNetworkInterfaceToInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Boolean autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Networks")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networks;

    private AddNetworkInterfaceToInstanceRequest(Builder builder) {
        super(builder);
        this.autoStart = builder.autoStart;
        this.instanceId = builder.instanceId;
        this.networks = builder.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNetworkInterfaceToInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networks
     */
    public String getNetworks() {
        return this.networks;
    }

    public static final class Builder extends Request.Builder<AddNetworkInterfaceToInstanceRequest, Builder> {
        private Boolean autoStart; 
        private String instanceId; 
        private String networks; 

        private Builder() {
            super();
        } 

        private Builder(AddNetworkInterfaceToInstanceRequest request) {
            super(request);
            this.autoStart = request.autoStart;
            this.instanceId = request.instanceId;
            this.networks = request.networks;
        } 

        /**
         * <p>Specifies whether to specify the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourInstance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The network. The value is a JSON string. Only IPv6 is supported. Sample code of an IPv6 network: [{ &quot;ipType&quot;: &quot;public&quot;, &quot;ipAddressType&quot;: &quot;ipv6&quot; }]</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ipType&quot;: &quot;public&quot;, &quot;ipAddressType&quot;: &quot;ipv6&quot; }]</p>
         */
        public Builder networks(String networks) {
            this.putQueryParameter("Networks", networks);
            this.networks = networks;
            return this;
        }

        @Override
        public AddNetworkInterfaceToInstanceRequest build() {
            return new AddNetworkInterfaceToInstanceRequest(this);
        } 

    } 

}
