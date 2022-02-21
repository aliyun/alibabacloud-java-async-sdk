// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogConfigResponseBody</p>
 */
public class DescribeAuditLogConfigResponseBody extends TeaModel {
    @NameInMap("AuditLogStatus")
    private String auditLogStatus;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAuditLogConfigResponseBody(Builder builder) {
        this.auditLogStatus = builder.auditLogStatus;
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditLogStatus
     */
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String auditLogStatus; 
        private String DBClusterId; 
        private String requestId; 

        /**
         * AuditLogStatus.
         */
        public Builder auditLogStatus(String auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAuditLogConfigResponseBody build() {
            return new DescribeAuditLogConfigResponseBody(this);
        } 

    } 

}
