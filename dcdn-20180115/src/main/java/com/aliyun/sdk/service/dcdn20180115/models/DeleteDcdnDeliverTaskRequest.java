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

    private DeleteDcdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliverId = builder.deliverId;
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

    public static final class Builder extends Request.Builder<DeleteDcdnDeliverTaskRequest, Builder> {
        private Long deliverId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnDeliverTaskRequest request) {
            super(request);
            this.deliverId = request.deliverId;
        } 

        /**
         * The IDs of the tracking tasks that you want to delete. You can call the [DescribeCdnDeliverList](~~270043~~) operation to query task IDs.
         */
        public Builder deliverId(Long deliverId) {
            this.putQueryParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        @Override
        public DeleteDcdnDeliverTaskRequest build() {
            return new DeleteDcdnDeliverTaskRequest(this);
        } 

    } 

}
