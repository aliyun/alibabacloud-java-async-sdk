// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowProjectUserRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowProjectUserRequest</p>
 */
public class CreateFlowProjectUserRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("User")
    @Validation(required = true)
    private java.util.List < User> user;

    private CreateFlowProjectUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowProjectUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return user
     */
    public java.util.List < User> getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<CreateFlowProjectUserRequest, Builder> {
        private String clientToken; 
        private String projectId; 
        private String regionId; 
        private java.util.List < User> user; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowProjectUserRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.user = request.user;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * User.
         */
        public Builder user(java.util.List < User> user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public CreateFlowProjectUserRequest build() {
            return new CreateFlowProjectUserRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        private String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        private String userName;

        private User(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
