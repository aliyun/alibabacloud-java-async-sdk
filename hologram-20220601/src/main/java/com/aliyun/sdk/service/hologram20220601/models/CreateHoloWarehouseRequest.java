// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHoloWarehouseRequest} extends {@link RequestModel}
 *
 * <p>CreateHoloWarehouseRequest</p>
 */
public class CreateHoloWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateHoloWarehouseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.cpu = builder.cpu;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoloWarehouseRequest create() {
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
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateHoloWarehouseRequest, Builder> {
        private String instanceId; 
        private String cpu; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoloWarehouseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.cpu = request.cpu;
            this.name = request.name;
        } 

        /**
         * <p>The instance ID. This parameter is required.</p>
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
         * <p>The specifications of the virtual warehouse. The number of vCPUs must be an integer multiple of 16 CPUs. Minimum value: 16.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder cpu(String cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The name of the virtual warehouse.</p>
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

        @Override
        public CreateHoloWarehouseRequest build() {
            return new CreateHoloWarehouseRequest(this);
        } 

    } 

}
