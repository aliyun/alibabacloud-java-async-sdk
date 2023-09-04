// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessConfigurationRequest</p>
 */
public class DeleteAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("ForceRemovePermissionPolicies")
    private Boolean forceRemovePermissionPolicies;

    private DeleteAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.forceRemovePermissionPolicies = builder.forceRemovePermissionPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessConfigurationRequest create() {
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
     * @return forceRemovePermissionPolicies
     */
    public Boolean getForceRemovePermissionPolicies() {
        return this.forceRemovePermissionPolicies;
    }

    public static final class Builder extends Request.Builder<DeleteAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private Boolean forceRemovePermissionPolicies; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.forceRemovePermissionPolicies = request.forceRemovePermissionPolicies;
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
         * Specifies whether to forcibly remove system policies and inline policies. Valid values:
         * <p>
         * 
         * *   true: When you delete the access configuration, the associated system policies and inline policies are forcibly removed.
         * *   false: When you delete the access configuration, the associated system policies and inline policies are not forcibly removed. This is the default value. If these policies exist in the access configuration, the deletion fails. Before you delete the access configuration, you must remove the system policies and inline policies. For more information, see [RemovePermissionPolicyFromAccessConfiguration](~~336904~~).
         */
        public Builder forceRemovePermissionPolicies(Boolean forceRemovePermissionPolicies) {
            this.putQueryParameter("ForceRemovePermissionPolicies", forceRemovePermissionPolicies);
            this.forceRemovePermissionPolicies = forceRemovePermissionPolicies;
            return this;
        }

        @Override
        public DeleteAccessConfigurationRequest build() {
            return new DeleteAccessConfigurationRequest(this);
        } 

    } 

}
