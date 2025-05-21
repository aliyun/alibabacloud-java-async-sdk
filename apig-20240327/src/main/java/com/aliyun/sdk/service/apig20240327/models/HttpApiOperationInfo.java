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
 * {@link HttpApiOperationInfo} extends {@link TeaModel}
 *
 * <p>HttpApiOperationInfo</p>
 */
public class HttpApiOperationInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("mock")
    private HttpApiMockContract mock;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("operationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("request")
    private HttpApiRequestContract request;

    @com.aliyun.core.annotation.NameInMap("response")
    private HttpApiResponseContract response;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private HttpApiOperationInfo(Builder builder) {
        this.authConfig = builder.authConfig;
        this.createTimestamp = builder.createTimestamp;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.enableAuth = builder.enableAuth;
        this.method = builder.method;
        this.mock = builder.mock;
        this.name = builder.name;
        this.operationId = builder.operationId;
        this.path = builder.path;
        this.request = builder.request;
        this.response = builder.response;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiOperationInfo create() {
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
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
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
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private AuthConfig authConfig; 
        private Long createTimestamp; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private Boolean enableAuth; 
        private String method; 
        private HttpApiMockContract mock; 
        private String name; 
        private String operationId; 
        private String path; 
        private HttpApiRequestContract request; 
        private HttpApiResponseContract response; 
        private String status; 

        private Builder() {
        } 

        private Builder(HttpApiOperationInfo model) {
            this.authConfig = model.authConfig;
            this.createTimestamp = model.createTimestamp;
            this.deployConfigs = model.deployConfigs;
            this.description = model.description;
            this.enableAuth = model.enableAuth;
            this.method = model.method;
            this.mock = model.mock;
            this.name = model.name;
            this.operationId = model.operationId;
            this.path = model.path;
            this.request = model.request;
            this.response = model.response;
            this.status = model.status;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * deployConfigs.
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.deployConfigs = deployConfigs;
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
         * method.
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * operationId.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * path.
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public HttpApiOperationInfo build() {
            return new HttpApiOperationInfo(this);
        } 

    } 

}
