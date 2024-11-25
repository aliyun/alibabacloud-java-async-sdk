// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRCSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteRCSnapshotRequest</p>
 */
public class DeleteRCSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private DeleteRCSnapshotRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRCSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<DeleteRCSnapshotRequest, Builder> {
        private Boolean force; 
        private String regionId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRCSnapshotRequest request) {
            super(request);
            this.force = request.force;
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>Specifies whether to forcefully delete the snapshot that is used to create cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: forcefully deletes the snapshot After the snapshot is forcefully deleted, the cloud disks created from the snapshot cannot be re-initialized.</li>
         * <li><strong>false</strong>(default): does not forcefully delete the snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        /**
         * <p>The snapshot ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rcds-7mbefjzkqccvdev****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public DeleteRCSnapshotRequest build() {
            return new DeleteRCSnapshotRequest(this);
        } 

    } 

}
