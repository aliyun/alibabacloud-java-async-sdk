// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatFirewallControlPolicyResponseBody</p>
 */
public class CreateNatFirewallControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatFirewallControlPolicyResponseBody(Builder builder) {
        this.aclUuid = builder.aclUuid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatFirewallControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclUuid
     */
    public String getAclUuid() {
        return this.aclUuid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aclUuid; 
        private String requestId; 

        /**
         * The unique ID of the access control policy.
         * <p>
         * 
         * >  To modify an access control policy, you must specify the unique ID of the policy. You can call the DescribeNatFirewallControlPolicy operation to obtain the ID.
         */
        public Builder aclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatFirewallControlPolicyResponseBody build() {
            return new CreateNatFirewallControlPolicyResponseBody(this);
        } 

    } 

}
