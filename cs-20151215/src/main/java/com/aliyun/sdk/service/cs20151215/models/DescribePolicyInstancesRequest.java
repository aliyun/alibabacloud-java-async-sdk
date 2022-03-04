// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyInstancesRequest</p>
 */
public class DescribePolicyInstancesRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("policy_name")
    private String policyName;

    @Query
    @NameInMap("instance_name")
    private String instanceName;

    private DescribePolicyInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyName = builder.policyName;
        this.instanceName = builder.instanceName;
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<DescribePolicyInstancesRequest, Builder> {
        private String clusterId; 
        private String policyName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
            this.instanceName = request.instanceName;
        } 

        /**
         * The ID of the target cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Policy governance rule name
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * Policy instance name
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public DescribePolicyInstancesRequest build() {
            return new DescribePolicyInstancesRequest(this);
        } 

    } 

}
