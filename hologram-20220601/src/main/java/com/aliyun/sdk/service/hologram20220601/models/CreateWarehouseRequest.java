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
 * {@link CreateWarehouseRequest} extends {@link RequestModel}
 *
 * <p>CreateWarehouseRequest</p>
 */
public class CreateWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    private String cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warehouseName")
    private String warehouseName;

    private CreateWarehouseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.cpu = builder.cpu;
        this.warehouseName = builder.warehouseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarehouseRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return warehouseName
     */
    public String getWarehouseName() {
        return this.warehouseName;
    }

    public static final class Builder extends Request.Builder<CreateWarehouseRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String config; 
        private String cpu; 
        private String warehouseName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWarehouseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.cpu = request.cpu;
            this.warehouseName = request.warehouseName;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-j672yny9g001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The number of vCPUs.</p>
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
         * 
         * <strong>example:</strong>
         * <p>warehouse-test</p>
         */
        public Builder warehouseName(String warehouseName) {
            this.putBodyParameter("warehouseName", warehouseName);
            this.warehouseName = warehouseName;
            return this;
        }

        @Override
        public CreateWarehouseRequest build() {
            return new CreateWarehouseRequest(this);
        } 

    } 

}
