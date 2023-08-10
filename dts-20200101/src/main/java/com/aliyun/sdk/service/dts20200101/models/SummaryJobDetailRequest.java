// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryJobDetailRequest} extends {@link RequestModel}
 *
 * <p>SummaryJobDetailRequest</p>
 */
public class SummaryJobDetailRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("JobCode")
    @Validation(required = true)
    private String jobCode;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StructType")
    private String structType;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    private SummaryJobDetailRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.jobCode = builder.jobCode;
        this.regionId = builder.regionId;
        this.structType = builder.structType;
        this.synchronizationDirection = builder.synchronizationDirection;
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

    public static final class Builder extends Request.Builder<SummaryJobDetailRequest, Builder> {
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String jobCode; 
        private String regionId; 
        private String structType; 
        private String synchronizationDirection; 

        private Builder() {
            super();
        } 

        private Builder(SummaryJobDetailRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.jobCode = request.jobCode;
            this.regionId = request.regionId;
            this.structType = request.structType;
            this.synchronizationDirection = request.synchronizationDirection;
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

        @Override
        public SummaryJobDetailRequest build() {
            return new SummaryJobDetailRequest(this);
        } 

    } 

}
