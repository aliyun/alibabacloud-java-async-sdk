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

    private HttpApiOperation(Builder builder) {
        this.authConfig = builder.authConfig;
        this.description = builder.description;
        this.enableAuth = builder.enableAuth;
        this.method = builder.method;
        this.mock = builder.mock;
        this.name = builder.name;
        this.path = builder.path;
        this.request = builder.request;
        this.response = builder.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiOperation create() {
        return builder().build();
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
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

    public static final class Builder {
        private AuthConfig authConfig; 
        private String description; 
        private Boolean enableAuth; 
        private String method; 
        private HttpApiMockContract mock; 
        private String name; 
        private String path; 
        private HttpApiRequestContract request; 
        private HttpApiResponseContract response; 

        /**
         * authConfig.
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enableAuth.
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.enableAuth = enableAuth;
            return this;
        }

        /**
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
         * mock.
         */
        public Builder mock(HttpApiMockContract mock) {
            this.mock = mock;
            return this;
        }

        /**
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
         * request.
         */
        public Builder request(HttpApiRequestContract request) {
            this.request = request;
            return this;
        }

        /**
         * response.
         */
        public Builder response(HttpApiResponseContract response) {
            this.response = response;
            return this;
        }

        public HttpApiOperation build() {
            return new HttpApiOperation(this);
        } 

    } 

}
