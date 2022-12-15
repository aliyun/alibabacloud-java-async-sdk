// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CancelAutoSnapshotPolicyRequest</p>
 */
public class CancelAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("DbfsIds")
    @Validation(required = true)
    private java.util.List < String > dbfsIds;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CancelAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.dbfsIds = builder.dbfsIds;
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
     * @return dbfsIds
     */
    public java.util.List < String > getDbfsIds() {
        return this.dbfsIds;
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
        private java.util.List < String > dbfsIds; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelAutoSnapshotPolicyRequest request) {
            super(request);
            this.dbfsIds = request.dbfsIds;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * DbfsIds.
         */
        public Builder dbfsIds(java.util.List < String > dbfsIds) {
            String dbfsIdsShrink = shrink(dbfsIds, "DbfsIds", "json");
            this.putQueryParameter("DbfsIds", dbfsIdsShrink);
            this.dbfsIds = dbfsIds;
            return this;
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
        public CancelAutoSnapshotPolicyRequest build() {
            return new CancelAutoSnapshotPolicyRequest(this);
        } 

    } 

}
