// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFieldStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFieldStatisticsRequest</p>
 */
public class DescribeFieldStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private DescribeFieldStatisticsRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.regionId = builder.regionId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<DescribeFieldStatisticsRequest, Builder> {
        private String machineTypes; 
        private String regionId; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFieldStatisticsRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.regionId = request.regionId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: server</li>
         * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>The ID of the region in which the asset resides.</p>
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
         * <p>The ID of the primary account of the Resource Directory member account.</p>
         * <blockquote>
         * <p>call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> interface to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public DescribeFieldStatisticsRequest build() {
            return new DescribeFieldStatisticsRequest(this);
        } 

    } 

}
