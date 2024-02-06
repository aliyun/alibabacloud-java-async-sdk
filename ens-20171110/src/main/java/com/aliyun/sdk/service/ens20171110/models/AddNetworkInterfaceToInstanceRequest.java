// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNetworkInterfaceToInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddNetworkInterfaceToInstanceRequest</p>
 */
public class AddNetworkInterfaceToInstanceRequest extends Request {
    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Networks")
    @Validation(required = true)
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
         * Specifies whether to specify the instance.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The network. The value is a JSON string. Only IPv6 is supported. Sample code of an IPv6 network: \[{ "ipType": "public", "ipAddressType": "ipv6" }]
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
