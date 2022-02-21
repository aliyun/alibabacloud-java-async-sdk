// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityGroupResponseBody</p>
 */
public class CreateSecurityGroupResponseBody extends TeaModel {
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSecurityGroupResponseBody(Builder builder) {
        this.securityGroupId = builder.securityGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String securityGroupId; 
        private String requestId; 

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSecurityGroupResponseBody build() {
            return new CreateSecurityGroupResponseBody(this);
        } 

    } 

}
