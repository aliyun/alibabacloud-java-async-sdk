// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link AddPermissionPolicyToAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>AddPermissionPolicyToAccessConfigurationRequest</p>
 */
public class AddPermissionPolicyToAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InlinePolicyDocument")
    private String inlinePolicyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionPolicyName")
    private String permissionPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionPolicyType")
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

    public static final class Builder extends Request.Builder<AddPermissionPolicyToAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String inlinePolicyDocument; 
        private String permissionPolicyName; 
        private String permissionPolicyType; 

        private Builder() {
            super();
        } 

        private Builder(AddPermissionPolicyToAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.inlinePolicyDocument = request.inlinePolicyDocument;
            this.permissionPolicyName = request.permissionPolicyName;
            this.permissionPolicyType = request.permissionPolicyType;
        } 

        /**
         * <p>The access configuration ID.</p>
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
         * <p>The directory ID.</p>
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
         * <p>The content of the inline policy.</p>
         * <p>The maximum length is 4,096 characters.</p>
         * <p>If PermissionPolicyType is set to Inline, this parameter is required. For more information about the syntax and structure of access policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Access policy syntax and structure</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
         */
        public Builder inlinePolicyDocument(String inlinePolicyDocument) {
            this.putQueryParameter("InlinePolicyDocument", inlinePolicyDocument);
            this.inlinePolicyDocument = inlinePolicyDocument;
            return this;
        }

        /**
         * <p>The name of the access policy. </p>
         * <ul>
         * <li>If PermissionPolicyType is set to System, this parameter specifies the name of the system policy. Because RAM system policies are reused, you must obtain the system policy name from RAM.</li>
         * <li>If PermissionPolicyType is set to Inline, this parameter specifies the name of the inline policy. You can customize the name. The name can be up to 32 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSFullAccess</p>
         */
        public Builder permissionPolicyName(String permissionPolicyName) {
            this.putQueryParameter("PermissionPolicyName", permissionPolicyName);
            this.permissionPolicyName = permissionPolicyName;
            return this;
        }

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <ul>
         * <li>System: system policy. Reuses the system policies of Resource Access Management (RAM).</li>
         * <li>Inline: inline policy. A custom policy written based on the syntax and structure of RAM policies.</li>
         * </ul>
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
        public AddPermissionPolicyToAccessConfigurationRequest build() {
            return new AddPermissionPolicyToAccessConfigurationRequest(this);
        } 

    } 

}
