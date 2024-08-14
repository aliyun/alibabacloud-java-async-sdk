// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiskRequest</p>
 */
public class DeleteDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteDiskRequest, Builder> {
        private String diskId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The region ID of the primary or secondary disk in the replication pair. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDiskRequest build() {
            return new DeleteDiskRequest(this);
        } 

    } 

}
