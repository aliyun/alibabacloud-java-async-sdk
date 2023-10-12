// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeliveryArchVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeliveryArchVersionRequest</p>
 */
public class DeleteDeliveryArchVersionRequest extends Request {
    @Body
    @NameInMap("DeliveryArchVersionId")
    @Validation(required = true)
    private String deliveryArchVersionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDeliveryArchVersionRequest(Builder builder) {
        super(builder);
        this.deliveryArchVersionId = builder.deliveryArchVersionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeliveryArchVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryArchVersionId
     */
    public String getDeliveryArchVersionId() {
        return this.deliveryArchVersionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDeliveryArchVersionRequest, Builder> {
        private String deliveryArchVersionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeliveryArchVersionRequest request) {
            super(request);
            this.deliveryArchVersionId = request.deliveryArchVersionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeliveryArchVersionId.
         */
        public Builder deliveryArchVersionId(String deliveryArchVersionId) {
            this.putBodyParameter("DeliveryArchVersionId", deliveryArchVersionId);
            this.deliveryArchVersionId = deliveryArchVersionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDeliveryArchVersionRequest build() {
            return new DeleteDeliveryArchVersionRequest(this);
        } 

    } 

}
