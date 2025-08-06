// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BlockVodObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>BlockVodObjectCachesRequest</p>
 */
public class BlockVodObjectCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Maxage")
    @com.aliyun.core.annotation.Validation(maximum = 864000, minimum = 600)
    private Integer maxage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private BlockVodObjectCachesRequest(Builder builder) {
        super(builder);
        this.maxage = builder.maxage;
        this.objectPath = builder.objectPath;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BlockVodObjectCachesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxage
     */
    public Integer getMaxage() {
        return this.maxage;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<BlockVodObjectCachesRequest, Builder> {
        private Integer maxage; 
        private String objectPath; 
        private Long ownerId; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BlockVodObjectCachesRequest request) {
            super(request);
            this.maxage = request.maxage;
            this.objectPath = request.objectPath;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.type = request.type;
        } 

        /**
         * Maxage.
         */
        public Builder maxage(Integer maxage) {
            this.putQueryParameter("Maxage", maxage);
            this.maxage = maxage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public BlockVodObjectCachesRequest build() {
            return new BlockVodObjectCachesRequest(this);
        } 

    } 

}
