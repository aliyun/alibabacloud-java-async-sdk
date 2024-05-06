// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogConfigResponseBody</p>
 */
public class DescribeAuditLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbAudit")
    private String dbAudit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private String retention;

    private DescribeAuditLogConfigResponseBody(Builder builder) {
        this.dbAudit = builder.dbAudit;
        this.requestId = builder.requestId;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbAudit
     */
    public String getDbAudit() {
        return this.dbAudit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retention
     */
    public String getRetention() {
        return this.retention;
    }

    public static final class Builder {
        private String dbAudit; 
        private String requestId; 
        private String retention; 

        /**
         * Indicates whether the audit log feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**: enabled
         * *   **false**: disabled
         * 
         * > You can call the [ModifyAuditLogConfig](~~130206~~) operation to enable or disable the audit log feature for an ApsaraDB for Redis instance.
         */
        public Builder dbAudit(String dbAudit) {
            this.dbAudit = dbAudit;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The retention period of audit logs. Unit: days.
         */
        public Builder retention(String retention) {
            this.retention = retention;
            return this;
        }

        public DescribeAuditLogConfigResponseBody build() {
            return new DescribeAuditLogConfigResponseBody(this);
        } 

    } 

}
