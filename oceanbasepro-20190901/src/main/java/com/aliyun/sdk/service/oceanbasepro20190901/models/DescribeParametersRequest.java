// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeParametersRequest</p>
 */
public class DescribeParametersRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeParametersRequest(Builder builder) {
        super(builder);
        this.dimension = builder.dimension;
        this.dimensionValue = builder.dimensionValue;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeParametersRequest, Builder> {
        private String dimension; 
        private String dimensionValue; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParametersRequest response) {
            super(response);
            this.dimension = response.dimension;
            this.dimensionValue = response.dimensionValue;
            this.instanceId = response.instanceId;
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
         * ??????ID???
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeParametersRequest build() {
            return new DescribeParametersRequest(this);
        } 

    } 

}
