// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotVehicleTableItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiotVehicleTableItemRequest</p>
 */
public class DeleteAiotVehicleTableItemRequest extends Request {
    @Body
    @NameInMap("Id")
    private String id;

    @Body
    @NameInMap("VehicleTableId")
    private String vehicleTableId;

    @Body
    @NameInMap("VehicleTableItemId")
    private String vehicleTableItemId;

    private DeleteAiotVehicleTableItemRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.vehicleTableId = builder.vehicleTableId;
        this.vehicleTableItemId = builder.vehicleTableItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiotVehicleTableItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return vehicleTableId
     */
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    /**
     * @return vehicleTableItemId
     */
    public String getVehicleTableItemId() {
        return this.vehicleTableItemId;
    }

    public static final class Builder extends Request.Builder<DeleteAiotVehicleTableItemRequest, Builder> {
        private String id; 
        private String vehicleTableId; 
        private String vehicleTableItemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiotVehicleTableItemRequest response) {
            super(response);
            this.id = response.id;
            this.vehicleTableId = response.vehicleTableId;
            this.vehicleTableItemId = response.vehicleTableItemId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * VehicleTableId.
         */
        public Builder vehicleTableId(String vehicleTableId) {
            this.putBodyParameter("VehicleTableId", vehicleTableId);
            this.vehicleTableId = vehicleTableId;
            return this;
        }

        /**
         * VehicleTableItemId.
         */
        public Builder vehicleTableItemId(String vehicleTableItemId) {
            this.putBodyParameter("VehicleTableItemId", vehicleTableItemId);
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }

        @Override
        public DeleteAiotVehicleTableItemRequest build() {
            return new DeleteAiotVehicleTableItemRequest(this);
        } 

    } 

}
