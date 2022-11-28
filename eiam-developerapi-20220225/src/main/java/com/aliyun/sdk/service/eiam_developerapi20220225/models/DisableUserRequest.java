// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link DisableUserRequest} extends {@link RequestModel}
 *
 * <p>DisableUserRequest</p>
 */
public class DisableUserRequest extends Request {
    @Host
    @NameInMap("regionId")
    private String regionId;

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

    private DisableUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.userId = builder.userId;
        this.authorization = builder.authorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableUserRequest create() {
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

    public static final class Builder extends Request.Builder<DisableUserRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String userId; 
        private String authorization; 

        private Builder() {
            super();
        } 

        private Builder(DisableUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.userId = request.userId;
            this.authorization = request.authorization;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID。
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
         * 认证信息。
         * <p>
         * 格式:Bearer ${access_token}。
         * 示例：Bearer ATxxxx。
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        @Override
        public DisableUserRequest build() {
            return new DisableUserRequest(this);
        } 

    } 

}
