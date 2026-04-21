// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link CreateYikeUserRequest} extends {@link RequestModel}
 *
 * <p>CreateYikeUserRequest</p>
 */
public class CreateYikeUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 32)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNamePrefix")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50)
    private String userNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateYikeUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.productionIds = builder.productionIds;
        this.userNamePrefix = builder.userNamePrefix;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return productionIds
     */
    public String getProductionIds() {
        return this.productionIds;
    }

    /**
     * @return userNamePrefix
     */
    public String getUserNamePrefix() {
        return this.userNamePrefix;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateYikeUserRequest, Builder> {
        private String regionId; 
        private String nickname; 
        private String password; 
        private String productionIds; 
        private String userNamePrefix; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateYikeUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nickname = request.nickname;
            this.password = request.password;
            this.productionIds = request.productionIds;
            this.userNamePrefix = request.userNamePrefix;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nick</p>
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id1,id2</p>
         */
        public Builder productionIds(String productionIds) {
            this.putQueryParameter("ProductionIds", productionIds);
            this.productionIds = productionIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder userNamePrefix(String userNamePrefix) {
            this.putQueryParameter("UserNamePrefix", userNamePrefix);
            this.userNamePrefix = userNamePrefix;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-az2gglkjauwnnhpq</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateYikeUserRequest build() {
            return new CreateYikeUserRequest(this);
        } 

    } 

}
