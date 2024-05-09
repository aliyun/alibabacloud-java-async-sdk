// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryJobDetailRequest} extends {@link RequestModel}
 *
 * <p>SummaryJobDetailRequest</p>
 */
public class SummaryJobDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StructType")
    private String structType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private SummaryJobDetailRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.jobCode = builder.jobCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.structType = builder.structType;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SummaryJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return jobCode
     */
    public String getJobCode() {
        return this.jobCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return structType
     */
    public String getStructType() {
        return this.structType;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<SummaryJobDetailRequest, Builder> {
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String jobCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String structType; 
        private String synchronizationDirection; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(SummaryJobDetailRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.jobCode = request.jobCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.structType = request.structType;
            this.synchronizationDirection = request.synchronizationDirection;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * The ID of the data migration or data synchronization instance.
         * <p>
         * 
         * >  You must specify at least one of the DtsJobId and DtsInstanceId parameters.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The ID of the data migration or data synchronization task.
         * <p>
         * 
         * >  You must specify at least one of the DtsJobId and DtsInstanceId parameters.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The phase of the data migration task. Valid values:
         * <p>
         * 
         * *   **02**: The task is in the schema migration phase.
         * *   **03**: The task is in the incremental migration phase.
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of schema definition. Valid values:
         * <p>
         * 
         * *   **before**: schema migration or initial schema synchronization
         * *   **after**: DDL operations performed during incremental data migration or synchronization
         */
        public Builder structType(String structType) {
            this.putQueryParameter("StructType", structType);
            this.structType = structType;
            return this;
        }

        /**
         * The synchronization direction of the data synchronization task. Valid values:
         * <p>
         * 
         * *   **Forward**: Data is synchronized from the source database to the destination database.
         * *   **Reverse**: Data is synchronized from the destination database to the source database.
         * 
         * > 
         * *   Default value: **Forward**.
         * *   You can set this parameter to **Reverse** to delete the reverse synchronization task only if the topology is two-way synchronization.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * ZeroEtlJob.
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public SummaryJobDetailRequest build() {
            return new SummaryJobDetailRequest(this);
        } 

    } 

}
