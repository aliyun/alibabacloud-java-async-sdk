// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotRequest</p>
 */
public class DeleteSnapshotRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private java.util.List < String > snapshotId;

    private DeleteSnapshotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotRequest create() {
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
     * @return snapshotId
     */
    public java.util.List < String > getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotRequest, Builder> {
        private String regionId; 
        private java.util.List < String > snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the snapshots. You can specify 1 to 100 IDs of snapshots.
         */
        public Builder snapshotId(java.util.List < String > snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public DeleteSnapshotRequest build() {
            return new DeleteSnapshotRequest(this);
        } 

    } 

}
