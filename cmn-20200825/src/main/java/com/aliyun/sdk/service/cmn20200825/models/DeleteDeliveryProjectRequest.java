// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeliveryProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeliveryProjectRequest</p>
 */
public class DeleteDeliveryProjectRequest extends Request {
    @Body
    @NameInMap("DeliveryProjectId")
    @Validation(required = true)
    private String deliveryProjectId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDeliveryProjectRequest(Builder builder) {
        super(builder);
        this.deliveryProjectId = builder.deliveryProjectId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeliveryProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryProjectId
     */
    public String getDeliveryProjectId() {
        return this.deliveryProjectId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDeliveryProjectRequest, Builder> {
        private String deliveryProjectId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeliveryProjectRequest request) {
            super(request);
            this.deliveryProjectId = request.deliveryProjectId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeliveryProjectId.
         */
        public Builder deliveryProjectId(String deliveryProjectId) {
            this.putBodyParameter("DeliveryProjectId", deliveryProjectId);
            this.deliveryProjectId = deliveryProjectId;
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
        public DeleteDeliveryProjectRequest build() {
            return new DeleteDeliveryProjectRequest(this);
        } 

    } 

}
