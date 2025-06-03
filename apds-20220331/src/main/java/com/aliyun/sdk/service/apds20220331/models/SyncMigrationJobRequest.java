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
 * {@link SyncMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>SyncMigrationJobRequest</p>
 */
public class SyncMigrationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regions")
    private String regions;

    private SyncMigrationJobRequest(Builder builder) {
        super(builder);
        this.jobType = builder.jobType;
        this.operationType = builder.operationType;
        this.regionId = builder.regionId;
        this.regions = builder.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMigrationJobRequest create() {
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
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    public static final class Builder extends Request.Builder<SyncMigrationJobRequest, Builder> {
        private String jobType; 
        private String operationType; 
        private String regionId; 
        private String regions; 

        private Builder() {
            super();
        } 

        private Builder(SyncMigrationJobRequest request) {
            super(request);
            this.jobType = request.jobType;
            this.operationType = request.operationType;
            this.regionId = request.regionId;
            this.regions = request.regions;
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
         * operationType.
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("operationType", operationType);
            this.operationType = operationType;
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

        /**
         * regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("regions", regions);
            this.regions = regions;
            return this;
        }

        @Override
        public SyncMigrationJobRequest build() {
            return new SyncMigrationJobRequest(this);
        } 

    } 

}
