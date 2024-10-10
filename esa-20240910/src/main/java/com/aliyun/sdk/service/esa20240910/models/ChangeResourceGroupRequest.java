// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeResourceGroupRequest</p>
 */
public class ChangeResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ChangeResourceGroupRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityToken = builder.securityToken;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ChangeResourceGroupRequest, Builder> {
        private Long ownerId; 
        private String resourceGroupId; 
        private String securityToken; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResourceGroupRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityToken = request.securityToken;
            this.siteId = request.siteId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-axxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ChangeResourceGroupRequest build() {
            return new ChangeResourceGroupRequest(this);
        } 

    } 

}
