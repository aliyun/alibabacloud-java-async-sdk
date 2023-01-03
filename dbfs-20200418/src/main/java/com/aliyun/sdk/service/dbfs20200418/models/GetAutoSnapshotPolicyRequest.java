// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetAutoSnapshotPolicyRequest</p>
 */
public class GetAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoSnapshotPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetAutoSnapshotPolicyRequest, Builder> {
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoSnapshotPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * 策略ID
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAutoSnapshotPolicyRequest build() {
            return new GetAutoSnapshotPolicyRequest(this);
        } 

    } 

}
