// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ApplyTagPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ApplyTagPoliciesRequest</p>
 */
public class ApplyTagPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @Deprecated
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.Map<String, RulesValue> rules;

    private ApplyTagPoliciesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.namespace = builder.namespace;
        this.namespaceId = builder.namespaceId;
        this.region = builder.region;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTagPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return rules
     */
    public java.util.Map<String, RulesValue> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ApplyTagPoliciesRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Boolean enable; 
        private String namespace; 
        private String namespaceId; 
        private String region; 
        private java.util.Map<String, RulesValue> rules; 

        private Builder() {
            super();
        } 

        private Builder(ApplyTagPoliciesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.enable = request.enable;
            this.namespace = request.namespace;
            this.namespaceId = request.namespaceId;
            this.region = request.region;
            this.rules = request.rules;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h5pohqu3gd@xxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The Microservices Engine (MSE) namespace to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Optional. The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>12233****</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The details of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;blue&quot;: { # Tag key. &quot;rate&quot;: 20, # Rate. A value of 20 indicates that 20% of the traffic is routed to the node identified by the tag. &quot;name&quot;: &quot;luoye-route-test&quot;, # Routing rule name. &quot;carryData&quot;: false, # Specifies whether to enable pass-through. This parameter is applicable to end-to-end canary release. &quot;rules&quot;: { # Rule information. &quot;dubbo&quot;: [{ # Dubbo rule. The system also supports Spring Cloud and Istio rule. &quot;serviceName&quot;: &quot;com.taobao.hsf.common.DemoService&quot;, # Service name (operation name). &quot;group&quot;: &quot;&quot;, # Group name. &quot;version&quot;: &quot;&quot;, # Service version. &quot;methodName&quot;: &quot;sayHello&quot;, # Method name. &quot;condition&quot;: &quot;AND&quot;, # Logical operator used by the following items. Valid values: AND and OR. &quot;argumentItems&quot;: [{ # Array of rule details. &quot;index&quot;: 0, # Index field. &quot;expr&quot;: &quot;&quot;, # Expression. Its details is described below. &quot;operator&quot;: &quot;rawvalue&quot;, # The comparison mode. A value of rawvalue indicates direct comparison. A value of mode indicates the modulo operation. A value of list indicates using a whitelist. &quot;value&quot;: &quot;jim&quot;, # Base value. The value obtained by the expression will be compared with this value. If operator is set to list, separate the items specified for this parameter with commas (,). Example: 1,2,3. &quot;cond&quot;: &quot;==&quot; # Comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==. }] }] } }, &quot;_base&quot;: { # Another tag key. &quot;rate&quot;: 80 # Rate. A value of 20 indicates that 20% of the traffic is routed to the node identified by the tag. } }</p>
         */
        public Builder rules(java.util.Map<String, RulesValue> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public ApplyTagPoliciesRequest build() {
            return new ApplyTagPoliciesRequest(this);
        } 

    } 

}
