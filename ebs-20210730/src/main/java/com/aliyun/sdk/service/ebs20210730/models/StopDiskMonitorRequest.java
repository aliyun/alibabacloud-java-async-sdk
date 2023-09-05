// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDiskMonitorRequest} extends {@link RequestModel}
 *
 * <p>StopDiskMonitorRequest</p>
 */
public class StopDiskMonitorRequest extends Request {
    @Query
    @NameInMap("DiskIds")
    @Validation(required = true)
    private java.util.List < String > diskIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StopDiskMonitorRequest(Builder builder) {
        super(builder);
        this.diskIds = builder.diskIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDiskMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskIds
     */
    public java.util.List < String > getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopDiskMonitorRequest, Builder> {
        private java.util.List < String > diskIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopDiskMonitorRequest request) {
            super(request);
            this.diskIds = request.diskIds;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the disks for which you want to disable near real-time monitoring.
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            String diskIdsShrink = shrink(diskIds, "DiskIds", "json");
            this.putQueryParameter("DiskIds", diskIdsShrink);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * The ID of the region in which you want to disable near real-time monitoring for disks. You can call the [DescribeRegions](~~354276~~) operation to query the list of regions that support CloudLens for EBS.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StopDiskMonitorRequest build() {
            return new StopDiskMonitorRequest(this);
        } 

    } 

}
