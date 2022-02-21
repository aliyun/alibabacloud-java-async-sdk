// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyParametersRequest</p>
 */
public class ModifyParametersRequest extends Request {
    @Body
    @NameInMap("Dimension")
    @Validation(required = true)
    private String dimension;

    @Body
    @NameInMap("DimensionValue")
    private String dimensionValue;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyParametersRequest(Builder builder) {
        super(builder);
        this.dimension = builder.dimension;
        this.dimensionValue = builder.dimensionValue;
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return dimensionValue
     */
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyParametersRequest, Builder> {
        private String dimension; 
        private String dimensionValue; 
        private String instanceId; 
        private String parameters; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParametersRequest response) {
            super(response);
            this.dimension = response.dimension;
            this.dimensionValue = response.dimensionValue;
            this.instanceId = response.instanceId;
            this.parameters = response.parameters;
            this.regionId = response.regionId;
        } 

        /**
         * 参数类型。 当前支持集群（CLUSTER)和租户（TENANT）
         */
        public Builder dimension(String dimension) {
            this.putBodyParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * 参数类型的资源标识。 如果为集群参数可以不填，若为租户的参数，则传入租户的TenantId。
         */
        public Builder dimensionValue(String dimensionValue) {
            this.putBodyParameter("DimensionValue", dimensionValue);
            this.dimensionValue = dimensionValue;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 参数信息。 其为一个Json格式的数组，数组中每个对象包括两个元素：参数名称（Name）和参数值（Value）。 注意：集群和租户可修改的参数名称和参数值的范围不同，详见DescribeParameters。
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyParametersRequest build() {
            return new ModifyParametersRequest(this);
        } 

    } 

}
