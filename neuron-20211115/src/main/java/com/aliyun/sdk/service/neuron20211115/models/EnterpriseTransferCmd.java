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
 * {@link EnterpriseTransferCmd} extends {@link TeaModel}
 *
 * <p>EnterpriseTransferCmd</p>
 */
public class EnterpriseTransferCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private EnterpriseTransferCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseTransferCmd create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private String accountId; 
        private Long id; 

        private Builder() {
        } 

        private Builder(EnterpriseTransferCmd model) {
            this.accountId = model.accountId;
            this.id = model.id;
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
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public EnterpriseTransferCmd build() {
            return new EnterpriseTransferCmd(this);
        } 

    } 

}
