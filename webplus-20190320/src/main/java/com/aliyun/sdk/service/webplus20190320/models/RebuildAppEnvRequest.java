// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildAppEnvRequest} extends {@link RequestModel}
 *
 * <p>RebuildAppEnvRequest</p>
 */
public class RebuildAppEnvRequest extends Request {
    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private RebuildAppEnvRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.envId = builder.envId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RebuildAppEnvRequest, Builder> {
        private Boolean dryRun; 
        private String envId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildAppEnvRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.envId = response.envId;
            this.regionId = response.regionId;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RebuildAppEnvRequest build() {
            return new RebuildAppEnvRequest(this);
        } 

    } 

}
