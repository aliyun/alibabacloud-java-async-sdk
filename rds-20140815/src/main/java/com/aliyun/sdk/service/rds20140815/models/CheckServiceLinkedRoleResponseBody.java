// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleResponseBody</p>
 */
public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HasServiceLinkedRole")
    private String hasServiceLinkedRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckServiceLinkedRoleResponseBody(Builder builder) {
        this.hasServiceLinkedRole = builder.hasServiceLinkedRole;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return hasServiceLinkedRole
     */
    public String getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hasServiceLinkedRole; 
        private String requestId; 

        /**
         * Indicates whether an SLR is created.
         */
        public Builder hasServiceLinkedRole(String hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckServiceLinkedRoleResponseBody build() {
            return new CheckServiceLinkedRoleResponseBody(this);
        } 

    } 

}
