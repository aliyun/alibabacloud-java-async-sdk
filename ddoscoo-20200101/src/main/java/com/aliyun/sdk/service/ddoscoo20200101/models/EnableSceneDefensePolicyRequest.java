// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSceneDefensePolicyRequest} extends {@link RequestModel}
 *
 * <p>EnableSceneDefensePolicyRequest</p>
 */
public class EnableSceneDefensePolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private EnableSceneDefensePolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSceneDefensePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnableSceneDefensePolicyRequest, Builder> {
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableSceneDefensePolicyRequest response) {
            super(response);
            this.policyId = response.policyId;
            this.regionId = response.regionId;
        } 

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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
        public EnableSceneDefensePolicyRequest build() {
            return new EnableSceneDefensePolicyRequest(this);
        } 

    } 

}
