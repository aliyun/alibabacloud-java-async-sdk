// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateAppEnvRequest} extends {@link RequestModel}
 *
 * <p>TerminateAppEnvRequest</p>
 */
public class TerminateAppEnvRequest extends Request {
    @Body
    @NameInMap("DryRun")
    private String dryRun;

    @Body
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private TerminateAppEnvRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.envId = builder.envId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
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

    public static final class Builder extends Request.Builder<TerminateAppEnvRequest, Builder> {
        private String dryRun; 
        private String envId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(TerminateAppEnvRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.envId = response.envId;
            this.regionId = response.regionId;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
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
        public TerminateAppEnvRequest build() {
            return new TerminateAppEnvRequest(this);
        } 

    } 

}
