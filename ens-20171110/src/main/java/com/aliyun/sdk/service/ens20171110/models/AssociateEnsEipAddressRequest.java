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
 * {@link AssociateEnsEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateEnsEipAddressRequest</p>
 */
public class AssociateEnsEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Standby")
    private Boolean standby;

    private AssociateEnsEipAddressRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.standby = builder.standby;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEnsEipAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return standby
     */
    public Boolean getStandby() {
        return this.standby;
    }

    public static final class Builder extends Request.Builder<AssociateEnsEipAddressRequest, Builder> {
        private String allocationId; 
        private String instanceId; 
        private String instanceType; 
        private Boolean standby; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEnsEipAddressRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.standby = request.standby;
        } 

        /**
         * <p>The ID of the EIP that you want to associate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5sc1sgcrsrwgwdvx44hru3p63</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The ID of the cloud service with which the EIP is associated.</p>
         * <blockquote>
         * <p> You can specify the ID of an Edge Load Balancer (ELB) instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5saivuir6b1mupxjfbhmk1xkb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of instance with which you want to associate the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Nat</strong>: NAT gateway.</li>
         * <li><strong>SlbInstance</strong>: Edge Load Balancer (ELB) instance.</li>
         * <li><strong>NetworkInterface</strong>: secondary elastic network interface (ENI).</li>
         * <li><strong>NatSlbInstance</strong>: If you want to associate multiple EIPs with an ELB instance, you need to set the parameter to this value.</li>
         * <li><strong>EnsInstance</strong> (default): ENS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether the EIP is a secondary EIP. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder standby(Boolean standby) {
            this.putQueryParameter("Standby", standby);
            this.standby = standby;
            return this;
        }

        @Override
        public AssociateEnsEipAddressRequest build() {
            return new AssociateEnsEipAddressRequest(this);
        } 

    } 

}
