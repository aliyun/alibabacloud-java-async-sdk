// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckServiceLinkedRoleResponseBody model) {
            this.hasServiceLinkedRole = model.hasServiceLinkedRole;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether an SLR is created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasServiceLinkedRole(Boolean hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA0F6761-7A8C-59F8-9624-FB56788C0EDF</p>
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
