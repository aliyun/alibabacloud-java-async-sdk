// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnDeliverTaskRequest</p>
 */
public class DeleteDcdnDeliverTaskRequest extends Request {
    @Query
    @NameInMap("DeliverId")
    @Validation(required = true)
    private Long deliverId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteDcdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliverId = builder.deliverId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnDeliverTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliverId
     */
    public Long getDeliverId() {
        return this.deliverId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteDcdnDeliverTaskRequest, Builder> {
        private Long deliverId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnDeliverTaskRequest request) {
            super(request);
            this.deliverId = request.deliverId;
            this.ownerId = request.ownerId;
        } 

        /**
         * DeliverId.
         */
        public Builder deliverId(Long deliverId) {
            this.putQueryParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteDcdnDeliverTaskRequest build() {
            return new DeleteDcdnDeliverTaskRequest(this);
        } 

    } 

}
