// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAuthPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthPolicyRequest</p>
 */
public class UpdateAuthPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthRule")
    private String authRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sNamespace")
    private String k8sNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private UpdateAuthPolicyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.authRule = builder.authRule;
        this.enable = builder.enable;
        this.id = builder.id;
        this.k8sNamespace = builder.k8sNamespace;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.region = builder.region;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthPolicyRequest create() {
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
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateAuthPolicyRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String authRule; 
        private String enable; 
        private String id; 
        private String k8sNamespace; 
        private String name; 
        private String protocol; 
        private String region; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthPolicyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.authRule = request.authRule;
            this.enable = request.enable;
            this.id = request.id;
            this.k8sNamespace = request.k8sNamespace;
            this.name = request.name;
            this.protocol = request.protocol;
            this.region = request.region;
            this.source = request.source;
        } 

        /**
         * <p>The language of the response. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese, and the value en-US indicates English.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde@12345</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The content of the service authentication rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;all&quot;:true,&quot;appIds&quot;:[&quot;f6xqzbao96@4adfaf3c92c947a&quot;],&quot;black&quot;:false}]</p>
         */
        public Builder authRule(String authRule) {
            this.putQueryParameter("AuthRule", authRule);
            this.authRule = authRule;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule.</p>
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
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>432</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the ACK cluster namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>c19c6c500e1ff4d7abc7bed9b8236***</p>
         */
        public Builder k8sNamespace(String k8sNamespace) {
            this.putQueryParameter("K8sNamespace", k8sNamespace);
            this.k8sNamespace = k8sNamespace;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>SPRING_CLOUD</strong></li>
         * <li><strong>DUBBO</strong></li>
         * <li><strong>istio</strong></li>
         * </ul>
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
         * <p>The source for application access.</p>
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
        public UpdateAuthPolicyRequest build() {
            return new UpdateAuthPolicyRequest(this);
        } 

    } 

}
