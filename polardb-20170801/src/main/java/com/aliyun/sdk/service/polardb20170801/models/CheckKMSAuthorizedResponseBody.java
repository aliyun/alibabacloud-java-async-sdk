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
 * {@link CheckKMSAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckKMSAuthorizedResponseBody</p>
 */
public class CheckKMSAuthorizedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationState")
    private Integer authorizationState;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
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

        private Builder() {
        } 

        private Builder(CheckKMSAuthorizedResponseBody model) {
            this.authorizationState = model.authorizationState;
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
            this.roleArn = model.roleArn;
        } 

        /**
         * <p>The authorization status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Unauthorized.</p>
         * </li>
         * <li><p><strong>1</strong>: Authorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder authorizationState(Integer authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Global Resource Descriptor of the role. It specifies the role. For more information, see <a href="https://help.aliyun.com/document_detail/93689.html">RAM role overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406926*****:role/aliyunrdsinstanceencryptiondefaultrole</p>
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
