// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CheckServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleResponseBody</p>
 */
public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HasServiceLinkedRole")
    private String hasServiceLinkedRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequireServiceLinkedRole")
    private String requireServiceLinkedRole;

    private CheckServiceLinkedRoleResponseBody(Builder builder) {
        this.hasServiceLinkedRole = builder.hasServiceLinkedRole;
        this.requestId = builder.requestId;
        this.requireServiceLinkedRole = builder.requireServiceLinkedRole;
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

    /**
     * @return requireServiceLinkedRole
     */
    public String getRequireServiceLinkedRole() {
        return this.requireServiceLinkedRole;
    }

    public static final class Builder {
        private String hasServiceLinkedRole; 
        private String requestId; 
        private String requireServiceLinkedRole; 

        /**
         * <p>Indicates whether an SLR is created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasServiceLinkedRole(String hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AB44DC0A-7E77-442A-97A9-C6418694CB22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RequireServiceLinkedRole.
         */
        public Builder requireServiceLinkedRole(String requireServiceLinkedRole) {
            this.requireServiceLinkedRole = requireServiceLinkedRole;
            return this;
        }

        public CheckServiceLinkedRoleResponseBody build() {
            return new CheckServiceLinkedRoleResponseBody(this);
        } 

    } 

}
