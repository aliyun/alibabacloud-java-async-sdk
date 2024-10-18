// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectRolesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
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

    /**
     * 
     * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectRolesResponseBody</p>
     */
    public static class ProjectRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProjectRoles(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectRoles create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Long projectId; 
            private String type; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProjectRoles build() {
                return new ProjectRoles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectRolesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectRoles")
        private java.util.List < ProjectRoles> projectRoles;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projectRoles = builder.projectRoles;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projectRoles
         */
        public java.util.List < ProjectRoles> getProjectRoles() {
            return this.projectRoles;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String pageNumber; 
            private String pageSize; 
            private java.util.List < ProjectRoles> projectRoles; 
            private String totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ProjectRoles.
             */
            public Builder projectRoles(java.util.List < ProjectRoles> projectRoles) {
                this.projectRoles = projectRoles;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
