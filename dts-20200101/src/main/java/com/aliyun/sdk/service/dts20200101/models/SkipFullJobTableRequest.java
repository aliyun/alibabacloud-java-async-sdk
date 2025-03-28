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
 * {@link SkipFullJobTableRequest} extends {@link RequestModel}
 *
 * <p>SkipFullJobTableRequest</p>
 */
public class SkipFullJobTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobProgressId")
    private String jobProgressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private SkipFullJobTableRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.jobProgressId = builder.jobProgressId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipFullJobTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return jobProgressId
     */
    public String getJobProgressId() {
        return this.jobProgressId;
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

    public static final class Builder extends Request.Builder<SkipFullJobTableRequest, Builder> {
        private String dtsJobId; 
        private String jobProgressId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(SkipFullJobTableRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.jobProgressId = request.jobProgressId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the DTS task. The DTS task can be a data migration, data synchronization, or change tracking task.</p>
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
         * <p>The ID of the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder jobProgressId(String jobProgressId) {
            this.putQueryParameter("JobProgressId", jobProgressId);
            this.jobProgressId = jobProgressId;
            return this;
        }

        /**
         * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>Specifies whether to query only zero-extract, transform, load (ETL) integration tasks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
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
        public SkipFullJobTableRequest build() {
            return new SkipFullJobTableRequest(this);
        } 

    } 

}
