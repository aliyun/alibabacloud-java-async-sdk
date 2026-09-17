// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link VerifyWorkspaceAcrRamAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyWorkspaceAcrRamAuthorizationResponseBody</p>
 */
public class VerifyWorkspaceAcrRamAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private VerifyWorkspaceAcrRamAuthorizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWorkspaceAcrRamAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyWorkspaceAcrRamAuthorizationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBody build() {
            return new VerifyWorkspaceAcrRamAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyWorkspaceAcrRamAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyWorkspaceAcrRamAuthorizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("authorizationStatus")
        private String authorizationStatus;

        @com.aliyun.core.annotation.NameInMap("eligibilityStatus")
        private String eligibilityStatus;

        @com.aliyun.core.annotation.NameInMap("reasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("reasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("roleSource")
        private String roleSource;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.authorizationStatus = builder.authorizationStatus;
            this.eligibilityStatus = builder.eligibilityStatus;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.roleName = builder.roleName;
            this.roleSource = builder.roleSource;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return authorizationStatus
         */
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        /**
         * @return eligibilityStatus
         */
        public String getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return roleSource
         */
        public String getRoleSource() {
            return this.roleSource;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String acrInstanceId; 
            private String authorizationStatus; 
            private String eligibilityStatus; 
            private String reasonCode; 
            private String reasonMessage; 
            private String roleName; 
            private String roleSource; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acrInstanceId = model.acrInstanceId;
                this.authorizationStatus = model.authorizationStatus;
                this.eligibilityStatus = model.eligibilityStatus;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.roleName = model.roleName;
                this.roleSource = model.roleSource;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ACR Enterprise instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-1234567890abcdef</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The policy attachment status for the target repository.</p>
             * 
             * <strong>example:</strong>
             * <p>UNAUTHORIZED</p>
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * <p>The prerequisite status for access. This is not the Secret Ready status.</p>
             * 
             * <strong>example:</strong>
             * <p>ELIGIBLE</p>
             */
            public Builder eligibilityStatus(String eligibilityStatus) {
                this.eligibilityStatus = eligibilityStatus;
                return this;
            }

            /**
             * <p>The stable reason code for unauthorized or unmet conditions. This field is omitted when no reason exists.</p>
             * 
             * <strong>example:</strong>
             * <p>AcrRamUnauthorized</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The human-readable reason. This field is omitted when no reason exists.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorize the Workspace role for this ACR instance.</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The shared role name selected by the backend. This value is not editable on the frontend.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunAgentCoreWorkspace-ws-1234567890abcdef12345</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The source of the shared role. This does not indicate that authorization is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKSPACE_SHARED</p>
             */
            public Builder roleSource(String roleSource) {
                this.roleSource = roleSource;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1234567890abcdef12345</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
