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
 * {@link AddControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>AddControlPolicyResponseBody</p>
 */
public class AddControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the access control policy that is created on the Internet firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
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
