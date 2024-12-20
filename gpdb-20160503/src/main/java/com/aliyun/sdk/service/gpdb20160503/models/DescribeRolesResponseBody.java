// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeRolesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRolesResponseBody</p>
 */
public class DescribeRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleList")
    private RoleList roleList;

    private DescribeRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roleList = builder.roleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleList
     */
    public RoleList getRoleList() {
        return this.roleList;
    }

    public static final class Builder {
        private String requestId; 
        private RoleList roleList; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The roles.</p>
         */
        public Builder roleList(RoleList roleList) {
            this.roleList = roleList;
            return this;
        }

        public DescribeRolesResponseBody build() {
            return new DescribeRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRolesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRolesResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<String> role;

        private RoleList(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List<String> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<String> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List<String> role) {
                this.role = role;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
}
