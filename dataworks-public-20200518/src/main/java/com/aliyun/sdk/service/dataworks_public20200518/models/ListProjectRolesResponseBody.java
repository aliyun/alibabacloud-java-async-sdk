// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectRolesResponseBody</p>
 */
public class ListProjectRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectRoleList")
    private java.util.List<ProjectRoleList> projectRoleList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectRoleList
     */
    public java.util.List<ProjectRoleList> getProjectRoleList() {
        return this.projectRoleList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ProjectRoleList> projectRoleList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProjectRolesResponseBody model) {
            this.projectRoleList = model.projectRoleList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The roles in the DataWorks workspace.</p>
         */
        public Builder projectRoleList(java.util.List<ProjectRoleList> projectRoleList) {
            this.projectRoleList = projectRoleList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectRolesResponseBody build() {
            return new ListProjectRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectRolesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ProjectRoleList model) {
                this.projectRoleCode = model.projectRoleCode;
                this.projectRoleId = model.projectRoleId;
                this.projectRoleName = model.projectRoleName;
                this.projectRoleType = model.projectRoleType;
            } 

            /**
             * <p>The code of the role in the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>role_project_guest</p>
             */
            public Builder projectRoleCode(String projectRoleCode) {
                this.projectRoleCode = projectRoleCode;
                return this;
            }

            /**
             * <p>The ID of the role in the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder projectRoleId(Integer projectRoleId) {
                this.projectRoleId = projectRoleId;
                return this;
            }

            /**
             * <p>The name of the role in the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>visitor</p>
             */
            public Builder projectRoleName(String projectRoleName) {
                this.projectRoleName = projectRoleName;
                return this;
            }

            /**
             * <p>The type of the role in the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
