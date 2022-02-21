// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkRuleRequest</p>
 */
public class DeleteNetworkRuleRequest extends Request {
    @Query
    @NameInMap("NetworkRule")
    @Validation(required = true)
    private String networkRule;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteNetworkRuleRequest(Builder builder) {
        super(builder);
        this.networkRule = builder.networkRule;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkRule
     */
    public String getNetworkRule() {
        return this.networkRule;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkRuleRequest, Builder> {
        private String networkRule; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkRuleRequest response) {
            super(response);
            this.networkRule = response.networkRule;
            this.regionId = response.regionId;
        } 

        /**
         * NetworkRule.
         */
        public Builder networkRule(String networkRule) {
            this.putQueryParameter("NetworkRule", networkRule);
            this.networkRule = networkRule;
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
        public DeleteNetworkRuleRequest build() {
            return new DeleteNetworkRuleRequest(this);
        } 

    } 

}
