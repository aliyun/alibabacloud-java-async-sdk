// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartAppEnvRequest} extends {@link RequestModel}
 *
 * <p>RestartAppEnvRequest</p>
 */
public class RestartAppEnvRequest extends Request {
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

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private RestartAppEnvRequest(Builder builder) {
        super(builder);
        this.batchInterval = builder.batchInterval;
        this.batchPercent = builder.batchPercent;
        this.batchSize = builder.batchSize;
        this.envId = builder.envId;
        this.pauseBetweenBatches = builder.pauseBetweenBatches;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartAppEnvRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RestartAppEnvRequest, Builder> {
        private Integer batchInterval; 
        private Integer batchPercent; 
        private Integer batchSize; 
        private String envId; 
        private Boolean pauseBetweenBatches; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RestartAppEnvRequest response) {
            super(response);
            this.batchInterval = response.batchInterval;
            this.batchPercent = response.batchPercent;
            this.batchSize = response.batchSize;
            this.envId = response.envId;
            this.pauseBetweenBatches = response.pauseBetweenBatches;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RestartAppEnvRequest build() {
            return new RestartAppEnvRequest(this);
        } 

    } 

}
