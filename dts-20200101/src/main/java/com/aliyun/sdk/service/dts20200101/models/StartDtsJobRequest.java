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
 * {@link StartDtsJobRequest} extends {@link RequestModel}
 *
 * <p>StartDtsJobRequest</p>
 */
public class StartDtsJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private StartDtsJobRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDtsJobRequest create() {
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

    public static final class Builder extends Request.Builder<StartDtsJobRequest, Builder> {
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 
        private String synchronizationDirection; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(StartDtsJobRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
         * <blockquote>
         * <p>You can query the instance ID by invoking <a href="https://help.aliyun.com/document_detail/208139.html">Query the list of data migration instances and details of each instance</a>, <a href="https://help.aliyun.com/document_detail/49442.html">Query the list of change tracking instances and details of each instance</a>, or <a href="https://help.aliyun.com/document_detail/49454.html">Query the list of data synchronization instances and details of each instance</a>.</p>
         * </blockquote>
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
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
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
         * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>rg-aek2ilvoxlrdcby</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: forward. This is the default value.</li>
         * <li><strong>Reverse</strong>: reverse.<blockquote>
         * <p>You can set this parameter to <strong>Reverse</strong> to start the reverse synchronization link only when the topology of the data synchronization instance is two-way synchronization.</p>
         * </blockquote>
         * </li>
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
         * <p>Specifies whether the node is a zero-ETL node. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no.</li>
         * <li><strong>true</strong>: yes.</li>
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
        public StartDtsJobRequest build() {
            return new StartDtsJobRequest(this);
        } 

    } 

}
