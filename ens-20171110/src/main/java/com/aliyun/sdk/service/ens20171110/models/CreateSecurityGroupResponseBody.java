// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityGroupResponseBody</p>
 */
public class CreateSecurityGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    private CreateSecurityGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String securityGroupId; 

        private Builder() {
        } 

        private Builder(CreateSecurityGroupResponseBody model) {
            this.requestId = model.requestId;
            this.securityGroupId = model.securityGroupId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>760bad53276431c499e30dc36f6b26be</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1fg655nh68xyz9i***</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        public CreateSecurityGroupResponseBody build() {
            return new CreateSecurityGroupResponseBody(this);
        } 

    } 

}
