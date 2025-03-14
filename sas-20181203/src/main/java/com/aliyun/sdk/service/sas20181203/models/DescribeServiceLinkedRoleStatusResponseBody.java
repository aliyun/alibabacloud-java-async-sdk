// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
     * @return roleStatus
     */
    public RoleStatus getRoleStatus() {
        return this.roleStatus;
    }

    public static final class Builder {
        private String requestId; 
        private RoleStatus roleStatus; 

        private Builder() {
        } 

        private Builder(DescribeServiceLinkedRoleStatusResponseBody model) {
            this.requestId = model.requestId;
            this.roleStatus = model.roleStatus;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>39CE98F4-88C0-4539-B906-6B542E5C07B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status information about the service-linked role.</p>
         */
        public Builder roleStatus(RoleStatus roleStatus) {
            this.roleStatus = roleStatus;
            return this;
        }

        public DescribeServiceLinkedRoleStatusResponseBody build() {
            return new DescribeServiceLinkedRoleStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RoleStatus model) {
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the service-linked role is created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
