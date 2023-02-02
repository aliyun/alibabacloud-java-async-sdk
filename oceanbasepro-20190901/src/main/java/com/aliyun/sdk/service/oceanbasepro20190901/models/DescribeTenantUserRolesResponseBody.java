// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantUserRolesResponseBody</p>
 */
public class DescribeTenantUserRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
    private java.util.List < String > role;

    private DescribeTenantUserRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantUserRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public java.util.List < String > getRole() {
        return this.role;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > role; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of roles of the user.   
         * <p>
         * Valid values: 
         * 
         * ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.
         * ReadOnly: a role that has only the read-only privilege SELECT.
         * DDL: a role that has DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.
         * DML: a role that has DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.
         */
        public Builder role(java.util.List < String > role) {
            this.role = role;
            return this;
        }

        public DescribeTenantUserRolesResponseBody build() {
            return new DescribeTenantUserRolesResponseBody(this);
        } 

    } 

}
