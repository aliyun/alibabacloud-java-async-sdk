// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeZonesRequest</p>
 */
public class DescribeZonesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpuArch")
    private String cpuArch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Series")
    private String series;

    private DescribeZonesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpuArch = builder.cpuArch;
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
     * @return cpuArch
     */
    public String getCpuArch() {
        return this.cpuArch;
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
        private String cpuArch; 
        private String deployType; 
        private String series; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpuArch = request.cpuArch;
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
         * CpuArch.
         */
        public Builder cpuArch(String cpuArch) {
            this.putBodyParameter("CpuArch", cpuArch);
            this.cpuArch = cpuArch;
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
