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
 * {@link CheckBackupEncryptionAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckBackupEncryptionAuthorizedResponseBody</p>
 */
public class CheckBackupEncryptionAuthorizedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationState")
    private String authorizationState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    private CheckBackupEncryptionAuthorizedResponseBody(Builder builder) {
        this.authorizationState = builder.authorizationState;
        this.requestId = builder.requestId;
        this.roleARN = builder.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBackupEncryptionAuthorizedResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationState
     */
    public String getAuthorizationState() {
        return this.authorizationState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    public static final class Builder {
        private String authorizationState; 
        private String requestId; 
        private String roleARN; 

        private Builder() {
        } 

        private Builder(CheckBackupEncryptionAuthorizedResponseBody model) {
            this.authorizationState = model.authorizationState;
            this.requestId = model.requestId;
            this.roleARN = model.roleARN;
        } 

        /**
         * AuthorizationState.
         */
        public Builder authorizationState(String authorizationState) {
            this.authorizationState = authorizationState;
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
         * RoleARN.
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public CheckBackupEncryptionAuthorizedResponseBody build() {
            return new CheckBackupEncryptionAuthorizedResponseBody(this);
        } 

    } 

}
