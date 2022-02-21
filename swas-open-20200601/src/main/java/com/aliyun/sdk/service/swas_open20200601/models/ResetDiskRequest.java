// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDiskRequest} extends {@link RequestModel}
 *
 * <p>ResetDiskRequest</p>
 */
public class ResetDiskRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    private ResetDiskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diskId = builder.diskId;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
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

    public static final class Builder extends Request.Builder<ResetDiskRequest, Builder> {
        private String clientToken; 
        private String diskId; 
        private String regionId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(ResetDiskRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.diskId = response.diskId;
            this.regionId = response.regionId;
            this.snapshotId = response.snapshotId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
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

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public ResetDiskRequest build() {
            return new ResetDiskRequest(this);
        } 

    } 

}
