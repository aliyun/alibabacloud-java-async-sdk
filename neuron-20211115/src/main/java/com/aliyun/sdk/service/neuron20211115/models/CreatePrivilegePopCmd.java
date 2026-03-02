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
 * {@link CreatePrivilegePopCmd} extends {@link TeaModel}
 *
 * <p>CreatePrivilegePopCmd</p>
 */
public class CreatePrivilegePopCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("actions")
    private String actions;

    @com.aliyun.core.annotation.NameInMap("resource")
    private String resource;

    @com.aliyun.core.annotation.NameInMap("roleId")
    private Long roleId;

    private CreatePrivilegePopCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.actions = builder.actions;
        this.resource = builder.resource;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivilegePopCmd create() {
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
     * @return actions
     */
    public String getActions() {
        return this.actions;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    public static final class Builder {
        private String accountId; 
        private String actions; 
        private String resource; 
        private Long roleId; 

        private Builder() {
        } 

        private Builder(CreatePrivilegePopCmd model) {
            this.accountId = model.accountId;
            this.actions = model.actions;
            this.resource = model.resource;
            this.roleId = model.roleId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * actions.
         */
        public Builder actions(String actions) {
            this.actions = actions;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * roleId.
         */
        public Builder roleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }

        public CreatePrivilegePopCmd build() {
            return new CreatePrivilegePopCmd(this);
        } 

    } 

}
