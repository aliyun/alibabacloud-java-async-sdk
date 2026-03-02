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
 * {@link Privilege} extends {@link TeaModel}
 *
 * <p>Privilege</p>
 */
public class Privilege extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actions;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    private Privilege(Builder builder) {
        this.accountId = builder.accountId;
        this.actions = builder.actions;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Privilege create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String gmtCreate; 
        private Long id; 
        private String requestId; 
        private String resource; 
        private Long roleId; 

        private Builder() {
        } 

        private Builder(Privilege model) {
            this.accountId = model.accountId;
            this.actions = model.actions;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.roleId = model.roleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121321412341</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;write,edit&quot;</p>
         */
        public Builder actions(String actions) {
            this.actions = actions;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>neuron:catalog:company/1:pbc/2</p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
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

        public Privilege build() {
            return new Privilege(this);
        } 

    } 

}
