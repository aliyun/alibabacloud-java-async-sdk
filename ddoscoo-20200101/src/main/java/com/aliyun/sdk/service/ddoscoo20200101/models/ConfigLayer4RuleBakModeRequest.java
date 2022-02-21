// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RuleBakModeRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleBakModeRequest</p>
 */
public class ConfigLayer4RuleBakModeRequest extends Request {
    @Query
    @NameInMap("BakMode")
    @Validation(required = true)
    private String bakMode;

    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ConfigLayer4RuleBakModeRequest(Builder builder) {
        super(builder);
        this.bakMode = builder.bakMode;
        this.listeners = builder.listeners;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RuleBakModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bakMode
     */
    public String getBakMode() {
        return this.bakMode;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RuleBakModeRequest, Builder> {
        private String bakMode; 
        private String listeners; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleBakModeRequest response) {
            super(response);
            this.bakMode = response.bakMode;
            this.listeners = response.listeners;
            this.regionId = response.regionId;
        } 

        /**
         * BakMode.
         */
        public Builder bakMode(String bakMode) {
            this.putQueryParameter("BakMode", bakMode);
            this.bakMode = bakMode;
            return this;
        }

        /**
         * Listeners.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigLayer4RuleBakModeRequest build() {
            return new ConfigLayer4RuleBakModeRequest(this);
        } 

    } 

}
