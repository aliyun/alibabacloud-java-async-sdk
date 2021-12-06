// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AddPermissionPolicyToAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>AddPermissionPolicyToAccessConfigurationRequest</p>
 */
public class AddPermissionPolicyToAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("InlinePolicyDocument")
    private String inlinePolicyDocument;

    @Query
    @NameInMap("PermissionPolicyName")
    private String permissionPolicyName;

    @Query
    @NameInMap("PermissionPolicyType")
    private String permissionPolicyType;


    private AddPermissionPolicyToAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.inlinePolicyDocument = builder.inlinePolicyDocument;
        this.permissionPolicyName = builder.permissionPolicyName;
        this.permissionPolicyType = builder.permissionPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPermissionPolicyToAccessConfigurationRequest create() {
        return builder().build();
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
     * @return inlinePolicyDocument
     */
    public String getInlinePolicyDocument() {
        return this.inlinePolicyDocument;
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

    public static final class Builder extends Request.Builder {
        private String accessConfigurationId; 
        private String directoryId; 
        private String inlinePolicyDocument; 
        private String permissionPolicyName; 
        private String permissionPolicyType; 

        /**
         * <p>AccessConfigurationId.</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>InlinePolicyDocument.</p>
         */
        public Builder inlinePolicyDocument(String inlinePolicyDocument) {
            this.putQueryParameter("InlinePolicyDocument", inlinePolicyDocument);
            this.inlinePolicyDocument = inlinePolicyDocument;
            return this;
        }

        /**
         * <p>PermissionPolicyName.</p>
         */
        public Builder permissionPolicyName(String permissionPolicyName) {
            this.putQueryParameter("PermissionPolicyName", permissionPolicyName);
            this.permissionPolicyName = permissionPolicyName;
            return this;
        }

        /**
         * <p>PermissionPolicyType.</p>
         */
        public Builder permissionPolicyType(String permissionPolicyType) {
            this.putQueryParameter("PermissionPolicyType", permissionPolicyType);
            this.permissionPolicyType = permissionPolicyType;
            return this;
        }

        public AddPermissionPolicyToAccessConfigurationRequest build() {
            return new AddPermissionPolicyToAccessConfigurationRequest(this);
        } 

    } 

}
