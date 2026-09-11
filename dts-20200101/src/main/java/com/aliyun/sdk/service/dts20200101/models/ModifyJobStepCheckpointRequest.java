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
 * {@link ModifyJobStepCheckpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyJobStepCheckpointRequest</p>
 */
public class ModifyJobStepCheckpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStepId")
    private String jobStepId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewCheckPoint")
    private Long newCheckPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyJobStepCheckpointRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.jobStepId = builder.jobStepId;
        this.newCheckPoint = builder.newCheckPoint;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyJobStepCheckpointRequest create() {
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
     * @return jobStepId
     */
    public String getJobStepId() {
        return this.jobStepId;
    }

    /**
     * @return newCheckPoint
     */
    public Long getNewCheckPoint() {
        return this.newCheckPoint;
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

    public static final class Builder extends Request.Builder<ModifyJobStepCheckpointRequest, Builder> {
        private String dtsJobId; 
        private String jobStepId; 
        private Long newCheckPoint; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyJobStepCheckpointRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.jobStepId = request.jobStepId;
            this.newCheckPoint = request.newCheckPoint;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the migration, synchronization, or tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>l5512es7w15****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The task step ID, which corresponds to the <strong>synchronization</strong> step ID returned by the ListJobStep API.</p>
         * 
         * <strong>example:</strong>
         * <p>wn3z4ukia9wi9xu_0004_0000</p>
         */
        public Builder jobStepId(String jobStepId) {
            this.putQueryParameter("JobStepId", jobStepId);
            this.jobStepId = jobStepId;
            return this;
        }

        /**
         * <p>The new offset as a UNIX timestamp in seconds. The specified value must fall within the offset range of the incremental data collection step.</p>
         * 
         * <strong>example:</strong>
         * <p>1760406***</p>
         */
        public Builder newCheckPoint(Long newCheckPoint) {
            this.putQueryParameter("NewCheckPoint", newCheckPoint);
            this.newCheckPoint = newCheckPoint;
            return this;
        }

        /**
         * <p>The region where the DTS instance resides.</p>
         * <blockquote>
         * <p>For regions that support dedicated clusters, see <a href="https://help.aliyun.com/document_detail/417481.html">DTS dedicated cluster</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2ilvoxlrd***</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyJobStepCheckpointRequest build() {
            return new ModifyJobStepCheckpointRequest(this);
        } 

    } 

}
