// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountKmsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountKmsStatusResponseBody</p>
 */
public class DescribeAccountKmsStatusResponseBody extends TeaModel {
    @NameInMap("AccountStatus")
    private String accountStatus;

    @NameInMap("RequestId")
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
         * AccountStatus.
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * RequestId.
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
