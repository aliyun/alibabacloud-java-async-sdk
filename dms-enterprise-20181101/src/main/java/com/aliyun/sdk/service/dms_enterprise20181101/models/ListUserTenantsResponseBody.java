// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserTenantsResponseBody</p>
 */
public class ListUserTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TenantList")
    private java.util.List < TenantList> tenantList;

    private ListUserTenantsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tenantList = builder.tenantList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserTenantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return tenantList
     */
    public java.util.List < TenantList> getTenantList() {
        return this.tenantList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TenantList> tenantList; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The details of the tenants that were returned.
         */
        public Builder tenantList(java.util.List < TenantList> tenantList) {
            this.tenantList = tenantList;
            return this;
        }

        public ListUserTenantsResponseBody build() {
            return new ListUserTenantsResponseBody(this);
        } 

    } 

    public static class TenantList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private Long tid;

        private TenantList(Builder builder) {
            this.status = builder.status;
            this.tenantName = builder.tenantName;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return tid
         */
        public Long getTid() {
            return this.tid;
        }

        public static final class Builder {
            private String status; 
            private String tenantName; 
            private Long tid; 

            /**
             * The status of the tenant. Valid values:
             * <p>
             * 
             * *   **ACTIVE**: The tenant is used to access DMS.
             * *   **IN_ACTIVE**: The tenant is not used.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the tenant.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tid(Long tid) {
                this.tid = tid;
                return this;
            }

            public TenantList build() {
                return new TenantList(this);
            } 

        } 

    }
}
