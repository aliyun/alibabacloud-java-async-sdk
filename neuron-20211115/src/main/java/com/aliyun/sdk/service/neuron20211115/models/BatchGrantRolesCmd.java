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
 * {@link BatchGrantRolesCmd} extends {@link TeaModel}
 *
 * <p>BatchGrantRolesCmd</p>
 */
public class BatchGrantRolesCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("roleIds")
    private java.util.List<Long> roleIds;

    private BatchGrantRolesCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.roleIds = builder.roleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGrantRolesCmd create() {
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
     * @return roleIds
     */
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    public static final class Builder {
        private String accountId; 
        private java.util.List<Long> roleIds; 

        private Builder() {
        } 

        private Builder(BatchGrantRolesCmd model) {
            this.accountId = model.accountId;
            this.roleIds = model.roleIds;
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
         * roleIds.
         */
        public Builder roleIds(java.util.List<Long> roleIds) {
            this.roleIds = roleIds;
            return this;
        }

        public BatchGrantRolesCmd build() {
            return new BatchGrantRolesCmd(this);
        } 

    } 

}
