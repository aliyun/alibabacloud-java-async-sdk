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
 * {@link CancelAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CancelAutoSnapshotPolicyRequest</p>
 */
public class CancelAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CancelAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
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

    public static final class Builder extends Request.Builder<CancelAutoSnapshotPolicyRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelAutoSnapshotPolicyRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the cloud computers. You can specify 1 to 50 IDs. The IDs cannot be an empty string. The IDs can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The IDs cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-78lhzpe7kjfnd****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public CancelAutoSnapshotPolicyRequest build() {
            return new CancelAutoSnapshotPolicyRequest(this);
        } 

    } 

}
