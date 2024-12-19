// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link DescribeServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleResponseBody</p>
 */
public class DescribeServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityRoleGrant")
    private Boolean entityRoleGrant;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceLinkedRoleResponseBody(Builder builder) {
        this.entityRoleGrant = builder.entityRoleGrant;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityRoleGrant
     */
    public Boolean getEntityRoleGrant() {
        return this.entityRoleGrant;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean entityRoleGrant; 
        private String requestId; 

        /**
         * <p>Whether the service-linked role permission is granted:</p>
         * <ul>
         * <li>true: Granted.</li>
         * <li>false: Not granted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder entityRoleGrant(Boolean entityRoleGrant) {
            this.entityRoleGrant = entityRoleGrant;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>02F8BBF3-2D61-5982-8911-EEB387BE3AF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceLinkedRoleResponseBody build() {
            return new DescribeServiceLinkedRoleResponseBody(this);
        } 

    } 

}
