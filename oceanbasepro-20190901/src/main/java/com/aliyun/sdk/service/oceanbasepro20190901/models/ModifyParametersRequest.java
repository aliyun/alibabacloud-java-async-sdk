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
         * ??????????????? ?????????????????????CLUSTER)????????????TENANT???
         */
        public Builder dimension(String dimension) {
            this.putBodyParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * ?????????????????????????????? ??????????????????????????????????????????????????????????????????????????????TenantId???
         */
        public Builder dimensionValue(String dimensionValue) {
            this.putBodyParameter("DimensionValue", dimensionValue);
            this.dimensionValue = dimensionValue;
            return this;
        }

        /**
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ??????????????? ????????????Json???????????????????????????????????????????????????????????????????????????Name??????????????????Value?????? ????????????????????????????????????????????????????????????????????????????????????DescribeParameters???
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * ??????ID???
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
