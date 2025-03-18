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
 * {@link JoinSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>JoinSecurityGroupRequest</p>
 */
public class JoinSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    private JoinSecurityGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinSecurityGroupRequest create() {
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

    public static final class Builder extends Request.Builder<JoinSecurityGroupRequest, Builder> {
        private String instanceId; 
        private String networkInterfaceId; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(JoinSecurityGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-58z57orgmt6d1****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4ph***</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public JoinSecurityGroupRequest build() {
            return new JoinSecurityGroupRequest(this);
        } 

    } 

}
