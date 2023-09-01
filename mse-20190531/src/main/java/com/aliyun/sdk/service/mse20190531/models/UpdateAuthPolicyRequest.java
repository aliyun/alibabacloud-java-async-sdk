// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthPolicyRequest</p>
 */
public class UpdateAuthPolicyRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AuthRule")
    private String authRule;

    @Query
    @NameInMap("Enable")
    private String enable;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("K8sNamespace")
    private String k8sNamespace;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Source")
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
         * AuthRule.
         */
        public Builder authRule(String authRule) {
            this.putQueryParameter("AuthRule", authRule);
            this.authRule = authRule;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Source.
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
