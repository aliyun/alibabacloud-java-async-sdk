// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewaysTagsRequest</p>
 */
public class DescribeGatewaysTagsRequest extends Request {
    @Query
    @NameInMap("GatewayIds")
    @Validation(required = true)
    private String gatewayIds;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageBundleId")
    @Validation(required = true)
    private String storageBundleId;

    @Query
    @NameInMap("TagCategory")
    private String tagCategory;

    private DescribeGatewaysTagsRequest(Builder builder) {
        super(builder);
        this.gatewayIds = builder.gatewayIds;
        this.securityToken = builder.securityToken;
        this.storageBundleId = builder.storageBundleId;
        this.tagCategory = builder.tagCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaysTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayIds
     */
    public String getGatewayIds() {
        return this.gatewayIds;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    /**
     * @return tagCategory
     */
    public String getTagCategory() {
        return this.tagCategory;
    }

    public static final class Builder extends Request.Builder<DescribeGatewaysTagsRequest, Builder> {
        private String gatewayIds; 
        private String securityToken; 
        private String storageBundleId; 
        private String tagCategory; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewaysTagsRequest request) {
            super(request);
            this.gatewayIds = request.gatewayIds;
            this.securityToken = request.securityToken;
            this.storageBundleId = request.storageBundleId;
            this.tagCategory = request.tagCategory;
        } 

        /**
         * GatewayIds.
         */
        public Builder gatewayIds(String gatewayIds) {
            this.putQueryParameter("GatewayIds", gatewayIds);
            this.gatewayIds = gatewayIds;
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
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
            return this;
        }

        /**
         * TagCategory.
         */
        public Builder tagCategory(String tagCategory) {
            this.putQueryParameter("TagCategory", tagCategory);
            this.tagCategory = tagCategory;
            return this;
        }

        @Override
        public DescribeGatewaysTagsRequest build() {
            return new DescribeGatewaysTagsRequest(this);
        } 

    } 

}
