// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ServiceLinkedRole} extends {@link TeaModel}
 *
 * <p>ServiceLinkedRole</p>
 */
public class ServiceLinkedRole extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("assumeRolePolicyDocument")
    private String assumeRolePolicyDocument;

    @com.aliyun.core.annotation.NameInMap("createDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("isServiceLinkedRole")
    private Boolean isServiceLinkedRole;

    @com.aliyun.core.annotation.NameInMap("roleId")
    private String roleId;

    @com.aliyun.core.annotation.NameInMap("roleName")
    private String roleName;

    @com.aliyun.core.annotation.NameInMap("rolePrincipalName")
    private String rolePrincipalName;

    private ServiceLinkedRole(Builder builder) {
        this.arn = builder.arn;
        this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
        this.createDate = builder.createDate;
        this.description = builder.description;
        this.isServiceLinkedRole = builder.isServiceLinkedRole;
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.rolePrincipalName = builder.rolePrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceLinkedRole create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return assumeRolePolicyDocument
     */
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isServiceLinkedRole
     */
    public Boolean getIsServiceLinkedRole() {
        return this.isServiceLinkedRole;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return rolePrincipalName
     */
    public String getRolePrincipalName() {
        return this.rolePrincipalName;
    }

    public static final class Builder {
        private String arn; 
        private String assumeRolePolicyDocument; 
        private String createDate; 
        private String description; 
        private Boolean isServiceLinkedRole; 
        private String roleId; 
        private String roleName; 
        private String rolePrincipalName; 

        /**
         * arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * assumeRolePolicyDocument.
         */
        public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }

        /**
         * createDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * isServiceLinkedRole.
         */
        public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }

        /**
         * roleId.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * roleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * rolePrincipalName.
         */
        public Builder rolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }

        public ServiceLinkedRole build() {
            return new ServiceLinkedRole(this);
        } 

    } 

}
