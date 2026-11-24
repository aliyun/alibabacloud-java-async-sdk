// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeAutoRepairPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoRepairPolicyRequest</p>
 */
public class DescribeAutoRepairPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_id")
    private String policyId;

    private DescribeAutoRepairPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoRepairPolicyRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribeAutoRepairPolicyRequest, Builder> {
        private String clusterId; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoRepairPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The self-healing rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policy_id", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeAutoRepairPolicyRequest build() {
            return new DescribeAutoRepairPolicyRequest(this);
        } 

    } 

}
