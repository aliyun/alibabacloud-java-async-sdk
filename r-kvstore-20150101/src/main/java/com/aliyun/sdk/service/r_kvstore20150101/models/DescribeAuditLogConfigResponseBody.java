// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAuditLogConfigResponseBody model) {
            this.dbAudit = model.dbAudit;
            this.requestId = model.requestId;
            this.retention = model.retention;
        } 

        /**
         * <p>Indicates whether the audit log feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
         * </ul>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a> operation to enable or disable the audit log feature for a Tair (Redis OSS-compatible) instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dbAudit(String dbAudit) {
            this.dbAudit = dbAudit;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The retention period of audit logs. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
