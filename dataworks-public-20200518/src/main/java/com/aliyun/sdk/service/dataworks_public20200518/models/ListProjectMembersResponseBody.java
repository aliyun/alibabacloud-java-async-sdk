// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectMembersResponseBody</p>
 */
public class ListProjectMembersResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListProjectMembersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The results that are returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectMembersResponseBody build() {
            return new ListProjectMembersResponseBody(this);
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
             * The code of the role.
             * <p>
             * 
             * DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see [Overview of users, roles, and permissions](~~295463~~).
             */
            public Builder projectRoleCode(String projectRoleCode) {
                this.projectRoleCode = projectRoleCode;
                return this;
            }

            /**
             * The ID of the role.
             */
            public Builder projectRoleId(Integer projectRoleId) {
                this.projectRoleId = projectRoleId;
                return this;
            }

            /**
             * The name of the role.
             * <p>
             * 
             * DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see [Overview of users, roles, and permissions](~~295463~~).
             */
            public Builder projectRoleName(String projectRoleName) {
                this.projectRoleName = projectRoleName;
                return this;
            }

            /**
             * The type of the role. Valid values:
             * <p>
             * 
             * *   0: SYSTEM, which indicates that the role is a built-in role.
             * *   2: USER_CUSTOM, which indicates that the role is a custom role.
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
    public static class ProjectMemberList extends TeaModel {
        @NameInMap("Nick")
        private String nick;

        @NameInMap("ProjectMemberId")
        private String projectMemberId;

        @NameInMap("ProjectMemberName")
        private String projectMemberName;

        @NameInMap("ProjectMemberType")
        private String projectMemberType;

        @NameInMap("ProjectRoleList")
        private java.util.List < ProjectRoleList> projectRoleList;

        @NameInMap("Status")
        private String status;

        private ProjectMemberList(Builder builder) {
            this.nick = builder.nick;
            this.projectMemberId = builder.projectMemberId;
            this.projectMemberName = builder.projectMemberName;
            this.projectMemberType = builder.projectMemberType;
            this.projectRoleList = builder.projectRoleList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectMemberList create() {
            return builder().build();
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return projectMemberId
         */
        public String getProjectMemberId() {
            return this.projectMemberId;
        }

        /**
         * @return projectMemberName
         */
        public String getProjectMemberName() {
            return this.projectMemberName;
        }

        /**
         * @return projectMemberType
         */
        public String getProjectMemberType() {
            return this.projectMemberType;
        }

        /**
         * @return projectRoleList
         */
        public java.util.List < ProjectRoleList> getProjectRoleList() {
            return this.projectRoleList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String nick; 
            private String projectMemberId; 
            private String projectMemberName; 
            private String projectMemberType; 
            private java.util.List < ProjectRoleList> projectRoleList; 
            private String status; 

            /**
             * The nickname of the member.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * The ID of the member.
             */
            public Builder projectMemberId(String projectMemberId) {
                this.projectMemberId = projectMemberId;
                return this;
            }

            /**
             * The name of the member.
             */
            public Builder projectMemberName(String projectMemberName) {
                this.projectMemberName = projectMemberName;
                return this;
            }

            /**
             * The type of the member. Valid values:
             * <p>
             * 
             * *   1: USER_ALIYUN, which indicates that the member is an Alibaba Cloud account.
             * *   5: USER_UBACCOUNT, which indicates that the member is a RAM user.
             * *   6: USER_STS_ROLE, which indicates that the member is a RAM role.
             */
            public Builder projectMemberType(String projectMemberType) {
                this.projectMemberType = projectMemberType;
                return this;
            }

            /**
             * The roles that are assigned to the member.
             */
            public Builder projectRoleList(java.util.List < ProjectRoleList> projectRoleList) {
                this.projectRoleList = projectRoleList;
                return this;
            }

            /**
             * The status of the member. Valid values:
             * <p>
             * 
             * *   0: NORMAL, which indicates that the member is in a normal state.
             * *   1: FORBIDDEN, which indicates that the member is disabled.
             * *   2: DELETED, which indicates that the member is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ProjectMemberList build() {
                return new ProjectMemberList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ProjectMemberList")
        private java.util.List < ProjectMemberList> projectMemberList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projectMemberList = builder.projectMemberList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projectMemberList
         */
        public java.util.List < ProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < ProjectMemberList> projectMemberList; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The information of members in the DataWorks workspace.
             */
            public Builder projectMemberList(java.util.List < ProjectMemberList> projectMemberList) {
                this.projectMemberList = projectMemberList;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
