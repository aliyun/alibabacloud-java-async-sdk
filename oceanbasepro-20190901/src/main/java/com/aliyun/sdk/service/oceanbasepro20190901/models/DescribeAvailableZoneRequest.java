// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableZoneRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableZoneRequest</p>
 */
public class DescribeAvailableZoneRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DeployType")
    private String deployType;

    @Body
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("ObVersion")
    private String obVersion;

    @Body
    @NameInMap("Series")
    private String series;

    @Body
    @NameInMap("Spec")
    private String spec;

    private DescribeAvailableZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deployType = builder.deployType;
        this.instanceType = builder.instanceType;
        this.obVersion = builder.obVersion;
        this.series = builder.series;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableZoneRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return obVersion
     */
    public String getObVersion() {
        return this.obVersion;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableZoneRequest, Builder> {
        private String regionId; 
        private String deployType; 
        private String instanceType; 
        private String obVersion; 
        private String series; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deployType = request.deployType;
            this.instanceType = request.instanceType;
            this.obVersion = request.obVersion;
            this.series = request.series;
            this.spec = request.spec;
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
         * DeployType.
         */
        public Builder deployType(String deployType) {
            this.putBodyParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * ObVersion.
         */
        public Builder obVersion(String obVersion) {
            this.putBodyParameter("ObVersion", obVersion);
            this.obVersion = obVersion;
            return this;
        }

        /**
         * Series.
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public DescribeAvailableZoneRequest build() {
            return new DescribeAvailableZoneRequest(this);
        } 

    } 

}
