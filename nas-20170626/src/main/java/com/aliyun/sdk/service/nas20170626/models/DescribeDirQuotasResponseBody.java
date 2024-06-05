// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirQuotasResponseBody</p>
 */
public class DescribeDirQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DirQuotaInfos")
    private java.util.List < DirQuotaInfos> dirQuotaInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDirQuotasResponseBody(Builder builder) {
        this.dirQuotaInfos = builder.dirQuotaInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return dirQuotaInfos
     */
    public java.util.List < DirQuotaInfos> getDirQuotaInfos() {
        return this.dirQuotaInfos;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DirQuotaInfos> dirQuotaInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried directory quotas.
         */
        public Builder dirQuotaInfos(java.util.List < DirQuotaInfos> dirQuotaInfos) {
            this.dirQuotaInfos = dirQuotaInfos;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of directories.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDirQuotasResponseBody build() {
            return new DescribeDirQuotasResponseBody(this);
        } 

    } 

    public static class UserQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("FileCountReal")
        private Long fileCountReal;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        @com.aliyun.core.annotation.NameInMap("SizeReal")
        private Long sizeReal;

        @com.aliyun.core.annotation.NameInMap("SizeRealInByte")
        private Long sizeRealInByte;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private UserQuotaInfos(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.fileCountReal = builder.fileCountReal;
            this.quotaType = builder.quotaType;
            this.sizeLimit = builder.sizeLimit;
            this.sizeReal = builder.sizeReal;
            this.sizeRealInByte = builder.sizeRealInByte;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return fileCountReal
         */
        public Long getFileCountReal() {
            return this.fileCountReal;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        /**
         * @return sizeReal
         */
        public Long getSizeReal() {
            return this.sizeReal;
        }

        /**
         * @return sizeRealInByte
         */
        public Long getSizeRealInByte() {
            return this.sizeRealInByte;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long fileCountLimit; 
            private Long fileCountReal; 
            private String quotaType; 
            private Long sizeLimit; 
            private Long sizeReal; 
            private Long sizeRealInByte; 
            private String userId; 
            private String userType; 

            /**
             * The maximum number of files that a user can create in the directory.
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * The total number of files that a user has created in the directory.
             */
            public Builder fileCountReal(Long fileCountReal) {
                this.fileCountReal = fileCountReal;
                return this;
            }

            /**
             * The type of the quota. Valid values: Accounting and Enforcement.
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * The maximum size of files that a user can create in the directory. Unit: GiB.
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            /**
             * The total size of files that a user has created in the directory. Unit: GiB.
             */
            public Builder sizeReal(Long sizeReal) {
                this.sizeReal = sizeReal;
                return this;
            }

            /**
             * SizeRealInByte.
             */
            public Builder sizeRealInByte(Long sizeRealInByte) {
                this.sizeRealInByte = sizeRealInByte;
                return this;
            }

            /**
             * The ID of the user that you specify to create a quota for the directory. The value depends on the value of the UserType parameter. Valid values: Uid and Gid.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The type of the user ID. Valid values: Uid, Gid, and AllUsers.
             * <p>
             * 
             * *   If the parameter is set to Uid or Gid, the value of the UserId parameter is returned.
             * *   If the parameter is set to AllUsers, the value of the UserID parameter is empty.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserQuotaInfos build() {
                return new UserQuotaInfos(this);
            } 

        } 

    }
    public static class DirQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirInode")
        private String dirInode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserQuotaInfos")
        private java.util.List < UserQuotaInfos> userQuotaInfos;

        private DirQuotaInfos(Builder builder) {
            this.dirInode = builder.dirInode;
            this.path = builder.path;
            this.status = builder.status;
            this.userQuotaInfos = builder.userQuotaInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return dirInode
         */
        public String getDirInode() {
            return this.dirInode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userQuotaInfos
         */
        public java.util.List < UserQuotaInfos> getUserQuotaInfos() {
            return this.userQuotaInfos;
        }

        public static final class Builder {
            private String dirInode; 
            private String path; 
            private String status; 
            private java.util.List < UserQuotaInfos> userQuotaInfos; 

            /**
             * The inode number of the directory.
             */
            public Builder dirInode(String dirInode) {
                this.dirInode = dirInode;
                return this;
            }

            /**
             * The absolute path of a directory.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The status of the quota created for the directory. Valid values: Initializing and Normal. The Initializing state indicates that the quota is being created. The Normal state indicates that the quota is created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The information about quotas for all users.
             */
            public Builder userQuotaInfos(java.util.List < UserQuotaInfos> userQuotaInfos) {
                this.userQuotaInfos = userQuotaInfos;
                return this;
            }

            public DirQuotaInfos build() {
                return new DirQuotaInfos(this);
            } 

        } 

    }
}
