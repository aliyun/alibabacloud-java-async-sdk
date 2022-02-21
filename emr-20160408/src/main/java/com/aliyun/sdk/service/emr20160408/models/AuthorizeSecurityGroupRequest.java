// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupRequest</p>
 */
public class AuthorizeSecurityGroupRequest extends Request {
    @Query
    @NameInMap("BizContent")
    private String bizContent;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AuthorizeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.bizContent = builder.bizContent;
        this.bizType = builder.bizType;
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizContent
     */
    public String getBizContent() {
        return this.bizContent;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupRequest, Builder> {
        private String bizContent; 
        private String bizType; 
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupRequest response) {
            super(response);
            this.bizContent = response.bizContent;
            this.bizType = response.bizType;
            this.clusterId = response.clusterId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BizContent.
         */
        public Builder bizContent(String bizContent) {
            this.putQueryParameter("BizContent", bizContent);
            this.bizContent = bizContent;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupRequest build() {
            return new AuthorizeSecurityGroupRequest(this);
        } 

    } 

}
