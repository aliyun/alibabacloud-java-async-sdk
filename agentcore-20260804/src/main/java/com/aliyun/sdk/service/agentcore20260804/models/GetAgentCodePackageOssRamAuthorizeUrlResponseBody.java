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
 * {@link GetAgentCodePackageOssRamAuthorizeUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentCodePackageOssRamAuthorizeUrlResponseBody</p>
 */
public class GetAgentCodePackageOssRamAuthorizeUrlResponseBody extends TeaModel {
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

    private GetAgentCodePackageOssRamAuthorizeUrlResponseBody(Builder builder) {
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

    public static GetAgentCodePackageOssRamAuthorizeUrlResponseBody create() {
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

        private Builder(GetAgentCodePackageOssRamAuthorizeUrlResponseBody model) {
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
         * <p>The returned result.</p>
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
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentCodePackageOssRamAuthorizeUrlResponseBody build() {
            return new GetAgentCodePackageOssRamAuthorizeUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentCodePackageOssRamAuthorizeUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentCodePackageOssRamAuthorizeUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizeUrl")
        private String authorizeUrl;

        @com.aliyun.core.annotation.NameInMap("ossBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.authorizeUrl = builder.authorizeUrl;
            this.ossBucketName = builder.ossBucketName;
            this.roleName = builder.roleName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizeUrl
         */
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String authorizeUrl; 
            private String ossBucketName; 
            private String roleName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizeUrl = model.authorizeUrl;
                this.ossBucketName = model.ossBucketName;
                this.roleName = model.roleName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The RAM authorization URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22agentcore-oss-mount-policy-my-agent-bucket%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22OSSObjectRestoreCustom%22%2C%22templateValue%22%3A%7B%22ossBucket%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%22%2C%22ossBucketObject%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%2F%2A%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22agentcore-oss-mount-policy-my-agent-bucket%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22OSSObjectRestoreCustom%22%2C%22templateValue%22%3A%7B%22ossBucket%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%22%2C%22ossBucketObject%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%2F%2A%22%7D%7D%5D%7D%5D%7D</a></p>
             */
            public Builder authorizeUrl(String authorizeUrl) {
                this.authorizeUrl = authorizeUrl;
                return this;
            }

            /**
             * <p>The name of the authorized source OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-bucket</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The name of the workspace role selected by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-a1b2c3d4e5f6</p>
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
