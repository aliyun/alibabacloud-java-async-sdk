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
 * {@link RoleGrantCmd} extends {@link TeaModel}
 *
 * <p>RoleGrantCmd</p>
 */
public class RoleGrantCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("authorizationResourceList")
    private java.util.List<AuthorizationResource> authorizationResourceList;

    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    private RoleGrantCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.authorizationResourceList = builder.authorizationResourceList;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoleGrantCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return authorizationResourceList
     */
    public java.util.List<AuthorizationResource> getAuthorizationResourceList() {
        return this.authorizationResourceList;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    public static final class Builder {
        private String accountId; 
        private java.util.List<AuthorizationResource> authorizationResourceList; 
        private Long roleId; 

        private Builder() {
        } 

        private Builder(RoleGrantCmd model) {
            this.accountId = model.accountId;
            this.authorizationResourceList = model.authorizationResourceList;
            this.roleId = model.roleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * authorizationResourceList.
         */
        public Builder authorizationResourceList(java.util.List<AuthorizationResource> authorizationResourceList) {
            this.authorizationResourceList = authorizationResourceList;
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

        public RoleGrantCmd build() {
            return new RoleGrantCmd(this);
        } 

    } 

}
