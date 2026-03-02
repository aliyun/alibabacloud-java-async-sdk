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
 * {@link NeuronBizUserTokenCreateCmd} extends {@link TeaModel}
 *
 * <p>NeuronBizUserTokenCreateCmd</p>
 */
public class NeuronBizUserTokenCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private Long accountId;

    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    private NeuronBizUserTokenCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.bizId = builder.bizId;
        this.permission = builder.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronBizUserTokenCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    public static final class Builder {
        private Long accountId; 
        private String bizId; 
        private String permission; 

        private Builder() {
        } 

        private Builder(NeuronBizUserTokenCreateCmd model) {
            this.accountId = model.accountId;
            this.bizId = model.bizId;
            this.permission = model.permission;
        } 

        /**
         * accountId.
         */
        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>233131</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * permission.
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        public NeuronBizUserTokenCreateCmd build() {
            return new NeuronBizUserTokenCreateCmd(this);
        } 

    } 

}
