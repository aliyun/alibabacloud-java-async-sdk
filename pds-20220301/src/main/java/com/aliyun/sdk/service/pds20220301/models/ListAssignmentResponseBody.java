// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListAssignmentResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssignmentResponseBody</p>
 */
public class ListAssignmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assignment_list")
    private java.util.List<AssignmentList> assignmentList;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private ListAssignmentResponseBody(Builder builder) {
        this.assignmentList = builder.assignmentList;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssignmentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignmentList
     */
    public java.util.List<AssignmentList> getAssignmentList() {
        return this.assignmentList;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List<AssignmentList> assignmentList; 
        private String nextMarker; 

        private Builder() {
        } 

        private Builder(ListAssignmentResponseBody model) {
            this.assignmentList = model.assignmentList;
            this.nextMarker = model.nextMarker;
        } 

        /**
         * <p>The assigned roles.</p>
         */
        public Builder assignmentList(java.util.List<AssignmentList> assignmentList) {
            this.assignmentList = assignmentList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        public ListAssignmentResponseBody build() {
            return new ListAssignmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssignmentResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssignmentResponseBody</p>
     */
    public static class AssignmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created_at")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("domain_id")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("identity")
        private Identity identity;

        @com.aliyun.core.annotation.NameInMap("manage_resource_id")
        private String manageResourceId;

        @com.aliyun.core.annotation.NameInMap("manage_resource_type")
        private String manageResourceType;

        @com.aliyun.core.annotation.NameInMap("role_id")
        private String roleId;

        private AssignmentList(Builder builder) {
            this.createdAt = builder.createdAt;
            this.creator = builder.creator;
            this.domainId = builder.domainId;
            this.identity = builder.identity;
            this.manageResourceId = builder.manageResourceId;
            this.manageResourceType = builder.manageResourceType;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignmentList create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
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
         * @return manageResourceId
         */
        public String getManageResourceId() {
            return this.manageResourceId;
        }

        /**
         * @return manageResourceType
         */
        public String getManageResourceType() {
            return this.manageResourceType;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private Long createdAt; 
            private String creator; 
            private String domainId; 
            private Identity identity; 
            private String manageResourceId; 
            private String manageResourceType; 
            private String roleId; 

            private Builder() {
            } 

            private Builder(AssignmentList model) {
                this.createdAt = model.createdAt;
                this.creator = model.creator;
                this.domainId = model.domainId;
                this.identity = model.identity;
                this.manageResourceId = model.manageResourceId;
                this.manageResourceType = model.manageResourceType;
                this.roleId = model.roleId;
            } 

            /**
             * <p>The time when the role was assigned. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1622682267564</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The ID of the user who assigned the role.</p>
             * 
             * <strong>example:</strong>
             * <p>216***c83</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hz1</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The identity to whom the role is assigned, which is a user or a group.</p>
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * <p>The ID of the managed resource, such as a group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>105***b82</p>
             */
            public Builder manageResourceId(String manageResourceId) {
                this.manageResourceId = manageResourceId;
                return this;
            }

            /**
             * <p>The type of the managed resource. For example, a value of RT_Group indicates group.</p>
             * 
             * <strong>example:</strong>
             * <p>RT_Group</p>
             */
            public Builder manageResourceType(String manageResourceType) {
                this.manageResourceType = manageResourceType;
                return this;
            }

            /**
             * <p>The ID of the role assigned to the identity.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemGroupAdmin</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            public AssignmentList build() {
                return new AssignmentList(this);
            } 

        } 

    }
}
