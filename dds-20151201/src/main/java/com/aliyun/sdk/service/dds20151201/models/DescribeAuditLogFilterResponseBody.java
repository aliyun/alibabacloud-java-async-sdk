// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogFilterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogFilterResponseBody</p>
 */
public class DescribeAuditLogFilterResponseBody extends TeaModel {
    @NameInMap("Filter")
    private String filter;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleType")
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
         * Filter.
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleType.
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
