// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLoginInfoResponseBody} extends {@link TeaModel}
 *
 * <p>RequestLoginInfoResponseBody</p>
 */
public class RequestLoginInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("LoginInfo")
    private LoginInfo loginInfo;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestLoginInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.loginInfo = builder.loginInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLoginInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return loginInfo
     */
    public LoginInfo getLoginInfo() {
        return this.loginInfo;
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
        private Integer httpStatusCode; 
        private LoginInfo loginInfo; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LoginInfo.
         */
        public Builder loginInfo(LoginInfo loginInfo) {
            this.loginInfo = loginInfo;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public RequestLoginInfoResponseBody build() {
            return new RequestLoginInfoResponseBody(this);
        } 

    } 

    public static class Role extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RoleDescription")
        private String roleDescription;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleName")
        private String roleName;

        private Role(Builder builder) {
            this.instanceId = builder.instanceId;
            this.roleDescription = builder.roleDescription;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return roleDescription
         */
        public String getRoleDescription() {
            return this.roleDescription;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String instanceId; 
            private String roleDescription; 
            private String roleId; 
            private String roleName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RoleDescription.
             */
            public Builder roleDescription(String roleDescription) {
                this.roleDescription = roleDescription;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @NameInMap("Role")
        private java.util.List < Role> role;

        private Roles(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List < Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List < Role> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List < Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class LoginInfo extends TeaModel {
        @NameInMap("AgentServerUrl")
        private String agentServerUrl;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("Region")
        private String region;

        @NameInMap("Roles")
        private Roles roles;

        @NameInMap("SignData")
        private String signData;

        @NameInMap("Signature")
        private String signature;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("WebRtcUrl")
        private String webRtcUrl;

        private LoginInfo(Builder builder) {
            this.agentServerUrl = builder.agentServerUrl;
            this.displayName = builder.displayName;
            this.extension = builder.extension;
            this.phoneNumber = builder.phoneNumber;
            this.region = builder.region;
            this.roles = builder.roles;
            this.signData = builder.signData;
            this.signature = builder.signature;
            this.tenantId = builder.tenantId;
            this.userName = builder.userName;
            this.webRtcUrl = builder.webRtcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginInfo create() {
            return builder().build();
        }

        /**
         * @return agentServerUrl
         */
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roles
         */
        public Roles getRoles() {
            return this.roles;
        }

        /**
         * @return signData
         */
        public String getSignData() {
            return this.signData;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return webRtcUrl
         */
        public String getWebRtcUrl() {
            return this.webRtcUrl;
        }

        public static final class Builder {
            private String agentServerUrl; 
            private String displayName; 
            private String extension; 
            private String phoneNumber; 
            private String region; 
            private Roles roles; 
            private String signData; 
            private String signature; 
            private String tenantId; 
            private String userName; 
            private String webRtcUrl; 

            /**
             * AgentServerUrl.
             */
            public Builder agentServerUrl(String agentServerUrl) {
                this.agentServerUrl = agentServerUrl;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
                return this;
            }

            /**
             * SignData.
             */
            public Builder signData(String signData) {
                this.signData = signData;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * WebRtcUrl.
             */
            public Builder webRtcUrl(String webRtcUrl) {
                this.webRtcUrl = webRtcUrl;
                return this;
            }

            public LoginInfo build() {
                return new LoginInfo(this);
            } 

        } 

    }
}
