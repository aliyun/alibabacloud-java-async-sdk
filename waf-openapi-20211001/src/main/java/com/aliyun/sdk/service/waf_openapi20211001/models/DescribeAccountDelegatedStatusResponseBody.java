// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the Alibaba Cloud account.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The name of the Alibaba Cloud account. This parameter is returned only if the account is the delegated administrator account.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Indicates whether the Alibaba Cloud account is the delegated administrator account of the WAF instance.
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder delegatedStatus(Boolean delegatedStatus) {
            this.delegatedStatus = delegatedStatus;
            return this;
        }

        /**
         * The request ID.
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
