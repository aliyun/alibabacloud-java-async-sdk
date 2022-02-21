// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteCdnDeliverTaskRequest</p>
 */
public class DeleteCdnDeliverTaskRequest extends Request {
    @Query
    @NameInMap("DeliverId")
    @Validation(required = true)
    private Long deliverId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteCdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliverId = builder.deliverId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCdnDeliverTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCdnDeliverTaskRequest, Builder> {
        private Long deliverId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCdnDeliverTaskRequest response) {
            super(response);
            this.deliverId = response.deliverId;
            this.ownerId = response.ownerId;
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
        public DeleteCdnDeliverTaskRequest build() {
            return new DeleteCdnDeliverTaskRequest(this);
        } 

    } 

}
