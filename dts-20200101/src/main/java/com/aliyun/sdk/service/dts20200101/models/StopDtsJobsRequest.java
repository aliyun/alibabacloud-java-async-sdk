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
 * {@link StopDtsJobsRequest} extends {@link RequestModel}
 *
 * <p>StopDtsJobsRequest</p>
 */
public class StopDtsJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private StopDtsJobsRequest(Builder builder) {
        super(builder);
        this.dtsJobIds = builder.dtsJobIds;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDtsJobsRequest create() {
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<StopDtsJobsRequest, Builder> {
        private String dtsJobIds; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(StopDtsJobsRequest request) {
            super(request);
            this.dtsJobIds = request.dtsJobIds;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the data migration or data synchronization task.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Separate multiple task IDs by <strong>,</strong> (commas).</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query task IDs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>l5o11f9029c****</p>
         */
        public Builder dtsJobIds(String dtsJobIds) {
            this.putQueryParameter("DtsJobIds", dtsJobIds);
            this.dtsJobIds = dtsJobIds;
            return this;
        }

        /**
         * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzsf6yoxhfpva</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be:</p>
         * <ul>
         * <li><strong>false</strong>: No. - <strong>true</strong>: Yes.</li>
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
        public StopDtsJobsRequest build() {
            return new StopDtsJobsRequest(this);
        } 

    } 

}
