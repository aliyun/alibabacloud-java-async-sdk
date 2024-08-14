// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEnterpriseSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>BindEnterpriseSnapshotPolicyRequest</p>
 */
public class BindEnterpriseSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskTargets")
    private java.util.List < String > diskTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private BindEnterpriseSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diskTargets = builder.diskTargets;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindEnterpriseSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskTargets
     */
    public java.util.List < String > getDiskTargets() {
        return this.diskTargets;
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

    public static final class Builder extends Request.Builder<BindEnterpriseSnapshotPolicyRequest, Builder> {
        private String clientToken; 
        private java.util.List < String > diskTargets; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BindEnterpriseSnapshotPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diskTargets = request.diskTargets;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The list of disks.
         */
        public Builder diskTargets(java.util.List < String > diskTargets) {
            this.putQueryParameter("DiskTargets", diskTargets);
            this.diskTargets = diskTargets;
            return this;
        }

        /**
         * The id of the policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BindEnterpriseSnapshotPolicyRequest build() {
            return new BindEnterpriseSnapshotPolicyRequest(this);
        } 

    } 

}
