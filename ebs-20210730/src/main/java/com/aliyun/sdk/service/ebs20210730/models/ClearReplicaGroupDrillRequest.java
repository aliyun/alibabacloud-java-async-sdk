// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClearReplicaGroupDrillRequest} extends {@link RequestModel}
 *
 * <p>ClearReplicaGroupDrillRequest</p>
 */
public class ClearReplicaGroupDrillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the drill. You can call the <a href="https://help.aliyun.com/document_detail/2584481.html">DescribeReplicaGroupDrills</a> operation to query disaster recovery drills that were performed on replication pairs in a specific region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-drill-xxxx</p>
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * <p>The ID of the replication pair-consistent group. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation to query the most recent list of replication pair-consistent groups, including group IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxx</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
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
        public ClearReplicaGroupDrillRequest build() {
            return new ClearReplicaGroupDrillRequest(this);
        } 

    } 

}
