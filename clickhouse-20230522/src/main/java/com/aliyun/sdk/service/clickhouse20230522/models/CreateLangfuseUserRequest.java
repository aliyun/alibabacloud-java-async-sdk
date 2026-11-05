// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link CreateLangfuseUserRequest} extends {@link RequestModel}
 *
 * <p>CreateLangfuseUserRequest</p>
 */
public class CreateLangfuseUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowOrgCreation")
    private Boolean allowOrgCreation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgRole")
    private String orgRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateLangfuseUserRequest(Builder builder) {
        super(builder);
        this.allowOrgCreation = builder.allowOrgCreation;
        this.DBInstanceId = builder.DBInstanceId;
        this.email = builder.email;
        this.name = builder.name;
        this.orgRole = builder.orgRole;
        this.organizationId = builder.organizationId;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLangfuseUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowOrgCreation
     */
    public Boolean getAllowOrgCreation() {
        return this.allowOrgCreation;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orgRole
     */
    public String getOrgRole() {
        return this.orgRole;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateLangfuseUserRequest, Builder> {
        private Boolean allowOrgCreation; 
        private String DBInstanceId; 
        private String email; 
        private String name; 
        private String orgRole; 
        private String organizationId; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLangfuseUserRequest request) {
            super(request);
            this.allowOrgCreation = request.allowOrgCreation;
            this.DBInstanceId = request.DBInstanceId;
            this.email = request.email;
            this.name = request.name;
            this.orgRole = request.orgRole;
            this.organizationId = request.organizationId;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether the user is allowed to create organizations. Default value: false.</p>
         */
        public Builder allowOrgCreation(Boolean allowOrgCreation) {
            this.putQueryParameter("AllowOrgCreation", allowOrgCreation);
            this.allowOrgCreation = allowOrgCreation;
            return this;
        }

        /**
         * <p>The Langfuse instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The email address of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>john</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The role of the user in the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        public Builder orgRole(String orgRole) {
            this.putQueryParameter("OrgRole", orgRole);
            this.orgRole = orgRole;
            return this;
        }

        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>The password of the user account. The password must meet the following requirements:</p>
         * <ul>
         * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * </li>
         * <li><p>Special characters include !@#$%^&amp;*()_+-=.</p>
         * </li>
         * <li><p>It must be 8 to 32 characters in length.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2F9e9@******</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateLangfuseUserRequest build() {
            return new CreateLangfuseUserRequest(this);
        } 

    } 

}
