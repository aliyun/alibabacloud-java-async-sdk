// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAccessPermissionByApisRequest} extends {@link RequestModel}
 *
 * <p>RemoveAccessPermissionByApisRequest</p>
 */
public class RemoveAccessPermissionByApisRequest extends Request {
    @Query
    @NameInMap("ApiIds")
    @Validation(required = true)
    private String apiIds;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private RemoveAccessPermissionByApisRequest(Builder builder) {
        super(builder);
        this.apiIds = builder.apiIds;
        this.appId = builder.appId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAccessPermissionByApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiIds
     */
    public String getApiIds() {
        return this.apiIds;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<RemoveAccessPermissionByApisRequest, Builder> {
        private String apiIds; 
        private Long appId; 
        private String description; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAccessPermissionByApisRequest request) {
            super(request);
            this.apiIds = request.apiIds;
            this.appId = request.appId;
            this.description = request.description;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * ApiIds.
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public RemoveAccessPermissionByApisRequest build() {
            return new RemoveAccessPermissionByApisRequest(this);
        } 

    } 

}
