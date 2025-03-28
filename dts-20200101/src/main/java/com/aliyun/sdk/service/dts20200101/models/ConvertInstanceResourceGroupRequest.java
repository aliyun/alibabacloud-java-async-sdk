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
 * {@link ConvertInstanceResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ConvertInstanceResourceGroupRequest</p>
 */
public class ConvertInstanceResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewResourceGroupId")
    private String newResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private ConvertInstanceResourceGroupRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertInstanceResourceGroupRequest create() {
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
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<ConvertInstanceResourceGroupRequest, Builder> {
        private String dtsJobId; 
        private String newResourceGroupId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceId; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(ConvertInstanceResourceGroupRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.newResourceGroupId = request.newResourceGroupId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>This historical parameter does not take effect and is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>m4312mab158****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The ID of new resource group. You can obtain the ID on the Resource Group page in the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information about a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2r4fkrqw****</p>
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
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
         * <p>This parameter is only for special services and not required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-3m1213ye7l****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the DTS instance. You can view the ID in the <strong>ID/Name</strong> column on the task page in the console.</p>
         * <blockquote>
         * <p> This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtszhc12zp727o****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is only for special services and not required.</p>
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
        public ConvertInstanceResourceGroupRequest build() {
            return new ConvertInstanceResourceGroupRequest(this);
        } 

    } 

}
