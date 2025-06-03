// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAccountKmsStatusResponseBody model) {
            this.accountStatus = model.accountStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of KMS within your Alibaba cloud account. Valid values:</p>
         * <ul>
         * <li><p>Enabled: KMS is enabled.</p>
         * </li>
         * <li><p>NotEnabled: KMS is disabled.</p>
         * </li>
         * <li><p>InDebt: Your account is overdue, and KMS stops providing services.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If your Alibaba Cloud account is overdue, top up your account at the earliest opportunity to avoid impacts on your services.</p>
         * </blockquote>
         * <ul>
         * <li>Suspended: KMS is suspended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3ac84333-d64d-4784-a8bc-997834a7ac6c</p>
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
