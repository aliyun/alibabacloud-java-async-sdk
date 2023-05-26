// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserActiveTenantResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserActiveTenantResponseBody</p>
 */
public class GetUserActiveTenantResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tenant")
    private Tenant tenant;

    private GetUserActiveTenantResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tenant = builder.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserActiveTenantResponseBody create() {
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
     * @return tenant
     */
    public Tenant getTenant() {
        return this.tenant;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Tenant tenant; 

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
         * The details of the tenant.
         */
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            return this;
        }

        public GetUserActiveTenantResponseBody build() {
            return new GetUserActiveTenantResponseBody(this);
        } 

    } 

    public static class Tenant extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("Tid")
        private Long tid;

        private Tenant(Builder builder) {
            this.status = builder.status;
            this.tenantName = builder.tenantName;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenant create() {
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

            public Tenant build() {
                return new Tenant(this);
            } 

        } 

    }
}
