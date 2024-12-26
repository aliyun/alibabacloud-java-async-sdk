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
 * {@link RenameHoloWarehouseRequest} extends {@link RequestModel}
 *
 * <p>RenameHoloWarehouseRequest</p>
 */
public class RenameHoloWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("newWarehouseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newWarehouseName;

    private RenameHoloWarehouseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.newWarehouseName = builder.newWarehouseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameHoloWarehouseRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newWarehouseName
     */
    public String getNewWarehouseName() {
        return this.newWarehouseName;
    }

    public static final class Builder extends Request.Builder<RenameHoloWarehouseRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String newWarehouseName; 

        private Builder() {
            super();
        } 

        private Builder(RenameHoloWarehouseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.newWarehouseName = request.newWarehouseName;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>The original name of the virtual warehouse.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_warehouse</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The new name of the virtual warehouse.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new_name</p>
         */
        public Builder newWarehouseName(String newWarehouseName) {
            this.putBodyParameter("newWarehouseName", newWarehouseName);
            this.newWarehouseName = newWarehouseName;
            return this;
        }

        @Override
        public RenameHoloWarehouseRequest build() {
            return new RenameHoloWarehouseRequest(this);
        } 

    } 

}
