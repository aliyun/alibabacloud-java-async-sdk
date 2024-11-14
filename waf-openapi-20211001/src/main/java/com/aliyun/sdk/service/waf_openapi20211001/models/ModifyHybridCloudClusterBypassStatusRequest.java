// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleStatus;

    private ModifyHybridCloudClusterBypassStatusRequest(Builder builder) {
        super(builder);
        this.clusterResourceId = builder.clusterResourceId;
        this.instanceId = builder.instanceId;
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
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudClusterBypassStatusRequest, Builder> {
        private String clusterResourceId; 
        private String instanceId; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudClusterBypassStatusRequest request) {
            super(request);
            this.clusterResourceId = request.clusterResourceId;
            this.instanceId = request.instanceId;
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
