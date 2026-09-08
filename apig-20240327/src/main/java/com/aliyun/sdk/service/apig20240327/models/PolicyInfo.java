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
 * {@link PolicyInfo} extends {@link TeaModel}
 *
 * <p>PolicyInfo</p>
 */
public class PolicyInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List<Attachment> attachments;

    @com.aliyun.core.annotation.NameInMap("classAlias")
    private String classAlias;

    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("executePriority")
    private String executePriority;

    @com.aliyun.core.annotation.NameInMap("executeStage")
    private String executeStage;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PolicyInfo(Builder builder) {
        this.attachments = builder.attachments;
        this.classAlias = builder.classAlias;
        this.className = builder.className;
        this.config = builder.config;
        this.direction = builder.direction;
        this.executePriority = builder.executePriority;
        this.executeStage = builder.executeStage;
        this.name = builder.name;
        this.policyId = builder.policyId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }

    /**
     * @return classAlias
     */
    public String getClassAlias() {
        return this.classAlias;
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return executePriority
     */
    public String getExecutePriority() {
        return this.executePriority;
    }

    /**
     * @return executeStage
     */
    public String getExecuteStage() {
        return this.executeStage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<Attachment> attachments; 
        private String classAlias; 
        private String className; 
        private String config; 
        private String direction; 
        private String executePriority; 
        private String executeStage; 
        private String name; 
        private String policyId; 
        private String type; 

        private Builder() {
        } 

        private Builder(PolicyInfo model) {
            this.attachments = model.attachments;
            this.classAlias = model.classAlias;
            this.className = model.className;
            this.config = model.config;
            this.direction = model.direction;
            this.executePriority = model.executePriority;
            this.executeStage = model.executeStage;
            this.name = model.name;
            this.policyId = model.policyId;
            this.type = model.type;
        } 

        /**
         * <p>The mount information.</p>
         */
        public Builder attachments(java.util.List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>The policy class alias.</p>
         * 
         * <strong>example:</strong>
         * <p>流量控制</p>
         */
        public Builder classAlias(String classAlias) {
            this.classAlias = classAlias;
            return this;
        }

        /**
         * <p>The class name supported by the policy. Different policies support different mount points. This parameter is used in combination with AttachResourceType.</p>
         * <ul>
         * <li>RateLimit: throttles traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>ConcurrencyLimit: controls concurrency. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>CircuitBreaker: breaks circuits and downgrades traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>HttpRewrite: rewrites HTTP traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>HeaderModify: modifies headers. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>Cors: supports CORS. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>FlowCopy: replicates traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>Timeout: times out requests. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>Retry: retries requests. Supported: HttpApi, Operation, and GatewayRoute.</li>
         * <li>IpAccessControl: implements IP address-based access control. Supported: HttpApi, Operation, GatewayRoute, Domain, and Gateway.</li>
         * <li>DirectResponse: mocks responses. Supported: Operation and GatewayRoute.</li>
         * <li>Redirect: redirects traffic. Supported: GatewayRoute.</li>
         * <li>Fallback: implements fallback. Supported: Operation and GatewayRoute.</li>
         * <li>ServiceTls: implements TLS authentication. Supported: GatewayService.</li>
         * <li>ServiceLb: balances loads. Supported: GatewayService.</li>
         * <li>ServicePortTls: implements service port TLS authentication. Supported: GatewayServicePort.</li>
         * <li>Waf: implements WAF protection. Supported: GatewayRoute and Gateway.</li>
         * <li>JWTAuth: implements global JWT authentication. Supported: Gateway.</li>
         * <li>OIDCAuth: implements global OIDC authentication. Supported: Gateway.</li>
         * <li>ExternalZAuth: implements custom authentication. Supported: Gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RateLimit</p>
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * <p>The policy configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:false}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The direction of traffic on which the policy takes effect. Valid values:</p>
         * <ul>
         * <li>OutBound</li>
         * <li>InBound</li>
         * <li>Both</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InBound</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * <p>The execution priority.</p>
         * 
         * <strong>example:</strong>
         * <p>310</p>
         */
        public Builder executePriority(String executePriority) {
            this.executePriority = executePriority;
            return this;
        }

        /**
         * <p>The execution phase.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PluginStatistic</li>
         * <li>PluginAuthorization</li>
         * <li>PluginPre</li>
         * <li>PluginAuthentication</li>
         * <li>PluginDefault</li>
         * <li>PluginPost</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PluginPost</p>
         */
        public Builder executeStage(String executeStage) {
            this.executeStage = executeStage;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-policy</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>策略类型</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PolicyInfo build() {
            return new PolicyInfo(this);
        } 

    } 

}
