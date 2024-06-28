// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCostUnitRequest} extends {@link RequestModel}
 *
 * <p>DeleteCostUnitRequest</p>
 */
public class DeleteCostUnitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long unitId;

    private DeleteCostUnitRequest(Builder builder) {
        super(builder);
        this.ownerUid = builder.ownerUid;
        this.unitId = builder.unitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerUid
     */
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return unitId
     */
    public Long getUnitId() {
        return this.unitId;
    }

    public static final class Builder extends Request.Builder<DeleteCostUnitRequest, Builder> {
        private Long ownerUid; 
        private Long unitId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCostUnitRequest request) {
            super(request);
            this.ownerUid = request.ownerUid;
            this.unitId = request.unitId;
        } 

        /**
         * The user ID of the cost center owner.
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * The ID of the cost center. A value of -1 indicates the root cost center.
         */
        public Builder unitId(Long unitId) {
            this.putQueryParameter("UnitId", unitId);
            this.unitId = unitId;
            return this;
        }

        @Override
        public DeleteCostUnitRequest build() {
            return new DeleteCostUnitRequest(this);
        } 

    } 

}
