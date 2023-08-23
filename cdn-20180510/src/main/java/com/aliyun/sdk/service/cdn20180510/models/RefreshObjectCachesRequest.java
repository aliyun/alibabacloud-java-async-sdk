// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>RefreshObjectCachesRequest</p>
 */
public class RefreshObjectCachesRequest extends Request {
    @Query
    @NameInMap("ObjectPath")
    @Validation(required = true)
    private String objectPath;

    @Query
    @NameInMap("ObjectType")
    private String objectType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private RefreshObjectCachesRequest(Builder builder) {
        super(builder);
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
        private String objectPath; 
        private String objectType; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RefreshObjectCachesRequest request) {
            super(request);
            this.objectPath = request.objectPath;
            this.objectType = request.objectType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ObjectPath.
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * The type of the object that you want to refresh. Valid values:
         * <p>
         * 
         * *   **File** (default): refreshes one or more files.
         * *   **Directory**: refreshes the files in one or more directories.
         * *   **Regex**: refreshes content based on regular expressions.
         * *   **ExQuery**: omits parameters after the question mark in the URL and refreshes content.
         * 
         * If you set the ObjectType parameter to File or Directory, you can view [Refresh and prefetch resources](~~27140~~) to obtain more information. If you set the ObjectType parameter to Regex, you can view [Configure URL refresh rules that contain regular expressions](~~146195~~) to obtain more information.
         * 
         * If you set the ObjectType parameter to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Alibaba Cloud CDN checks whether the resources on your origin server are updated. If resources are updated, Alibaba Cloud CDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
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
