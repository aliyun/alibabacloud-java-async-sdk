// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopSyncMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>StopSyncMigrationJobRequest</p>
 */
public class StopSyncMigrationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private StopSyncMigrationJobRequest(Builder builder) {
        super(builder);
        this.jobType = builder.jobType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopSyncMigrationJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopSyncMigrationJobRequest, Builder> {
        private String jobType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopSyncMigrationJobRequest request) {
            super(request);
            this.jobType = request.jobType;
            this.regionId = request.regionId;
        } 

        /**
         * jobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("jobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StopSyncMigrationJobRequest build() {
            return new StopSyncMigrationJobRequest(this);
        } 

    } 

}
