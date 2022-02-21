// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployAppEnvRequest} extends {@link RequestModel}
 *
 * <p>DeployAppEnvRequest</p>
 */
public class DeployAppEnvRequest extends Request {
    @Body
    @NameInMap("BatchInterval")
    private Integer batchInterval;

    @Body
    @NameInMap("BatchPercent")
    private Integer batchPercent;

    @Body
    @NameInMap("BatchSize")
    private Integer batchSize;

    @Body
    @NameInMap("EnvId")
    private String envId;

    @Body
    @NameInMap("PauseBetweenBatches")
    private Boolean pauseBetweenBatches;

    @Body
    @NameInMap("PkgVersionId")
    private String pkgVersionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeployAppEnvRequest(Builder builder) {
        super(builder);
        this.batchInterval = builder.batchInterval;
        this.batchPercent = builder.batchPercent;
        this.batchSize = builder.batchSize;
        this.envId = builder.envId;
        this.pauseBetweenBatches = builder.pauseBetweenBatches;
        this.pkgVersionId = builder.pkgVersionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchInterval
     */
    public Integer getBatchInterval() {
        return this.batchInterval;
    }

    /**
     * @return batchPercent
     */
    public Integer getBatchPercent() {
        return this.batchPercent;
    }

    /**
     * @return batchSize
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return pauseBetweenBatches
     */
    public Boolean getPauseBetweenBatches() {
        return this.pauseBetweenBatches;
    }

    /**
     * @return pkgVersionId
     */
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeployAppEnvRequest, Builder> {
        private Integer batchInterval; 
        private Integer batchPercent; 
        private Integer batchSize; 
        private String envId; 
        private Boolean pauseBetweenBatches; 
        private String pkgVersionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeployAppEnvRequest response) {
            super(response);
            this.batchInterval = response.batchInterval;
            this.batchPercent = response.batchPercent;
            this.batchSize = response.batchSize;
            this.envId = response.envId;
            this.pauseBetweenBatches = response.pauseBetweenBatches;
            this.pkgVersionId = response.pkgVersionId;
            this.regionId = response.regionId;
        } 

        /**
         * BatchInterval.
         */
        public Builder batchInterval(Integer batchInterval) {
            this.putBodyParameter("BatchInterval", batchInterval);
            this.batchInterval = batchInterval;
            return this;
        }

        /**
         * BatchPercent.
         */
        public Builder batchPercent(Integer batchPercent) {
            this.putBodyParameter("BatchPercent", batchPercent);
            this.batchPercent = batchPercent;
            return this;
        }

        /**
         * BatchSize.
         */
        public Builder batchSize(Integer batchSize) {
            this.putBodyParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putBodyParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * PauseBetweenBatches.
         */
        public Builder pauseBetweenBatches(Boolean pauseBetweenBatches) {
            this.putBodyParameter("PauseBetweenBatches", pauseBetweenBatches);
            this.pauseBetweenBatches = pauseBetweenBatches;
            return this;
        }

        /**
         * PkgVersionId.
         */
        public Builder pkgVersionId(String pkgVersionId) {
            this.putBodyParameter("PkgVersionId", pkgVersionId);
            this.pkgVersionId = pkgVersionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeployAppEnvRequest build() {
            return new DeployAppEnvRequest(this);
        } 

    } 

}
