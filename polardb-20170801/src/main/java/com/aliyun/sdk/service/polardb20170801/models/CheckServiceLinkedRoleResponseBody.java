// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
         * <p>Indicates whether the SLR is created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasServiceLinkedRole(Boolean hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3F9E6A3B-C13E-4064-A010-18582A******</p>
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
