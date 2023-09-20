// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridCloudClusterBypassStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudClusterBypassStatusRequest</p>
 */
public class ModifyHybridCloudClusterBypassStatusRequest extends Request {
    @Query
    @NameInMap("ClusterResourceId")
    @Validation(required = true)
    private String clusterResourceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RuleStatus")
    @Validation(required = true)
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
         * The ID of the hybrid cloud cluster.
         */
        public Builder clusterResourceId(String clusterResourceId) {
            this.putQueryParameter("ClusterResourceId", clusterResourceId);
            this.clusterResourceId = clusterResourceId;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * **
         * 
         * **You can call the **DescribeInstanceInfo[ operation to obtain the ID of the WAF instance.](~~140857~~)
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The status of manual bypass. Valid values:
         * <p>
         * 
         * *   **on**: enabled.
         * *   **off**: disabled. This is the default value.
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
