// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstanceIdsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceIdsRequest</p>
 */
public class DescribeInstanceIdsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private Integer edition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeInstanceIdsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.edition = builder.edition;
        this.instanceIds = builder.instanceIds;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return edition
     */
    public Integer getEdition() {
        return this.edition;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceIdsRequest, Builder> {
        private String regionId; 
        private Integer edition; 
        private java.util.List<String> instanceIds; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceIdsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.edition = request.edition;
            this.instanceIds = request.instanceIds;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the instance to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
         * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
         * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
         * <li><strong>3</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan</li>
         * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder edition(Integer edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The IDs of instances to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
        public DescribeInstanceIdsRequest build() {
            return new DescribeInstanceIdsRequest(this);
        } 

    } 

}
