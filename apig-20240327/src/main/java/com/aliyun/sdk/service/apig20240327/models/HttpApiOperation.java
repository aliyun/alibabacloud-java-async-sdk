// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiOperation} extends {@link TeaModel}
 *
 * <p>HttpApiOperation</p>
 */
public class HttpApiOperation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.NameInMap("method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.NameInMap("mock")
    private HttpApiMockContract mock;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.NameInMap("request")
    private HttpApiRequestContract request;

    @com.aliyun.core.annotation.NameInMap("response")
    private HttpApiResponseContract response;

    @com.aliyun.core.annotation.NameInMap("systemParameters")
    private HttpApiSystemParameters systemParameters;

    private HttpApiOperation(Builder builder) {
        this.authConfig = builder.authConfig;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.enableAuth = builder.enableAuth;
        this.method = builder.method;
        this.mock = builder.mock;
        this.name = builder.name;
        this.path = builder.path;
        this.request = builder.request;
        this.response = builder.response;
        this.systemParameters = builder.systemParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiOperation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return mock
     */
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return request
     */
    public HttpApiRequestContract getRequest() {
        return this.request;
    }

    /**
     * @return response
     */
    public HttpApiResponseContract getResponse() {
        return this.response;
    }

    /**
     * @return systemParameters
     */
    public HttpApiSystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public static final class Builder {
        private AuthConfig authConfig; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private Boolean enableAuth; 
        private String method; 
        private HttpApiMockContract mock; 
        private String name; 
        private String path; 
        private HttpApiRequestContract request; 
        private HttpApiResponseContract response; 
        private HttpApiSystemParameters systemParameters; 

        private Builder() {
        } 

        private Builder(HttpApiOperation model) {
            this.authConfig = model.authConfig;
            this.deployConfigs = model.deployConfigs;
            this.description = model.description;
            this.enableAuth = model.enableAuth;
            this.method = model.method;
            this.mock = model.mock;
            this.name = model.name;
            this.path = model.path;
            this.request = model.request;
            this.response = model.response;
            this.systemParameters = model.systemParameters;
        } 

        /**
         * <p>The authentication configuration.</p>
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The deployment configurations.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>Retrieve user information</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The API mock configuration. This configuration takes effect only when the API publishing scenario is Mock.</p>
         */
        public Builder mock(HttpApiMockContract mock) {
            this.mock = mock;
            return this;
        }

        /**
         * <p>The API name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GetUserInfo</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The API path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/user</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The request parameter definition.</p>
         */
        public Builder request(HttpApiRequestContract request) {
            this.request = request;
            return this;
        }

        /**
         * <p>The response parameter definition.</p>
         */
        public Builder response(HttpApiResponseContract response) {
            this.response = response;
            return this;
        }

        /**
         * <p>The system parameter configuration. This is supported only for operations of standard REST APIs. If you omit this parameter or set it to null during creation, no configuration is applied. If you omit this parameter or set it to null during an update, the original configuration is retained. To clear the configuration, explicitly pass an object without mappings, such as {}. Saving only modifies the draft, and the changes take effect after publishing.</p>
         */
        public Builder systemParameters(HttpApiSystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        public HttpApiOperation build() {
            return new HttpApiOperation(this);
        } 

    } 

}
