// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAppEnvRequest} extends {@link RequestModel}
 *
 * <p>StopAppEnvRequest</p>
 */
public class StopAppEnvRequest extends Request {
    @Body
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private StopAppEnvRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<StopAppEnvRequest, Builder> {
        private String envId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopAppEnvRequest response) {
            super(response);
            this.envId = response.envId;
            this.regionId = response.regionId;
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
        public StopAppEnvRequest build() {
            return new StopAppEnvRequest(this);
        } 

    } 

}
