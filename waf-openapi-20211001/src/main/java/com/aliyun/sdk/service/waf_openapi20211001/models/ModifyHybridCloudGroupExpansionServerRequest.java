// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyHybridCloudGroupExpansionServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudGroupExpansionServerRequest</p>
 */
public class ModifyHybridCloudGroupExpansionServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyHybridCloudGroupExpansionServerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.mids = builder.mids;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudGroupExpansionServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mids
     */
    public String getMids() {
        return this.mids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudGroupExpansionServerRequest, Builder> {
        private Long clusterId; 
        private Long groupId; 
        private String instanceId; 
        private String mids; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudGroupExpansionServerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.mids = request.mids;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterId(Long clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-tl32ast****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>612929b133e7ff**0d0</p>
         */
        public Builder mids(String mids) {
            this.putQueryParameter("Mids", mids);
            this.mids = mids;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid value:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
         * </ul>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyHybridCloudGroupExpansionServerRequest build() {
            return new ModifyHybridCloudGroupExpansionServerRequest(this);
        } 

    } 

}
