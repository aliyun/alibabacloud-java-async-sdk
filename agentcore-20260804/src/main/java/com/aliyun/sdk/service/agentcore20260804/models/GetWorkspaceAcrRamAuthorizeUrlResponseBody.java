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
 * {@link GetWorkspaceAcrRamAuthorizeUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceAcrRamAuthorizeUrlResponseBody</p>
 */
public class GetWorkspaceAcrRamAuthorizeUrlResponseBody extends TeaModel {
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

    private GetWorkspaceAcrRamAuthorizeUrlResponseBody(Builder builder) {
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

    public static GetWorkspaceAcrRamAuthorizeUrlResponseBody create() {
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

        private Builder(GetWorkspaceAcrRamAuthorizeUrlResponseBody model) {
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

        public GetWorkspaceAcrRamAuthorizeUrlResponseBody build() {
            return new GetWorkspaceAcrRamAuthorizeUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceAcrRamAuthorizeUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceAcrRamAuthorizeUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("authorizeUrl")
        private String authorizeUrl;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("roleSource")
        private String roleSource;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.authorizeUrl = builder.authorizeUrl;
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
         * @return authorizeUrl
         */
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
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
            private String authorizeUrl; 
            private String roleName; 
            private String roleSource; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acrInstanceId = model.acrInstanceId;
                this.authorizeUrl = model.authorizeUrl;
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
             * <p>The RAM authorization URL used to create or append ACR permissions for the shared role on the target repository.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-1234567890abcdef12345%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreAcrPull-63373f3802583663d49465d8061e410a899d8f2936b8fc0cb9ec905b71f273c6%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22CrPullInstanceImage%22%2C%22templateValue%22%3A%7B%22crInstance%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Ainstance%2Fcri-1234567890abcdef%22%2C%22crRepository%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Arepository%2Fcri-1234567890abcdef%2Fexample%2Fagent-image%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-1234567890abcdef12345%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreAcrPull-63373f3802583663d49465d8061e410a899d8f2936b8fc0cb9ec905b71f273c6%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22CrPullInstanceImage%22%2C%22templateValue%22%3A%7B%22crInstance%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Ainstance%2Fcri-1234567890abcdef%22%2C%22crRepository%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Arepository%2Fcri-1234567890abcdef%2Fexample%2Fagent-image%22%7D%7D%5D%7D%5D%7D</a></p>
             */
            public Builder authorizeUrl(String authorizeUrl) {
                this.authorizeUrl = authorizeUrl;
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
             * <p>The source of the shared role. This value does not indicate that authorization is complete.</p>
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
