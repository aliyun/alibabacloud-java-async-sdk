// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDiskSecondLevelMonitorRequest} extends {@link RequestModel}
 *
 * <p>CancelDiskSecondLevelMonitorRequest</p>
 */
public class CancelDiskSecondLevelMonitorRequest extends Request {
    @Query
    @NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CancelDiskSecondLevelMonitorRequest(Builder builder) {
        super(builder);
        this.diskIds = builder.diskIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDiskSecondLevelMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<CancelDiskSecondLevelMonitorRequest, Builder> {
        private java.util.List < String > diskIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelDiskSecondLevelMonitorRequest response) {
            super(response);
            this.diskIds = response.diskIds;
            this.regionId = response.regionId;
        } 

        /**
         * DiskIds.
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
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
        public CancelDiskSecondLevelMonitorRequest build() {
            return new CancelDiskSecondLevelMonitorRequest(this);
        } 

    } 

}
