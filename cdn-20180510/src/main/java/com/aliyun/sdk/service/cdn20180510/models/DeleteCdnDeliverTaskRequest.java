// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteCdnDeliverTaskRequest</p>
 */
public class DeleteCdnDeliverTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deliverId;

    private DeleteCdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliverId = builder.deliverId;
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

    public static final class Builder extends Request.Builder<DeleteCdnDeliverTaskRequest, Builder> {
        private Long deliverId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCdnDeliverTaskRequest request) {
            super(request);
            this.deliverId = request.deliverId;
        } 

        /**
         * The ID of the tracking task that you want to delete. You can call the [DescribeCdnDeliverList](~~270877~~) operation to query task IDs.
         */
        public Builder deliverId(Long deliverId) {
            this.putQueryParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        @Override
        public DeleteCdnDeliverTaskRequest build() {
            return new DeleteCdnDeliverTaskRequest(this);
        } 

    } 

}
