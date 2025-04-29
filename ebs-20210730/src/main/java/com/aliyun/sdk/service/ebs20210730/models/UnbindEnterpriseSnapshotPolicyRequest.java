// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindEnterpriseSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>UnbindEnterpriseSnapshotPolicyRequest</p>
 */
public class UnbindEnterpriseSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskTargets")
    private java.util.List<String> diskTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UnbindEnterpriseSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diskTargets = builder.diskTargets;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEnterpriseSnapshotPolicyRequest create() {
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
    public java.util.List<String> getDiskTargets() {
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

    public static final class Builder extends Request.Builder<UnbindEnterpriseSnapshotPolicyRequest, Builder> {
        private String clientToken; 
        private java.util.List<String> diskTargets; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindEnterpriseSnapshotPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diskTargets = request.diskTargets;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The list of disks.</p>
         */
        public Builder diskTargets(java.util.List<String> diskTargets) {
            this.putQueryParameter("DiskTargets", diskTargets);
            this.diskTargets = diskTargets;
            return this;
        }

        /**
         * <p>The id of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp-xxs</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID . You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which snapshot policy is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UnbindEnterpriseSnapshotPolicyRequest build() {
            return new UnbindEnterpriseSnapshotPolicyRequest(this);
        } 

    } 

}
