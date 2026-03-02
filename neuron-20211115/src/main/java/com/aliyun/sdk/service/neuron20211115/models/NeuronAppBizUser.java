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
 * {@link NeuronAppBizUser} extends {@link TeaModel}
 *
 * <p>NeuronAppBizUser</p>
 */
public class NeuronAppBizUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private Long accountId;

    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    private NeuronAppBizUser(Builder builder) {
        this.accountId = builder.accountId;
        this.bizId = builder.bizId;
        this.permission = builder.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppBizUser create() {
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

        private Builder(NeuronAppBizUser model) {
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
         * bizId.
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

        public NeuronAppBizUser build() {
            return new NeuronAppBizUser(this);
        } 

    } 

}
