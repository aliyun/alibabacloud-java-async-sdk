// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccessPermissionByGroupForBackendRequest} extends {@link RequestModel}
 *
 * <p>SetAccessPermissionByGroupForBackendRequest</p>
 */
public class SetAccessPermissionByGroupForBackendRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetAccessPermissionByGroupForBackendRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessPermissionByGroupForBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
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

    public static final class Builder extends Request.Builder<SetAccessPermissionByGroupForBackendRequest, Builder> {
        private Long appId; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetAccessPermissionByGroupForBackendRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * GroupId.
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
        public SetAccessPermissionByGroupForBackendRequest build() {
            return new SetAccessPermissionByGroupForBackendRequest(this);
        } 

    } 

}
