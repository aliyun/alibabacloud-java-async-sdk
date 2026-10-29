// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyInstanceNetworkAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNetworkAttributeRequest</p>
 */
public class ModifyInstanceNetworkAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private ModifyInstanceNetworkAttributeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.privateIpAddress = builder.privateIpAddress;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNetworkAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNetworkAttributeRequest, Builder> {
        private String instanceId; 
        private String privateIpAddress; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNetworkAttributeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.privateIpAddress = request.privateIpAddress;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The ENS instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5myukg7hnpbto7m024002****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new private IP address.
         * Default value: If this parameter is not specified, an IP address is randomly assigned from the CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <ul>
         * <li>If the specified ID is the current vSwitch of the instance, the vSwitch of the instance remains unchanged.</li>
         * <li>If the specified ID is a new vSwitch, the new and old vSwitches must belong to the same edge zone.</li>
         * <li>If this parameter is not specified, a value is randomly assigned from the CIDR block of the original vSwitch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-5rllcjb3ol6duzjdnbm1o****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyInstanceNetworkAttributeRequest build() {
            return new ModifyInstanceNetworkAttributeRequest(this);
        } 

    } 

}
