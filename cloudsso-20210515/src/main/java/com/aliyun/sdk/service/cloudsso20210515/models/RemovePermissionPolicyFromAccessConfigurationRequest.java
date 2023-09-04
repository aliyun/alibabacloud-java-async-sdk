// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePermissionPolicyFromAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>RemovePermissionPolicyFromAccessConfigurationRequest</p>
 */
public class RemovePermissionPolicyFromAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("PermissionPolicyName")
    private String permissionPolicyName;

    @Query
    @NameInMap("PermissionPolicyType")
    private String permissionPolicyType;

    private RemovePermissionPolicyFromAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.permissionPolicyName = builder.permissionPolicyName;
        this.permissionPolicyType = builder.permissionPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePermissionPolicyFromAccessConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return permissionPolicyName
     */
    public String getPermissionPolicyName() {
        return this.permissionPolicyName;
    }

    /**
     * @return permissionPolicyType
     */
    public String getPermissionPolicyType() {
        return this.permissionPolicyType;
    }

    public static final class Builder extends Request.Builder<RemovePermissionPolicyFromAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String permissionPolicyName; 
        private String permissionPolicyType; 

        private Builder() {
            super();
        } 

        private Builder(RemovePermissionPolicyFromAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.permissionPolicyName = request.permissionPolicyName;
            this.permissionPolicyType = request.permissionPolicyType;
        } 

        /**
         * The ID of the access configuration.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder permissionPolicyName(String permissionPolicyName) {
            this.putQueryParameter("PermissionPolicyName", permissionPolicyName);
            this.permissionPolicyName = permissionPolicyName;
            return this;
        }

        /**
         * The type of the policy. Valid values:
         * <p>
         * 
         * *   System: system policy
         * *   Inline: inline policy
         */
        public Builder permissionPolicyType(String permissionPolicyType) {
            this.putQueryParameter("PermissionPolicyType", permissionPolicyType);
            this.permissionPolicyType = permissionPolicyType;
            return this;
        }

        @Override
        public RemovePermissionPolicyFromAccessConfigurationRequest build() {
            return new RemovePermissionPolicyFromAccessConfigurationRequest(this);
        } 

    } 

}
