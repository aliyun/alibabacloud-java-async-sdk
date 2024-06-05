// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseRoleMemberResponse} extends {@link TeaModel}
 *
 * <p>BaseRoleMemberResponse</p>
 */
public class BaseRoleMemberResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("assignment_list")
    private java.util.List < BaseAssignmentResponse > assignmentList;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("identity")
    private Identity identity;

    @com.aliyun.core.annotation.NameInMap("identity_name")
    private String identityName;

    @com.aliyun.core.annotation.NameInMap("is_admin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.NameInMap("subdomain_id")
    private String subdomainId;

    private BaseRoleMemberResponse(BuilderImpl builder) {
        super(builder);
        this.assignmentList = builder.assignmentList;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.domainId = builder.domainId;
        this.identity = builder.identity;
        this.identityName = builder.identityName;
        this.isAdmin = builder.isAdmin;
        this.subdomainId = builder.subdomainId;
    }

    public static BaseRoleMemberResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return assignmentList
     */
    public java.util.List < BaseAssignmentResponse > getAssignmentList() {
        return this.assignmentList;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return identity
     */
    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * @return identityName
     */
    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return subdomainId
     */
    public String getSubdomainId() {
        return this.subdomainId;
    }

    public interface Builder extends Response.Builder<BaseRoleMemberResponse, Builder> {

        Builder assignmentList(java.util.List < BaseAssignmentResponse > assignmentList);

        Builder createdAt(String createdAt);

        Builder creator(String creator);

        Builder domainId(String domainId);

        Builder identity(Identity identity);

        Builder identityName(String identityName);

        Builder isAdmin(Boolean isAdmin);

        Builder subdomainId(String subdomainId);

        @Override
        BaseRoleMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseRoleMemberResponse, Builder>
            implements Builder {
        private java.util.List < BaseAssignmentResponse > assignmentList; 
        private String createdAt; 
        private String creator; 
        private String domainId; 
        private Identity identity; 
        private String identityName; 
        private Boolean isAdmin; 
        private String subdomainId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseRoleMemberResponse response) {
            super(response);
            this.assignmentList = response.assignmentList;
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.domainId = response.domainId;
            this.identity = response.identity;
            this.identityName = response.identityName;
            this.isAdmin = response.isAdmin;
            this.subdomainId = response.subdomainId;
        } 

        /**
         * assignment_list.
         */
        @Override
        public Builder assignmentList(java.util.List < BaseAssignmentResponse > assignmentList) {
            this.assignmentList = assignmentList;
            return this;
        }

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * identity.
         */
        @Override
        public Builder identity(Identity identity) {
            this.identity = identity;
            return this;
        }

        /**
         * identity_name.
         */
        @Override
        public Builder identityName(String identityName) {
            this.identityName = identityName;
            return this;
        }

        /**
         * is_admin.
         */
        @Override
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * subdomain_id.
         */
        @Override
        public Builder subdomainId(String subdomainId) {
            this.subdomainId = subdomainId;
            return this;
        }

        @Override
        public BaseRoleMemberResponse build() {
            return new BaseRoleMemberResponse(this);
        } 

    } 

}
