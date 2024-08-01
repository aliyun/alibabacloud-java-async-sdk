// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogFilterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogFilterResponseBody</p>
 */
public class DescribeAuditLogFilterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private DescribeAuditLogFilterResponseBody(Builder builder) {
        this.filter = builder.filter;
        this.requestId = builder.requestId;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogFilterResponseBody create() {
        return builder().build();
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder {
        private String filter; 
        private String requestId; 
        private String roleType; 

        /**
         * The type of the audit log entries. Valid values:
         * <p>
         * 
         * *   **admin**: O\&M and management operations
         * *   **slow**: slow query logs
         * *   **query**: query operations
         * *   **insert**: insert operations
         * *   **update**: update operations
         * *   **delete**: delete operations
         * *   **command**: protocol commands such as the aggregate method
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The role of the node.
         */
        public Builder roleType(String roleType) {
            this.roleType = roleType;
            return this;
        }

        public DescribeAuditLogFilterResponseBody build() {
            return new DescribeAuditLogFilterResponseBody(this);
        } 

    } 

}
