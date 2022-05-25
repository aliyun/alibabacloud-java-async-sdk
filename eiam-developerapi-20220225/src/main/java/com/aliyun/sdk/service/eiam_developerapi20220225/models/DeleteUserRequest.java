// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link DeleteUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserRequest</p>
 */
public class DeleteUserRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Path
    @NameInMap("userId")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Host
    @NameInMap("regionId")
    private String regionId;

    private DeleteUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.userId = builder.userId;
        this.authorization = builder.authorization;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteUserRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String userId; 
        private String authorization; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.userId = request.userId;
            this.authorization = request.authorization;
            this.regionId = request.regionId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 账户ID
         */
        public Builder userId(String userId) {
            this.putPathParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 认证信息，格式:Bearer access_token
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteUserRequest build() {
            return new DeleteUserRequest(this);
        } 

    } 

}
