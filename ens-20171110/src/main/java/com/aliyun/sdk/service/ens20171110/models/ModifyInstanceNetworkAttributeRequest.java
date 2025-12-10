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
         * <p>The ID of the ENS instance.</p>
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
         * <p>The new private IP address of the ECS instance. By default, if this parameter is empty, a private IP address is randomly assigned from the CIDR block of the specified vSwitch.</p>
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
         * <p>The vSwitch IDs.</p>
         * <ul>
         * <li>If you set this parameter to the ID of the current vSwitch, the vSwitch of the ECS instance remains unchanged.</li>
         * <li>The input ID is a new vSwitch, and the new and old vSwitches must belong to the same node.</li>
         * <li>By default, if this parameter is not specified, a private IP address is randomly assigned from within the CIDR block of the specified vSwitch.</li>
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
