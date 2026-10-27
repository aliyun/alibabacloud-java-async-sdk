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
 * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIdentityProviderResponseBody</p>
 */
public class UpdateIdentityProviderResponseBody extends TeaModel {
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

    private UpdateIdentityProviderResponseBody(Builder builder) {
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

    public static UpdateIdentityProviderResponseBody create() {
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

        private Builder(UpdateIdentityProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not mean that the asynchronous configuration or synchronization task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The currently saved identity provider binding information, including the expected configuration and resource status. The actual update may still be executing in the background.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the API request, which does not represent the execution result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message of the API request. An error description is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. Provide this value when you troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. To check whether the background configuration has taken effect, query the identity provider status separately.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateIdentityProviderResponseBody build() {
            return new UpdateIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("ssoStatus")
        private String ssoStatus;

        private Configuration(Builder builder) {
            this.bindingType = builder.bindingType;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.ssoStatus = builder.ssoStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return ssoStatus
         */
        public String getSsoStatus() {
            return this.ssoStatus;
        }

        public static final class Builder {
            private String bindingType; 
            private String entityId; 
            private String loginUrl; 
            private String ssoStatus; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.bindingType = model.bindingType;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.ssoStatus = model.ssoStatus;
            } 

            /**
             * <p>The actual SAML binding type saved in the upstream, which is HTTP-Redirect or HTTP-POST.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The actual enterprise IdP entity ID saved in the upstream.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The actual enterprise IdP SSO logon URL saved in the upstream.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The actual SSO logon status in the upstream. Enabled indicates that it is turned on, and Disabled indicates that it is turned off. This should be evaluated separately from the expected value of loginEnabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder ssoStatus(String ssoStatus) {
                this.ssoStatus = ssoStatus;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
     */
    public static class Saml extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("x509Certificates")
        private java.util.List<String> x509Certificates;

        private Saml(Builder builder) {
            this.bindingType = builder.bindingType;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.x509Certificates = builder.x509Certificates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Saml create() {
            return builder().build();
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return x509Certificates
         */
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

        public static final class Builder {
            private String bindingType; 
            private String entityId; 
            private String loginUrl; 
            private java.util.List<String> x509Certificates; 

            private Builder() {
            } 

            private Builder(Saml model) {
                this.bindingType = model.bindingType;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.x509Certificates = model.x509Certificates;
            } 

            /**
             * <p>The saved SAML binding type, which is HTTP-Redirect or HTTP-POST.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The saved enterprise IdP entity ID, which is different from the entity ID of the service provider (SP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The saved enterprise IdP SSO logon URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The list of saved enterprise IdP X.509 signing certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
             */
            public Builder x509Certificates(java.util.List<String> x509Certificates) {
                this.x509Certificates = x509Certificates;
                return this;
            }

            public Saml build() {
                return new Saml(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
     */
    public static class SyncScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("departmentIds")
        private java.util.List<String> departmentIds;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        private SyncScope(Builder builder) {
            this.departmentIds = builder.departmentIds;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncScope create() {
            return builder().build();
        }

        /**
         * @return departmentIds
         */
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<String> departmentIds; 
            private String mode; 

            private Builder() {
            } 

            private Builder(SyncScope model) {
                this.departmentIds = model.departmentIds;
                this.mode = model.mode;
            } 

            /**
             * <p>The list of department IDs in the synchronization scope, obtained from ListIdentityProviderDepartments. In SelectedDepartments mode, at least one non-empty department ID must be provided. In AllAuthorized mode, this parameter should be omitted or an empty array should be passed.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;]</p>
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * <p>The synchronization scope mode. AllAuthorized: all members within the authorization scope of the application address book. SelectedDepartments: the selected departments and all their sub-departments. A valid mode must be provided when syncScope is explicitly submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>SelectedDepartments</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public SyncScope build() {
                return new SyncScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("identityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("saml")
        private Saml saml;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        @com.aliyun.core.annotation.NameInMap("syncScope")
        private SyncScope syncScope;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.identityProviderType = builder.identityProviderType;
            this.loginEnabled = builder.loginEnabled;
            this.protocol = builder.protocol;
            this.saml = builder.saml;
            this.status = builder.status;
            this.syncEnabled = builder.syncEnabled;
            this.syncScope = builder.syncScope;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return loginEnabled
         */
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return saml
         */
        public Saml getSaml() {
            return this.saml;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        /**
         * @return syncScope
         */
        public SyncScope getSyncScope() {
            return this.syncScope;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String identityProviderType; 
            private Boolean loginEnabled; 
            private String protocol; 
            private Saml saml; 
            private String status; 
            private Boolean syncEnabled; 
            private SyncScope syncScope; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.identityProviderType = model.identityProviderType;
                this.loginEnabled = model.loginEnabled;
                this.protocol = model.protocol;
                this.saml = model.saml;
                this.status = model.status;
                this.syncEnabled = model.syncEnabled;
                this.syncScope = model.syncScope;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The actual SAML configuration read back from the upstream. This update operation does not perform the read-back and usually does not return this field. Use GetIdentityProvider to obtain it.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The type of the identity provider. DingTalk: DingTalk. Feishu: Lark. CustomSSO: custom enterprise identity provider connected through SAML. The value must be the same as the type of the identity provider bound to the current workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>The currently saved expected value of the logon switch, which alone does not prove that the upstream logon configuration has taken effect.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The currently saved logon protocol for CustomSSO, which is SAML when configured. This field is not returned for DingTalk or Lark.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The saved standardized SAML configuration for CustomSSO. The original metadata XML is not echoed. This field is not returned if no valid configuration is saved or if the identity provider is DingTalk or Lark. This value is the locally saved configuration and is not equivalent to the actual upstream configuration.</p>
             */
            public Builder saml(Saml saml) {
                this.saml = saml;
                return this;
            }

            /**
             * <p>The status of the identity provider resource and logon configuration. Valid values:</p>
             * <ul>
             * <li>CONFIGURED: The configuration is accepted.</li>
             * <li>UPDATING: The configuration is being updated.</li>
             * <li>SYNCING: Synchronization is in progress.</li>
             * <li>SYNCED: The synchronization phase is completed.</li>
             * <li>READY: The resource is ready.</li>
             * <li>SYNC_FAILED: Synchronization failed.</li>
             * <li>UPDATE_FAILED: The update failed.</li>
             * <li>DISCONNECTING: Unbinding is in progress.</li>
             * <li>DISCONNECT_FAILED: Unbinding failed.
             * READY alone does not indicate that users have been imported. Query the SCIM operation results for CustomSSO separately.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The currently saved expected value of the synchronization switch. For DingTalk and Lark, it is used for subsequent address book change events. The SCIM switch for CustomSSO is managed through UpdateIdentityProviderSCIM, and the operation results are queried through GetIdentityProviderSCIM.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            /**
             * <p>The saved synchronization scope for DingTalk and Lark. The default value for valid historical configurations is AllAuthorized, and this field may not be returned for corrupted historical configurations. This field is not returned for CustomSSO.</p>
             */
            public Builder syncScope(SyncScope syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the identity provider belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
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
