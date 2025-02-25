// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetUserActiveTenantResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserActiveTenantResponseBody</p>
 */
public class GetUserActiveTenantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tenant")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>TenantNotExist</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified tenant does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4B63CAC5-BD7F-5C7C-82C9-59DFFBC3C5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the tenant.</p>
         */
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            return this;
        }

        public GetUserActiveTenantResponseBody build() {
            return new GetUserActiveTenantResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserActiveTenantResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserActiveTenantResponseBody</p>
     */
    public static class Tenant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Tid")
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
             * <p>The status of the tenant. Valid values:</p>
             * <ul>
             * <li><strong>ACTIVE</strong>: The tenant is used to access DMS.</li>
             * <li><strong>IN_ACTIVE</strong>: The tenant is not used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>test_name</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>3***</p>
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
