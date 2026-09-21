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
 * {@link GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody</p>
 */
public class GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody extends TeaModel {
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

    private GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody(Builder builder) {
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

    public static GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody create() {
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

        private Builder(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody model) {
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
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
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

        public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody build() {
            return new GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizeUrl")
        private String authorizeUrl;

        private Data(Builder builder) {
            this.authorizeUrl = builder.authorizeUrl;
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

        public static final class Builder {
            private String authorizeUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizeUrl = model.authorizeUrl;
            } 

            /**
             * <p>The RAM authorization URL. After opening this URL and completing the authorization, call the verification operation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AgentCoreWorkspaceRoleExample%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreNasMountExample%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22NasFileSystemClientMount%22%2C%22templateValue%22%3A%7B%22nasFileSystem%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Afilesystem%2F0123456789%22%2C%22nasAccessPoint%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Aaccesspoint%2Fap-0123456789abcdef0%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AgentCoreWorkspaceRoleExample%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreNasMountExample%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22NasFileSystemClientMount%22%2C%22templateValue%22%3A%7B%22nasFileSystem%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Afilesystem%2F0123456789%22%2C%22nasAccessPoint%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Aaccesspoint%2Fap-0123456789abcdef0%22%7D%7D%5D%7D%5D%7D</a></p>
             */
            public Builder authorizeUrl(String authorizeUrl) {
                this.authorizeUrl = authorizeUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
