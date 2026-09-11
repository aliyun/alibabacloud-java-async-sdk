// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
         * <p>The migration or synchronization instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsl3m1213ye7l****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the data migration or synchronization task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>l3m1213ye7l****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The migration phase. Valid values:</p>
         * <ul>
         * <li><strong>02</strong>: schema migration phase.</li>
         * <li><strong>03</strong>: incremental data migration phase.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
            return this;
        }

        /**
         * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2mjc4qlnog6q</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of schema definition. Valid values:</p>
         * <ul>
         * <li><strong>before</strong>: schema migration or initial schema synchronization.</li>
         * <li><strong>after</strong>: DDL operations during incremental data migration or synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>before</p>
         */
        public Builder structType(String structType) {
            this.putQueryParameter("StructType", structType);
            this.structType = structType;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: forward.</li>
         * <li><strong>Reverse</strong>: reverse.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>Forward</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You can set this parameter to <strong>Reverse</strong> to release the reverse synchronization link only when the topology of the data synchronization instance is two-way synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>Specifies whether the node is a seamless integration (zero-ETL) node. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The node is a seamless integration node.</li>
         * <li><strong>false</strong>: The node is not a seamless integration node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
