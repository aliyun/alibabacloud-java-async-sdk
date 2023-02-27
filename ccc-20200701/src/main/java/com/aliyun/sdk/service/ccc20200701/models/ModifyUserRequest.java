// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
    @Query
    @NameInMap("DisplayId")
    private String displayId;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("RoleId")
    private String roleId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("WorkMode")
    @Validation(required = true)
    private String workMode;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.displayId = builder.displayId;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.mobile = builder.mobile;
        this.roleId = builder.roleId;
        this.userId = builder.userId;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayId
     */
    public String getDisplayId() {
        return this.displayId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
        private String displayId; 
        private String displayName; 
        private String instanceId; 
        private String mobile; 
        private String roleId; 
        private String userId; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
            super(request);
            this.displayId = request.displayId;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.mobile = request.mobile;
            this.roleId = request.roleId;
            this.userId = request.userId;
            this.workMode = request.workMode;
        } 

        /**
         * DisplayId.
         */
        public Builder displayId(String displayId) {
            this.putQueryParameter("DisplayId", displayId);
            this.displayId = displayId;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkMode.
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}
