// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveTopLevelDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveTopLevelDomainRequest</p>
 */
public class UpdateLiveTopLevelDomainRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TopLevelDomain")
    @Validation(required = true)
    private String topLevelDomain;

    private UpdateLiveTopLevelDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.securityToken = builder.securityToken;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveTopLevelDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return topLevelDomain
     */
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static final class Builder extends Request.Builder<UpdateLiveTopLevelDomainRequest, Builder> {
        private String domainName; 
        private String securityToken; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveTopLevelDomainRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.securityToken = response.securityToken;
            this.topLevelDomain = response.topLevelDomain;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * TopLevelDomain.
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public UpdateLiveTopLevelDomainRequest build() {
            return new UpdateLiveTopLevelDomainRequest(this);
        } 

    } 

}
