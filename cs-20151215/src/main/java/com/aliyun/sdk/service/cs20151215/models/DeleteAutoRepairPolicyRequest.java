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
 * {@link DeleteAutoRepairPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoRepairPolicyRequest</p>
 */
public class DeleteAutoRepairPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_id")
    private String policyId;

    private DeleteAutoRepairPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoRepairPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAutoRepairPolicyRequest, Builder> {
        private String clusterId; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoRepairPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyId = request.policyId;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * policy_id.
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policy_id", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeleteAutoRepairPolicyRequest build() {
            return new DeleteAutoRepairPolicyRequest(this);
        } 

    } 

}
