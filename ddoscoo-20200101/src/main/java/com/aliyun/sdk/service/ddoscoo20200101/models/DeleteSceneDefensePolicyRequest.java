// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneDefensePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSceneDefensePolicyRequest</p>
 */
public class DeleteSceneDefensePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private DeleteSceneDefensePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSceneDefensePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DeleteSceneDefensePolicyRequest, Builder> {
        private String regionId; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneDefensePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.policyId = request.policyId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the policy that you want to delete.
         * <p>
         * 
         * > You can call the [DescribeSceneDefensePolicies](~~159382~~) operation to query the IDs of all policies.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeleteSceneDefensePolicyRequest build() {
            return new DeleteSceneDefensePolicyRequest(this);
        } 

    } 

}
