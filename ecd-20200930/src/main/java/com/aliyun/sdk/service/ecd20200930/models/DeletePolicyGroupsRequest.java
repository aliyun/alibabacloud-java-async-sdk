// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DeletePolicyGroupsRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyGroupsRequest</p>
 */
public class DeletePolicyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeletePolicyGroupsRequest(Builder builder) {
        super(builder);
        this.policyGroupId = builder.policyGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyGroupId
     */
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePolicyGroupsRequest, Builder> {
        private java.util.List<String> policyGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyGroupsRequest request) {
            super(request);
            this.policyGroupId = request.policyGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cloud computer policy IDs. You can specify 1 to 100 policies.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        public Builder policyGroupId(java.util.List<String> policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by EDS.</p>
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
        public DeletePolicyGroupsRequest build() {
            return new DeletePolicyGroupsRequest(this);
        } 

    } 

}
