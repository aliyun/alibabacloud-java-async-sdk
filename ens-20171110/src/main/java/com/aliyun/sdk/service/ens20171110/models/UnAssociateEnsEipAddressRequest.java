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

    private UnAssociateEnsEipAddressRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
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

    public static final class Builder extends Request.Builder<UnAssociateEnsEipAddressRequest, Builder> {
        private String allocationId; 

        private Builder() {
            super();
        } 

        private Builder(UnAssociateEnsEipAddressRequest request) {
            super(request);
            this.allocationId = request.allocationId;
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

        @Override
        public UnAssociateEnsEipAddressRequest build() {
            return new UnAssociateEnsEipAddressRequest(this);
        } 

    } 

}
