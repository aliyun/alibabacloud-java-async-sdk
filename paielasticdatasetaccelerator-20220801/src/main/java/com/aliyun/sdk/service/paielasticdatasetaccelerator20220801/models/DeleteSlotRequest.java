// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSlotRequest} extends {@link RequestModel}
 *
 * <p>DeleteSlotRequest</p>
 */
public class DeleteSlotRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("SlotId")
    @Validation(required = true)
    private String slotId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    private DeleteSlotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.slotId = builder.slotId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSlotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteSlotRequest, Builder> {
        private String regionId; 
        private String slotId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSlotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.slotId = request.slotId;
            this.force = request.force;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteSlotRequest build() {
            return new DeleteSlotRequest(this);
        } 

    } 

}
