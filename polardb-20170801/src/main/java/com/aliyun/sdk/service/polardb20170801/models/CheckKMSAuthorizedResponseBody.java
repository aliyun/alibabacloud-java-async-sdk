// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckKMSAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckKMSAuthorizedResponseBody</p>
 */
public class CheckKMSAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizationState")
    private Integer authorizationState;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleArn")
    private String roleArn;

    private CheckKMSAuthorizedResponseBody(Builder builder) {
        this.authorizationState = builder.authorizationState;
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckKMSAuthorizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationState
     */
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private Integer authorizationState; 
        private String DBClusterId; 
        private String requestId; 
        private String roleArn; 

        /**
         * Indicates whether the cluster is authorized to use KMS. Valid values:
         * <p>
         * 
         * *   **0**: no.
         * *   **1**: yes.
         */
        public Builder authorizationState(Integer authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see [RAM role overview](~~93689~~).
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public CheckKMSAuthorizedResponseBody build() {
            return new CheckKMSAuthorizedResponseBody(this);
        } 

    } 

}
