// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AuditLogStatus")
    private String auditLogStatus;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAuditLogConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String auditLogStatus; 
        private String DBClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAuditLogConfigResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.auditLogStatus = model.auditLogStatus;
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status of SQL audit. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: SQL audit is enabled.</li>
         * <li><strong>off</strong>: SQL audit is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder auditLogStatus(String auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-t4nj8619bz2w3****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0983B43-B2EC-536A-8791-142B5CF1E9B6</p>
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
