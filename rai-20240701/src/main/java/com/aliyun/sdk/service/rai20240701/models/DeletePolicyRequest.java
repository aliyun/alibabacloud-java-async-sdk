// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link DeletePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyRequest</p>
 */
public class DeletePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIdList")
    private java.util.List<Long> policyIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeletePolicyRequest(Builder builder) {
        super(builder);
        this.policyIdList = builder.policyIdList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyIdList
     */
    public java.util.List<Long> getPolicyIdList() {
        return this.policyIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePolicyRequest, Builder> {
        private java.util.List<Long> policyIdList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyRequest request) {
            super(request);
            this.policyIdList = request.policyIdList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>List of detection policy IDs</p>
         */
        public Builder policyIdList(java.util.List<Long> policyIdList) {
            String policyIdListShrink = shrink(policyIdList, "PolicyIdList", "json");
            this.putQueryParameter("PolicyIdList", policyIdListShrink);
            this.policyIdList = policyIdList;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeletePolicyRequest build() {
            return new DeletePolicyRequest(this);
        } 

    } 

}
