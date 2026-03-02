// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RoleRevokeCmd} extends {@link TeaModel}
 *
 * <p>RoleRevokeCmd</p>
 */
public class RoleRevokeCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerId;

    @com.aliyun.core.annotation.NameInMap("authorizerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerType;

    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    private RoleRevokeCmd(Builder builder) {
        this.authorizerId = builder.authorizerId;
        this.authorizerType = builder.authorizerType;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoleRevokeCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @return authorizerType
     */
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    public static final class Builder {
        private String authorizerId; 
        private String authorizerType; 
        private Long roleId; 

        private Builder() {
        } 

        private Builder(RoleRevokeCmd model) {
            this.authorizerId = model.authorizerId;
            this.authorizerType = model.authorizerType;
            this.roleId = model.roleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authorizerId(String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>developer</p>
         */
        public Builder authorizerType(String authorizerType) {
            this.authorizerType = authorizerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }

        public RoleRevokeCmd build() {
            return new RoleRevokeCmd(this);
        } 

    } 

}
