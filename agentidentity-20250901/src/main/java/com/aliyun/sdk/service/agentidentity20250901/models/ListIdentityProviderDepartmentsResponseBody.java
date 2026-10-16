// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListIdentityProviderDepartmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProviderDepartmentsResponseBody</p>
 */
public class ListIdentityProviderDepartmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Departments")
    private java.util.List<Departments> departments;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIdentityProviderDepartmentsResponseBody(Builder builder) {
        this.departments = builder.departments;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderDepartmentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departments
     */
    public java.util.List<Departments> getDepartments() {
        return this.departments;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Departments> departments; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIdentityProviderDepartmentsResponseBody model) {
            this.departments = model.departments;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Departments.
         */
        public Builder departments(java.util.List<Departments> departments) {
            this.departments = departments;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIdentityProviderDepartmentsResponseBody build() {
            return new ListIdentityProviderDepartmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProviderDepartmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProviderDepartmentsResponseBody</p>
     */
    public static class Departments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MemberCount")
        private Long memberCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Departments(Builder builder) {
            this.hasChildren = builder.hasChildren;
            this.id = builder.id;
            this.memberCount = builder.memberCount;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Departments create() {
            return builder().build();
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return memberCount
         */
        public Long getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Boolean hasChildren; 
            private String id; 
            private Long memberCount; 
            private String name; 
            private String parentId; 

            private Builder() {
            } 

            private Builder(Departments model) {
                this.hasChildren = model.hasChildren;
                this.id = model.id;
                this.memberCount = model.memberCount;
                this.name = model.name;
                this.parentId = model.parentId;
            } 

            /**
             * HasChildren.
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Long memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Departments build() {
                return new Departments(this);
            } 

        } 

    }
}
