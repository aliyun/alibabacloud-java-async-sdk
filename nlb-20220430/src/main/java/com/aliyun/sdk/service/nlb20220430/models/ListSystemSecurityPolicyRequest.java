// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link ListSystemSecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListSystemSecurityPolicyRequest</p>
 */
public class ListSystemSecurityPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListSystemSecurityPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemSecurityPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ListSystemSecurityPolicyRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemSecurityPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSystemSecurityPolicyRequest build() {
            return new ListSystemSecurityPolicyRequest(this);
        } 

    } 

}
