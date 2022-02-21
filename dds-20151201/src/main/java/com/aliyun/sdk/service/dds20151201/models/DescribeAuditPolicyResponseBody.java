// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditPolicyResponseBody</p>
 */
public class DescribeAuditPolicyResponseBody extends TeaModel {
    @NameInMap("LogAuditStatus")
    private String logAuditStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAuditPolicyResponseBody(Builder builder) {
        this.logAuditStatus = builder.logAuditStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return logAuditStatus
     */
    public String getLogAuditStatus() {
        return this.logAuditStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String logAuditStatus; 
        private String requestId; 

        /**
         * LogAuditStatus.
         */
        public Builder logAuditStatus(String logAuditStatus) {
            this.logAuditStatus = logAuditStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAuditPolicyResponseBody build() {
            return new DescribeAuditPolicyResponseBody(this);
        } 

    } 

}
