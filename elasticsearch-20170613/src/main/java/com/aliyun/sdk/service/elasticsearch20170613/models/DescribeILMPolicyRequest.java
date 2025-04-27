// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeILMPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeILMPolicyRequest</p>
 */
public class DescribeILMPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    private DescribeILMPolicyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeILMPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DescribeILMPolicyRequest, Builder> {
        private String instanceId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeILMPolicyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif24adwc0082****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-1</p>
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DescribeILMPolicyRequest build() {
            return new DescribeILMPolicyRequest(this);
        } 

    } 

}
