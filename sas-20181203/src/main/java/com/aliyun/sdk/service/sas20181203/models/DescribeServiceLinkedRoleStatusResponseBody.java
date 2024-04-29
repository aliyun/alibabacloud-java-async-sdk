// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
 */
public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleStatus")
    private RoleStatus roleStatus;

    private DescribeServiceLinkedRoleStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roleStatus = builder.roleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleStatus
     */
    public RoleStatus getRoleStatus() {
        return this.roleStatus;
    }

    public static final class Builder {
        private String requestId; 
        private RoleStatus roleStatus; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status information about the service-linked role.
         */
        public Builder roleStatus(RoleStatus roleStatus) {
            this.roleStatus = roleStatus;
            return this;
        }

        public DescribeServiceLinkedRoleStatusResponseBody build() {
            return new DescribeServiceLinkedRoleStatusResponseBody(this);
        } 

    } 

    public static class RoleStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private RoleStatus(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean status; 

            /**
             * Indicates whether the service-linked role is created. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public RoleStatus build() {
                return new RoleStatus(this);
            } 

        } 

    }
}
