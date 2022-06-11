// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeILMPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeILMPolicyRequest</p>
 */
public class DescribeILMPolicyRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Body
    @NameInMap("body")
    private String body;

    private DescribeILMPolicyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
        this.body = builder.body;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DescribeILMPolicyRequest, Builder> {
        private String instanceId; 
        private String policyName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeILMPolicyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
            this.body = request.body;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DescribeILMPolicyRequest build() {
            return new DescribeILMPolicyRequest(this);
        } 

    } 

}
