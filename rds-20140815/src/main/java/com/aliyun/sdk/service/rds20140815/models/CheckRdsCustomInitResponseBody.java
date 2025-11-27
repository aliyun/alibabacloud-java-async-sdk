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
 * {@link CheckRdsCustomInitResponseBody} extends {@link TeaModel}
 *
 * <p>CheckRdsCustomInitResponseBody</p>
 */
public class CheckRdsCustomInitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HasServiceLinkedRole")
    private String hasServiceLinkedRole;

    @com.aliyun.core.annotation.NameInMap("RegisterUidSuccess")
    private Boolean registerUidSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequireServiceLinkedRole")
    private String requireServiceLinkedRole;

    private CheckRdsCustomInitResponseBody(Builder builder) {
        this.hasServiceLinkedRole = builder.hasServiceLinkedRole;
        this.registerUidSuccess = builder.registerUidSuccess;
        this.requestId = builder.requestId;
        this.requireServiceLinkedRole = builder.requireServiceLinkedRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRdsCustomInitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasServiceLinkedRole
     */
    public String getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    /**
     * @return registerUidSuccess
     */
    public Boolean getRegisterUidSuccess() {
        return this.registerUidSuccess;
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
        private Boolean registerUidSuccess; 
        private String requestId; 
        private String requireServiceLinkedRole; 

        private Builder() {
        } 

        private Builder(CheckRdsCustomInitResponseBody model) {
            this.hasServiceLinkedRole = model.hasServiceLinkedRole;
            this.registerUidSuccess = model.registerUidSuccess;
            this.requestId = model.requestId;
            this.requireServiceLinkedRole = model.requireServiceLinkedRole;
        } 

        /**
         * HasServiceLinkedRole.
         */
        public Builder hasServiceLinkedRole(String hasServiceLinkedRole) {
            this.hasServiceLinkedRole = hasServiceLinkedRole;
            return this;
        }

        /**
         * RegisterUidSuccess.
         */
        public Builder registerUidSuccess(Boolean registerUidSuccess) {
            this.registerUidSuccess = registerUidSuccess;
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
         * RequireServiceLinkedRole.
         */
        public Builder requireServiceLinkedRole(String requireServiceLinkedRole) {
            this.requireServiceLinkedRole = requireServiceLinkedRole;
            return this;
        }

        public CheckRdsCustomInitResponseBody build() {
            return new CheckRdsCustomInitResponseBody(this);
        } 

    } 

}
