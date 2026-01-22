// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link EcIdAccountId} extends {@link TeaModel}
 *
 * <p>EcIdAccountId</p>
 */
public class EcIdAccountId extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<Long> accountIds;

    @com.aliyun.core.annotation.NameInMap("EcId")
    private String ecId;

    private EcIdAccountId(Builder builder) {
        this.accountIds = builder.accountIds;
        this.ecId = builder.ecId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcIdAccountId create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return ecId
     */
    public String getEcId() {
        return this.ecId;
    }

    public static final class Builder {
        private java.util.List<Long> accountIds; 
        private String ecId; 

        private Builder() {
        } 

        private Builder(EcIdAccountId model) {
            this.accountIds = model.accountIds;
            this.ecId = model.ecId;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }

        /**
         * EcId.
         */
        public Builder ecId(String ecId) {
            this.ecId = ecId;
            return this;
        }

        public EcIdAccountId build() {
            return new EcIdAccountId(this);
        } 

    } 

}
