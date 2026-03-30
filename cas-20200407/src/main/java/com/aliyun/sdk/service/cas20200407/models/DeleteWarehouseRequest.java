// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWarehouseRequest} extends {@link RequestModel}
 *
 * <p>DeleteWarehouseRequest</p>
 */
public class DeleteWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseInstanceId")
    private String warehouseInstanceId;

    private DeleteWarehouseRequest(Builder builder) {
        super(builder);
        this.warehouseInstanceId = builder.warehouseInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWarehouseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return warehouseInstanceId
     */
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteWarehouseRequest, Builder> {
        private String warehouseInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWarehouseRequest request) {
            super(request);
            this.warehouseInstanceId = request.warehouseInstanceId;
        } 

        /**
         * WarehouseInstanceId.
         */
        public Builder warehouseInstanceId(String warehouseInstanceId) {
            this.putQueryParameter("WarehouseInstanceId", warehouseInstanceId);
            this.warehouseInstanceId = warehouseInstanceId;
            return this;
        }

        @Override
        public DeleteWarehouseRequest build() {
            return new DeleteWarehouseRequest(this);
        } 

    } 

}
