// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReactivateDomainRequest} extends {@link RequestModel}
 *
 * <p>ReactivateDomainRequest</p>
 */
public class ReactivateDomainRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ReactivateDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactivateDomainRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ReactivateDomainRequest, Builder> {
        private String domainName; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ReactivateDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * *   This operation is intended for API providers.
         * <p>
         * *   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.
         * *   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.
         * *   You can call this operation to reactivate the domain name to resume normal access.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public ReactivateDomainRequest build() {
            return new ReactivateDomainRequest(this);
        } 

    } 

}
