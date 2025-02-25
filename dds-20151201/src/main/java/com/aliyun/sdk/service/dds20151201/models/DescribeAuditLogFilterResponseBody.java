// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
         * <p>The type of the audit log entries. Valid values:</p>
         * <ul>
         * <li><strong>admin</strong>: O&amp;M and management operations</li>
         * <li><strong>slow</strong>: slow query logs</li>
         * <li><strong>query</strong>: query operations</li>
         * <li><strong>insert</strong>: insert operations</li>
         * <li><strong>update</strong>: update operations</li>
         * <li><strong>delete</strong>: delete operations</li>
         * <li><strong>command</strong>: protocol commands such as the aggregate method</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin,slow,insert,query,update,delete,command</p>
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7BAFB0B3-2A54-5B65-B13E-3937CF08FEE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The role of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>logic</p>
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
