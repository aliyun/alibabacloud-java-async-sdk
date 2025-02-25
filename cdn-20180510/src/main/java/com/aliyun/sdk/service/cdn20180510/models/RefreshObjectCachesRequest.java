// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>RefreshObjectCachesRequest</p>
 */
public class RefreshObjectCachesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private RefreshObjectCachesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.objectPath = builder.objectPath;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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

    public static final class Builder extends Request.Builder<RefreshObjectCachesRequest, Builder> {
        private Boolean force; 
        private String objectPath; 
        private String objectType; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RefreshObjectCachesRequest request) {
            super(request);
            this.force = request.force;
            this.objectPath = request.objectPath;
            this.objectType = request.objectType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder objectPath(String objectPath) {
            this.putBodyParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
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

        @Override
        public RefreshObjectCachesRequest build() {
            return new RefreshObjectCachesRequest(this);
        } 

    } 

}
