// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAccountDelegatedStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountDelegatedStatusResponseBody</p>
 */
public class DescribeAccountDelegatedStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("DelegatedStatus")
    private Boolean delegatedStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountDelegatedStatusResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.delegatedStatus = builder.delegatedStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountDelegatedStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return delegatedStatus
     */
    public Boolean getDelegatedStatus() {
        return this.delegatedStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountId; 
        private String accountName; 
        private Boolean delegatedStatus; 
        private String requestId; 

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>10***********34</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The name of the Alibaba Cloud account. This parameter is returned only if the account is the delegated administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>account_test</p>
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Indicates whether the Alibaba Cloud account is the delegated administrator account of the WAF instance.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder delegatedStatus(Boolean delegatedStatus) {
            this.delegatedStatus = delegatedStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8161375D-5958-5627-BFDE-DF14****3E87</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountDelegatedStatusResponseBody build() {
            return new DescribeAccountDelegatedStatusResponseBody(this);
        } 

    } 

}
