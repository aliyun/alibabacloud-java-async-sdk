// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectRolesResponseBody</p>
 */
public class ListProjectRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectRoleList")
    private java.util.List < ProjectRoleList> projectRoleList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectRolesResponseBody(Builder builder) {
        this.projectRoleList = builder.projectRoleList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectRoleList
     */
    public java.util.List < ProjectRoleList> getProjectRoleList() {
        return this.projectRoleList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ProjectRoleList> projectRoleList; 
        private String requestId; 

        /**
         * The role ID of the workspace.
         */
        public Builder projectRoleList(java.util.List < ProjectRoleList> projectRoleList) {
            this.projectRoleList = projectRoleList;
            return this;
        }

        /**
         * The roles of the workspace.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectRolesResponseBody build() {
            return new ListProjectRolesResponseBody(this);
        } 

    } 

    public static class ProjectRoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectRoleCode")
        private String projectRoleCode;

        @com.aliyun.core.annotation.NameInMap("ProjectRoleId")
        private Integer projectRoleId;

        @com.aliyun.core.annotation.NameInMap("ProjectRoleName")
        private String projectRoleName;

        @com.aliyun.core.annotation.NameInMap("ProjectRoleType")
        private String projectRoleType;

        private ProjectRoleList(Builder builder) {
            this.projectRoleCode = builder.projectRoleCode;
            this.projectRoleId = builder.projectRoleId;
            this.projectRoleName = builder.projectRoleName;
            this.projectRoleType = builder.projectRoleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectRoleList create() {
            return builder().build();
        }

        /**
         * @return projectRoleCode
         */
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

        /**
         * @return projectRoleId
         */
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        /**
         * @return projectRoleName
         */
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        /**
         * @return projectRoleType
         */
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

        public static final class Builder {
            private String projectRoleCode; 
            private Integer projectRoleId; 
            private String projectRoleName; 
            private String projectRoleType; 

            /**
             * ProjectRoleCode.
             */
            public Builder projectRoleCode(String projectRoleCode) {
                this.projectRoleCode = projectRoleCode;
                return this;
            }

            /**
             * The role type of the workspace. Valid values:
             */
            public Builder projectRoleId(Integer projectRoleId) {
                this.projectRoleId = projectRoleId;
                return this;
            }

            /**
             * The role Code of the workspace.
             */
            public Builder projectRoleName(String projectRoleName) {
                this.projectRoleName = projectRoleName;
                return this;
            }

            /**
             * The role name of the workspace.
             */
            public Builder projectRoleType(String projectRoleType) {
                this.projectRoleType = projectRoleType;
                return this;
            }

            public ProjectRoleList build() {
                return new ProjectRoleList(this);
            } 

        } 

    }
}
