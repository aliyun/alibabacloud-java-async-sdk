// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeZonesRequest</p>
 */
public class DescribeZonesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("DeployType")
    private String deployType;

    @Body
    @NameInMap("Series")
    private String series;

    private DescribeZonesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deployType = builder.deployType;
        this.series = builder.series;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesRequest create() {
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
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    public static final class Builder extends Request.Builder<DescribeZonesRequest, Builder> {
        private String regionId; 
        private String deployType; 
        private String series; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deployType = request.deployType;
            this.series = request.series;
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
         * The operation that you want to perform.   
         * <p>
         * Set the value to **DescribeZones**.
         */
        public Builder deployType(String deployType) {
            this.putBodyParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * The deployment mode.
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        @Override
        public DescribeZonesRequest build() {
            return new DescribeZonesRequest(this);
        } 

    } 

}
