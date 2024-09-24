// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > ossBuckets;

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
    public java.util.List < String > getOssBuckets() {
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
        private java.util.List < String > ossBuckets; 
        private String regionId; 
        private String requestId; 
        private Boolean success; 

        /**
         * AuditLogStatus.
         */
        public Builder auditLogStatus(String auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * AuditOssBucket.
         */
        public Builder auditOssBucket(String auditOssBucket) {
            this.auditOssBucket = auditOssBucket;
            return this;
        }

        /**
         * GrantedServiceAccess.
         */
        public Builder grantedServiceAccess(Boolean grantedServiceAccess) {
            this.grantedServiceAccess = grantedServiceAccess;
            return this;
        }

        /**
         * OssBuckets.
         */
        public Builder ossBuckets(java.util.List < String > ossBuckets) {
            this.ossBuckets = ossBuckets;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
