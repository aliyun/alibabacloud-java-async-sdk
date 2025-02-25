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
 * {@link DescribeDtsJobDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsJobDetailRequest</p>
 */
public class DescribeDtsJobDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncSubJobHistory")
    private Boolean syncSubJobHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private DescribeDtsJobDetailRequest(Builder builder) {
        super(builder);
        this.dtsInstanceID = builder.dtsInstanceID;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.syncSubJobHistory = builder.syncSubJobHistory;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceID
     */
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
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
     * @return syncSubJobHistory
     */
    public Boolean getSyncSubJobHistory() {
        return this.syncSubJobHistory;
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

    public static final class Builder extends Request.Builder<DescribeDtsJobDetailRequest, Builder> {
        private String dtsInstanceID; 
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean syncSubJobHistory; 
        private String synchronizationDirection; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsJobDetailRequest request) {
            super(request);
            this.dtsInstanceID = request.dtsInstanceID;
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.syncSubJobHistory = request.syncSubJobHistory;
            this.synchronizationDirection = request.synchronizationDirection;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsta7w132u12h****</p>
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.putQueryParameter("DtsInstanceID", dtsInstanceID);
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>ta7w132u12h****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to return the information about all data synchronization subtasks. Default value: <strong>false</strong>. A value of false indicates that the system returns only the information about a data synchronization subtask that is running or was most recently run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder syncSubJobHistory(Boolean syncSubJobHistory) {
            this.putQueryParameter("SyncSubJobHistory", syncSubJobHistory);
            this.syncSubJobHistory = syncSubJobHistory;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong></li>
         * <li><strong>Reverse</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The default value is <strong>Forward</strong>.</li>
         * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
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
         * <p>Specifies whether to query only zero-extract, transform, load (ETL) integration tasks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public DescribeDtsJobDetailRequest build() {
            return new DescribeDtsJobDetailRequest(this);
        } 

    } 

}
