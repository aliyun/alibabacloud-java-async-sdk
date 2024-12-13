// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPermissionPoliciesInAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionPoliciesInAccessConfigurationRequest</p>
 */
public class ListPermissionPoliciesInAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionPolicyType")
    private String permissionPolicyType;

    private ListPermissionPoliciesInAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.permissionPolicyType = builder.permissionPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionPoliciesInAccessConfigurationRequest create() {
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
     * @return permissionPolicyType
     */
    public String getPermissionPolicyType() {
        return this.permissionPolicyType;
    }

    public static final class Builder extends Request.Builder<ListPermissionPoliciesInAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String permissionPolicyType; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionPoliciesInAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.permissionPolicyType = request.permissionPolicyType;
        } 

        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The type of the policy. The type can be used to filter policies. Valid values:</p>
         * <ul>
         * <li>System: system policy</li>
         * <li>Inline: inline policy</li>
         * </ul>
         * <p>If you do not specify this parameter, all types of policies are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder permissionPolicyType(String permissionPolicyType) {
            this.putQueryParameter("PermissionPolicyType", permissionPolicyType);
            this.permissionPolicyType = permissionPolicyType;
            return this;
        }

        @Override
        public ListPermissionPoliciesInAccessConfigurationRequest build() {
            return new ListPermissionPoliciesInAccessConfigurationRequest(this);
        } 

    } 

}
