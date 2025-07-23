// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link GetAuditLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditLogStatusResponseBody</p>
 */
public class GetAuditLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditLogStatus")
    private String auditLogStatus;

    @com.aliyun.core.annotation.NameInMap("AuditOssBucket")
    private String auditOssBucket;

    @com.aliyun.core.annotation.NameInMap("GrantedServiceAccess")
    private Boolean grantedServiceAccess;

    @com.aliyun.core.annotation.NameInMap("OssBuckets")
    private java.util.List<String> ossBuckets;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAuditLogStatusResponseBody(Builder builder) {
        this.auditLogStatus = builder.auditLogStatus;
        this.auditOssBucket = builder.auditOssBucket;
        this.grantedServiceAccess = builder.grantedServiceAccess;
        this.ossBuckets = builder.ossBuckets;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditLogStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditLogStatus
     */
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    /**
     * @return auditOssBucket
     */
    public String getAuditOssBucket() {
        return this.auditOssBucket;
    }

    /**
     * @return grantedServiceAccess
     */
    public Boolean getGrantedServiceAccess() {
        return this.grantedServiceAccess;
    }

    /**
     * @return ossBuckets
     */
    public java.util.List<String> getOssBuckets() {
        return this.ossBuckets;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String auditLogStatus; 
        private String auditOssBucket; 
        private Boolean grantedServiceAccess; 
        private java.util.List<String> ossBuckets; 
        private String regionId; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAuditLogStatusResponseBody model) {
            this.auditLogStatus = model.auditLogStatus;
            this.auditOssBucket = model.auditOssBucket;
            this.grantedServiceAccess = model.grantedServiceAccess;
            this.ossBuckets = model.ossBuckets;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Indicates whether the audit log feature is enabled. Valid values:</p>
         * <ul>
         * <li>enable</li>
         * <li>disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder auditLogStatus(String auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * <p>The bucket that stores audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-test</p>
         */
        public Builder auditOssBucket(String auditOssBucket) {
            this.auditOssBucket = auditOssBucket;
            return this;
        }

        /**
         * <p>Indicates whether Cloud Hardware Security Module is authorized to deliver logs. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder grantedServiceAccess(Boolean grantedServiceAccess) {
            this.grantedServiceAccess = grantedServiceAccess;
            return this;
        }

        /**
         * <p>A list of buckets that can be used to store audit logs.</p>
         */
        public Builder ossBuckets(java.util.List<String> ossBuckets) {
            this.ossBuckets = ossBuckets;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAuditLogStatusResponseBody build() {
            return new GetAuditLogStatusResponseBody(this);
        } 

    } 

}
