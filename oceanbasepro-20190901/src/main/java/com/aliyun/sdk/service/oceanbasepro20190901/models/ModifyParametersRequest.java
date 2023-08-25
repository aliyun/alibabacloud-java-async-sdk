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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private ModifyParametersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dimension = builder.dimension;
        this.dimensionValue = builder.dimensionValue;
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyParametersRequest, Builder> {
        private String regionId; 
        private String dimension; 
        private String dimensionValue; 
        private String instanceId; 
        private String parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParametersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dimension = request.dimension;
            this.dimensionValue = request.dimensionValue;
            this.instanceId = request.instanceId;
            this.parameters = request.parameters;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder dimension(String dimension) {
            this.putBodyParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * The cause of the modification failure.
         */
        public Builder dimensionValue(String dimensionValue) {
            this.putBodyParameter("DimensionValue", dimensionValue);
            this.dimensionValue = dimensionValue;
            return this;
        }

        /**
         * Alibaba Cloud CLI
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The resource ID of the parameter type.    
         * <p>
         * You can leave this parameter unspecified when you call this operation to modify cluster parameters. In the case of tenant parameters, pass the tenant ID.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public ModifyParametersRequest build() {
            return new ModifyParametersRequest(this);
        } 

    } 

}
