// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link MemberAccountResult} extends {@link TeaModel}
 *
 * <p>MemberAccountResult</p>
 */
public class MemberAccountResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountNo")
    private java.util.List<String> accountNo;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    private MemberAccountResult(Builder builder) {
        this.accountNo = builder.accountNo;
        this.shopId = builder.shopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberAccountResult create() {
        return builder().build();
    }

    /**
     * @return accountNo
     */
    public java.util.List<String> getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    public static final class Builder {
        private java.util.List<String> accountNo; 
        private String shopId; 

        /**
         * accountNo.
         */
        public Builder accountNo(java.util.List<String> accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        public MemberAccountResult build() {
            return new MemberAccountResult(this);
        } 

    } 

}
