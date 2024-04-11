// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobMonitorRuleRequest</p>
 */
public class DescribeJobMonitorRuleRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeJobMonitorRuleRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMonitorRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeJobMonitorRuleRequest, Builder> {
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobMonitorRuleRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the data migration, data synchronization, or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
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

        @Override
        public DescribeJobMonitorRuleRequest build() {
            return new DescribeJobMonitorRuleRequest(this);
        } 

    } 

}
