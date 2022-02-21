// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkRulesRequest</p>
 */
public class CreateNetworkRulesRequest extends Request {
    @Query
    @NameInMap("NetworkRules")
    @Validation(required = true)
    private String networkRules;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateNetworkRulesRequest(Builder builder) {
        super(builder);
        this.networkRules = builder.networkRules;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRulesRequest create() {
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

    public static final class Builder extends Request.Builder<CreateNetworkRulesRequest, Builder> {
        private String networkRules; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkRulesRequest response) {
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
        public CreateNetworkRulesRequest build() {
            return new CreateNetworkRulesRequest(this);
        } 

    } 

}
