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
 * {@link ModifyHybridCloudClusterBypassStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudClusterBypassStatusRequest</p>
 */
public class ModifyHybridCloudClusterBypassStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleStatus;

    private ModifyHybridCloudClusterBypassStatusRequest(Builder builder) {
        super(builder);
        this.clusterResourceId = builder.clusterResourceId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudClusterBypassStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterResourceId
     */
    public String getClusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudClusterBypassStatusRequest, Builder> {
        private String clusterResourceId; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudClusterBypassStatusRequest request) {
            super(request);
            this.clusterResourceId = request.clusterResourceId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleStatus = request.ruleStatus;
        } 

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc_cluster_****</p>
         */
        public Builder clusterResourceId(String clusterResourceId) {
            this.putQueryParameter("ClusterResourceId", clusterResourceId);
            this.clusterResourceId = clusterResourceId;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <p>**</p>
         * <p>**You can call the **DescribeInstanceInfo<a href="https://help.aliyun.com/document_detail/140857.html"> operation to obtain the ID of the WAF instance.</a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
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

        /**
         * <p>The status of manual bypass. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled. This is the default value.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        @Override
        public ModifyHybridCloudClusterBypassStatusRequest build() {
            return new ModifyHybridCloudClusterBypassStatusRequest(this);
        } 

    } 

}
