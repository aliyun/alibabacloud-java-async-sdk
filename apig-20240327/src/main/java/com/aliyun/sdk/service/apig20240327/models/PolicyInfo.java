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
         * <p>The list of mount information.</p>
         */
        public Builder attachments(java.util.List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>The policy class alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Throttling</p>
         */
        public Builder classAlias(String classAlias) {
            this.classAlias = classAlias;
            return this;
        }

        /**
         * <p>The class name supported by the policy. Different policies support different mount points. This parameter is used together with AttachResourceType. Valid values:</p>
         * <ul>
         * <li>RateLimit: throttling. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>ConcurrencyLimit: concurrency control. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>CircuitBreaker: circuit breaking. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>HttpRewrite: HTTP rewrite. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>HeaderModify: header modification. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>Cors: cross-origin resource sharing (CORS). Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>FlowCopy: traffic copy. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>Timeout: timeout. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>Retry: retry. Supported for HttpApi, Operation, and GatewayRoute.</li>
         * <li>IpAccessControl: IP access control. Supported for HttpApi, Operation, GatewayRoute, Domain, and Gateway.</li>
         * <li>DirectResponse: mock. Supported for Operation and GatewayRoute.</li>
         * <li>Redirect: redirect. Supported for GatewayRoute.</li>
         * <li>Fallback: fallback. Supported for Operation and GatewayRoute.</li>
         * <li>ServiceTls: service TLS authentication. Supported for GatewayService.</li>
         * <li>ServiceLb: service load balancing. Supported for GatewayService.</li>
         * <li>ServicePortTls: service port TLS authentication. Supported for GatewayServicePort.</li>
         * <li>Waf: WAF protection. Supported for GatewayRoute and Gateway.</li>
         * <li>JWTAuth: JWT global authentication. Supported for Gateway.</li>
         * <li>OIDCAuth: OIDC global authentication. Supported for Gateway.</li>
         * <li>ExternalZAuth: custom authentication. Supported for Gateway.</li>
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
         * <p>The policy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:false}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The inbound or outbound direction of the policy. Valid values:</p>
         * <ul>
         * <li>OutBound: outbound.</li>
         * <li>InBound: inbound.</li>
         * <li>Both: both directions.</li>
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
         * <p>The execution stage.</p>
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
         * <p>Policy type</p>
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
