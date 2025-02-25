// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDcdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnDeliverTaskRequest</p>
 */
public class DeleteDcdnDeliverTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of the tracking tasks that you want to delete. You can call the <a href="https://help.aliyun.com/document_detail/270043.html">DescribeCdnDeliverList</a> operation to query task IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
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
