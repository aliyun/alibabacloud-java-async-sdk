// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountKmsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountKmsStatusResponseBody</p>
 */
public class DescribeAccountKmsStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountKmsStatusResponseBody(Builder builder) {
        this.accountStatus = builder.accountStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountKmsStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountStatus; 
        private String requestId; 

        /**
         * The status of KMS within your Alibaba cloud account. Valid values:
         * <p>
         * 
         * *   Enabled: KMS is enabled.
         * 
         * *   NotEnabled: KMS is disabled.
         * 
         * *   InDebt: Your account is overdue, and KMS stops providing services.
         * 
         * > If your Alibaba Cloud account is overdue, top up your account at the earliest opportunity to avoid impacts on your services.
         * 
         * *   Suspended: KMS is suspended.
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountKmsStatusResponseBody build() {
            return new DescribeAccountKmsStatusResponseBody(this);
        } 

    } 

}
