// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetAbacPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetAbacPolicyRequest</p>
 */
public class GetAbacPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyId")
    private Long abacPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyName")
    private String abacPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetAbacPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.abacPolicyId = builder.abacPolicyId;
        this.abacPolicyName = builder.abacPolicyName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAbacPolicyRequest create() {
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
     * @return abacPolicyId
     */
    public Long getAbacPolicyId() {
        return this.abacPolicyId;
    }

    /**
     * @return abacPolicyName
     */
    public String getAbacPolicyName() {
        return this.abacPolicyName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetAbacPolicyRequest, Builder> {
        private String regionId; 
        private Long abacPolicyId; 
        private String abacPolicyName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetAbacPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.abacPolicyId = request.abacPolicyId;
            this.abacPolicyName = request.abacPolicyName;
            this.tid = request.tid;
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
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder abacPolicyId(Long abacPolicyId) {
            this.putQueryParameter("AbacPolicyId", abacPolicyId);
            this.abacPolicyId = abacPolicyId;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        public Builder abacPolicyName(String abacPolicyName) {
            this.putQueryParameter("AbacPolicyName", abacPolicyName);
            this.abacPolicyName = abacPolicyName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetAbacPolicyRequest build() {
            return new GetAbacPolicyRequest(this);
        } 

    } 

}
