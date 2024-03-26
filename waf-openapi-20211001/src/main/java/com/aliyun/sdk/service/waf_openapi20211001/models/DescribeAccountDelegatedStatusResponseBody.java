// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountDelegatedStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountDelegatedStatusResponseBody</p>
 */
public class DescribeAccountDelegatedStatusResponseBody extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("AccountName")
    private String accountName;

    @NameInMap("DelegatedStatus")
    private Boolean delegatedStatus;

    @NameInMap("RequestId")
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
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * DelegatedStatus.
         */
        public Builder delegatedStatus(Boolean delegatedStatus) {
            this.delegatedStatus = delegatedStatus;
            return this;
        }

        /**
         * RequestId.
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
