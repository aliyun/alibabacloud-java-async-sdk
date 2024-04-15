// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoSnapshotPolicyRequest</p>
 */
public class DeleteAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private java.util.List < String > policyId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public java.util.List < String > getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAutoSnapshotPolicyRequest, Builder> {
        private java.util.List < String > policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoSnapshotPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the automatic snapshot policies that you want to delete.
         */
        public Builder policyId(java.util.List < String > policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAutoSnapshotPolicyRequest build() {
            return new DeleteAutoSnapshotPolicyRequest(this);
        } 

    } 

}
