// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeAuditPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditPolicyResponseBody</p>
 */
public class DescribeAuditPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogAuditStatus")
    private String logAuditStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAuditPolicyResponseBody model) {
            this.logAuditStatus = model.logAuditStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the log audit feature is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disabled</li>
         * </ul>
         * <p>Default value: Disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder logAuditStatus(String logAuditStatus) {
            this.logAuditStatus = logAuditStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111E7B16-0A87-4CBA-B271-F34AD61E099F</p>
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
