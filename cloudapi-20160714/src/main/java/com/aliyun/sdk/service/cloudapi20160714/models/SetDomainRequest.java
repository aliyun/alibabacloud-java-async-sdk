// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRequest</p>
 */
public class SetDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindStageName")
    private String bindStageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomDomainType")
    private String customDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsForce")
    private Boolean isForce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsHttpRedirectToHttps")
    private Boolean isHttpRedirectToHttps;

    private SetDomainRequest(Builder builder) {
        super(builder);
        this.bindStageName = builder.bindStageName;
        this.customDomainType = builder.customDomainType;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.isForce = builder.isForce;
        this.isHttpRedirectToHttps = builder.isHttpRedirectToHttps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindStageName
     */
    public String getBindStageName() {
        return this.bindStageName;
    }

    /**
     * @return customDomainType
     */
    public String getCustomDomainType() {
        return this.customDomainType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isForce
     */
    public Boolean getIsForce() {
        return this.isForce;
    }

    /**
     * @return isHttpRedirectToHttps
     */
    public Boolean getIsHttpRedirectToHttps() {
        return this.isHttpRedirectToHttps;
    }

    public static final class Builder extends Request.Builder<SetDomainRequest, Builder> {
        private String bindStageName; 
        private String customDomainType; 
        private String domainName; 
        private String groupId; 
        private Boolean isForce; 
        private Boolean isHttpRedirectToHttps; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRequest request) {
            super(request);
            this.bindStageName = request.bindStageName;
            this.customDomainType = request.customDomainType;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.isForce = request.isForce;
            this.isHttpRedirectToHttps = request.isHttpRedirectToHttps;
        } 

        /**
         * The environment which you can access by using the domain name. If you do not specify this parameter, the domain name can be used to access all environments.
         * <p>
         * 
         * If you specify an environment, the domain name can be used to access only the specified environment. Valid values:
         * 
         * *   TEST
         * *   PRE
         * *   RELEASE
         * 
         * If you want to use the domain name to access all environments, set this parameter to an empty string ("").
         */
        public Builder bindStageName(String bindStageName) {
            this.putQueryParameter("BindStageName", bindStageName);
            this.bindStageName = bindStageName;
            return this;
        }

        /**
         * The network type of the domain name to be bound. Default value: INTERNET. Valid values:
         * <p>
         * 
         * *   INTERNET
         * *   INTRANET. If you set this parameter to this value, the domain name cannot be used on the Internet.
         */
        public Builder customDomainType(String customDomainType) {
            this.putQueryParameter("CustomDomainType", customDomainType);
            this.customDomainType = customDomainType;
            return this;
        }

        /**
         * The custom domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the API group. This ID is generated by the system and globally unique.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Specifies whether this binding relationship takes precedence over the binding relationships between the domain name and other API groups. If you set this parameter to true, this binding relationship takes precedence, and the domain name is automatically unbound from other API groups. This operation brings risks. Proceed with caution.
         */
        public Builder isForce(Boolean isForce) {
            this.putQueryParameter("IsForce", isForce);
            this.isForce = isForce;
            return this;
        }

        /**
         * Specifies whether to redirect HTTP requests to HTTPS requests.
         */
        public Builder isHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
            this.putQueryParameter("IsHttpRedirectToHttps", isHttpRedirectToHttps);
            this.isHttpRedirectToHttps = isHttpRedirectToHttps;
            return this;
        }

        @Override
        public SetDomainRequest build() {
            return new SetDomainRequest(this);
        } 

    } 

}
