// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetErrorPageConfigRequest} extends {@link RequestModel}
 *
 * <p>SetErrorPageConfigRequest</p>
 */
public class SetErrorPageConfigRequest extends Request {
    @Query
    @NameInMap("CustomPageUrl")
    private String customPageUrl;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageType")
    @Validation(required = true)
    private String pageType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetErrorPageConfigRequest(Builder builder) {
        super(builder);
        this.customPageUrl = builder.customPageUrl;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pageType = builder.pageType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetErrorPageConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPageUrl
     */
    public String getCustomPageUrl() {
        return this.customPageUrl;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageType
     */
    public String getPageType() {
        return this.pageType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetErrorPageConfigRequest, Builder> {
        private String customPageUrl; 
        private String domainName; 
        private Long ownerId; 
        private String pageType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetErrorPageConfigRequest response) {
            super(response);
            this.customPageUrl = response.customPageUrl;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.pageType = response.pageType;
            this.securityToken = response.securityToken;
        } 

        /**
         * CustomPageUrl.
         */
        public Builder customPageUrl(String customPageUrl) {
            this.putQueryParameter("CustomPageUrl", customPageUrl);
            this.customPageUrl = customPageUrl;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageType.
         */
        public Builder pageType(String pageType) {
            this.putQueryParameter("PageType", pageType);
            this.pageType = pageType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetErrorPageConfigRequest build() {
            return new SetErrorPageConfigRequest(this);
        } 

    } 

}
