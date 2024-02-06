// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>LeaveSecurityGroupRequest</p>
 */
public class LeaveSecurityGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    private LeaveSecurityGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LeaveSecurityGroupRequest create() {
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
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<LeaveSecurityGroupRequest, Builder> {
        private String instanceId; 
        private String networkInterfaceId; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(LeaveSecurityGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public LeaveSecurityGroupRequest build() {
            return new LeaveSecurityGroupRequest(this);
        } 

    } 

}
