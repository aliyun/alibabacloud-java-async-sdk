// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link DeleteWarehouseScheduleTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteWarehouseScheduleTaskRequest</p>
 */
public class DeleteWarehouseScheduleTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warehouseId")
    private String warehouseId;

    private DeleteWarehouseScheduleTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.id = builder.id;
        this.warehouseId = builder.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWarehouseScheduleTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return warehouseId
     */
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<DeleteWarehouseScheduleTaskRequest, Builder> {
        private String instanceId; 
        private String id; 
        private String warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWarehouseScheduleTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.id = request.id;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-i7m2v08uu00a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2034449120420339713</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * warehouseId.
         */
        public Builder warehouseId(String warehouseId) {
            this.putBodyParameter("warehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public DeleteWarehouseScheduleTaskRequest build() {
            return new DeleteWarehouseScheduleTaskRequest(this);
        } 

    } 

}
