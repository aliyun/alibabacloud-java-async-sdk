// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleHoloWarehouseRequest} extends {@link RequestModel}
 *
 * <p>ScaleHoloWarehouseRequest</p>
 */
public class ScaleHoloWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private ScaleHoloWarehouseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.cpu = builder.cpu;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleHoloWarehouseRequest create() {
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
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ScaleHoloWarehouseRequest, Builder> {
        private String instanceId; 
        private Long cpu; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ScaleHoloWarehouseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.cpu = request.cpu;
            this.name = request.name;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ScaleHoloWarehouseRequest build() {
            return new ScaleHoloWarehouseRequest(this);
        } 

    } 

}
