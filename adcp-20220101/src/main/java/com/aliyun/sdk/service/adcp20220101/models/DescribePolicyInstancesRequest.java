// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

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
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private DescribePolicyInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DescribePolicyInstancesRequest, Builder> {
        private String clusterId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
        } 

        /**
         * The ID of the master instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DescribePolicyInstancesRequest build() {
            return new DescribePolicyInstancesRequest(this);
        } 

    } 

}
