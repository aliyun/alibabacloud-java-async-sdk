// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorAccountsResponseBody</p>
 */
public class DescribeMonitorAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMonitorAccountsResponseBody(Builder builder) {
        this.accountIds = builder.accountIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > accountIds; 
        private String requestId; 

        /**
         * The IDs of the members.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMonitorAccountsResponseBody build() {
            return new DescribeMonitorAccountsResponseBody(this);
        } 

    } 

}
