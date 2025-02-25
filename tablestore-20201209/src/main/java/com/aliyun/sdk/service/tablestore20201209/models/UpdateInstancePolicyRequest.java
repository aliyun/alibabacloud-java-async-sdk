// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link UpdateInstancePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstancePolicyRequest</p>
 */
public class UpdateInstancePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyVersion;

    private UpdateInstancePolicyRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.policy = builder.policy;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstancePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<UpdateInstancePolicyRequest, Builder> {
        private String instanceName; 
        private String policy; 
        private Long policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstancePolicyRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.policy = request.policy;
            this.policyVersion = request.policyVersion;
        } 

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-test-12345</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance policy in the JSON format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Version&quot;: &quot;1&quot;,
         *     &quot;Statement&quot;: [
         *         {
         *             &quot;Action&quot;: [
         *                 &quot;ots:<em>&quot;
         *             ],
         *             &quot;Resource&quot;: [
         *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
         *             ],
         *             &quot;Principal&quot;: [
         *                 &quot;*&quot;
         *             ],
         *             &quot;Effect&quot;: &quot;Allow&quot;,
         *             &quot;Condition&quot;: {
         *                 &quot;StringEquals&quot;: {
         *                     &quot;ots:TLSVersion&quot;: [
         *                         &quot;1.2&quot;
         *                     ]
         *                 },
         *                 &quot;IpAddress&quot;: {
         *                     &quot;acs:SourceIp&quot;: [
         *                         &quot;192.168.0.1&quot;,
         *                         &quot;172.16.0.1&quot;
         *                     ]
         *                 }
         *             }
         *         }
         *     ]
         * }</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The version of the instance policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder policyVersion(Long policyVersion) {
            this.putBodyParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public UpdateInstancePolicyRequest build() {
            return new UpdateInstancePolicyRequest(this);
        } 

    } 

}
