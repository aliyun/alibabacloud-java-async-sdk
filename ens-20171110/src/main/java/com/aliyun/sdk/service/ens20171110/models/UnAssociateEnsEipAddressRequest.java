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
 * {@link UnAssociateEnsEipAddressRequest} extends {@link RequestModel}
 *
 * <p>UnAssociateEnsEipAddressRequest</p>
 */
public class UnAssociateEnsEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    private UnAssociateEnsEipAddressRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnAssociateEnsEipAddressRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<UnAssociateEnsEipAddressRequest, Builder> {
        private String allocationId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(UnAssociateEnsEipAddressRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.force = request.force;
        } 

        /**
         * <p>The ID of the EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5sqa431nx3vee8heqxfxp****</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully release the instance if it is in the Running status. Valid values:</p>
         * <ul>
         * <li>true. If you set the Force parameter to true, temporary data in the memory and storage of the instance is erased and cannot be restored after you call the operation, which is similar to the effect of a power-off action.</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public UnAssociateEnsEipAddressRequest build() {
            return new UnAssociateEnsEipAddressRequest(this);
        } 

    } 

}
