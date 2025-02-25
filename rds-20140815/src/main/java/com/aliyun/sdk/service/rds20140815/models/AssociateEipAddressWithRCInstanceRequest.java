// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link AssociateEipAddressWithRCInstanceRequest} extends {@link RequestModel}
 *
 * <p>AssociateEipAddressWithRCInstanceRequest</p>
 */
public class AssociateEipAddressWithRCInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AssociateEipAddressWithRCInstanceRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEipAddressWithRCInstanceRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateEipAddressWithRCInstanceRequest, Builder> {
        private String allocationId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEipAddressWithRCInstanceRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The EIP ID.</p>
         * <blockquote>
         * <p> If no EIP is available, create an EIP. For more information, see <a href="https://help.aliyun.com/document_detail/292841.html">Create an EIP</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eip-bp166out2x4bpcf******</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-i322y2t562oh7o******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AssociateEipAddressWithRCInstanceRequest build() {
            return new AssociateEipAddressWithRCInstanceRequest(this);
        } 

    } 

}
