// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyInstancesRequest</p>
 */
public class DescribePolicyInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policy_name")
    private String policyName;

    private DescribePolicyInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceName = builder.instanceName;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DescribePolicyInstancesRequest, Builder> {
        private String clusterId; 
        private String instanceName; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceName = request.instanceName;
            this.policyName = request.policyName;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the policy instance that you want to query.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The name of the policy that you want to query.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DescribePolicyInstancesRequest build() {
            return new DescribePolicyInstancesRequest(this);
        } 

    } 

}
