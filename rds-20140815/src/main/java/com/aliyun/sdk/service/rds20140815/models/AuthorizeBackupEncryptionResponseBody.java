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
 * {@link AuthorizeBackupEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>AuthorizeBackupEncryptionResponseBody</p>
 */
public class AuthorizeBackupEncryptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationState")
    private Integer authorizationState;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    private AuthorizeBackupEncryptionResponseBody(Builder builder) {
        this.authorizationState = builder.authorizationState;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleARN = builder.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeBackupEncryptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationState
     */
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer authorizationState; 
        private String message; 
        private String requestId; 
        private String roleARN; 

        private Builder() {
        } 

        private Builder(AuthorizeBackupEncryptionResponseBody model) {
            this.authorizationState = model.authorizationState;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleARN = model.roleARN;
        } 

        /**
         * <p>The authorization status of the account. Valid values:</p>
         * <ul>
         * <li>0: Not authorized.</li>
         * <li>1: Authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authorizationState(Integer authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }

        /**
         * <p>The error message returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>create backup encrypt service linked role error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A1DD2A4-69F7-5848-AD56-********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Resource Name (ARN) of the service-linked role associated with backup encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::113991************:role/AliyunServiceRoleForRdsBackupEncryption</p>
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public AuthorizeBackupEncryptionResponseBody build() {
            return new AuthorizeBackupEncryptionResponseBody(this);
        } 

    } 

}
