// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectRolesResponseBody</p>
 */
public class ListProjectRolesResponseBody extends TeaModel {
    @NameInMap("ProjectRoleList")
    private java.util.List < ProjectRoleList> projectRoleList;

    @NameInMap("RequestId")
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
         * ProjectRoleList.
         */
        public Builder projectRoleList(java.util.List < ProjectRoleList> projectRoleList) {
            this.projectRoleList = projectRoleList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("ProjectRoleCode")
        private String projectRoleCode;

        @NameInMap("ProjectRoleId")
        private Integer projectRoleId;

        @NameInMap("ProjectRoleName")
        private String projectRoleName;

        @NameInMap("ProjectRoleType")
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
             * ProjectRoleId.
             */
            public Builder projectRoleId(Integer projectRoleId) {
                this.projectRoleId = projectRoleId;
                return this;
            }

            /**
             * ProjectRoleName.
             */
            public Builder projectRoleName(String projectRoleName) {
                this.projectRoleName = projectRoleName;
                return this;
            }

            /**
             * ProjectRoleType.
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
