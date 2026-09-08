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
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("className")
    @com.aliyun.core.annotation.Validation(required = true)
    private String className;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.className = builder.className;
        this.config = builder.config;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private String className; 
        private String config; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.className = request.className;
            this.config = request.config;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li>RateLimit: rate limiting. Limits the request rate.</li>
         * <li>ConcurrencyLimit: concurrency limiting. Limits the number of concurrent requests.</li>
         * <li>CircuitBreaker: circuit breaker. Automatically triggers circuit breaking when backend exceptions occur.</li>
         * <li>HttpRewrite: HTTP rewrite. Rewrites the request URL or path.</li>
         * <li>HeaderModify: header modification. Adds, removes, or modifies HTTP request headers.</li>
         * <li>Cors: Cross-Origin Resource Sharing (CORS). Controls cross-origin requests.</li>
         * <li>Authentication: general authentication. A general request authentication policy.</li>
         * <li>FlowCopy: traffic mirroring. Copies requests to an additional backend.</li>
         * <li>Timeout: timeout. Sets the request timeout period.</li>
         * <li>Retry: retry. Automatically retries failed requests.</li>
         * <li>IpAccessControl: IP access control. Filters requests based on IP whitelists and blacklists.</li>
         * <li>DirectResponse: direct response. Returns a fixed response directly.</li>
         * <li>Redirect: redirect. Redirects requests to another address.</li>
         * <li>Fallback: fallback. Returns a fallback response when the backend is unavailable.</li>
         * <li>ServiceTls: server-side TLS. Configures TLS for backend services.</li>
         * <li>ServiceLb: service load balancing. Configures load balancing for backend services.</li>
         * <li>ServicePortTls: service port TLS. Configures TLS for backend service ports.</li>
         * <li>Waf: Web Application Firewall (WAF). Provides request security protection.</li>
         * <li>JWTAuth: JWT authentication. Authenticates requests based on JSON Web Tokens (JWT).</li>
         * <li>OIDCAuth: OIDC authentication. Authenticates requests based on the OpenID Connect (OIDC) protocol.</li>
         * <li>ExternalZAuth: external authentication. Integrates with an external authentication service.</li>
         * <li>AiProxy: AI proxy.</li>
         * <li>ModelRouter: model router.</li>
         * <li>AiStatistics: AI statistics.</li>
         * <li>AiSecurityGuard: AI security guard. Detects the security of AI request and response content.</li>
         * <li>AiFallback: AI fallback. Falls back to an alternative model when the AI service is unavailable.</li>
         * <li>ModelMapper: model mapper.</li>
         * <li>AiTokenRateLimit: AI token rate limiting. Limits the rate based on token consumption.</li>
         * <li>AiCache: AI cache. Caches AI response results.</li>
         * <li>DynamicRoute: dynamic route.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Timeout</p>
         */
        public Builder className(String className) {
            this.putBodyParameter("className", className);
            this.className = className;
            return this;
        }

        /**
         * <p>The policy configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;unitNum&quot;:1,&quot;timeUnit&quot;:&quot;s&quot;,&quot;enable&quot;:true}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>超时策略</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-policy</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

}
