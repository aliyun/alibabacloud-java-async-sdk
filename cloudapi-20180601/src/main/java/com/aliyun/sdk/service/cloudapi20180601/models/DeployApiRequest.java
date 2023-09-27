// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApiRequest} extends {@link RequestModel}
 *
 * <p>DeployApiRequest</p>
 */
public class DeployApiRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    @Query
    @NameInMap("SupportMock")
    private String supportMock;

    private DeployApiRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.supportMock = builder.supportMock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
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

    /**
     * @return supportMock
     */
    public String getSupportMock() {
        return this.supportMock;
    }

    public static final class Builder extends Request.Builder<DeployApiRequest, Builder> {
        private String apiId; 
        private String description; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 
        private String supportMock; 

        private Builder() {
            super();
        } 

        private Builder(DeployApiRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.description = request.description;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.supportMock = request.supportMock;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
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

        /**
         * SupportMock.
         */
        public Builder supportMock(String supportMock) {
            this.putQueryParameter("SupportMock", supportMock);
            this.supportMock = supportMock;
            return this;
        }

        @Override
        public DeployApiRequest build() {
            return new DeployApiRequest(this);
        } 

    } 

}
