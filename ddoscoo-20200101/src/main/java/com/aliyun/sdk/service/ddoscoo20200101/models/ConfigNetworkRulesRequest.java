// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRulesRequest} extends {@link RequestModel}
 *
 * <p>ConfigNetworkRulesRequest</p>
 */
public class ConfigNetworkRulesRequest extends Request {
    @Query
    @NameInMap("NetworkRules")
    @Validation(required = true)
    private String networkRules;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ConfigNetworkRulesRequest(Builder builder) {
        super(builder);
        this.networkRules = builder.networkRules;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetworkRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkRules
     */
    public String getNetworkRules() {
        return this.networkRules;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigNetworkRulesRequest, Builder> {
        private String networkRules; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigNetworkRulesRequest response) {
            super(response);
            this.networkRules = response.networkRules;
            this.regionId = response.regionId;
        } 

        /**
         * NetworkRules.
         */
        public Builder networkRules(String networkRules) {
            this.putQueryParameter("NetworkRules", networkRules);
            this.networkRules = networkRules;
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
        public ConfigNetworkRulesRequest build() {
            return new ConfigNetworkRulesRequest(this);
        } 

    } 

}
