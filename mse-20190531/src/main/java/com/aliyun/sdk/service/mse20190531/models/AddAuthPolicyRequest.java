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
 * {@link AddAuthPolicyRequest} extends {@link RequestModel}
 *
 * <p>AddAuthPolicyRequest</p>
 */
public class AddAuthPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private Integer authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sNamespace")
    private String k8sNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    private AddAuthPolicyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.authRule = builder.authRule;
        this.authType = builder.authType;
        this.enable = builder.enable;
        this.k8sNamespace = builder.k8sNamespace;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.protocol = builder.protocol;
        this.region = builder.region;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuthPolicyRequest create() {
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
     * @return authRule
     */
    public String getAuthRule() {
        return this.authRule;
    }

    /**
     * @return authType
     */
    public Integer getAuthType() {
        return this.authType;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return k8sNamespace
     */
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<AddAuthPolicyRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String authRule; 
        private Integer authType; 
        private String enable; 
        private String k8sNamespace; 
        private String name; 
        private String namespace; 
        private String protocol; 
        private String region; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(AddAuthPolicyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.authRule = request.authRule;
            this.authType = request.authType;
            this.enable = request.enable;
            this.k8sNamespace = request.k8sNamespace;
            this.name = request.name;
            this.namespace = request.namespace;
            this.protocol = request.protocol;
            this.region = request.region;
            this.source = request.source;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;all&quot;:true,&quot;black&quot;:false,&quot;appIds&quot;:[&quot;dez4qt7weh@***&quot;]}]</p>
         */
        public Builder authRule(String authRule) {
            this.putQueryParameter("AuthRule", authRule);
            this.authRule = authRule;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(Integer authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * K8sNamespace.
         */
        public Builder k8sNamespace(String k8sNamespace) {
            this.putQueryParameter("K8sNamespace", k8sNamespace);
            this.k8sNamespace = k8sNamespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPRING_CLOUD</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edasmsc</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public AddAuthPolicyRequest build() {
            return new AddAuthPolicyRequest(this);
        } 

    } 

}
