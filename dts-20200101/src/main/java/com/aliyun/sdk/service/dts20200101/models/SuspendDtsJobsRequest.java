// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendDtsJobsRequest} extends {@link RequestModel}
 *
 * <p>SuspendDtsJobsRequest</p>
 */
public class SuspendDtsJobsRequest extends Request {
    @Query
    @NameInMap("DtsJobIds")
    @Validation(required = true)
    private String dtsJobIds;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private SuspendDtsJobsRequest(Builder builder) {
        super(builder);
        this.dtsJobIds = builder.dtsJobIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendDtsJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobIds
     */
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SuspendDtsJobsRequest, Builder> {
        private String dtsJobIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SuspendDtsJobsRequest request) {
            super(request);
            this.dtsJobIds = request.dtsJobIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the data migration or data synchronization task.
         * <p>
         * 
         * > 
         * *   For multiple tasks, separate them with commas (,).
         * *   You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobIds(String dtsJobIds) {
            this.putQueryParameter("DtsJobIds", dtsJobIds);
            this.dtsJobIds = dtsJobIds;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SuspendDtsJobsRequest build() {
            return new SuspendDtsJobsRequest(this);
        } 

    } 

}
