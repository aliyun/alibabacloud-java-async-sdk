// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloneSentinelRuleFromAhasRequest} extends {@link RequestModel}
 *
 * <p>CloneSentinelRuleFromAhasRequest</p>
 */
public class CloneSentinelRuleFromAhasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AhasNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ahasNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAHASPublicRegion")
    private Boolean isAHASPublicRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private CloneSentinelRuleFromAhasRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.ahasNamespace = builder.ahasNamespace;
        this.appName = builder.appName;
        this.isAHASPublicRegion = builder.isAHASPublicRegion;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneSentinelRuleFromAhasRequest create() {
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
     * @return ahasNamespace
     */
    public String getAhasNamespace() {
        return this.ahasNamespace;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return isAHASPublicRegion
     */
    public Boolean getIsAHASPublicRegion() {
        return this.isAHASPublicRegion;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<CloneSentinelRuleFromAhasRequest, Builder> {
        private String acceptLanguage; 
        private String ahasNamespace; 
        private String appName; 
        private Boolean isAHASPublicRegion; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(CloneSentinelRuleFromAhasRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.ahasNamespace = request.ahasNamespace;
            this.appName = request.appName;
            this.isAHASPublicRegion = request.isAHASPublicRegion;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
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
         * <p>The namespace (environment) of Application High Availability Service (AHAS).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder ahasNamespace(String ahasNamespace) {
            this.putQueryParameter("AhasNamespace", ahasNamespace);
            this.ahasNamespace = ahasNamespace;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether AHAS is deployed in the Internet region.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isAHASPublicRegion(Boolean isAHASPublicRegion) {
            this.putQueryParameter("IsAHASPublicRegion", isAHASPublicRegion);
            this.isAHASPublicRegion = isAHASPublicRegion;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public CloneSentinelRuleFromAhasRequest build() {
            return new CloneSentinelRuleFromAhasRequest(this);
        } 

    } 

}
