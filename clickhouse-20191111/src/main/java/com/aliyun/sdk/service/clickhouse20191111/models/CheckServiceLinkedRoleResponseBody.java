// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
    private Boolean hasServiceLinkedRole;

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
    public Boolean getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean hasServiceLinkedRole; 
        private String requestId; 

        /**
         * <p>Indicates whether a service-linked role is created for ApsaraDB for ClickHouse.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder hasServiceLinkedRole(Boolean hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
