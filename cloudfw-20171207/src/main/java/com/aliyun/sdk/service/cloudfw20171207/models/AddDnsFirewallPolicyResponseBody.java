// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link AddDnsFirewallPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>AddDnsFirewallPolicyResponseBody</p>
 */
public class AddDnsFirewallPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDnsFirewallPolicyResponseBody(Builder builder) {
        this.aclUuid = builder.aclUuid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsFirewallPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddDnsFirewallPolicyResponseBody model) {
            this.aclUuid = model.aclUuid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>f88dae6f-XXX-XXX-613de9ab2be8</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71209DFE-XXX-XXX-52B4A4E9DA3B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDnsFirewallPolicyResponseBody build() {
            return new AddDnsFirewallPolicyResponseBody(this);
        } 

    } 

}
