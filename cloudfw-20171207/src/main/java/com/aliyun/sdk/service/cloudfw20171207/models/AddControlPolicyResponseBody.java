// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>AddControlPolicyResponseBody</p>
 */
public class AddControlPolicyResponseBody extends TeaModel {
    @NameInMap("AclUuid")
    private String aclUuid;

    @NameInMap("RequestId")
    private String requestId;

    private AddControlPolicyResponseBody(Builder builder) {
        this.aclUuid = builder.aclUuid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddControlPolicyResponseBody create() {
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
         * The ID of the access control policy that is created on the Internet firewall.
         */
        public Builder aclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddControlPolicyResponseBody build() {
            return new AddControlPolicyResponseBody(this);
        } 

    } 

}
