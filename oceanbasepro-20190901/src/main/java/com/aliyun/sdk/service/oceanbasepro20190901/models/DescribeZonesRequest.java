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
    @Body
    @NameInMap("DeployType")
    private String deployType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Series")
    private String series;

    private DescribeZonesRequest(Builder builder) {
        super(builder);
        this.deployType = builder.deployType;
        this.regionId = builder.regionId;
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
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    public static final class Builder extends Request.Builder<DescribeZonesRequest, Builder> {
        private String deployType; 
        private String regionId; 
        private String series; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest response) {
            super(response);
            this.deployType = response.deployType;
            this.regionId = response.regionId;
            this.series = response.series;
        } 

        /**
         * 集群的部署类型。- multiple：多机房 - single：单机房 - dual：双机房
         */
        public Builder deployType(String deployType) {
            this.putBodyParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Oceanbase集群的系列 - normal（默认）：高可用版本 - basic：基础版本
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
