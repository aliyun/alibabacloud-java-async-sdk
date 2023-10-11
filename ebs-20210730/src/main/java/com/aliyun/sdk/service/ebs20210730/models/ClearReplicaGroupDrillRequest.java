// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearReplicaGroupDrillRequest} extends {@link RequestModel}
 *
 * <p>ClearReplicaGroupDrillRequest</p>
 */
public class ClearReplicaGroupDrillRequest extends Request {
    @Query
    @NameInMap("DrillId")
    @Validation(required = true)
    private String drillId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ClearReplicaGroupDrillRequest(Builder builder) {
        super(builder);
        this.drillId = builder.drillId;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearReplicaGroupDrillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drillId
     */
    public String getDrillId() {
        return this.drillId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ClearReplicaGroupDrillRequest, Builder> {
        private String drillId; 
        private String groupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ClearReplicaGroupDrillRequest request) {
            super(request);
            this.drillId = request.drillId;
            this.groupId = request.groupId;
            this.regionId = request.regionId;
        } 

        /**
         * DrillId.
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public ClearReplicaGroupDrillRequest build() {
            return new ClearReplicaGroupDrillRequest(this);
        } 

    } 

}
