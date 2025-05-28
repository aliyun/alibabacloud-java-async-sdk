// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DeleteCostCenterRequest} extends {@link RequestModel}
 *
 * <p>DeleteCostCenterRequest</p>
 */
public class DeleteCostCenterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostCenterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long costCenterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerAccountId;

    private DeleteCostCenterRequest(Builder builder) {
        super(builder);
        this.costCenterId = builder.costCenterId;
        this.nbid = builder.nbid;
        this.ownerAccountId = builder.ownerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterId
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static final class Builder extends Request.Builder<DeleteCostCenterRequest, Builder> {
        private Long costCenterId; 
        private String nbid; 
        private Long ownerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCostCenterRequest request) {
            super(request);
            this.costCenterId = request.costCenterId;
            this.nbid = request.nbid;
            this.ownerAccountId = request.ownerAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>485938</p>
         */
        public Builder costCenterId(Long costCenterId) {
            this.putQueryParameter("CostCenterId", costCenterId);
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.putQueryParameter("OwnerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        @Override
        public DeleteCostCenterRequest build() {
            return new DeleteCostCenterRequest(this);
        } 

    } 

}
